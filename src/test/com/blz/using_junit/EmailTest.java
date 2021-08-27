package com.blz.using_junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.blz.userdetails_valid.UserRegistrationValid;

public class EmailTest {

	UserRegistrationValid userRegistrationValid = new UserRegistrationValid();
	@Test
	public void testEmailValid_success() {
		assertTrue(userRegistrationValid.EmailID("ydeepak141097@gmail.com"));
	}
	
	@Test()
	public void testEmailValid_fail() {
		assertFalse(userRegistrationValid.EmailID("@gamilydeepak14109.com"));
	}

}
