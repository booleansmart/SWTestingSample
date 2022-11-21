Feature: Radio Button Interactions

  Scenario: Display Yes word in Text Success
    Given user navigates to Demo QA Elements page
    When user clicks on Radio Button section
    And user clicks on Yes
    Then Text Success is set to Yes

  Scenario: Display Impressive word in Text Success
    Given user navigates to Demo QA Elements page
    When user clicks on Radio Button section
    And user clicks on Impressive
    Then Text Success is set to Impressive