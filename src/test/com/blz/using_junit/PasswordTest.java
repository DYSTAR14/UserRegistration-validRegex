package com.blz.using_junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.blz.exception.InvalidInputException;
import com.blz.userdetails_valid.UserRegistrationValid;

public class PasswordTest {

	UserRegistrationValid userRegistrationValid = new UserRegistrationValid();
	
	@Test
	public void testUserPasswordValid_success() throws InvalidInputException {
		assertTrue(userRegistrationValid.Password("Deepak@123"));
	}
	
	@Test(expected = InvalidInputException.class)
	public void testUserPasswordMin8Letter_fail() throws InvalidInputException {
		userRegistrationValid.Password("De@123");
	}
	
	@Test(expected = InvalidInputException.class)
	public void testUserPassword1CapChar_fail() throws InvalidInputException {
		userRegistrationValid.Password("deepak@123");
	}
	
	@Test(expected = InvalidInputException.class)
	public void testUserPassword1Digit_fail() throws InvalidInputException {
		userRegistrationValid.Password("Deepak@yadav");
	}
	
	@Test(expected = InvalidInputException.class)
	public void testUserPassword1SmallChar_fail() throws InvalidInputException {
		userRegistrationValid.Password("DEEPAK@123");
	}
	
	@Test(expected = InvalidInputException.class)
	public void testUserPassword1SpecialSymbol_fail() throws InvalidInputException {
		userRegistrationValid.Password("Deepak123");
	}
	
	@Test(expected = InvalidInputException.class)
	public void testUserPasswordValid_fails() throws InvalidInputException {
		userRegistrationValid.Password("Deepak@ 123");
	}
	
	@Test(expected = InvalidInputException.class)
	public void testUserPasswordEmptyValue() throws InvalidInputException {
		userRegistrationValid.Password(" ");
	}
}
