package com.TryCloud.step_definitions;

import com.TryCloud.pages.LoginPage;
import com.TryCloud.pages.US_11_DashboardPage;
import com.TryCloud.pages.US_11_LoginPage;
import com.TryCloud.pages.US_11_SendMessagePage;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.ConfigReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class US_11_StepDefs {
    US_11_LoginPage us_11_loginPage = new US_11_LoginPage();
    US_11_DashboardPage us_11_dashboardPage = new US_11_DashboardPage();
    US_11_SendMessagePage us_11_sendMessagePage =new US_11_SendMessagePage();


    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
       Driver.getDriver().get(ConfigReader.getProperty("env2"));
       us_11_loginPage.loginUser.sendKeys(ConfigReader.getProperty("username12"));
       us_11_loginPage.loginPass.sendKeys(ConfigReader.getProperty("password11"));
       us_11_loginPage.loginBtn.click();
        System.out.println("User is on dashboard page");

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


    @And("user enters the {string} in the search box")
    public void userEntersTheInTheSearchBox(String username) {
        us_11_dashboardPage.searchInput.sendKeys(username);
    }

    @And("user clicks on the {string} on the dropdown menu")
    public void userClicksOnTheOnTheDropdownMenu(String username) {
        us_11_dashboardPage.userNumber(username);
    }

    @And("user writes a {string}")
    public void userWritesA(String message) {
        us_11_sendMessagePage.sendMessageInput.sendKeys(message);

    }

    @And("user clicks to submit button")
    public void userClicksToSubmitButton() {
        BrowserUtils.sleep(2);
        us_11_sendMessagePage.sendMessageButton.click();
        BrowserUtils.sleep(2);
    }


    @Then("the user should be able to see the {string} is displayed on the conversation log")
    public void theUserShouldBeAbleToSeeTheIsDisplayedOnTheConversationLog(String expectedMessage) {
         for (WebElement eachMessage : us_11_sendMessagePage.messageOutput) {
            if(eachMessage.getText().equals(expectedMessage)){

                Assert.assertTrue(eachMessage.isDisplayed());
                break;
            }
        }

    }



}
