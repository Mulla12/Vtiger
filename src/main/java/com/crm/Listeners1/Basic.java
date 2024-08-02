package com.crm.Listeners1;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import BaseClass.Task1BaseClass;
import Listeners1.TaseCaseBasic;

public class Basic extends Task1BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("onTestStart", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("onTestSuccess", true);

		
			}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source	=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshot/demo.jpeg");

		
		Reporter.log("onTestFailure", true);
		

			}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("onTestSkipped", true);


			}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		Reporter.log("onStart", true);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		Reporter.log("onFinish", true);
	}
	}
	


