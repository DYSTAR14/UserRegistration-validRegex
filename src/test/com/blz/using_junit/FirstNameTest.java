package com.blz.using_junit;

import static org.junit.Assert.*;
import org.junit.Test;
import com.blz.userdetails_valid.UserRegistrationValid;

public class FirstNameTest {
	
	UserRegistrationValid userRegistrationValid = new UserRegistrationValid();
	@Test
	public void testFirstNameValid_success() {
		assertTrue(userRegistrationValid.firstName("Deepak"));
	}
	
	@Test
	public void testFirstNameValid_fail() {
		assertFalse(userRegistrationValid.firstName("deepak"));
	}

}
