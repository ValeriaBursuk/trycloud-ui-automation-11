package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_11_DashboardPage {
    public US_11_DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[@aria-label='Talk'][1]")
    public WebElement talkModule;
    @FindBy(xpath = "//img[@src='/index.php/avatar/User11/32?v=0']")
    public WebElement userProfile;
    @FindBy (xpath = "//a[text()[normalize-space()='Log out']]")
    public WebElement logoutBtn;
    @FindBy(xpath = "//span[text()[normalize-space()='User51']]")
    public WebElement usersDropdown;

    public void module (String string ){
        WebElement selectedModule  = Driver.getDriver().findElement(By.xpath("(//a[@aria-label='"+string+"'])[1]"));
        selectedModule.click();
    }

    public void userNumber (String username){
        WebElement selectUsername = Driver.getDriver().findElement(By.xpath("//span[text()[normalize-space()='"+username+"']]"));
        selectUsername.click();
    }

    public void logout(){
        userProfile.click();
        logoutBtn.click();
    }

    @FindBy (xpath = "//input[@class='app-navigation-search__input']")
    public WebElement searchInput;

    @FindBy (xpath = "//div[@class='new-message-form__advancedinput']")
    public WebElement messageInputBox;

    @FindBy (xpath = "//button[@aria-label='Send message']")
    public WebElement submitButton;

}
