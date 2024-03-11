Feature: select delivery order type
  @store_selection_delivery
  Scenario:select a store for delivery a order
    Given open "edge" browser and load the online website URL
    When I entered  street details and zip code in delivery section
    Then I clicked on my submit button
    Then I close the browser after verified


