package com.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegularExpression {

@Given("Launch the URL {string}")
public void launch_the_url(String string) {
  System.out.println("step1");
}
@When("^User enters the username \"(.*)\" and password \"(.*)\"$")
public void user_enters_the_username_and_password(String username, String password) {
    System.out.println("step2");
}
@When("^click on submit button (\\d+)$")
public void click_on_submit_button(int buttonNumber) {
    System.out.println("step3");
}

@Then("^click on Logout button (\\d+\\.\\d+)$")
public void click_on_logout_button(float logoutButton) {
    System.out.println("step4");
}

@Then("Verify the title of the page")
public void verify_the_title_of_the_page() {
    
}

@Then("Verify the title of the page after logout")
public void verify_the_title_of_the_page_after_logout() {
   
}



}
