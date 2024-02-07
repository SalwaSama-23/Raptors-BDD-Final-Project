
  Feature: validate userProfile Page
    Background:
      When click on login button
    Scenario: validate userprofile information
      And enter username as "supervisor"
      And enter password as "tek_supervisor"
      And click on sign in button
      And click on profile button
      Then validate profile information is correct

    Scenario: validate logout button
      When enter username as "supervisor"
      And enter password as "tek_supervisor"
      And click on sign in button
      And click on profile button
      And click on logout button
      Then validate user navigate to home page