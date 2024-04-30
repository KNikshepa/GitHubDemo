Feature: Login Functionality with all the details mentioned in the feature file

Scenario: To verify the login functionality with user details mentioned with user id details

Given Launch the URL "https://practicetestautomation.com/practice-test-login/"
When User enters the username "student" and password "Password123"
And click on submit button
Then Verify the title of the page
Then click on Logout button
Then Verify the title of the page after logout