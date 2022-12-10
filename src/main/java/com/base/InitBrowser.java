package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class InitBrowser {
	public static WebDriver driver;
	
	
	//@Test
	public static void LaunchBrowser() {
		
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver",
				"E:\\Softwares\\Eclipse_Workspace\\BaseWorkspace\\Driver\\CD\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demowebshop.tricentis.com/");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
