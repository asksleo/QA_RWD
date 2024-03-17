package hooks;



import PageObjects.BrowserSession;
import PageObjects.StaticTestSession;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class BeforeandAfter {

	@Before
	public void beforeMethod() {

		System.out.println("Test is Started!!!!");

	}
	@After
	public void afterMethod() {

		System.out.println("Test Successfully Completed!!!!");


	}

}
