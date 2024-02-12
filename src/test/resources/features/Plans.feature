
      Feature: Validate Plans Page
      Background:
       When click on login button
      Scenario: validate row of data
       And enter username as "supervisor"
       And enter password as "tek_supervisor"
       And click on sign in button
       And click on plans page
       Then Validate 4 row of data is present

      Scenario: Validate Create And Expire Date
        And enter username as "supervisor"
        And enter password as "tek_supervisor"
        And click on sign in button
        And click on plans page
        Then validate create date
        And validate expire date
