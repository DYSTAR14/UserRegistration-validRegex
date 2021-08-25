package com.blz.test;

import java.util.Scanner;

import com.blz.userdetails_valid.UserRegistrationValid;

public class TestLastName {

	public static void validTest(UserRegistrationValid userRegistrationValid, String userName) {
		if (userRegistrationValid.lastName(userName)) {
			System.out.println("Your (" + userName + ") surName is Valid");
		} else {
			System.out.println("Your (" + userName + ") surName are Invalid");
		}
	}

	public static void main(String[] args) {
		UserRegistrationValid userRegistrationValid = new UserRegistrationValid();
		Scanner sc = new Scanner(System.in);
		int key = 0;
		while (key != 2) {
			System.out.println("Select From Option\n1.Enter Surname Name\n2.exit");
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("Enter Surname Name");
				String userSurName = sc.next();
				validTest(userRegistrationValid, userSurName);
				break;
			default:
				break;
			}
		}

	}
}
