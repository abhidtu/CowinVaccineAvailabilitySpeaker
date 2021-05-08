package com.corona.cowinvaccineavailabilityspeaker.task;

import com.corona.cowinvaccineavailabilityspeaker.Utils;
import com.corona.cowinvaccineavailabilityspeaker.callbacks.VaccineNotifierCallback;
import com.corona.cowinvaccineavailabilityspeaker.model.RequestedDistrictsWithAge;
import com.corona.cowinvaccineavailabilityspeaker.service.SpeechService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author Abhishek Chawla
 */
@Component
@Scope("prototype")
public class NotifyVaccinationDetailsByDistrict extends NotifyVaccinationDetails {

    private RequestedDistrictsWithAge requestedDistrictsWithAge;

    @Value("${vaccination.details.by.district.url}")
    String baseUrl;

    public NotifyVaccinationDetailsByDistrict(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    protected String getBaseURLWithParams() {
        return String.format(baseUrl, requestedDistrictsWithAge.getDistrictId(), Utils.getCurrentDateAsString());
    }

    @Override
    protected String getType() {
        return "DistrictId";
    }

    public void execute(RequestedDistrictsWithAge requestedDistrictsWithAge, VaccineNotifierCallback vaccineNotifierCallback) {
        this.requestedDistrictsWithAge = requestedDistrictsWithAge;
        Notify(requestedDistrictsWithAge.getDistrictId(), requestedDistrictsWithAge.getAge(), vaccineNotifierCallback);
    }
}
