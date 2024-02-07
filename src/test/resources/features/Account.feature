#Navigate to Customer Service Portal with valid CSR credentials and
# navigate to Accounts verify 5 row /page is default
  Feature: validate Account page
    Background:
      When click on login button
    Scenario: verify row of page
      And enter username as "supervisor"
      And enter password as "tek_supervisor"
      And click on sign in button
      And click on Account button
      Then validate five row is exist

      #Navigate to Customer Service Portal with valid CSR credentials and navigate to
      # Accounts change show per page to 10, 25, 50 and validate table records per page according to selected show per page.
      Scenario Outline: validate account change show per page
      And enter username as "supervisor"
      And enter password as "tek_supervisor"
      And click on sign in button
      And click on Account button
      Then validate table records change per page according to selected show per "<row number>"
  Examples:
     | row number |
     | 10          |
     | 25          |
     | 50          |