package pages;

import org.openqa.selenium.By;

import base.PredefinedActions;

public class LoginPage extends PredefinedActions {

	public void login(String userName, String password) {
		enterUsername(userName);
		enterPassword(password);
		clickOnSubmitBtn();

	}

	public void enterUsername(String username) {
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(password);
	}

	public void clickOnSubmitBtn() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}
	
	
	public boolean isLogoPresent() {
		return driver.findElement(By.xpath("//div[@class='organization-logo shadow']/img")).isDisplayed();

	}
	
	public String getTitle() {
		return driver.getTitle();
	}
}
