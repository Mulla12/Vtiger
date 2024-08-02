package com.crm.Listeners1;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import BaseClass.DwsBaseListeners;

public class BasicListeners  extends DwsBaseListeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		String name=result.getMethod().getMethodName();
		Reporter.log(name, true);
	}
	

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("onTestSuccess", true);
			}

	@Override
	public void onTestFailure(ITestResult result) {
		LocalDateTime date=LocalDateTime.now();
		String time=date.toString().replace(":", "-");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File from=ts.getScreenshotAs(OutputType.FILE);
		File to=new File("./ScreenShot/DwsPage"+time+".png");
		try {
			FileHandler.copy(from, to);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("onTestSkipped", true);	}

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
