package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src//test//java//feature//storeselection.feature",glue={"cucumber.stepdef","hooks"},tags="@store_selection_carryout")

public class TestRunner_Prashant extends AbstractTestNGCucumberTests {
}
