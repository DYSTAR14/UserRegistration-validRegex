package com.blz.test;

import com.blz.userdetails_valid.UserRegistrationValid;

public class TestPassword {
	public static void validTest(UserRegistrationValid userRegistrationValid, String userPassword) {
		if (userRegistrationValid.Password(userPassword)) {
			System.out.println("Your Password (" + userPassword + ") is Valid");
		} else {
			System.out.println("Your Password (" + userPassword + ") is Invalid");
		}
	}

	public static void main(String[] args) {
		UserRegistrationValid userRegistrationValid = new UserRegistrationValid();
		
		validTest(userRegistrationValid, "Deepak@123");
		validTest(userRegistrationValid, "de@pyuiui");
		validTest(userRegistrationValid, "deepak@ygj");
		validTest(userRegistrationValid, "yadave@py");
	}
}
