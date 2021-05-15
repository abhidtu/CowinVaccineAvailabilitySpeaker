package com.corona.cowinvaccineavailabilityspeaker.controller;

import com.corona.cowinvaccineavailabilityspeaker.model.UserRegister;
import com.corona.cowinvaccineavailabilityspeaker.service.CoronaVaccinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
class CowinSpeakerUIController {

    private CoronaVaccinationService coronaVaccinationService;

    @Autowired
    public void setCoronaVaccinationService(CoronaVaccinationService coronaVaccinationService) {
        this.coronaVaccinationService = coronaVaccinationService;
    }

    @GetMapping("/")
    String index() {
        return "index";
    }

    @RequestMapping(value="/registerPin", method= RequestMethod.POST)
    ModelAndView registerPin(@ModelAttribute UserRegister userRegister) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-register-pin");
        modelAndView.addObject("userRegister", userRegister);
        coronaVaccinationService.registerPinCode(userRegister.getPinCode(), userRegister.getAge());
        return modelAndView;
    }

    @RequestMapping(value="/registerDistrict", method= RequestMethod.POST)
    ModelAndView registerDistrict(@ModelAttribute UserRegister userRegister) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-register-district");
        modelAndView.addObject("userRegister", userRegister);
        coronaVaccinationService.registerDistrict(userRegister.getDistrict(), userRegister.getAge());
        return modelAndView;
    }

}