package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src//test//java//feature//addcolddrink.feature",glue={"cucumber.stepdef","hooks"},tags="@colddrink")
public class TestRunner extends AbstractTestNGCucumberTests
{

}
