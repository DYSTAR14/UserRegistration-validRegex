package com.blz.using_junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.blz.exception.InvalidInputException;
import com.blz.userdetails_valid.UserRegistrationValid;

public class MobileNumberTest {

	UserRegistrationValid userRegistrationValid = new UserRegistrationValid();
	
	@Test
	public void testMobileValid_success() throws InvalidInputException {
		assertTrue(userRegistrationValid.MobileNumber("91 9819025627"));
	}
	
	@Test(expected = InvalidInputException.class)
	public void testMobile_LessDigitNumber_fail() throws InvalidInputException {
		userRegistrationValid.MobileNumber("234423");
	}
	
	@Test(expected = InvalidInputException.class)
	public void testMobile_MoreDigitNumber_fail() throws InvalidInputException {
		userRegistrationValid.MobileNumber("9819025627234");
	}
	
	@Test(expected = InvalidInputException.class)
	public void testMobileEmpty_fail() throws InvalidInputException {
		userRegistrationValid.MobileNumber(" ");
	}

}
