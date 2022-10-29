
  Feature: NextbaseCRM login feature
    User Story:
    As a user, I should be able to login with correct credentials of different
    accounts and arrive on the dashboard page.

    Accounts are: HR, Marketing, Helpdesk

    Background: For the scenario in the feature file, user is expected to be on the login page
      Given the user logs in as a "<userType>"

    @Marketing @Helpdesk @HR @wip
    Scenario: Login as "<userType>"
      When user enters username "<username>"
      And user enters password "<password>"
      Then user should see the dashboard



