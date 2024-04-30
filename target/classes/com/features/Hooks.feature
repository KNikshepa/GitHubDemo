Feature: Amazon Search

@Smoke
Scenario: Search a Product MacBook Air
  Given I have a search field on Amazon Page
  When I search for a product with name "Apple MacBook Air" and price 200
  Then Product with name "Apple MacBook Air" should be displayed
  And Order id is 12345 and username is "Naveen"

Scenario: Search a Product iPhone
  Given I have a search field on Amazon Page
  When I search for a product with name "iPhone" and price 1200
  Then Product with name "iPhone" should be displayed
  And Order id is 5677 and username is "Naveen automation"
