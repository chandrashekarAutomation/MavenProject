package com.actiTime.reportTest;

import org.testng.annotations.Test;

public class ReportTest 
{
	@Test(groups=("smokeTest"))
	public void createReportTest()
	{
		System.out.println("execute createReportTest");
	}
	@Test(groups=("regressionTest"))
	public void modifyReportTest()
	{
		System.out.println("execute modifyReportTest");
	}
	@Test(groups=("regressionTest"))
	public void deleteReportTest()
	{
		System.out.println("execute deleteReportTest");
	}
}
