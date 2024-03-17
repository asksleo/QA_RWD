package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src//test//java//feature//..",glue={"cucumber.stepdef","hooks"},
        tags="@delivery_order_creditcard_using_datatable",
        plugin = { "pretty", "html: target/cucumber-html-reports.html","json: " +
                "target/cucumber-json-reports.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        ,monochrome=true)

public class TestRunner_Prashant extends AbstractTestNGCucumberTests {
}
