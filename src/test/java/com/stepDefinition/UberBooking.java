package com.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBooking {

    @Given("User wants to select a car type {string} from uber application")
    public void user_wants_to_select_a_car_type_from_uber_application(String carType) {
        System.out.println("User wants to select a " + carType + " car from the Uber application.");
    }

    @When("User selects car {string} and pick up point {string} and drop location {string}")
    public void user_selects_car_and_pick_up_point_and_drop_location(String carType, String pickUpPoint, String dropLocation) {
        System.out.println("User selects a " + carType + " car from " + pickUpPoint + " to " + dropLocation + ".");
    }

    @Then("Driver starts the journey")
    public void driver_starts_the_journey() {
        System.out.println("The driver starts the journey.");
    }

    @Then("Driver ends the journey")
    public void driver_ends_the_journey() {
        System.out.println("The driver ends the journey.");
    }

    @Then("User pays {int} USD")
    public void user_pays_usd(Integer amount) {
        System.out.println("User pays " + amount + " USD.");
    }
}
