package com.TryCloud.step_definitions;

import com.TryCloud.pages.LoginPage;
import com.TryCloud.pages.TryCloudLoginPage;
import com.TryCloud.pages.UpdateSettingsPage;
import com.TryCloud.utilities.ConfigReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UpdateSettingsVerification {
    TryCloudLoginPage tryCloudLoginPage=new TryCloudLoginPage();
    UpdateSettingsPage updateSettingsPage=new UpdateSettingsPage();
    String str;

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigReader.getProperty("env"));
        tryCloudLoginPage.login1(ConfigReader.getProperty("username"),ConfigReader.getProperty("password"));
    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        updateSettingsPage.filesModule.click();

        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }
    @When("user clicks Settings on the left bottom corner")
    public void user_clicks_settings_on_the_left_bottom_corner() {
        updateSettingsPage.settingsButton.click();

    }
    @Then("the user should be able to click any buttons")
    public void the_user_should_be_able_to_click_any_buttons() {
        updateSettingsPage.button1.click();
        System.out.println(updateSettingsPage.button1.isEnabled());
        updateSettingsPage.button2.click();
        System.out.println(updateSettingsPage.button2.isEnabled());
        updateSettingsPage.button3.click();
        System.out.println(updateSettingsPage.button3.isEnabled());

    }
    @When("user checks the current storage usage")
    public void user_checks_the_current_storage_usage() {
        str= updateSettingsPage.storageUsage.getText();
        System.out.println(updateSettingsPage.storageUsage.getText());
    }
    @When("user  uploads file with the upload file option")
    public void user_uploads_file_with_the_upload_file_option() {
        updateSettingsPage.uploadButton.click();
        updateSettingsPage.uploadFile.sendKeys("C:/Users/bazel/Downloads/DAY 6 CLASS_NOTES.txt");
        updateSettingsPage.upload.click();
    }
    @When("user refresh the page")
    public void user_refresh_the_page() {
        Driver.getDriver().navigate().refresh();

    }
    @Then("the user should be able to see storage usage is increased")
    public void the_user_should_be_able_to_see_storage_usage_is_increased() {

        String str2=updateSettingsPage.storageUsage.getText();
        System.out.println(updateSettingsPage.storageUsage.getText());
        char [] arr = str.toCharArray();
        String a1 = "";

        for (char each : arr) {
            if(Character.isDigit(each)){
                a1 += each+"";
                System.out.print(a1+" ");
            }
        }
        System.out.println();
        char [] arr2 = str2.toCharArray();

        String a2 ="";
        for (char each : arr2) {
            if(Character.isDigit(each)){
                a2 +=each+"";
                System.out.print(a2+" ");
            }
        }
        int number1 = Integer.parseInt(a1);
        int number2 = Integer.parseInt(a2);

        if (number1 < number2){
            System.out.println(" Passed");
        }else{
            System.out.println(" Not passed");
        }

    }

}

