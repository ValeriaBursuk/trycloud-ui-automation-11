package com.TryCloud.step_definitions;

import com.TryCloud.pages.*;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.ConfigReader;
import com.TryCloud.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebElement;



public class DeleteFile_StepDefs {

    TrashBin_Page trashBin_page = new TrashBin_Page();
    OpenedFile_Page openedFile_page = new OpenedFile_Page();
    Faker faker = new Faker();
    public String deletedFile = "";


LoginPage loginPage = new LoginPage();

    @When("the user clicks the {string} Delete f module")
    public void the_user_clicks_the_module(String string) {

        Driver.getDriver().get(ConfigReader.getProperty("env"));
        loginPage.login(ConfigReader.getProperty("username"), ConfigReader.getProperty("password"));


//        BrowserUtils.sleep(3);

        DashboardModules_Page dashboardModules_page = new DashboardModules_Page();
        dashboardModules_page.click_on_module(string);
//        BrowserUtils.sleep(2);
    }


    @When("user click action-icon from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        int fakerSelection = 0;


//        BrowserUtils.sleep(2);
        for (int i = 0; i < openedFile_page.threeDotAction.size(); i++){
            fakerSelection = faker.number().numberBetween(0, openedFile_page.threeDotAction.size());
            openedFile_page.threeDotAction.get(fakerSelection).click();
            break;
        }
        //        BrowserUtils.sleep(2);
    }


    @When("user choose the {string} option")
    public void user_choose_the_option(String string ) {

//        BrowserUtils.sleep(2);
        for (WebElement eachOption : openedFile_page.actionDropDownMenu){
            if (eachOption.getText().contains(string)){
                eachOption.click();
                deletedFile+=eachOption;
                break;
            }
        }
//        BrowserUtils.sleep(2);
    }


    @When("the user clicks the {string} sub-module on the left side")
    public void the_user_clicks_the_sub_module_on_the_left_side(String string) {

//        BrowserUtils.sleep(3);
    for (WebElement eachFileOption : openedFile_page.navigationFile){

        if (eachFileOption.getText().equalsIgnoreCase(string)){
            eachFileOption.click();
            break;
        }
    }
        BrowserUtils.sleep(2);
    }


    @Then("Verify the deleted file is displayed on the page.")
    public void verify_the_deleted_file_is_displayed_on_the_page() {

//        BrowserUtils.sleep(3);
      for (WebElement eachDeletedFileString : trashBin_page.deletedFilesTable){
          if (eachDeletedFileString.getText().equals(deletedFile)){
              eachDeletedFileString.isDisplayed();
          }
      }
//        BrowserUtils.sleep(2);

    }










}
