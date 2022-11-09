package com.TryCloud.step_definitions;

import com.TryCloud.pages.US_11_DashboardPage;
import com.TryCloud.pages.US_11_LoginPage;
import com.TryCloud.utilities.ConfigReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_11_StepDefs {
    US_11_LoginPage us_11_loginPage = new US_11_LoginPage();
    US_11_DashboardPage us_11_dashboardPage = new US_11_DashboardPage();


    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigReader.getProperty("env"));
        us_11_loginPage.loginUser.sendKeys(ConfigReader.getProperty("username1"));
        us_11_loginPage.loginPass.sendKeys(ConfigReader.getProperty("password"));

        us_11_loginPage.loginBtn.click();

    }
    @When("the user clicks the {string} module")
    public void theUserClicksTheModule(String string) {
        us_11_dashboardPage.module(string);
    }

    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String expectedTitle)  {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

     //  us_11_dashboardPage.logout();
    }



}
