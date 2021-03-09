package com.login;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbLogin extends Excel{
	WebDriver driver;
	@BeforeMethod
	public void launchFbLoginPage() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	@Test(invocationCount=3,threadPoolSize=2)
	private void m1() {
		driver.findElement(By.id("email")).sendKeys("jaba");
		driver.findElement(By.id("pass")).sendKeys("1234");
System.out.println(Thread.currentThread().getId());
	}
	
	
//	@Test(dataProvider="logindata")
//	public void loginVerification(String userName, String pswrd) {
//		driver.findElement(By.id("email")).sendKeys(userName);
//		driver.findElement(By.id("pass")).sendKeys(pswrd);
//		
//		driver.findElement(By.name("login")).click();
//	}
//	
//	@DataProvider(name="logindata")
//	public Object[][] fetchdata() throws IOException{
//		return new Object[][] {{excel(0, 0),excel(1, 0)},{excel(0, 2),excel(1, 2)}};
//		
//		}
//	
//	@AfterMethod
//	public void closeBrowser() {
//		driver.quit();
//	}
	
	}
	
	

