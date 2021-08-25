package com.blz.test;

import java.util.Scanner;

import com.blz.userdetails_valid.UserRegistrationValid;

public class TestFirstName {
	public static void validTest(UserRegistrationValid userRegistrationValid, String userName) {
		if(userRegistrationValid.firstName(userName)) {
			System.out.println("Your ("+userName+") Name is Valid");
		}
		else {
			System.out.println("Your ("+userName+") Name are Invalid");
		}
	}
	
	public static void main(String[] args) {
		UserRegistrationValid userRegistrationValid = new UserRegistrationValid();
		Scanner sc = new Scanner(System.in);
		int key=0;
		while(key!=2) {
			System.out.println("Select From Option\n1.Enter First Name\n2.exit");
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("Enter First Name");
				String userName = sc.next();
				validTest(userRegistrationValid, userName);
				break;
			default:
				break;
			}
		}
		
	}

}
