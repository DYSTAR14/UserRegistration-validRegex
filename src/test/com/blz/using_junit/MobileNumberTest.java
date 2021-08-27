package com.blz.using_junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.blz.userdetails_valid.UserRegistrationValid;

public class MobileNumberTest {

	UserRegistrationValid userRegistrationValid = new UserRegistrationValid();
	
	@Test
	public void testMobileValid_success() {
		assertTrue(userRegistrationValid.MobileNumber("91 9819025627"));
	}
	
	@Test
	public void testMobile_LessDigitNumber_fail() {
		assertFalse(userRegistrationValid.MobileNumber("234423"));
	}
	
	@Test
	public void testMobile_MoreDigitNumber_fail() {
		assertFalse(userRegistrationValid.MobileNumber("9819025627234"));
	}
	
	@Test
	public void testMobileEmpty_fail() {
		assertFalse(userRegistrationValid.MobileNumber(" "));
	}

}
