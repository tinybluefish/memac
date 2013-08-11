package com.tbf.memac.services;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AuthenticatorTest {
	
	@Before
	public void setup() {
	}
	
	@Test
	public void shouldAllowValidUserWithValidPassword() {
		Authenticator authenticator = new Authenticator();
		assertTrue(authenticator.isUserValid("valudUser", "validPwd"));
	}
	
//	@Test
//	public void shouldBlockValidUserWithInvalidPassword() {
//		Authenticator authenticator = new Authenticator();
//		assertFalse(authenticator.isUserValid("valudUser", "validPwd"));
//	}
//	
//	@Test
//	public void shouldBlockInvalidUserWithValidPassword() {
//		Authenticator authenticator = new Authenticator();
//		assertFalse(authenticator.isUserValid("valudUser", "validPwd"));
//	}
//	
//	@Test
//	public void shouldBlockInvalidUserWithInvalidPassword() {
//		Authenticator authenticator = new Authenticator();
//		assertFalse(authenticator.isUserValid("valudUser", "validPwd"));
//	}

}
