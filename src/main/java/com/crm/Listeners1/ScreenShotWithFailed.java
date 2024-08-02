package com.crm.Listeners1;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import BaseClass.DwsScreenShot;

public class ScreenShotWithFailed extends DwsScreenShot implements ITestListener{
	
	ExtentReports report;
	ExtentSparkReporter spark;
	ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		String t_name=result.getMethod().getMethodName();
		Reporter.log(t_name+"is executed");
			}
	@Override
	public void onTestSuccess(ITestResult result) {
		String t_name=result.getMethod().getMethodName();
		test.log(Status.PASS, t_name+"is success");

	}
	@Override
	public void onTestFailure(ITestResult result) {
		String t_name=result.getMethod().getMethodName();
		test.log(Status.FAIL, t_name+"is failure");
		TakesScreenshot ts=(TakesScreenshot) driver;
		String screenShot=ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(screenShot);
			}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
		String t_name=result.getMethod().getMethodName();
		test.log(Status.SKIP, t_name+"is skipped");		
			}
	
	@Override
	public void onStart(ITestContext context) {
		spark=new ExtentSparkReporter("./Reports/failedTestCase.html");
		spark.config().setDocumentTitle("sampleReport");
		spark.config().setReportName("sumaiyya");
		spark.config().setTheme(Theme.DARK);
		report=new ExtentReports();
		report.setSystemInfo("OS", "window-10");
		report.setSystemInfo("Browser", "Chrome-100");
		report.attachReporter(spark);
			
		
	}
	@Override
	public void onFinish(ITestContext context) {
		report.flush();		

}
}
