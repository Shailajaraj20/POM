package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import View.LoginView;

public class AbstractTest {
 WebDriver driver;
 LoginView loginView;
 
 public AbstractTest()
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	
 }
 @BeforeTest
 public void envSetup()
 {
	 loginView = new LoginView();
	 PageFactory.initElements(driver, loginView);
 }
}
