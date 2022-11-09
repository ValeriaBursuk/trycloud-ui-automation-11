package com.TryCloud.pages;

import com.TryCloud.utilities.ConfigReader;
import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_11_LoginPage {
    public US_11_LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    };

    @FindBy(id = "user")
    public WebElement loginUser;
    @FindBy(id = "password")
    public WebElement loginPass;

    @FindBy(id = "submit-form")
    public WebElement loginBtn;

    public void login(String username,String password){
        loginUser.sendKeys(username);
        loginPass.sendKeys(password);
        loginBtn.click();

    }
}
