package com.TryCloud.step_definitions;

import com.TryCloud.pages.LoginPage;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.ConfigReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDef {


    LoginPage loginPage = new LoginPage();

    @Given("user on the login page")
    public void user_on_the_login_page() {
//        Driver.getDriver().get(ConfigReader.getProperty("env"));
        Driver.getDriver().get("http://qa2.trycloud.net/index.php/login?clear=1");

    }

    @When("user enters valid {string} and valid {string} and clicks login button")
    public void userEntersValidAndValidAndClicksLoginButton(String expectedUsername, String expectedPassword) {
        BrowserUtils.sleep(3);
        loginPage.login(expectedUsername, expectedPassword);

    }
//    @When("user enters valid {string} and valid {string}")
//    public void user_enters_valid_and_valid(String expectedUsername, String expectedPassword) {
//
//        loginPage.login(expectedUsername, expectedPassword);
//
//    }
//
//    @When("user clicks the login button")
//    public void user_clicks_the_login_button() {
//        loginPage.loginButton.click();
//
//    }

    @Then("user should be launched at the dashboard page")
    public void user_should_be_launched_at_the_dashboard_page() {
        Assert.assertEquals("http://qa2.trycloud.net/index.php/apps/dashboard/", Driver.getDriver().getCurrentUrl());

      //  Driver.getDriver().close();

    }


}
