package com.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDemo {

    @Given("I have a search field on Amazon Page")
    public void i_have_a_search_field_on_amazon_page() {
        System.out.println("I have a search field on Amazon Page");
    }

    @When("I search for a product with name {string} and price {int}")
    public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
        System.out.println("I search for a product with name: " + productName + " and price: " + price);
    }

    @Then("Product with name {string} should be displayed")
    public void product_with_name_should_be_displayed(String productName) {
        System.out.println("Product with name " + productName + " should be displayed");
    }

    @Then("Order id is {int} and username is {string}")
    public void order_id_is_and_username_is(Integer orderId, String username) {
        System.out.println("Order id is " + orderId + " and username is " + username);
    }
}
