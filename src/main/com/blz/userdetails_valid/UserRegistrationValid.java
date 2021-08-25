package com.blz.userdetails_valid;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.blz.Constants;


public class UserRegistrationValid {
	public boolean IsValidPattern(String input, String regexPattern) {
		Pattern pattern = Pattern.compile(regexPattern);
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();
	}
	
	public boolean firstName(String userFirstName) {
		return IsValidPattern(userFirstName, Constants.FIRST_NAME_REGEX);
	}
}
