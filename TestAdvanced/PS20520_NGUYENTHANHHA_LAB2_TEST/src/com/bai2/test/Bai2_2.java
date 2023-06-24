package com.bai2.test;

import org.junit.Assert;
import org.junit.Test;

public class Bai2_2 {
 @Test
 public void cretaAndSetName() { 
	 String expected = "Y";
	 String actual = "Y";
	 Assert.assertEquals(expected,actual);
	 System.out.println("Suite Test is successful "+ actual);
 }
}
