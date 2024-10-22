package com.seleniumeexpress.Ic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.seleniumexpresss.Ic.api.UserInfoDTO;

@Controller
public class LCAppController {
    @RequestMapping("/")
	public String showHomepage() {
		return "home-page";
	}
    @RequestMapping("/process-homepage")
  	public String showHResultPage(UserInfoDTO userInfoDTO,Model model) {
    	System.out.println(userInfoDTO.getUserName());
    	System.out.println(userInfoDTO.getCrushName());
    	
    	model.addAttribute("userInfo",userInfoDTO );
    	
  		return "result-page";
  	}
}
