package cucumber.stepdef;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Colddrinkstepdef {
	WebDriver driver;
		@Test
	@Given("I am on PapaJohns page and Login it")
	public void i_am_on_papa_johns_page_and_login_it() {
		driver = new ChromeDriver();
	WebDriverManager.chromedriver().setup();
	driver.get("https://qa.papajohns.com");
	}

	@When("I select the cold drink")
	public void i_select_the_cold_drink() {
	System.out.println("cold drink is selected");
	}

	@Then("I am able to see it in the cart")
	public void i_am_able_to_see_it_in_the_cart() {
		System.out.println("I did see them in cart");
	}

}
