Feature: Register and Login

  Scenario: [POSITIVE] User Successfully Registered and Login to App
    Given user open install the apps
    And user close the pop-up
    When user click register link
    Then user in register page
    When user input field username "olvi" in register
    And user input field email "olvi@gmail.com" in register
    And user input field password "olvi123" in register
    And user input field confirm "olvi123" in register
    And user click register button in register
    And user tap back button
    When user input username "olvi@gmail.com" in login
    And user input password "olvi123" in login
    And user click login button
    Then verify user "olvi@gmail.com" is successfully login
    And user close the app
