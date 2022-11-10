package tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.PredefinedActions;
import pages.LoginPage;

public class LoginTests {
	LoginPage login =new LoginPage();
	
	@Test
	public void TC1_VerifyLoginFunctionality() {
		System.out.println("Step 1: Launch your oranage HRM URL");
		PredefinedActions.start("https://shubgupta-trials77.orangehrmlive.com/");
		
		System.out.println("Step 2: Verify Logo displayed on Login Page");
		Assert.assertEquals(login.isLogoPresent(), true,"Logo is not present");
		System.out.println("Logo is present");
		
		System.out.println("Step 3: User Login with valid credential");
		login.login("Admin", "dP3RD1i@Lu");
		

		System.out.println("Step 4:User should navigate to home page+ Conflicts-------");
		String expectedTitle= "Employee Management";
		String ActualTitle= login.getTitle();
		Assert.assertEquals(expectedTitle,ActualTitle,"Expected Title is "+expectedTitle+ "where as Actual Title is "+ ActualTitle);
		System.out.println("Login is successful and user is navigated to home page");
		System.out.println("Step 5: Closing the browser");
		PredefinedActions.closeBrowser();
		System.out.println("On Branch A for Aug batch11");
System.out.println("On branch AA");
		System.out.println("abdbd");
	}


}
