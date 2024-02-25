package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src//test//java//feature//guestuser.feature",glue={"cucumber.stepdef","hooks"},tags="@guest_user_delivery")

public class TestRunner_Shubham extends AbstractTestNGCucumberTests {
}
