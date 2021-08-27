package com.blz.using_junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ EmailTest.class, FirstNameTest.class, LastNameTest.class, MobileNumberTest.class, PasswordTest.class })
public class AllTests {

}
