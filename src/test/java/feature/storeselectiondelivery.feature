Feature: select delivery order type
  @store_selection_delivery
  Scenario:select a store for delivery a order
    Given I am store selection page
    When I entered  street details and zip code in delivery section
    Then I clicked on my submit button
    Then I close the brower after verifed


