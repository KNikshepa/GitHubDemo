package com.stepDefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class datatable1 {
	@When("User enters following user details")
	public void user_enters_following_user_details(io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String, String>> userDetails = dataTable.asMaps(String.class, String.class);
	    for (Map<String, String> user : userDetails) {
	        System.out.println("First Name: " + user.get("First Name"));
	        System.out.println("Last Name: " + user.get("Last Name"));
	        System.out.println("Email: " + user.get("Email"));
	        System.out.println("Phone: " + user.get("Phone"));
	        System.out.println("City: " + user.get("City"));
	        System.out.println("Contact Person: " + user.get("Contact Person"));
	        System.out.println("Contact Email: " + user.get("Contact Email"));
	        System.out.println("Contact Phone: " + user.get("Contact Phone"));
	        System.out.println("Contact Address: " + user.get("Contact Address"));
	    }
	    
	    
	    List<String> userDetails1 = dataTable.asList();
	    int columnCount = dataTable.width();
	    for (int i = 0; i < userDetails1.size(); i += columnCount) {
	        System.out.println("First Name: " + userDetails1.get(i));
	        System.out.println("Last Name: " + userDetails1.get(i + 1));
	        System.out.println("Email: " + userDetails1.get(i + 2));
	        System.out.println("Phone: " + userDetails1.get(i + 3));
	        System.out.println("City: " + userDetails1.get(i + 4));
	        System.out.println("Contact Person: " + userDetails1.get(i + 5));
	        System.out.println("Contact Email: " + userDetails1.get(i + 6));
	        System.out.println("Contact Phone: " + userDetails1.get(i + 7));
	        System.out.println("Contact Address: " + userDetails1.get(i + 8));
	}
	}

	@Then("user registration should be successful")
	public void user_registration_should_be_successful() {
	    System.out.println("User registration is successful.");
	}

}
