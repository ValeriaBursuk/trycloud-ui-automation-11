package com.TryCloud.pages;

import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='user']")
    public WebElement usernameInputBox;


    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInputBox;


    @FindBy(xpath = "//input[@class='login primary']")
    public WebElement loginButton;


    public void login(String username, String password) {
        usernameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password);
        loginButton.click();
    }


}