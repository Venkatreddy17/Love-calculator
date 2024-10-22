package com.seleniumeexpress.Ic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.seleniumexpresss.Ic.api.UserInfoDTO;

@Controller
public class LCAppController {
	@RequestMapping("/")
	public String showHomepage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {

		// read the existing property by fetching its from the dto

		return "home-page";
	}

	@RequestMapping("/process-homepage")
	public String showHResultPage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {

		return "result-page";
	}
}
