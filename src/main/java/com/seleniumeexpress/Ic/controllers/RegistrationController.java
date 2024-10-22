package com.seleniumeexpress.Ic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpresss.Ic.api.UserRegistrationDTO;



@Controller
public class RegistrationController {
    @RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("UserReg") UserRegistrationDTO dto) {
    	dto.setName("venkat");
		return "use-registration-page";
	}
    @RequestMapping("/register-success")
	public String processUserReg(@ModelAttribute("UserReg") UserRegistrationDTO dto) {
    	return "registreation-success";
    }
}
