package com.bai1.test;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//import static org.junit.Assume.assumeTrue;

import javax.annotation.processing.*;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
public class Bai1Test {
 private Bai1 math;
	@Before
	public void setUp() {
			math = new Bai1();
	}

	@After
	public void tearDown() {
		math = null;

	}

@Test
public void calls() { 
	assertEquals(0, math.getCalls());
	math.factorial(1);
	assertEquals(1, math.getCalls());
	math.factorial(1);
	assertEquals(2, math.getCalls());
	
}
@Test
public void factorial() { 
	assertTrue(math.factorial(0)==1);
	assertTrue(math.factorial(1)==1);
	assertTrue(math.factorial(5)==120);
}
@Test(expected = IllegalArgumentException.class)
public void factorialNegative() {
	math.factorial(-1);
}
@Ignore
@Test
public void todo() { 
	assertTrue(math.plus(1, 1)==3);
}
//	private Bai1 createTestSubject() {
//		return new Bai1();
//	}
//
//	@Test
//	public void testPlus() throws Exception {
//		Bai1 testSubject;
//		int num1 = 0;
//		int num2 = 0;
//		long result;
//
//		// default test
//		testSubject = createTestSubject();
//		result = testSubject.plus(4, 9);
//		assertEquals(10, result);
//	}
//
//
//	@Test
//	public void testFactorial() throws Exception {
//		Bai1 testSubject;
//		int number = 0;
//		long result;
//
//		// test 1
//		testSubject = createTestSubject();
//		number = 0;
//		result = testSubject.factorial(number);
//		Assert.assertEquals(null, result);
//
//		// test 2
//		testSubject = createTestSubject();
//		number = -1;
//		result = testSubject.factorial(number);
//		Assert.assertEquals(null, result);
//
//		// test 3
//		testSubject = createTestSubject();
//		number = 1;
//		result = testSubject.factorial(number);
//		Assert.assertEquals(null, result);
//
//		// test 4
//		testSubject = createTestSubject();
//		number = 1;
//		result = testSubject.factorial(number);
//		Assert.assertEquals(null, result);
//
//		// test 5
//		testSubject = createTestSubject();
//		number = 0;
//		result = testSubject.factorial(number);
//		Assert.assertEquals(null, result);
//
//		// test 6
//		testSubject = createTestSubject();
//		number = 2;
//		result = testSubject.factorial(number);
//		Assert.assertEquals(null, result);
//	}
//
//
//	@Test
//	public void testGetCalls() throws Exception {
//		Bai1 testSubject;
//		int result;
//
//		// default test
//		testSubject = createTestSubject();
//		result = testSubject.getCalls();
//	}
}