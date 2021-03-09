package com.parallelecexution;

import org.testng.annotations.Test;

public class B {
	@Test
	public void tc11() {
		System.out.println("test case 11, threadno: "+Thread.currentThread().getId());
	}
	@Test
	public void tc12() {
		System.out.println("test case 12, threadno: "+Thread.currentThread().getId());
	}
	
	@Test
	public void tc13() {
		System.out.println("test case 13, threadno: "+Thread.currentThread().getId());
	}
	
	
	
	
	
	
}
