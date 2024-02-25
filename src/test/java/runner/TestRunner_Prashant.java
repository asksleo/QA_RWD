package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src//test//java//feature//Web-carryout-order-using-papacard.feature",glue={"cucumber.stepdef","hooks"},tags="@webcarryoutorderpapacard")

public class TestRunner_Prashant extends AbstractTestNGCucumberTests {
}
