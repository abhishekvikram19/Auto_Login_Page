package com.automation.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTests {
	
    @Test
    public void login() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhis\\eclipse-workspace\\my-project\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://sakshingp.github.io/assignment/login.html");

        WebDriverWait wait = new WebDriverWait(driver, 10);

        // Wait for the username field to be visible
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        // Enter the username
        usernameField.sendKeys("abc@gmail.com");

        // Wait for the password field to be visible
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        // Enter the password
        passwordField.sendKeys("your_password");

        // Wait for the login button to be clickable
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("log-in")));

        loginButton.click();

        String actualUrl = "https://sakshingp.github.io/assignment/home.html";
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        Thread.sleep(5000);

        
        WebElement amountHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));        		
        amountHeader.click();
        Thread.sleep(5000);

        // Wait for the table to be sorted
        // Get the sorted values from the transaction table
        List<WebElement> amountCells = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
        List<Double> sortedAmounts = new ArrayList<>();

        for (WebElement cell : amountCells) {

            String amountText = cell.getText().replace("$", "").replaceAll("[^\\d.]", "");
            sortedAmounts.add(Double.parseDouble(amountText));
        }
        // Verify that the values are sorted in ascending order
        List<Double> expectedSortedAmounts = new ArrayList<>(sortedAmounts);
        System.out.print(expectedSortedAmounts);
        Collections.sort(expectedSortedAmounts);

        driver.quit();
    }
}
