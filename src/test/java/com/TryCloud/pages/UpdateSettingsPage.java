package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateSettingsPage {
    public UpdateSettingsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Files']//*[name()='svg']//*[name()='image' and contains(@class,'app-icon')]")
    public WebElement filesModule;

    @FindBy(xpath = "//button[@class='settings-button']")
    public WebElement settingsButton;

    @FindBy(xpath = "//label[.='Show rich workspaces']")
    public WebElement button1;

    @FindBy(xpath = "//label[.='Show recommendations']")
    public WebElement button2;

    @FindBy(xpath = "//label[.='Show hidden files']")
    public WebElement button3;

    @FindBy(partialLinkText = "KB used")
    public WebElement storageUsage;

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement uploadButton;
    @FindBy(xpath = "//input[@type='file']")
    public WebElement uploadFile;

    @FindBy(xpath = "//div[@class='crumb svg crumbhome']")
    public WebElement upload;



}
