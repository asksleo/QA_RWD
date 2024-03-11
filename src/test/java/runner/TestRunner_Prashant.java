package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src//test//java//feature//Web-delivery-order-for-existing-user.feature",glue={"cucumber.stepdef","hooks"},tags="@webdeliveryorderforexistinguser")

public class TestRunner_Prashant extends AbstractTestNGCucumberTests {
}
