Feature: Text Box Interactions

  Scenario: Successful Entry with Full Data
    Given user navigates to Demo QA Elements page
    When user clicks on Text Box section
    And users enters Full Name
    And user enters correct email
    And user enters address
    And user enters permanent address
    And user clicks submit button
    Then all the data are displayed below the form

  Scenario: Successful Entry without Email
    Given user navigates to Demo QA Elements page
    When user clicks on Text Box section
    And users enters Full Name
    And user enters address
    And user enters permanent address
    And user clicks submit button
    Then all the data are displayed below the form except email

  Scenario: Failed Entry with incorrect email
    Given user navigates to Demo QA Elements page
    When user clicks on Text Box section
    And users enters Full Name
    And user enters incorrect email
    And user enters address
    And user enters permanent address
    And user clicks submit button
    Then data is not displayed