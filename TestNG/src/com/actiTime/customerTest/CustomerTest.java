package com.actiTime.customerTest;

import org.testng.annotations.Test;

public class CustomerTest 
{
	@Test(groups=("smokeTest"))
	public void createCustomerTest()
	{
		System.out.println("execute createCustomerTest");
	}
	@Test(groups=("regressionTest"))
	public void modifyCustomerTest()
	{
		System.out.println("execute modifyCustomerTest");
	}
	@Test(groups=("regressionTest"))
	public void deleteCustomerTest()
	{
		System.out.println("execute deleteCustomerTest");
	}

}
