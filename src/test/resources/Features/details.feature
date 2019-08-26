@tag
Feature: Fill the form
  I want to use this template for my feature file

  @tag1
  Scenario Outline: customer details
    Given User launch the Browser
    And Use click the Add customer button
    When User provide the details in details form "<fname>","<lname>","<email>","<Address>","<Mob>"
    Then User verify the customer id

    Examples: 
      | fname  | lname  | email             | Address   | Mob   |
      | kranti | kiran  | kranti@gmail.com  | ANDHIRA   | 99999 |
      | kiran  | kranti | kranthi@gmail.com | Chennai   | 88888 |
      | kk     | tk     | kktk@gmail.com    | Karnataka |  7777 |
