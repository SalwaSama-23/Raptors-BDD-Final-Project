
  Feature: Validate UserProfile Page
    Background:
      When click on login button
    Scenario: Validate Userprofile Information
      And enter username as "supervisor"
      And enter password as "tek_supervisor"
      And click on sign in button
      And click on profile button
      Then validate profile information is correct

    Scenario: Validate Logout Button
      When enter username as "supervisor"
      And enter password as "tek_supervisor"
      And click on sign in button
      And click on profile button
      And click on logout button
      Then validate user navigate to home page