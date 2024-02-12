
  Feature: Validate Account Page
    Background:
      When click on login button
    Scenario: Verify Row Of Page
      And enter username as "supervisor"
      And enter password as "tek_supervisor"
      And click on sign in button
      And click on Account button
      Then validate 5 row is exist

      Scenario Outline: Validate Account Change Show Per Page
      And enter username as "supervisor"
      And enter password as "tek_supervisor"
      And click on sign in button
      And click on Account button
      Then validate table records change per page according to selected show per "<row number>"
     Examples:
     | row number |
     | 10         |
     | 25         |
     | 50         |