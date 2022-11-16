package com.TryCloud.step_definitions;

import com.TryCloud.pages.US9Page;
import com.TryCloud.utilities.ConfigReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US9_stepDefinitions {
    US9Page us9Page = new US9Page();
 String expected;



    @Given("User logedIn and on the dashboard page")
    public void user_loged_in_and_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigReader.getProperty("env"));

        us9Page.userName.sendKeys("User11");
        us9Page.password.sendKeys("Userpass123");
        us9Page.loginBtn.click();
    }
    @When("the user clicks the Files module")
    public void theUserClicksTheFilesModule() {
        us9Page.filesModule.click();
    }
    @When("user click action-icon  from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {

        //here 6 of them.

        for (WebElement each : us9Page.actionIconThreeDots) {
            each.click();
            break;

        }

    }
    @And("user choose the Details option")
    public void userChooseTheDetailsOption() {
        us9Page.detailsOption.click();
        us9Page.commentsBtn.click();
    }

    @And("user write a comment {string} inside the input box")
    public void userWriteACommentInsideTheInputBox(String input) {
        us9Page.newCommentInputBox.sendKeys(input);
        System.out.println(us9Page.newCommentInputBox.getText());
        String expected = us9Page.newCommentInputBox.getText();
    }


    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {
        us9Page.submitButton.click();

    }
    @Then("Verify the comment is displayed in the comment section.")
    public void verify_the_comment_is_displayed_in_the_comment_section() {
   //    String actual=us9Page.actualComment.getText();
      //  Assert.assertEquals(expected, actual);







    }



}
