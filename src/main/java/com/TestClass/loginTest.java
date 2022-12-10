package com.TestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Libraries.Libraries;
import com.base.InitBrowser;

public class loginTest extends InitBrowser{
	
	 static Libraries lib;
	
	public loginTest() {
		// TODO Auto-generated constructor stub
		
		LaunchBrowser();
		driver.navigate().refresh();
	}
	@Test
	public static void Login() {
		
		
		
		
		
		lib.WaitAndClick("//a[contains(text(),'Log in')]", "//a[contains(text(),'Register')]", 20);
		
		lib.SendKeys("//input[contains(@id,'Email')]", "planittest78@gmail.com");
		lib.SendKeys("//input[contains(@id,'Password')]", "123456");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	WebElement eleClickLoginbtn=driver.findElement(By.xpath("//div[@class='inputs reversed']//following-sibling::div//input[contains(@type,'submit')]"));
		lib.javaScriptClick(eleClickLoginbtn);
	
		//lib.Click("//div[@class='inputs reversed']//following-sibling::div//input[contains(@type,'submit')]");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//lib.Click("//div[@class='inputs reversed']//following-sibling::div//input[contains(@type,'submit')]");
	String HomeTitle=	driver.getTitle();
	
	SoftAssert assertPage=new SoftAssert();
	assertPage.assertEquals(HomeTitle, "Demo Web Shop","Unable to land the home page");
	System.out.println("name of the page is :"+HomeTitle);
	
	WebElement eleAccountVerify=driver.findElement(By.xpath("//div[@class='header-links']//a[@class=\"account\"]"));
	
	lib.javaScriptClick(eleAccountVerify);
	
	String accountVerify=driver.findElement(By.xpath("//input[@name='Email']")).getAttribute("value");
	
	System.out.println("This is account name : "+accountVerify);
	
	
	  WebElement ele1=driver.findElement(By.xpath("//div[@class='header-menu']//a[contains(text(),'Computers')]")); Actions act=new
	  Actions(driver); act.moveToElement(ele1).perform();
	 
	
	  
	WebElement eleJavaClick_Desktop=  driver.findElement(By.xpath("//div[@class='header-menu']//a[contains(text(),'Desktops')]"));

	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	lib.javaScriptClick(eleJavaClick_Desktop);
	
	//driver.findElement(By.xpath(HomeTitle));
	WebElement SelectDesktop=driver.findElement(By.xpath("//span[contains(text(),'1200.00')]//parent::div[@class='prices']//parent::div//div[@class='buttons']//input"));
	lib.javaScriptClick(SelectDesktop);
	
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	lib.Click("//input[@id='product_attribute_16_3_6_18']");
	
	//driver.navigate().refresh();
	
	System.out.println("Before clicking HDD");
	
	//lib.Click("//label[text()='320 GB ']");
	
	WebElement eleSelectHDD=driver.findElement(By.xpath("//label[text()='320 GB ']"));
	lib.javaScriptClick(eleSelectHDD);
	System.out.println("After clicking HDD");
	System.out.println("Before clicking Add card");
	WebElement eleClick_AddCard= driver.findElement(By.xpath("//input[@type='button' and @id='add-to-cart-button-16']"));
	
	lib.javaScriptClick(eleClick_AddCard);
	
	System.out.println("After clicking Card");
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("before clicking Shopping card");
WebElement eleShoppingCard=	driver.findElement(By.xpath("//span[text()='Shopping cart']"));

lib.javaScriptClick(eleShoppingCard);
System.out.println("after clicking shopping Card");

	//lib.Click("//span[text()='Shopping cart']");

System.out.println("Before clicking TOS");
WebElement eleClickTermofcon=driver.findElement(By.xpath("//input[@name='termsofservice']"));

lib.javaScriptClick(eleClickTermofcon);

System.out.println("After clicking TOS");

System.out.println("Before clicking CheckOut");
WebElement eleClickCheckOut=driver.findElement(By.xpath("//button[@value='checkout']"));
lib.javaScriptClick(eleClickCheckOut);

System.out.println("Before clicking CheckOut");
	
WebElement eleClickContinue= driver.findElement(By.xpath("//input[@Onclick='Billing.save()']"));
	lib.javaScriptClick(eleClickContinue);
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	////input[@Onclick='Shipping.save()']
	//input[@Onclick='ShippingMethod.save()']
	
	WebElement eleClickContinue_shipping= driver.findElement(By.xpath("//input[@Onclick='Shipping.save()']"));
	lib.javaScriptClick(eleClickContinue_shipping);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	WebElement eleClickContinue_shipping_m= driver.findElement(By.xpath("//input[@Onclick='ShippingMethod.save()']"));
	lib.javaScriptClick(eleClickContinue_shipping_m);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//input[@Onclick='PaymentMethod.save()']
	WebElement eleClickContinue_shipping_m_c= driver.findElement(By.xpath("//input[@Onclick='PaymentMethod.save()']"));
	lib.javaScriptClick(eleClickContinue_shipping_m_c);
	assertPage.assertAll();
		
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	WebElement eleClickContinue_shipping_m_s= driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']"));
	lib.javaScriptClick(eleClickContinue_shipping_m_s);
	
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Final click before");
	
	WebElement eleClickContinue_shipping_m_sS= driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']"));
	lib.javaScriptClick(eleClickContinue_shipping_m_sS);
	
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Final click After ");
	
	
	}
	
	

}
