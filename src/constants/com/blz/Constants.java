package com.blz;

public class Constants {
	public static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}";
	public static final String LAST_NAME_REGEX = "^[A-Z][a-z]{2,}";
	public static final String EMAIL_ID_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9]+\\.){1,2}[a-zA-Z]{2,7}$";
	public static final String MOBILE_NUMBER_REGEX = "^[0-9]{2}[ ][6789]{1}+[0-9]{9}$";
	public static final String PASSWORD_REGEX = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-])(?=\\S+$).{8,}$";
	
	public static final String INVALID_FIRST_NAME = "User FirstName Invalid";
	public static final String INVALID_LAST_NAME = "User LastName Invalid";
	public static final String INVALID_EMAIL_ID = "User Email Invalid";
	public static final String INVALID_MOBILE_NUMBER = "User Mobile Number Invalid";
	public static final String INVALID_PASSWORD = "User Password Invalid";
}
