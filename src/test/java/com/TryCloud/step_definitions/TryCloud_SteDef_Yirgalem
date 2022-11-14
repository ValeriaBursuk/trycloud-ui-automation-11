package com.TryCloud.step_definitions;


import com.TryCloud.page.TryCloud_Page_Yirgalem;
import com.TryCloud.pages.DashboardModules_Page;
import com.TryCloud.utilities.ConfigReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TryCloud_SteDef_Yirgalem {

    TryCloud_Page_Yirgalem obj = new TryCloud_Page_Yirgalem();

    @Given("user on the login page")
    public void userOnTheLoginPage() {

        Driver.getDriver().get(ConfigReader.getProperty("env"));

    }


    @When("the users  log in with valid credentials")
    public void theUsersLogInWithValidCredentials() {

        obj.userName.sendKeys(ConfigReader.getProperty("username"));
        obj.password.sendKeys(ConfigReader.getProperty("password"));
        obj.login.click();

    }


    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String> expectedModule) {

       // List<WebElement> list=Driver.getDriver().findElements(By.xpath("//ul[@id='appmenu']//a"));

        List<String> actual=new ArrayList<>();
for(WebElement each:obj.Modules){
    actual.add(each.getAttribute("aria-label"));
}

            Assert.assertEquals(expectedModule,actual);
        }

}
