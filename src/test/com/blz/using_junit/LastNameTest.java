package com.blz.using_junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.blz.userdetails_valid.UserRegistrationValid;

public class LastNameTest {

	UserRegistrationValid userRegistrationValid = new UserRegistrationValid();
	@Test
	public void testLastNameValid_success() {
		assertTrue(userRegistrationValid.lastName("Yadav"));
	}
	
	@Test()
	public void testLastNameValid_fail() {
		assertFalse(userRegistrationValid.lastName("yadav"));
	}
}
