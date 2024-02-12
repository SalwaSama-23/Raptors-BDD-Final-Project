
Feature: Validate Login Page
  Background:
    When click on login button
  Scenario: Login With Credential
    And enter username as "supervisor"
    And enter password as "tek_supervisor"
    And click on sign in button
    Then validate page text is "Customer Service Portal"

  Scenario Outline: Login With Wrong Credentials
    And enter username as "<username>"
    And enter password as "<password>"
    And click on sign in button
    Then validate error message "<error_message>"
  Examples:
    |username     |password         |error_message              |
    |supervisor12 |tek_supervisor   |User supervisor12 not found|
    |supervisor   |tek_supervisor123|Password not matched       |
