package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_11_SendMessagePage {
    public US_11_SendMessagePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@class='new-message-form__advancedinput']")
    public WebElement sendMessageInput;

    @FindBy (xpath = "//button[@aria-label='Send message']")
    public WebElement sendMessageButton;

    @FindBy (xpath = "//div[@class='message__main__text']")
    public List <WebElement> messageOutput;


}
