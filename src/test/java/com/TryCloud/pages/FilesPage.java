package com.TryCloud.pages;

import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesPage {

    public FilesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement addFile;

    @FindBy(xpath = "//a[@data-templatename='New folder']")
    public WebElement newFolder;

    @FindBy(xpath = "//a//input[@id='view13-input-folder']")
    public WebElement newFolderName;

    @FindBy(xpath = "//a[@class='app-sidebar-header__star icon-star']")
    public WebElement starSideBar;

    @FindBy(xpath = "//a[@data-action='Favorite']")
    public WebElement addToFavorites;

    @FindBy(xpath = "//tbody[@id='fileList']//span[@class='innernametext']")
    public List<WebElement> allFiles;

    @FindBy(xpath = "((//tbody[@id='fileList'])[1])//a[@class='action action-menu permanent']")
    public List<WebElement> threeDotsElements;


    public String add_file_to_favorites() {
        WebElement chosenFile = null;
        for (int i = threeDotsElements.size()-1; i >= 0; i--) {
                chosenFile = allFiles.get(i);
                WebElement actionsMenu = threeDotsElements.get(i);
                String chosenFileName = chosenFile.getText();
                System.out.println("CHOOSEN FILE:" + chosenFileName);
                BrowserUtils.waitUntilClickable(actionsMenu);
                actionsMenu.click();
                BrowserUtils.sleep(2);
                if (addToFavorites.getText().equals("Remove from favorites")) {
                    actionsMenu.click();
                   continue;
                } else {
                    BrowserUtils.waitUntilClickable(addToFavorites);
                    BrowserUtils.sleep(3);
                    addToFavorites.click();
                    break;
                }
            }

        return chosenFile.getText();
    }



    public WebElement click_on_sub_module(String module) {
        String locator = "//li[@data-id='" + module.toLowerCase() + "']";
        return Driver.getDriver().findElement(By.xpath(locator));
    }








}
