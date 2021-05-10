package com.corona.cowinvaccineavailabilityspeaker.task;

import com.corona.cowinvaccineavailabilityspeaker.callbacks.VaccineNotifierCallback;
import com.corona.cowinvaccineavailabilityspeaker.model.Center;
import com.corona.cowinvaccineavailabilityspeaker.model.Session;
import com.corona.cowinvaccineavailabilityspeaker.model.VaccinationInfo;
import com.corona.cowinvaccineavailabilityspeaker.service.SpeechService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Abhishek Chawla
 */
@Slf4j
public abstract class NotifyVaccinationDetails {

    private final RestTemplate restTemplate;

    public NotifyVaccinationDetails(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    protected abstract String getBaseURLWithParams();

    protected abstract String getType();

    public List<Center> getVaccinationCentres(Integer data) {
        List<Center> centers = null;
        log.info("Looking for eligible vaccination centres at {} = {}", getType(), data);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("user-agent","Mozilla/5.0");
        HttpEntity entity = new HttpEntity(httpHeaders);
        ResponseEntity<VaccinationInfo> vaccinationInfoResponse = restTemplate.exchange(getBaseURLWithParams(), HttpMethod.GET, entity, VaccinationInfo.class);
        if(vaccinationInfoResponse.getBody() != null) {
            centers = vaccinationInfoResponse.getBody().getCenters();
            log.info("Found {} vaccination centres at {} = {}", centers.size(), getType(), data);
        }
        return centers;
    }

    protected void Notify(Integer data , int minAge, VaccineNotifierCallback vaccineNotifierCallback) {
        List<Center> centres = getVaccinationCentres(data);
        if(centres != null) {
            int count = 0;
            for (Center center : centres) {
                List<Session> sessions = center.getSessions();
                for (Session session : sessions) {
                    if(session.getMinAgeLimit() == minAge && session.getAvailableCapacity() > 0) {
                        count++;
                        vaccineNotifierCallback.listen("Vaccine "+session.getVaccine()+" for "+ session.getMinAgeLimit() +" available at center "+ center.getName() + " pin code "+ center.getPincode() +" on date "+ session.getDate() +", available quantity  "+session.getAvailableCapacity());
                    }
                }
            }
            if (count > 0) {
                vaccineNotifierCallback.listen("found total " + count + " active vaccine centres for age " + minAge + " for "+ getType() + " = " + data);
                log.info("found total {} active vaccine centres for age {} for {} = {}", count, minAge, getType(), data);
            }else {
                log.info("Sorry no vaccine available for  age {}", minAge);
            }
            log.info("Search complete for {} = {}\n\n", getType(), data);
        }else {
            log.info("No Centre found for given {}", getType());
        }
    }

}