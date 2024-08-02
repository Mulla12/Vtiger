package extendReport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class sampleRepot {
	
	@Test	
public void basucReport()
{
	ExtentSparkReporter spark=new ExtentSparkReporter("./Reports/sampleReport.html");
	spark.config().setDocumentTitle("sampleReport");
	spark.config().setReportName("sumaiyya");
	spark.config().setTheme(Theme.DARK);

	ExtentReports report=new ExtentReports();
	//configure extent report
	report.setSystemInfo("Os", "Window-10");
	report.setSystemInfo("Browser", "Chrome-100");
	//attach the spark reporter to the extent report
	report.attachReporter(spark);
	ExtentTest test = report.createTest("basicReport");
	test.log(Status.INFO,"report is successfully created");
	report.flush();
	
	
	
}

}
