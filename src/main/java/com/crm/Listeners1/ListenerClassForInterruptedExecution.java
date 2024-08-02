package com.crm.Listeners1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerClassForInterruptedExecution implements ITestListener{
	ExtentReports report;
	ExtentSparkReporter spark;
	ExtentTest test;
	
	
	public void onTestStart(ITestResult result) {
		String t_name=result.getMethod().getMethodName();
		Reporter.log(t_name+" is executed");
		test=report.createTest(t_name);
		
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
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		String t_name=result.getMethod().getMethodName();
		test.log(Status.SKIP,t_name+"is skipped");
		
	}
	@Override
	public void onStart(ITestContext context) {
		spark=new ExtentSparkReporter("./Reports/multiple.html");
		spark.config().setDocumentTitle("sampleReport");
		spark.config().setReportName("sumaiyya");
		spark.config().setTheme(Theme.DARK);
		
		report=new ExtentReports();
		
		report.setSystemInfo("os", "window-10");
		report.setSystemInfo("Browser", "chrome-100");
		report.attachReporter(spark);
		
		
	}
	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}
		//
	
	

}
