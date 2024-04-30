package com.stepDefinition;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginAndLogutFunctionality {
	
	WebDriver driver;
	
	/*
	 * @Given("Launch the practice test login page.") public void
	 * launch_the_practice_test_login_page() { driver=new ChromeDriver();
	 * driver.manage().window().maximize();
	 * driver.get("https://practicetestautomation.com/practice-test-login/"); }
	 * 
	 * @When("User enters the username and password") public void
	 * user_enters_the_username_and_password() {
	 * driver.findElement(By.id("username")).sendKeys("student");
	 * driver.findElement(By.id("password")).sendKeys("Password123"); }
	 */
	/*
	 * @When("click on submit button") public void click_on_submit_button() {
	 * driver.findElement(By.id("submit")).click(); }
	 * 
	 * @Then("Verify the title of the page") public void
	 * verify_the_title_of_the_page() { String
	 * expectedTitle="Logged In Successfully | Practice Test Automation"; String
	 * actualTitle=driver.getTitle();
	 * Assertions.assertEquals(expectedTitle,actualTitle); }
	 * 
	 * @Then("click on Logout button") public void click_on_logout_button() {
	 * driver.findElement(By.xpath("//a[text()='Log out']")).click(); }
	 * 
	 * @Then("Verify the title of the page after logout") public void
	 * verify_the_title_of_the_page_after_logout() { String
	 * expectedTitle="Test Login | Practice Test Automation"; String
	 * actualTitle=driver.getTitle();
	 * Assertions.assertEquals(expectedTitle,actualTitle); driver.quit(); }
	 */
}
