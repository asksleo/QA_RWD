package hooks;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class BeforeandAfter {

	@Before
	public void beforeMethod() {
		System.out.println("Before method");
		System.out.println("empty before");

	}
	@After
	public void afterMethod() {

		System.out.println("After method");


	}

}
