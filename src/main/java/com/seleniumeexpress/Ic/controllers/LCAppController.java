package com.seleniumeexpress.Ic.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpresss.Ic.api.UserInfoDTO;

import jakarta.validation.Valid;

@Controller
public class LCAppController {
	@RequestMapping("/")
	public String showHomepage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {

		// read the existing property by fetching its from the dto

		return "home-page";
	}

	@RequestMapping("/process-homepage")
	public String showHResultPage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult result) {
		System.out.println(userInfoDTO.isTermsAndCondition());
		if(result.hasErrors()) {
			System.out.println("my form have errors..");
			return "home-page";
		}
		

		return "result-page";
	}

}
