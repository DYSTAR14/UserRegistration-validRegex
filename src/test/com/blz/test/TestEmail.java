package com.blz.test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import com.blz.userdetails_valid.UserRegistrationValid;

public class TestEmail {
	public static void validTest(UserRegistrationValid userRegistrationValid, String userEmail) {
		if (userRegistrationValid.EmailID(userEmail)) {
			System.out.println("Your Email (" + userEmail + ") is Valid");
		} else {
			System.out.println("Your Email (" + userEmail + ") are Invalid");
		}
	}

	public static void main(String[] args) {
		UserRegistrationValid userRegistrationValid = new UserRegistrationValid();
		Scanner sc = new Scanner(System.in);
		List<String> emailIds = Arrays.asList(
			"abc@yahoo.com",
			"abc-100@yahoo.com",
			"abc-100@yahoo.com",
			"abc111@abc.com",
			"abc-100@abc.net",
			"abc.100@abc.com.au",
			"abc@1.com",
			"abc@gmail.com.com",
			"abc+100@gmail.com",
			
			"abc",
			"abc@.com.my",
			"abc123@gmail.a",
			"abc123@.com",
			"abc123@.com.com",
			".abc@abc.com",
			"abc()*@gmail.com",
			"abc@%*.com",
			"abc..2002@gmail.com",
			"abc.@gmail.com",
			"abc@abc@gmail.com",
			"abc@gmail.com.1a",
			"abc@gmail.com.aa.au");
		
		for (String userEmail : emailIds) {
			validTest(userRegistrationValid,userEmail);	
		}
	}
}
