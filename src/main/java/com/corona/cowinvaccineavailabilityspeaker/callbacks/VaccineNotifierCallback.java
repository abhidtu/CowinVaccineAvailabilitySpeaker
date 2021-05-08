package com.corona.cowinvaccineavailabilityspeaker.callbacks;

import com.corona.cowinvaccineavailabilityspeaker.service.SpeechService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VaccineNotifierCallback {

    private final SpeechService speechService;

    public VaccineNotifierCallback() {
        this.speechService = new SpeechService();
    }

    public void listen(String message) {
        System.out.println(message);
        speechService.speak(message);
    }

}
