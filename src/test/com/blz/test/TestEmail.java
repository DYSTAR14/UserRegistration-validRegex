package com.blz.test;

import java.util.Scanner;

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
		int key = 0;
		while (key != 2) {
			try {
				System.out.println("Select From Option\n1.Enter Email ID\n2.exit");
				key = sc.nextInt();
				switch (key) {
				case 1:
					System.out.println("Enter Your Email");
					String userEmail = sc.next();
					validTest(userRegistrationValid, userEmail);
					break;
				default:
					break;
				}
			}catch (Exception e) {
				System.out.println(e);
				key=2;
			}
		}

	}
}
