package com.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class backgroundFeature {
	
	@Given("a registered user exists")
	public void a_registered_user_exists() {
	    System.out.println("A registered user is already in the system.");
	}

	@Given("user is on Amazon login page")
	public void user_is_on_amazon_login_page() {
	    System.out.println("User is on the Amazon login page.");
	}

	@When("user enters username")
	public void user_enters_username() {
	    System.out.println("User enters the username.");
	}

	@When("user enters password")
	public void user_enters_password() {
	    System.out.println("User enters the password.");
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    System.out.println("User clicks on the login button.");
	}

	@Then("user navigates to the order page")
	public void user_navigates_to_the_order_page() {
	    System.out.println("User successfully navigates to the order page.");
	}

	@When("user clicks on previous order link")
	public void user_clicks_on_previous_order_link() {
	    System.out.println("User clicks on the previous order link.");
	}

	@When("user checks the previous order details")
	public void user_checks_the_previous_order_details() {
	    System.out.println("User checks the details of the previous order.");
	}



	@When("user checks the open order details")
	public void user_checks_the_open_order_details() {
	    System.out.println("User checks the details of the open order.");
	}

	@When("user checks the cancelled order details")
	public void user_checks_the_cancelled_order_details() {
	    System.out.println("User checks the details of the cancelled order.");
	}


@When("user clicks on  open order link")
public void user_clicks_on_open_order_link() {
	System.out.println("User clicks on the open order link.");
}

@When("user clicks on  cancelled order link")
public void user_clicks_on_cancelled_order_link() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("User clicks on the cancelled order link.");
}

}
