package com.mazprojects.step_definitions;

import com.mazprojects.pages.LoginPage;
import com.mazprojects.utilities.ConfigurationReader;
import com.mazprojects.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("the user logs in as a {string}")
    public void the_user_logs_in_as_a(String loginType) {
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
        loginPage.loginAs(loginType);
    }

    @When("user enters username {string}")
    public void user_enters_username(String username) {
        loginPage.usernameInput.sendKeys(username);
    }

    @When("user enters password {string}")
    public void user_enters_password(String password) {
        loginPage.usernameInput.sendKeys(password);
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        loginPage.loginButton.click();
    }




}
