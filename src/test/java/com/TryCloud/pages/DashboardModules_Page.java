package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardModules_Page {

   public DashboardModules_Page(){
       PageFactory.initElements(Driver.getDriver(),this);
   }

    @FindBy(xpath = "//ul[@id='appmenu']//a")
    public List<WebElement> moduleMenu;

   public void click_on_module(String moduleOption){

       DashboardModules_Page dashboardModules_page = new DashboardModules_Page();

       for (WebElement eachButton : dashboardModules_page.moduleMenu){
           if (eachButton.getAttribute("aria-label").equalsIgnoreCase(moduleOption)){
               eachButton.click();
               break;
           }
       }

   }








}
