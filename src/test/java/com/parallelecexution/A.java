package com.parallelecexution;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A {


	@Test
	public void tc1() {
		System.out.println("test case 1, threadno:");
		System.out.println("bbbb");
	}
	

	@Test
	public void tc2() {
		System.out.println("test case 2, threadno: ");
		System.out.println("aaaa");
		assertTrue(false);
	}
	
	@Test
	public void tc3() {
		System.out.println("test case 3, threadno: ");
		assertTrue(false);
	}
	
	
}
