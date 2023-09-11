Feature: Register New User

  Scenario: [NEGATIVE] User Register with Empty Password
    Given user open install the apps
    And user close the pop-up
    When user click register link
    Then user in register page
    When user input field username "olvi" in register
    And user input field email "olvi@gmail.com" in register
    And user input field password "" in register
    And user click register button in register
    Then user see warning message "enter password" in register
    And user close the app
