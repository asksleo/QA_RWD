package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src//test//java//feature//..",glue={"cucumber.stepdef","hooks"},
        tags="@webdeliveryorderforexistinguser",
        plugin = { "pretty", "html: target/cucumber-html-reports.html","json: " +
                "target/cucumber-json-reports.json"}
        ,monochrome=true)

public class TestRunner_Prashant extends AbstractTestNGCucumberTests {
}
