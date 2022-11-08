package com.TryCloud.step_definitions;

import com.TryCloud.utilities.Driver;
import io.cucumber.java.*;
import io.cucumber.java.Scenario;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void setUp(Scenario scenario){
        System.out.println("----@Before from HOOK class----setUp--------");
        System.out.println("Scenario name: " + scenario.getName());
    }

    @After
    public void tearDown(Scenario scenario){
        System.out.println("---@After from HOOK CLASS----tearDown--------");

        if(scenario.isFailed()){
            byte[]screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        Driver.closeDriver();
    }

}
