package com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void unitLevel1() {
	  System.out.println("testClass: Unit Level1 testing");
  }
  @Test
  public void unitLevel2() {
	  System.out.println("testClass:Unit Level2 testing");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("testClass: before method");
  }
  @BeforeMethod
  public void staticbeforeMethod() {
	  System.out.println("testClass: static before method");
  }
@Parameters({"param"})
  @BeforeMethod
  public void beforeMethodWithParam(String p) {
	  System.out.println("testClass: before method with param "+p);
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("testClass: after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("testClass: before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("testClass: after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("testClass: before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("testClass: after Test");
  }

}
