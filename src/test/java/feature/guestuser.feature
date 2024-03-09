Feature: Add a product in the cart for Guest user
  @guest_user_delivery
  Scenario: place a order from menu page for guest user
  # Given I am store selection page
    Given open "chrome" browser and load the online website URL
    When I entered  street details and zip code in delivery section
    Then I clicked on my submit button
    Then  I go to menu page and check available pizza
    Then select  Pepperoni Pizza
    Then I add to order in my cart page
    Then I checkout my order that is inside my cart
    Then I Select payment option is cash
    Given I enter (First Name:"Shubham",Last Name:"Singhvi", Email:"test@test.com",Phone Number :"7014552331")
    Then I check Understand and Terms conditions checkbox
    Then I click on Review button and place guest user order
    Then I close the browser after verified