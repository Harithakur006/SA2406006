package com.MyTests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListners implements ITestListener
{
	public void onStart(ITestContext result)
	{
		System.out.println("Test started!!!");
	}
	public void onFinish(ITestContext result)
	{
		System.out.println("Test finished!!!");
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Case Fail!!!");
	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test Case Skipped!!!");
	}
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test case started!!!");
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test Case Pass!!!");
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
	public void onTestFailedWithTimeout(ITestResult result)
	{
		
	}
}
