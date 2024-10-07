package com.BeforeAfterDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Demo2 {
  @Test
  public void test2() {
	  System.out.println("Test 2_Demo2");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class Demo2");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class Demo2");
  }

}
