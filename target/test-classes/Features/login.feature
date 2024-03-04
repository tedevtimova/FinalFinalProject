Feature:Login Functionality

  Background:
    Given the user is at the Login page


    Scenario Outline: Unsuccessful login with credentials
      When the user enters invalid "<username>" and "<password>"
      And clicks on the Login button
      Then the login should be unsuccessful and the user should see a "<message>" that the credentials are incorrect
      Examples:
      |username|password|message|
      |standard_user|secrets_sauce|Epic sadface: Username and password do not match any user in this service|
      |standard_userr|secret_sauce|Epic sadface: Username and password do not match any user in this service|


  Scenario Outline: Unsuccessful login without credentials
    When the user leaves username and password empty
    And clicks on the Login button
    Then the login should be unsuccessful and the user should see a "<message>" that credentials are required
    Examples:
    |message|
    | Epic sadface: Username is required|


  Scenario Outline: Successful login
    When the user enters valid "<username>" and "<password>"
    And clicks on the Login button
    Then the login should be successful
    Examples:
      |username|password|
      |standard_user|secret_sauce|