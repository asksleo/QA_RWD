Feature: Add a product to the cart
@colddrink
Scenario: Adding a colddrink to the cart
Given I am on PapaJohns page and Login it
When I select the cold drink
Then I am able to see it in the cart


@colddrink_login
Scenario: Adding a colddrink to the cart and add login details
Given I am on PapaJohns page and Login it
When I select the Login username and password
|username|password|
|testu12@gmail.com|@Papa007|
|karan|kumar|
Then I am able to see it in the cart

@colddrink_multiple
Scenario Outline:  Adding a colddrink to the cart and add login details with multiple set of data
Given I am on PapaJohns page and Login it
When I select the Login "<username>" and "<Password>"
Then I am able to see it in the cart

Examples:
|username|password|
|karan.kumar|@Papa007|
|karan.kr|@pop007|
|kr.karan|@papa|
|kumar.karan|@papaoo7|