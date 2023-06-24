package com.bai1.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class main {
	public static void main(String [] args) throws Exception{ 
		JUnitCore runner = new JUnitCore();	
		Result result = runner.run(Bai1Test.class);
		System.out.println("run test : "+ result.getRunCount());
		System.out.println("failed test : "+ result.getFailureCount());
		System.out.println("ignore test : "+ result.getIgnoreCount());
		System.out.println("success test : "+ result.wasSuccessful());
		
		}
}
