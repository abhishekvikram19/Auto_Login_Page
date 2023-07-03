# Auto_Login_Page 
visit- https://abhishekvikram19.github.io/Auto_Login_Page/
 This will cover all the possible functional testing scenario, and n the transaction table and check the values are sorted.
 Setting up the project:
Set up a Maven Using Eclipse IDE.
Adding Selenium WebDriver and TestNG dependencies in the project.
Once the project is set up, createing a new package ("com.automation.tests") inside the source folder.
Creating new Java classes within the package, for the Login Page & Home Page(LoginPageTests) tests and as follows
Project Object Model Creating HomePage, LoginPage, Testcase.
Then Updating the Selenium WebDriver &  and adding TestNG dependencies to the project
adding the ChromeDriver path
Note: I'm provide the ChromeDriver in the project folder
To update the "path/to/chromedriver" with the correct path.
System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

Now,runing the test classes using TestNG. Right-click on each test class file and select "Run" or "Run with TestNG" to execute the tests.
![TestNG_reports](https://github.com/abhishekvikram19/Auto_Login_Page/assets/24250895/aee77a69-f303-4ca0-8127-be987c4bc133)

I had mentioned 5 test Cases as Follows:
1.This case will provide Username and password
2.This case will provide only Username
3.This case will provide only password
4.This case will provide no data
5.This case will check (click the AMOUNT header in the transaction table and check the values are sorted)
Here the Provided Code
![TestCase](https://github.com/abhishekvikram19/Auto_Login_Page/assets/24250895/8558597a-1c0d-4732-b1cb-d2fa0d871dc2)


TestNG will run the tests, and the results will be displayed in the test runner window in the IDE. Assertions will be validated, and any failures or errors will be reported.

For generating HTML reports, integrating a reporting library ExtentReports or TestNG HTML Reporters into project. Follow the documentation of the specific reporting library you choose to incorporate for generating HTML reports.
Home Page
![HomePage](https://github.com/abhishekvikram19/Auto_Login_Page/assets/24250895/8eda9037-2c14-454d-a8d6-3aec297c0fa8)

Login Page
![LoginPage](https://github.com/abhishekvikram19/Auto_Login_Page/assets/24250895/99e62777-7523-4943-a791-eb444808455d)

Main Page
![MainLoginPage](https://github.com/abhishekvikram19/Auto_Login_Page/assets/24250895/a737c2cf-88ec-42bf-89c2-d0acd73b3f36)



