package com.TryCloud.page;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TryCloud_Page_Yirgalem {
    public TryCloud_Page_Yirgalem() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

   @FindBy(xpath = "//input[@id='user']")
    public WebElement userName;


    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement login;


@FindBy(xpath="//ul[@id='appmenu']//a")
public List<WebElement> Modules;



}
