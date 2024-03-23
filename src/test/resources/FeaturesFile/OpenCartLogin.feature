@All
Feature: Test Open Cart loginn feature

  @Register
  Scenario: Test Registration with datatable
    Given Launch Opencart Register page
    When I enter required field is form
      | Fname | Lname  | Email              | Telephone  | password | Confirm |
      | Kiran | Sharma | Kiran123@gmail.com | 9867666574 | test123  | test123 |
    When I click on yes radio button
    When I click on Privacy policy
    When I click on Continue button
    Then I should able to Register into application

  @Login
  Scenario: Test login with valid credentials
    Given Launch OpenCart login page
    When I enter valid email "Sumit123@gmail.com" and valid password "test123"
    When I click on Login button from opencart login page
    Then I should be able to login into cart application
