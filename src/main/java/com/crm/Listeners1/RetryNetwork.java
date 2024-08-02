package com.crm.Listeners1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryNetwork implements IRetryAnalyzer {
int Start=0, end=4;
	@Override
	public boolean retry(ITestResult result) {
		while(Start<end)
		{
			Start++;
			return true;
		}
		return false;
	}

}
