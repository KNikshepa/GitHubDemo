Feature: Amazon Order Page

  In order to check my order details
  As a registered user
  I want to specify the features of the order details page

Background:
Given a registered user exists
Given user is on Amazon login page
When user enters username
And user enters password
And user clicks on login button
Then user navigates to the order page

  Scenario: Check Previous Order Details
    When user clicks on previous order link
    And user checks the previous order details

  Scenario: Check Open Order Details
   When user clicks on  open order link
    And user checks the open order details

  Scenario: Check Cancelled Order Details
  When user clicks on  cancelled order link
    And user checks the cancelled order details
