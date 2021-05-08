package com.corona.cowinvaccineavailabilityspeaker.task;

import com.corona.cowinvaccineavailabilityspeaker.Utils;
import com.corona.cowinvaccineavailabilityspeaker.callbacks.VaccineNotifierCallback;
import com.corona.cowinvaccineavailabilityspeaker.model.RequestedPinCodesWithAge;
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
public class NotifyVaccinationDetailsByPin extends NotifyVaccinationDetails {

    private RequestedPinCodesWithAge requestedPinCodesWithAge;

    @Value("${vaccination.details.by.pincode.url}")
    private String baseUrl;

    public NotifyVaccinationDetailsByPin(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    protected String getBaseURLWithParams() {
        return String.format(baseUrl, requestedPinCodesWithAge.getPinCode(), Utils.getCurrentDateAsString());
    }

    @Override
    protected String getType() {
        return "PinCode";
    }

    public void execute(RequestedPinCodesWithAge requestedPinCodesWithAge, VaccineNotifierCallback vaccineNotifierCallback) {
        this.requestedPinCodesWithAge = requestedPinCodesWithAge;
        Notify(requestedPinCodesWithAge.getPinCode(), requestedPinCodesWithAge.getAge(), vaccineNotifierCallback);
    }

}
