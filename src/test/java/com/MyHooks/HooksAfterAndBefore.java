package com.MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class HooksAfterAndBefore {

	@Before("@Smoke")
	public void setUp(Scenario sc)
	{
		System.out.println("Launch the amazon application");
		System.out.println(sc.getName());
	}
	
	@Before(order=2)
	public void setupUrl()
	{
		System.out.println("Lunched the url");
	}

	@After(order=2)
	public void tearDown(Scenario sc)
	{
		System.out.println("Close the browser");
		System.out.println(sc.getName());
	}
	
	@After(order=1)
	public void logout()
	{
		System.out.println("Logout from the application");
	}
	
	@BeforeStep
	public void takescreenshot()
	{
		System.out.println("Screenshot is taken");
	}
	
	@AfterStep
	public void refresh()
	{
		System.out.println("Page refreshed");
	}
}
