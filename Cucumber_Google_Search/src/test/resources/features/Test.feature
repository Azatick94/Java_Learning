Feature: Google Main Search Page https://www.google.com/
  Validate Google Search Start-Up Page

  @web
  Scenario: Validate Google Search Text
    Given I open Browser
    When I navigate to Google Home Page https://www.google.com/
    Then I should see Google Image
    And I should see Input Form where I can type
    And I should see Button I'm Feeling Lucky

  Scenario: Validate Cucumber Search in Google Main Page
    Given I open Browser
    When I navigate to Google Home Page
    And Type "Cucumber" in Input Form
    And Click Enter
    Then I should see Google Search Results
    And I should see "Cucumber is a software tool that supports behavior-driven development." text in right corner of search
