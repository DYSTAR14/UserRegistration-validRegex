package com.blz.test;

import java.util.Scanner;

import com.blz.userdetails_valid.UserRegistrationValid;

public class TestMobileNumber {
	public static void validTest(UserRegistrationValid userRegistrationValid, String userMobile) {
		if (userRegistrationValid.MobileNumber(userMobile)) {
			System.out.println("Your Number (" + userMobile + ") is Valid");
		} else {
			System.out.println("Your Number (" + userMobile + ") is Invalid");
		}
	}

	public static void main(String[] args) {
		UserRegistrationValid userRegistrationValid = new UserRegistrationValid();
		Scanner sc = new Scanner(System.in);
		int key = 0;
		while (key != 2) {
			try {
				System.out.println("Select From Option\n1.Enter Mobile Number\n2.exit");
				key = sc.nextInt();
				switch (key) {
				case 1:
					System.out.println("Enter Your Mobile Number");
					String userMobileNo = sc.next();
					validTest(userRegistrationValid, "91 "+userMobileNo);
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
