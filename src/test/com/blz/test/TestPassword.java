package com.blz.test;

import com.blz.exception.InvalidInputException;
import com.blz.userdetails_valid.UserRegistrationValid;

public class TestPassword {
	public static void validTest(UserRegistrationValid userRegistrationValid, String userPassword) throws InvalidInputException {
		if (userRegistrationValid.Password(userPassword)) {
			System.out.println("Your Password (" + userPassword + ") is Valid");
		} else {
			System.out.println("Your Password (" + userPassword + ") is Invalid");
		}
	}

	public static void main(String[] args) throws InvalidInputException {
		UserRegistrationValid userRegistrationValid = new UserRegistrationValid();
		
		validTest(userRegistrationValid, "Deepak@123");
		validTest(userRegistrationValid, "depyuiui12");
		validTest(userRegistrationValid, "deepakygj123");
		validTest(userRegistrationValid, "yadavepy123");
	}
}
