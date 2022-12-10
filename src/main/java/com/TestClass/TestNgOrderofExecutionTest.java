package com.TestClass;

import org.testng.annotations.Test;

public class TestNgOrderofExecutionTest {
	@Test
	public static void Mytest() {
		System.out.println("This is My Test Main ");
		
	}
	@Test
	public static void Mytest4() {
		System.out.println("This is My Test But Last one without having priority");
		
	}
	@Test(priority=0)
	public static void Mytest1() {
		
		System.out.println("This is My Test0");
	}
	@Test(priority=1)
	public static void Mytest2() {
		System.out.println("This is My Test 1 ");
	}
	@Test(priority=2)
	public static void Mytest3() {
		System.out.println("This is My Test 2 ");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
