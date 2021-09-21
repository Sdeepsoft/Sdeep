Feature: Create an account

  Scenario: create an account
    Given Open the browser and enter url and press enter key
    Then System should navigate to Create Account screen of HN website
    Then Enter Firstname as "<Firstname>"
    Then Enter lastname as "<Lastname>"
    Then Enter Emailaddress as "<Emailaddress>"
    Then Enter Password as "<Password>"
    Then Enter RePassword as "<RePassword>"