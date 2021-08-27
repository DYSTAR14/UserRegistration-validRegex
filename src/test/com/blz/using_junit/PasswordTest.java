package com.blz.using_junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.blz.userdetails_valid.UserRegistrationValid;

public class PasswordTest {

	UserRegistrationValid userRegistrationValid = new UserRegistrationValid();
	
	@Test
	public void testUserPasswordValid_success() {
		assertTrue(userRegistrationValid.Password("Deepak@123"));
	}
	
	@Test
	public void testUserPasswordMin8Letter_fail() {
		assertFalse(userRegistrationValid.Password("De@123"));
	}
	
	@Test
	public void testUserPassword1CapChar_fail() {
		assertFalse(userRegistrationValid.Password("deepak@123"));
	}
	
	@Test
	public void testUserPassword1Digit_fail() {
		assertFalse(userRegistrationValid.Password("Deepak@yadav"));
	}
	
	@Test
	public void testUserPassword1SmallChar_fail() {
		assertFalse(userRegistrationValid.Password("DEEPAK@123"));
	}
	
	@Test
	public void testUserPassword1SpecialSymbol_fail() {
		assertFalse(userRegistrationValid.Password("Deepak123"));
	}
	
	@Test
	public void testUserPasswordValid_fails() {
		assertFalse(userRegistrationValid.Password("Deepak@ 123"));
	}
	@Test
	public void testUserPasswordEmptyValue() {
		assertFalse(userRegistrationValid.Password(" "));
	}
}
