package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="C:\\Users\\karan\\IdeaProjects\\QA_RWD\\src\\test\\java\\feature\\01-CreateOnlineOrderThroughRWDApplicationAndValidateInFocus.feature",glue={"cucumber.stepdef","hooks"},tags="@web_demo")
public class TestRunner extends AbstractTestNGCucumberTests
{

}
