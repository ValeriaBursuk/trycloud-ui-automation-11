package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TrashBin_Page extends DashboardModules_Page{


    public TrashBin_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

   @FindBy (xpath = "(//table)[@id='filestable'][12]//tbody/tr")
   public List<WebElement> deletedFilesTable;





}
