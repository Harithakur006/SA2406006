package com.BeforeAfterDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Demo1 {
  @Test
  public void test1() {
	  System.out.println("Test 1_Demo1");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class Demo1");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class Demo1");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite");
  }

}
