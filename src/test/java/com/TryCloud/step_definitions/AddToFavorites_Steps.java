package com.TryCloud.step_definitions;

import com.TryCloud.pages.LoginPage;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.ConfigReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import java.io.FileInputStream;
import java.io.IOException;

public class AddToFavorites_Steps {



    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("env"));
        String filepath = "TryCloud.xlsx";
        FileInputStream inputStream = new FileInputStream(filepath);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheet("Credentials");
        for(int i = 1; i < sheet.getLastRowNum(); i++){
            String username = sheet.getRow(i).getCell(0).toString();
            String password = sheet.getRow(i).getCell(1).toString();
            new LoginPage().login(username, password);
            break;
        }
       BrowserUtils.verifyTitleContains("Dashboard");

    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String files) {
        Driver.getDriver().findElement(By.xpath("(//a[@aria-label='"+files+"'])[1]")).click();
    }
    @When("the user clicks action-icon from any file on the page And user choose the {string} option")
    public void the_user_clicks_action_icon_from_any_file_on_the_page_and_user_choose_the_option(String option) {
        Driver.getDriver().findElement(By.xpath("//span[.='"+option+"']")).click();
    }
    @When("user click the {string} sub-module on the left side Then Verify the chosen file is listed on the table")
    public void user_click_the_sub_module_on_the_left_side_then_verify_the_chosen_file_is_listed_on_the_table(String favorites) {

    }


}
