package com.TryCloud.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
              //  "pretty",
                "html:target/cucumber-report.html",  //normal html report
                "rerun:target/rerun.txt",  //for rerun report
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"},  //cucumber plugin for pretty reports
        features = "src/test/resources/features",
        glue = "com/TryCloud/step_definitions",
        dryRun =false,
        tags = "@fav"

)


public class CukesRunner {
}
