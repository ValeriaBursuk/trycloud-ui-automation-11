package com.TryCloud.step_definitions;

import com.TryCloud.pages.BasePage;
import com.TryCloud.pages.LoginPage;
import com.TryCloud.pages.ManageFoldersPage;
import com.TryCloud.utilities.ConfigReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class manage_Folders_Step_Definitions {
    LoginPage loginPage = new LoginPage();
    ManageFoldersPage manageFoldersPage = new ManageFoldersPage();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigReader.getProperty("env"));
        loginPage.login("User11","Userpass123");


    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String moduleToClick) {
        BasePage.chooseTheMenu(moduleToClick);
    }

    @When("user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() {

    }
    @When("user click {string}")
    public void user_click(String string) {

    }

    @When("user write a folder name")
    public void user_write_a_folder_name() {

    }
    @When("the user click submit icon")
    public void the_user_click_submit_icon() {

    }
    @Then("Verify the folder is displayed on the page")
    public void verify_the_folder_is_displayed_on_the_page() {

    }






    @When("user choose a folder from the page")
    public void user_choose_a_folder_from_the_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user uploads a file with the upload file option")
    public void the_user_uploads_a_file_with_the_upload_file_option() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
