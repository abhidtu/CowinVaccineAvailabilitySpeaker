package com.corona.cowinvaccineavailabilityspeaker.controller;

import com.corona.cowinvaccineavailabilityspeaker.model.UserRegister;
import com.corona.cowinvaccineavailabilityspeaker.service.CoronaVaccinationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


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
    public ResponseEntity<String> registerPinCode(@RequestParam int pinCode, @RequestParam String vaccineType, @RequestParam int age) {
        try {
            return ResponseEntity.ok().body(coronaVaccinationService.registerPinCode(pinCode, age, vaccineType));
        }catch (IllegalArgumentException ie) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ie.getMessage());
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @RequestMapping(value="/registerDistrict" , method= RequestMethod.GET)
    public ResponseEntity<String> registerDistrict(@RequestParam String districtName, @RequestParam String vaccineType, @RequestParam int age) {
        try {
            return ResponseEntity.ok().body(coronaVaccinationService.registerDistrict(districtName, age, vaccineType));
        }catch (IllegalArgumentException ie) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ie.getMessage());
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

}