package com.Libraries;

import java.time.Duration;//

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.InitBrowser;

public class Libraries extends InitBrowser{
	
	
	
	public static void Click(String xpath_clickBtn) {
		
		driver.findElement(By.xpath(xpath_clickBtn));
		
		
	}
public static void SendKeys(String xpath_sendKeys,String ValuesendKeys) {
		
		driver.findElement(By.xpath(xpath_sendKeys)).sendKeys(ValuesendKeys);
		
		
	}


public static void WaitAndClick(String waitClickElement,String Xpathwait,int i) {
	
	WebDriverWait waitClick=new WebDriverWait(driver, i);
	waitClick.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpathwait)));
	driver.findElement(By.xpath(waitClickElement)).click();
	
	
	//WebDriverWait wait=new WebDriverWait(driver, i);
	
	
	
}

public static void actionSMouseHover(String Move_xpath) {
	
	
	String xptha="jhdkjs";
	
	
	
}

public static WebElement javaScriptClick(WebElement clickJavaScriptxpath) {
	
	JavascriptExecutor exeClick=(JavascriptExecutor)driver;
	exeClick.executeScript("arguments[0].click();", clickJavaScriptxpath);
	return clickJavaScriptxpath;
}

}
