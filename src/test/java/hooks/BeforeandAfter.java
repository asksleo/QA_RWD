package hooks;



import PageObjects.BrowserSession;
import PageObjects.StaticTestSession;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import static PageObjects.BrowserSession.driver;

public class BeforeandAfter {

	@Before
	public void beforeMethod() {

		System.out.println("Test is Started!!!!");

	}
	@After
	public void afterMethod(@NotNull Scenario scenario) {
		TakesScreenshot ts = (TakesScreenshot) driver;

		if (scenario.isFailed()) {
			System.out.println("Test Successfully Completed!!!!");
			byte[] src;
			 src = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", "Failed_screenshot");
		}else
		{
			byte[] src1;
			 src1 = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src1, "image/png", "Passed_screenshot");

		}	}

}
