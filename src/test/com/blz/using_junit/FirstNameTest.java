package com.blz.using_junit;

import static org.junit.Assert.*;
import org.junit.Test;

import com.blz.exception.InvalidInputException;
import com.blz.userdetails_valid.UserRegistrationValid;

public class FirstNameTest {
	
	UserRegistrationValid userRegistrationValid = new UserRegistrationValid();
	
	@Test
	public void testFirstNameValid_success() throws InvalidInputException{
		assertTrue(userRegistrationValid.firstName("Deepak"));
	}
	
	@Test(expected = InvalidInputException.class)
	public void testFirstNameValid_fail() throws InvalidInputException {
		userRegistrationValid.firstName("deepak");
	}

}
