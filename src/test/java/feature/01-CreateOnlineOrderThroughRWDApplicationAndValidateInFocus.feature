
@web1
Feature: place an Online order, then verify order details in Order Detail view screen in Focus

  As a user with an existing account
  I place an online order by online order application
  then I will verify order details in View Order detail screen

  @web_smoke
  @sumit
  @jump
  @web_demo
  Scenario: Log in with valid credentials and placed the order with Cash
    Given I am on the OnlineOrder_Home page on RWD application
    When I click Login button on RWD application
    Then I should be on OLO Login Screen
    Then I logged in using webautomation@gmail.com username and TestUser!1 password on RWD application
    And I choose the Product Pepperoni from home Page
    And I click on Cart button on home page
    Then I click on Olo Cart Checkout button on Cart page
    And I select papapriority option
    And I click on Cash button on Contact and Payment page
    Then I click on review your order button on  Contact and Payment page
    And I click on Olo Place Your Order button on Cart page
    Then I should be on Order Detail Page
    When I am logged in and clocked in as team member with helpdesk username and hdhdhd password
    And  I am using Order Entry application
    When I go to Browse Order screen
    Then I should be on Browse Order page
    And   I get the POS OrderID
    Then I search and select Online order 'restorderid'

  @sumitfocus
  @jump
  @indoria
  Scenario: Log in with valid credentials and placed the order with Cash
    Given I am on the OnlineOrder_Home page on RWD application
    When I click Login button on RWD application
    Then I should be on OLO Login Screen
    Then I logged in using username and password on RWD application
    And I choose the Prod uct from home Page
    And I click on Cart button on home page
    Then I click on Olo Cart Checkout button on Cart page
    And I select papapriority option
    And I click on Cash button on Contact and Payment page
    Then I click on review your order button on  Contact and Payment page
    And I click on Olo Place Your Order button on Cart page
    Then I should be on Order Detail Page
    When I am logged in and clocked in as team member with username and password
    And  I am using Order Entry application
    When I go to Browse Order screen
    Then I should be on Browse Order page
   # And   I get the POS OrderID
    Then I search and select Online order 'restorderid'


  Scenario: Log in with valid credentials and placed the order with credit card
    Given I am on the OnlineOrder_Home page on RWD application
    When I click Login button on RWD application
    Then I should be on OLO Login Screen
    Then I logged in using webcarryoutcase4@outlook.com username and TestUser!1 password on RWD application
    And I choose the Product Sausage from home Page
    And I click on Cart button on home page
    Then I click on Olo Cart Checkout button on Cart page
    Then I click credit card button on Contact & Payments page
    Then I pay with the following credit card details on Contact & Payments page:
      | cardnumber             | nameoncard    | expirymonth    | expiryyear | zipcode | securitycode |
      | 4715150010453398       | Connie Houston| 09 - September | 2019       | 40233   | 209          |
    Then I click on review your order button on  Contact and Payment page
    And I click on Olo Place Your Order button on Cart page
    Then I should be on Order Detail Page
    When I am logged in and clocked in as team member with MG1_L5 username and ADMIN2 password
    And  I am using Order Entry application
    When I go to Browse Order screen
    Then I should be on Browse Order page
    And   I get the POS OrderID
    Then I search and select order 'restorderid'


