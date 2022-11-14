package com.TryCloud.step_definitions;

import com.TryCloud.pages.*;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.ConfigReader;
import com.TryCloud.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.IOException;

public class AddToFavorites_Steps {

    FilesPage filesPage = new FilesPage();
    String expectedFile = null;
    Faker faker = new Faker();

    @Given("user on the Dashboard page")
    public void user_on_the_dashboard_page() throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("env"));
        new LoginPage().login(ConfigReader.getProperty("username"), ConfigReader.getProperty("password"));
//        String filepath = "TryCloud.xlsx";
//        FileInputStream inputStream = new FileInputStream(filepath);
//        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
//        XSSFSheet sheet = workbook.getSheet("Credentials");
//        for (int i = 1; i < sheet.getLastRowNum(); i++) {
//            String username = sheet.getRow(i).getCell(0).toString();
//            String password = sheet.getRow(i).getCell(1).toString();
//            new LoginPage().login(username, password);
//        }
//        BrowserUtils.verifyTitleContains("Dashboard");
    }

    @When("the user clicks the {string} Files module")
    public void the_user_clicks_the_module(String files) {
        new DashboardModules_Page().click_on_module(files);
    }

    @When("the user clicks action-icon from any file on the page And user choose the Add to favorites option")
    public void the_user_clicks_action_icon_from_any_file_on_the_page_and_user_choose_the_option() {

        expectedFile = filesPage.add_file_to_favorites();

    }

    @When("user click the Favorites {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String favorites) {
        filesPage.click_on_sub_module(favorites).click();
    }

    @Then("Verify the chosen file is listed on the table")
    public void verify_the_chosen_file_is_listed_on_the_table() {
        String actualFileNames = "";

        for (WebElement eachFile : filesPage.allFiles) {
            actualFileNames += eachFile.getText() + " ";
        }

        Assert.assertTrue("File wasn't added to favorites!", actualFileNames.contains(expectedFile));
    }

    @When("user clicks on Add New Folder, adds Folder name and enters information")
    public void user_clicks_on_add_new_folder_adds_folder_name_and_clicks_submit() {
        filesPage.addFile.click();
        filesPage.newFolder.click();
        filesPage.newFolderName.clear();
        expectedFile = faker.lorem().word();
        filesPage.newFolderName.sendKeys(expectedFile + Keys.ENTER);
    }
    @When("user clicks on Star icon in the opened side view")
    public void user_clicks_on_star_icon_in_the_opened_side_view() {
        filesPage.starSideBar.click();
        BrowserUtils.sleep(1);
    }

}
