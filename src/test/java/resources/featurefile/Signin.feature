Feature: Sign in  Test
  As user I want to Sign in into efinancialcareers website

  Scenario: User should navigate to Sign in page successfully
    Given I am on homepage
    When I click on Sign in link
    And I click on Accept all
    And I enter email "rohan@gmail.com"
    And I click on Continue tab
    And I enter password "Kohlu@89"
    Then I click on Submit











