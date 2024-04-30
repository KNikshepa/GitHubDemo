package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"C:\\Users\\Nikshepa\\eclipse-workspace\\CucumberFramework\\src\\main\\java\\com\\features\\Hooks.feature"},
    glue = {"com.stepDefinition","com.MyHooks"},
   // tags="@Smoke or  @Regression",
   // tags="@Smoke and  @Regression",
   // tags="not @PROD",
  //  tags="@All",
    plugin= {"pretty"
    		, "json: target/MyJSONReport/report.json",
    		"junit: target/MyJSONReport/report.xml" },
   publish=true
    /*monochrome=false,
    dryRun=true*/
    
)
public class TestRunner {

	public static void main(String[] args) {
		System.out.println("ehu");

	}
}

//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