package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US9Page {
    public US9Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //login:
    @FindBy(xpath = "//input[@id='user']")
    public WebElement userName;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginBtn;


    // My scenario:
    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Files']")
    public WebElement filesModule;

    @FindBy(xpath = "//a[@data-action='menu']//span[@class='icon icon-more']") //6 options
    public List<WebElement> actionIconThreeDots;

    @FindBy(xpath = "//a[@class='menuitem action action-details permanent']//span[.='Details']")
    public  WebElement detailsOption;

    @FindBy(xpath = "//a[@id='commentsTabView']")
    public WebElement commentsBtn;

    @FindBy(xpath = "//div[@data-placeholder='New comment …'] ")
    public WebElement newCommentInputBox;

    @FindBy(xpath = "//input[@class='submit icon-confirm has-tooltip']")
    public WebElement submitButton;

//    @FindBy(xpath = "(//li[contains(@class,'comment')])[1]")
//    public WebElement actualComment;
//
//

    @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement commentToAppear;




    public boolean messageOutput (String input){
       WebElement message=Driver.getDriver().findElement(By.xpath("//div[.='"+ input + "']" ));

        return  message.isDisplayed();
    }


}
