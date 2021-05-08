package com.corona.cowinvaccineavailabilityspeaker;

import com.corona.cowinvaccineavailabilityspeaker.model.District;
import com.corona.cowinvaccineavailabilityspeaker.model.Districts;
import com.corona.cowinvaccineavailabilityspeaker.model.State;
import com.corona.cowinvaccineavailabilityspeaker.model.States;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Abhishek Chawla
 */
@Slf4j
@Component
public class Bootstrapper {

    private final RestTemplate restTemplate;
    private final Map<String,Integer> districtNameToIdMap;

    @Value("${cowin.state.url}")
    private String stateBaseUrl;
    @Value("${cowin.district.url}")
    private String districtBaseUrl;

    public Bootstrapper(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
        districtNameToIdMap = new HashMap<>();
    }

    public Integer getDistrictIdByName(String districtName) {
        return districtNameToIdMap.get(districtName);
    }

    @PostConstruct
    public void pullVaccinationDistrictData() {
        try {
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.add("user-agent", "Mozilla/5.0");
            HttpEntity entity = new HttpEntity(httpHeaders);
            ResponseEntity<States> statesResponseEntity = restTemplate.exchange(stateBaseUrl, HttpMethod.GET, entity, States.class);
            if (statesResponseEntity.getBody() != null) {
                List<State> states = statesResponseEntity.getBody().getStates();
                log.info("Registering districts....");
                for (State state : states) {
                    Integer stateId = state.getStateId();
                    ResponseEntity<Districts> districtsResponseEntity = restTemplate.exchange(districtBaseUrl + stateId, HttpMethod.GET, entity, Districts.class);
                    if (districtsResponseEntity.getBody() != null) {
                        List<District> districts = districtsResponseEntity.getBody().getDistricts();
                        //log.info("Found {} districts for state = {}", districts.size(), state.getStateName());
                        for (District district : districts) {
                            if (district.getDistrictName() != null) {
                                districtNameToIdMap.put(district.getDistrictName().toLowerCase().replace(" ",""), district.getDistrictId());
                            }
                        }
                    }
                }
            }
        }catch (Exception e) {
            log.error("Error registering district info, note: PinCode feature will still work");
        }
    }

}
