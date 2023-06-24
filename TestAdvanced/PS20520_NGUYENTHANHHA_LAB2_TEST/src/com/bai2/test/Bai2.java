package com.bai2.test;
import static org.junit.Assert.assertEquals;
import  org.junit.Test;
public class Bai2 {
	public String message = "Fpoly";
	JunitMessage junitMessage = new JunitMessage(message);
	@Test
	public void testJUnitMessage() {
		System.out.println("Junit Message is printting");
		assertEquals(message, junitMessage.printMessage(message));
		
	}
	@Test
	public void testJUnitMessageNew() {
		System.out.println("Junit Message is printting");
		assertEquals(message, junitMessage.printMessageNew(message));
		
	}
		// TODO Auto-generated method stub

	}

