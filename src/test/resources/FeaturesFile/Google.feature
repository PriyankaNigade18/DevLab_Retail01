Feature: Test google application

Background: 
Given Open Google application


  Scenario: Test for Google page title
    #Given Open Google application
    When Get the actual title and compare with expected title
    Then Google page title should be Google only

  Scenario: Test search feature with valid keyword
    #Given Open Google application
    When I search with valid keyword in google
    Then I should ge valid search result
