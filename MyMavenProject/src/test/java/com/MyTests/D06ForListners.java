package com.MyTests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.MyTests.MyListners.class)
public class D06ForListners {
  @Test
  public void test1() {
	  System.out.println("First Test");
	  Assert.assertTrue(true);
  }
  @Test
  public void test2() {
	  System.out.println("Second Test");
	  Assert.assertTrue(false);
  }
  @Test
  public void test3() {
	  System.out.println("Third Test");
	  throw new SkipException("Skipping this test case");
  }
}
