package com.corona.cowinvaccineavailabilityspeaker.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author Abhishek Chawla
 */
@Slf4j
@Component
public class Configuration {

    @Bean
    public RestTemplate getCoronaRestTemplate() {
        return new RestTemplate();
    }

}
