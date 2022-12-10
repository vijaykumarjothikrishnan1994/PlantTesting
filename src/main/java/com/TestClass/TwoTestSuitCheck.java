package com.TestClass;

import org.testng.annotations.Test;

import com.itextpdf.text.log.SysoCounter;

public class TwoTestSuitCheck {
	@Test
	public static void Suit23() {
		
		System.out.println("This is test(suite)");
		
	}
	
	@Test(priority = 1)
public static void Suit22() {
		
		System.out.println("This is test(suite)");
		
	}
	@Test(priority = 2)
public static void Suit2() {
	
	System.out.println("This is test(suite)");
	
}
	@Test(priority = 3)
public static void Suit25() {
	
	System.out.println("This is test(suite)");
	
}


}
