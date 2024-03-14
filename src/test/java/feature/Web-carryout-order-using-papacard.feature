@webcarryoutorderpapacard
@smoke
Feature: Order 3-Web-Carryout-papacard-order-Complete - Place Web carryout orders with papacard for Day 1
  As a user with an existing account

  Scenario: Order 3-Web-Carryout-papacard-order-Complete - Place Web carryout orders with papacard for Day 1.
    Given open "chrome" browser and load the online website URL
    Given I am on store selection page
    When I click on Want to carry it out button
    Then I given the store zip code as "66061" for carryout order
    Then I click on submit button
    Then select the store in store list
    Then I verify store address as "1925" on home page is displayed or not
    Then I click on Login button
    Then I logged in using "webcarryoute2eee@outlook.com" username and "TestUser!1" password on RWD application
    And  I choose the Product "Pepperoni" from home Page
    And  I added some extras toppings "Cheesesticks" from given list
    And  I click on Checkout button on home page
    Then I Handle the Popup if coming on checkout page
    And  I click on More Payment Option button on Contact and Payment page
    And  I doing the payment using "gift card" option on Contact and Payment page
    Then I click on review your order button on  Contact and Payment page
    And  I click on Olo Place Your Order button on Cart page
    Then I should be on Order Detail Page
    And  I get the estimated amount from review your order page and verified with order confirmation page
    Then I close the browser after verified







