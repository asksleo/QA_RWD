@delivery_order_creditcard_using_datatable
  @smoke
  @regression
Feature: Order 4 Web-Delivery-order-Complete-for-existing-user - Place Web delivery orders for Day 1
  As a user with an existing account

  Scenario: Order 4 Web-Delivery-order-Complete-for-existing-user - Place Web delivery orders with credit card(using datatable) for Day 1.
    Given open "edge" browser and load the online website URL
    Given I am on store selection page
   # When I entered  street details and zip code in delivery section
    When I entered  street details and zip code in delivery section using datatable
      | Country | Address_Type  | Street_Address                          |ZIP_CODE_Delivery       |
      | USA     | Residence     | 101 s parker street olathe          | 66061                  |
    Then I clicked on my submit button
   # Then select the store in store list
    Then I verify store address as "1925" on home page is displayed or not
    Then I click on Login button
    Then I logged in using "webcarryoute2eee@outlook.com" username and "TestUser!1" password on RWD application
    And  I choose the Product "Pepperoni" from home Page
    And  I added some extras toppings "Cheesesticks" from given list
    And  I click on Checkout button on home page
    Then I Handle the Popup if coming on checkout page
    And  I click on More Payment Option button on Contact and Payment page
#    And  I doing the payment using "cash" option on Contact and Payment page\
    And  I doing the payment using credit card on Contact and Payment page
      | cardnumber             | nameoncard    | expirymonth    | expiryyear | zipcode | securitycode | Card Type     |
      | 4715150005146643       | Sam Hall      | 0626      | 2029       | 40223   | 999          | Discover Card |
    Then I click on review your order button on  Contact and Payment page
    And  I click on Olo Place Your Order button on Cart page
    Then I should be on Order Detail Page
    And  I get the estimated amount from review your order page and verified with order confirmation page
    Then I close the browser after verified