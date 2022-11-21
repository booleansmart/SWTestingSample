Feature: Combo Box Interactions

  Scenario: Display all data by clicking Home
    Given user navigates to Demo QA Elements page
    When user clicks on Check Box section
    And user checks home
    Then all data inside home are displayed

  Scenario: Display desktop data by clicking Desktop
    Given user navigates to Demo QA Elements page
    When user clicks on Check Box section
    And user clicks dropdown home
    And user checks desktop
    Then all data inside desktop are displayed