@e2e
Feature: End to end functionality to buy product
  As a user
  I should buy product successfully

  Scenario: Add product Connectors in to basket
    Given I am on the homepage
    When  I click on All Product Tab
    And   I select category from 'Connectors'
    And   I select sub-category from 'PCBConnectors'
    And   I select category pats from 'Backplane Accessories'
    And   I click on Add button of selected part by '476-457'
    Then  I add product in to basket successfully
    And   I click on Basket on right hand top corner
    And   I click on Checkout



      Scenario: Add product from Our Brands in to basket
        Given I am on the homepage
        When I click on Our Brands on home page
        And  I click on SEIMENS
        And  I click on Logic Modul under Popular categories for Siemens
        And  I click on product 'BARTH STG-600' Logic Control
        And  I click on Add to Basket tab next to quantity
        And  I click on Basket on right hand top corner
        Then Product should be added to basket page successsfully







