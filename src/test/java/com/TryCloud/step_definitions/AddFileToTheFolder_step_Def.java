package com.TryCloud.step_definitions;

import com.TryCloud.pages.ManageFolderPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class AddFileToTheFolder_step_Def {
    ManageFolderPage manageFolderPage = new ManageFolderPage();
    String fileName = "Screenshot 2022-11-10 at 3.02.38 PM.png";

    @When("user choose a folder from the page")
    public void user_choose_a_folder_from_the_page() {
        for (WebElement each: manageFolderPage.filesListInfo){
            if (each.getAttribute("data-file").equalsIgnoreCase("New File")){
                each.click();
            }
        }
    }
    @When("user clicks the add  icon on the top")
    public void user_clicks_the_add_icon_on_the_top() {
        manageFolderPage.AddingBtn.click();
    }
    @When("the user uploads a file with the upload file option")
    public void the_user_uploads_a_file_with_the_upload_file_option() {

        manageFolderPage.uploadFileLink.sendKeys("/Users/angelinabulgakova/Desktop/" + fileName);
    }
    @Then("Verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {

        boolean isNameMatch = false;

        for(WebElement each: manageFolderPage.filesListInfo){
            System.out.println(each.getAttribute("data-file"));
            if(each.getAttribute("data-file").equalsIgnoreCase(fileName)){
                isNameMatch = true;

            }
        }
        Assert.assertTrue(isNameMatch);



    }
}
