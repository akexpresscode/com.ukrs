@Search
Feature: Search functionality
  As a user,
  I should be able to use search functionality on uk.rs-online.com


  Scenario: Search box on home page
    When I enter url in to browser bar
    Then I should navigate to homepage successfully
    And I should see a search box successfully

  Scenario: Should list items containing certain keyword
    Given I want to buy a Batteries
    When I search for items containing "Batteries"
    Then I should only see items related to "Batteries"

  Scenario Outline: Should list items containing certain parts numbers
    Given I want to buy items using "<type>"
    When I enter "<partnumber>" in to search box
    Then I should only see item with "<type>" and "<partnumber>"

    Examples:
      | type         | partnumber |
      | Mfr. Part No | CSCAK/1    |
      | RS Stock No  | 537-5488   |
