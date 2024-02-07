
Feature: validate create account page
  Background:
    When click on create primary account button
  Scenario: validate form title
    Then validate form title is "Create Primary Account Holder"

  Scenario: Create valid new account
    When  fill Create Primary Account Holder form
       | emailAddress |    random@gmail.com |
      |firstName        |  Alex          |
      |gender           |  Male          |
      |employmentStatus |  student       |
      |title            |  Mr.           |
      |lastName         |   John         |
      |martialStatus    |  Single        |
      |dateOfBirth      | 06/26/1995       |
    Then click on Create Account button
    And Validate user navigate to "Sign up your account" page
    And validate email address displays as expected

  Scenario: validate existing email address
    When  fill up Create Primary Account Holder form
      |emailAddress |    random12@gmail.com |
      |firstName        |  Sadaf          |
      |gender           |  Female          |
      |employmentStatus |  student       |
      |title            |  Mr.           |
      |lastName         |   Azizi         |
      |martialStatus    |  Single        |
      |dateOfBirth      | 09/23/1993     |
    Then click on Create Account button
    And validate error message is "Account with email random12@gmail.com is exist"

