Feature: Google Search

  Scenario: Search Google for Images
    Given I am on the Google home page
    When I search for "images"
    Then the search results page is displayed
    And I click on the "Images" link
    And the images search results page is displayed