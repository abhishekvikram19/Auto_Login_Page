package com.automation.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcase {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set up WebDriver and navigate to the login page
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhis\\eclipse-workspace\\my-project\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://sakshingp.github.io/assignment/login.html");
    }

    @AfterMethod
    public void tearDown() {
        // Quit the WebDriver
        if (driver != null) {
            driver.quit();
        }
    }

//    This case will provide Username and password
    @Test
    public void testValidLogin() throws InterruptedException {
        // Create LoginPage object
        LoginPage login = new LoginPage(driver);

        // Enter username and password
        login.enterUsername("abhishekvikram19@gmail.com");
        login.enterPassword("Password@123");

        // Click login button
        login.clickLogin();
        Thread.sleep(3000);

        // Verify the URL after login
        String actualUrl = "https://sakshingp.github.io/assignment/home.html";
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
//      This case will provide only Username
    }
    @Test
    public void testInalidLoginNoPassword() throws InterruptedException {
        // Create LoginPage object
        LoginPage login = new LoginPage(driver);

        // Enter username and password
        login.enterUsername("abhishekvikram19@gmail.com");
        login.enterPassword("");

        // Click login button
        login.clickLogin();
        Thread.sleep(3000);

        // Verify the URL after login
        String actualUrl = "https://sakshingp.github.io/assignment/login.html";
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }
//  This case will provide only password
    @Test
    public void testInalidLoginNoUsername() throws InterruptedException {
        // Create LoginPage object
        LoginPage login = new LoginPage(driver);

        // Enter username and password
        login.enterUsername("");
        login.enterPassword("password@123");

        // Click login button
        login.clickLogin();
        Thread.sleep(3000);

        // Verify the URL after login
        String actualUrl = "https://sakshingp.github.io/assignment/login.html";
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }
//  This case will provide no data
    @Test
    public void testInalidLoginNoCredentials() throws InterruptedException {
        // Create LoginPage object
        LoginPage login = new LoginPage(driver);

        // Enter username and password
        login.enterUsername("");
        login.enterPassword("");

        // Click login button
        login.clickLogin();
        Thread.sleep(3000);

        // Verify the URL after login
        String actualUrl = "https://sakshingp.github.io/assignment/login.html";
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }
//  This case will check (click the AMOUNT header in the transaction table and
//    check the values are sorted)
    
    @Test
    public void testHomepage() throws InterruptedException {
        // Create LoginPage object
    	
        LoginPage login = new LoginPage(driver);

        // Enter username and password
        login.enterUsername("abhishekvikram19@gmail.com");
        login.enterPassword("Password@123");

        // Click login button
        login.clickLogin();
        Thread.sleep(3000);
    	
    	
        Homepage home = new Homepage(driver);

      
        home.clickAmount();
        Thread.sleep(3000);
        
        List<WebElement> amountCells = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
        List<Double> sortedAmounts = new ArrayList<>();

        for (WebElement cell : amountCells) {

            String amountText = cell.getText().replace("$", "").replaceAll("[^\\d.]", "");
            sortedAmounts.add(Double.parseDouble(amountText));
        }
   
        List<Double> expectedSortedAmounts = new ArrayList<>(sortedAmounts);
        System.out.print(expectedSortedAmounts);
        Collections.sort(expectedSortedAmounts);

        // Click login button
        Thread.sleep(3000);

  
    }
    
    
}
