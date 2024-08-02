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

import utility.BaseClass;

public class ListenersVtiger extends BaseClass implements ITestListener{

		ExtentSparkReporter spark;
		ExtentReports report;
		ExtentTest test;
		
		@Override
		public void onTestStart(ITestResult result) {
			String name = result.getMethod().getMethodName();
			Reporter.log(name,true);
			test = report.createTest(name);
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			String name = result.getMethod().getMethodName();
			Reporter.log("onTestSuccess",true);
			test.log(Status.PASS, name+" is Passed !");
		}

		@Override
		public void onTestFailure(ITestResult result) {
			String name = result.getMethod().getMethodName();
			test.log(Status.FAIL, name+" is Failed !");
			
					
			TakesScreenshot ts = (TakesScreenshot) driver;
			String from = ts.getScreenshotAs(OutputType.BASE64);
			test.addScreenCaptureFromBase64String(from);
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			String name = result.getMethod().getMethodName();
			Reporter.log("onTestSkipped",true);
			test.log(Status.SKIP, name+" is Skipped !");
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			Reporter.log("onTestFailedButWithinSuccessPercentage",true);
		}

		@Override
		public void onTestFailedWithTimeout(ITestResult result) {
			Reporter.log("onTestFailedWithTimeout",true);
		}

		@Override
		public void onStart(ITestContext context) {
			Reporter.log("onStart",true);
			
			spark = new ExtentSparkReporter("./ExtentReports/Report");
			spark.config().setDocumentTitle("Vtiger");
			spark.config().setTheme(Theme.DARK);
			spark.config().setReportName("Manikandan ");
			
			report = new ExtentReports();
			report.attachReporter(spark);
			report.setSystemInfo("OS", "Windows 10 ");
			report.setSystemInfo("Browser", "Chrome");
			report.setSystemInfo("Author", "sumaiya");
		}

		@Override
		public void onFinish(ITestContext context) {
			report.flush();
		}
	}



