package com.TryCloud.step_definitions;

import com.TryCloud.pages.DashboardPage;
import com.TryCloud.pages.FilesPage;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.ConfigReader;
import com.TryCloud.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class TryCloudFiles_StepDef {

    FilesPage filesPage = new FilesPage();

    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("env3"));

    }

    @When("user enters valid {string} and valid {string} and clicks login button")
    public void user_enters_valid_and_valid_and_clicks_login_button(String username, String password) {
        filesPage.login(username, password);
    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String moduleName) {
        new DashboardPage().clickModulesWithText(moduleName);

    }

    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String expectedPageTitle) {
        BrowserUtils.sleep(2);
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedPageTitle, actualTitle);


    }

    @When("user click the top-left checkbox of the table")
    public void user_click_the_top_left_checkbox_of_the_table() {
        BrowserUtils.sleep(2);
        filesPage.checkAllFilesButton.click();


    }

    @Then("verify all the files are selected")
    public void verify_all_the_files_are_selected() {
        BrowserUtils.sleep(2);
        new FilesPage().assertCheckButtonsisChecked();


    }


}
