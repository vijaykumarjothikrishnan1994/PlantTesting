package com.TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Mythra {

static	WebDriver driver;
		
		@Test(invocationCount = 1)
		public static void LoginPage() {
			
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver",
				"E:\\Softwares\\Eclipse_Workspace\\BaseWorkspace\\Driver\\CD\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.myntra.com/");
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//div[@class='desktop-navLink']//child::a[text()='Men']

	}

}
