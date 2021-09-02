package com.blz.using_junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.blz.exception.InvalidInputException;
import com.blz.userdetails_valid.UserRegistrationValid;

public class LastNameTest {

	UserRegistrationValid userRegistrationValid = new UserRegistrationValid();
	
	@Test
	public void testLastNameValid_success() throws InvalidInputException {
		assertTrue(userRegistrationValid.lastName("Yadav"));
	}
	
	@Test(expected = InvalidInputException.class)
	public void testLastNameValid_fail() throws InvalidInputException {
		assertFalse(userRegistrationValid.lastName("yadav"));
	}
}
