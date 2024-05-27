package web.service;

import org.junit.Assert;
import org.junit.Test;

public class LoginServiceUnitTest {
	
	@Test
	public void testValidLogin() {
		String username = "bruce";
		String password = "bruce_pass";
		String dob = "2024-05-05";
		
		boolean result = LoginService.login(username, password,dob);
		Assert.assertTrue(result);
	}
	
	@Test
	public void testinvalidUsername() {
		String username = "invalid";
		String password = "bruce_pass";
		String dob = "2024-05-05";
		
		boolean result = LoginService.login(username, password,dob);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testInvalidPassword() {
		String username = "bruce";
		String password = "invalid";
		String dob = "2024-05-05";
		
		boolean result = LoginService.login(username, password,dob);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testInvalidDob() {
		String username = "bruce";
		String password = "bruce_pass";
		String dob = "2024-05-04";
		
		boolean result = LoginService.login(username, password,dob);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testEmptyUsername() {
		String username = "";
		String password = "bruce_pass";
		String dob = "2024-05-05";
		
		boolean result = LoginService.login(username, password,dob);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testEmptyPassword() {
		String username = "bruce";
		String password = "";
		String dob = "2024-05-05";
		
		boolean result = LoginService.login(username, password,dob);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testEmptyDob() {
		String username = "bruce";
		String password = "bruce_pass";
		String dob = "";
		
		boolean result = LoginService.login(username, password,dob);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testNullValues() {
		String username = null;
		String password = null;
		String dob = null;
		
		boolean result = LoginService.login(username, password,dob);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testEalyBoundaryDob() {
		String username = "bruce";
		String password = "bruce_pass";
		String dob = "2024-05-04"; 
		
		boolean result = LoginService.login(username, password,dob);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testLateBoundaryDob() {
		String username = "bruce";
		String password = "bruce_pass";
		String dob = "2024-05-06"; 
		
		boolean result = LoginService.login(username, password,dob);
		Assert.assertFalse(result);
	}
	
	
}