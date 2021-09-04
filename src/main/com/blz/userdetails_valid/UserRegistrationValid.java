package com.blz.userdetails_valid;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.blz.Constants;
import com.blz.exception.InvalidInputException;

interface IsValidate{
	public boolean IsValidPattern(String input, String regexPattern);
}

public class UserRegistrationValid {
	
	IsValidate check = (String input, String regexPattern) -> {
		Pattern pattern = Pattern.compile(regexPattern);
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();};
	
	public boolean firstName(String userFirstName) throws InvalidInputException {
		if(check.IsValidPattern(userFirstName, Constants.FIRST_NAME_REGEX))
			return true;
		else
			throw new InvalidInputException(Constants.INVALID_FIRST_NAME);
	}
	
	public boolean lastName(String userLastName) throws InvalidInputException {
		if(check.IsValidPattern(userLastName, Constants.LAST_NAME_REGEX))
			return true;
		else
			throw new InvalidInputException(Constants.INVALID_LAST_NAME);
	}
	
	public boolean EmailID(String userEmail) throws InvalidInputException {
//		return IsValidPattern(userEmail, Constants.EMAIL_ID_REGEX);
		if(check.IsValidPattern(userEmail, Constants.EMAIL_ID_REGEX))
			return true;
		else
			throw new InvalidInputException(Constants.INVALID_EMAIL_ID);
	}

	public boolean MobileNumber(String userMobile) throws InvalidInputException {
		if(check.IsValidPattern(userMobile, Constants.MOBILE_NUMBER_REGEX))
			return true;
		else
			throw new InvalidInputException(Constants.INVALID_MOBILE_NUMBER);
	}
	
	public boolean Password(String userPass) throws InvalidInputException {
		if(check.IsValidPattern(userPass, Constants.PASSWORD_REGEX))
			return true;
		else
			throw new InvalidInputException(Constants.INVALID_PASSWORD);
	}
}
