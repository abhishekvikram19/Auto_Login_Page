package com.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Homepage {

	WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public Homepage(WebDriver driver) {
          this.driver = driver;
	}
	
	
	//Locator for username field
	By amount = By.id("amount");
	
	//Locator for password field
	By cells = By.xpath("//table/tbody/tr/td[5]");
	
	//Locator for login button
	By loginBtn = By.id("log-in");
	
	
	//Method to enter username
	public void clickAmount() {
		driver.findElement(amount).click();
	}
}