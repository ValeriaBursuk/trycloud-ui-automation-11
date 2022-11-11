package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OpenedFile_Page {
   public OpenedFile_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

//    @FindBy(xpath = "//table[@id='filestable']//tbody//tr")
//    public List<WebElement> listOfFiles;

//    @FindBy (xpath = "//table[@id='filestable']//a[@data-action='menu']")
//    public List<WebElement> dataActionButton;

//--------------------------------------------------------------------------------------------------------------
    // opens Dropdown Menu once threeDots Element is clicked
    //
    @FindBy (xpath = "//div[@class='fileActionsMenu popovermenu bubble open menu']//a")
    public List<WebElement> actionDropDownMenu;

    //three dots button
    @FindBy (xpath = "//table[@class='list-container  has-controls']//td[2]/a")
    public List<WebElement> fileActionMenu;

    //ThreeDot Action Button LINE:27
 @FindBy (xpath = "//a[@data-action='menu']")
    public List<WebElement> threeDotAction;
//-------------------------------------------------------------------------------------------------------------

    @FindBy (xpath = "//ul[@class='with-icon']/li")
    public List<WebElement> navigationFile;



}
