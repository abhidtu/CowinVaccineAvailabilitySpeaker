package com.corona.cowinvaccineavailabilityspeaker.controller;

import com.corona.cowinvaccineavailabilityspeaker.service.CoronaVaccinationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Abhishek Chawla
 */
@RestController
@RequestMapping("/rest/corona/vaccination")
@Slf4j
@AllArgsConstructor
public class VaccinationInfo {

    private final CoronaVaccinationService coronaVaccinationService;

    @RequestMapping(value="/registerPin" , method= RequestMethod.GET)
    public ResponseEntity<String> registerPinCode(@RequestParam int pinCode, @RequestParam int age) {
        try {
            return ResponseEntity.ok().body(coronaVaccinationService.registerPinCode(pinCode, age));
        }catch (IllegalArgumentException ie) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ie.getMessage());
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @RequestMapping(value="/registerDistrict" , method= RequestMethod.GET)
    public ResponseEntity<String> registerDistrict(@RequestParam String districtName, @RequestParam int age) {
        try {
            return ResponseEntity.ok().body(coronaVaccinationService.registerDistrict(districtName, age));
        }catch (IllegalArgumentException ie) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ie.getMessage());
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

}