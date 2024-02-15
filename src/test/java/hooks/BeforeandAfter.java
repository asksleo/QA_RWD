package hooks;



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
