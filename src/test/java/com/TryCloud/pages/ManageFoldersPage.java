package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFoldersPage {
public ManageFoldersPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}
    @FindBy (xpath = "//div[@class='header-left']/ul/li[2]")
    public WebElement FileFolder;

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement AddingBtn;

    @FindBy(xpath = "//span[.='Upload file']")
    public WebElement newFolderBtn;

    @FindBy(xpath = "//input[@id='view13-input-folder']")
    public WebElement inputOfFolderName;

    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement submitIcon;

    @FindBy(xpath = "//span[.='Upload file']")
    public WebElement uploadFileIcon;







}
