package hooks;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BeforeandAfter {
	
	@Before
	public void beforeMethod() {
		System.out.println("Before method");
	}
	@After
	public void afterMethod() {
		System.out.println("After method");
	}

}
