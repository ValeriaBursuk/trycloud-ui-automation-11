package com.TryCloud.step_definitions;

import com.TryCloud.pages.LoginPage;
import com.TryCloud.pages.US_12_pages;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.ConfigReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_12_stepDefs {

    LoginPage loginPage = new LoginPage();
    US_12_pages us_12_pages = new US_12_pages();
     //BrowserUtils browserUtils = new BrowserUtils();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigReader.getProperty("env"));
        loginPage.username.sendKeys(ConfigReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigReader.getProperty("password"));
        loginPage.loginButton.click();
    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
   us_12_pages.module(string);

    }
    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String expectedTitle) {

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);

    }

}
