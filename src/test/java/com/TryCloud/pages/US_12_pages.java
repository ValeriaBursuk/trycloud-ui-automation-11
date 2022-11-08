package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_12_pages {

    public US_12_pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


@FindBy (xpath = "(//li[@data-id='contacts'])[1]")
public WebElement contactModule;


 //   @FindBy (xpath = "(//a[@aria-label='Contacts'])[1]")
 //   public WebElement selectedModule;


    public  void module (String string ){

       WebElement selectedModule  = Driver.getDriver().findElement(By.xpath("(//a[@aria-label='"+string+"'])[1]"));
       selectedModule.click();
    }
}
