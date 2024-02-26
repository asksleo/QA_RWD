Feature: select a store on the RWD site.
  @store_selection_carryout
  Scenario: select a store for carryout a order
    Given open "chrome" browser and load the online website URL
    Given I am on store selection page
    When I click on Want to carry it out button
    Then I given the store zip code as "66061" for carryout order
    Then I click on submit button
    Then select the store in store list
    Then I varify store address as "1925" on home page is displayed or not
    Then I close the brower after verifed
