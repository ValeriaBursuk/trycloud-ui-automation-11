package com.TryCloud.step_definitions;

import com.TryCloud.pages.BasePage;
import com.TryCloud.pages.LoginPage;
import com.TryCloud.pages.ManageFolderPage;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.ConfigReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class ManageFolder_Step_Def {
    LoginPage loginPage = new LoginPage();
   ManageFolderPage manageFolderPage = new ManageFolderPage();

    String newFolderName = "New File";

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
        manageFolderPage.AddingBtn.click();

    }
    @When("user click {string}")
    public void user_click(String optionToClick) {

        for (WebElement each : manageFolderPage.dropdownMenu){
            if (each.getText().equalsIgnoreCase(optionToClick)){
                each.click();
            }

        }
    }


    @When("user write a folder name")
    public void user_write_a_folder_name() {

        manageFolderPage.inputOfFolderName.sendKeys(newFolderName);
    }
    @When("the user click submit icon")
    public void the_user_click_submit_icon() {
        manageFolderPage.submitIcon.click();
        BrowserUtils.waitFor(2);
    }
    @Then("Verify the folder is displayed on the page")
    public void verify_the_folder_is_displayed_on_the_page() {
        boolean isNameMatch = false;
        for (WebElement each : manageFolderPage.filesListInfo){
            System.out.println(each.getAttribute("data-file"));
            if (each.getAttribute("data-file").equalsIgnoreCase(newFolderName)){
                isNameMatch = true;
            }
        }
        Assert.assertTrue(isNameMatch);
    }

}
