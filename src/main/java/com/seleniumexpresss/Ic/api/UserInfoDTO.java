package com.seleniumexpresss.Ic.api;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserInfoDTO {
	@NotBlank(message = "* userName should not blank")
	@Size(min=3,max=15,message = "userName should be between 3-15 letters" )
	private String userName;
	
	private String crushName ;
	@AssertTrue(message = "agree for use app")
	private boolean  termsAndCondition;
	
	public UserInfoDTO() {
		System.out.println("User info dto..");
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

	public boolean isTermsAndCondition() {
		return termsAndCondition;
	}

	public void setTermsAndCondition(boolean termsAndCondition) {
		this.termsAndCondition = termsAndCondition;
	}

	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + "]";
	}

}
