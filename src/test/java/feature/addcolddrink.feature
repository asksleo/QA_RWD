Feature: Add a product to the cart
@colddrink
Scenario: Adding a colddrink to the cart
Given I am on PapaJohns page and Login it
When I select the cold drink
Then I am able to see it in the cart
