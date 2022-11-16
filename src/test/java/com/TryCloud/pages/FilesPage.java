package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;


public class FilesPage {

    public FilesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='user']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;


    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement btnlogin;

    @FindBy(xpath = "//a[@class='recommendation']")
    public WebElement filesModule;

    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement checkAllFilesButton;

    @FindBy(xpath = "//div[@class='app-content-list-item-line-one']")
    public List<WebElement> contactNamesElements;

    @FindBy(xpath = "//label[@for='select-files-32986']")
    public WebElement clickCheckbox;

    @FindBy(xpath = "//label[contains(@for,'select-files')]/../input")
    public List<WebElement> SelectAllFiles;


    public void login(String username1, String password1) {
        username.sendKeys(username1);
        password.sendKeys(password1);
        btnlogin.click();
    }

    public List<String> getContactNames() {
        List<String> contactNames = new ArrayList<>();
        for (WebElement namesElement : contactNamesElements) {
            contactNames.add(namesElement.getText());
        }
        return contactNames;
    }

    public void assertCheckButtonsisChecked() {
        for (WebElement checkFileButton : SelectAllFiles) {
            Assert.assertTrue(checkFileButton.isSelected());
            //update



        }

    }
}
