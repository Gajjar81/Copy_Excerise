package com.efinancialcareers.steps;

import com.efinancialcareers.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }
   @When("^I click on Sign in link$")
    public void iClickOnSignLink() {
        new HomePage().clickOnSignInLink();
    }
    @And("^I click on Accept all$")
    public void iClickOnAcceptAll() {
    }
  @And("^I enter email \"([^\"]*)\"$")
  public void iEnterEmail(String email) {
      new HomePage().enterEmailId(email);
  }
      @And("^I click on Continue tab$")
    public void iClickOnContinueTab()  {
        new HomePage().clickOnContinue();
    }
    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new HomePage().enterPassword(password);
    }
    @Then("^I click on Submit$")
    public void iClickOnSubmit() {
        new HomePage().clickonSubmit();
    }
}

