package com.scp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.scp.testng.AppConstants;
import com.scp.testng.LoginController;

public class LoginTest {
	
	@Test
	  public void invalidLogin() {
		  LoginController loginController = new LoginController();
		  Assert.assertEquals(loginController.authenticate("admin","admi"),AppConstants.LOGIN_FAILED);
	  }
	  
	  @Test
	  public void validLogin() {
		  LoginController loginController = new LoginController();
		  Assert.assertEquals(loginController.authenticate("admin","admin123"),AppConstants.LOGIN_SUCCESSSFUL);
	  }
	  
	  @Test
	  public void passwordNull() {
		  LoginController loginController = new LoginController();
		  Assert.assertEquals(loginController.authenticate("admin",null),AppConstants.USERNM_PASSWORD_CANNOT_BLANK);
	  }
	  
	  @Test
	  public void usernameNull() {
		  LoginController loginController = new LoginController();
		  Assert.assertEquals(loginController.authenticate(null,"adm"),AppConstants.USERNM_PASSWORD_CANNOT_BLANK);
	  }
	  
	  @Test
	  public void bothNull() {
		  LoginController loginController = new LoginController();
		  Assert.assertEquals(loginController.authenticate(null,null),AppConstants.USERNM_PASSWORD_CANNOT_BLANK);
	  }

}
