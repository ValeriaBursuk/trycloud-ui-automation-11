package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TryCloudLoginPage {
    public TryCloudLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "user")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement userPassword;

    @FindBy(id = "submit-form")
    public WebElement loginButton;

    public void login1(String username, String password){
        userName.sendKeys(username);
        userPassword.sendKeys(password);
        loginButton.click();
    }

}
