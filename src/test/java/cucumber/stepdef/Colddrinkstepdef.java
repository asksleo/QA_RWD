package cucumber.stepdef;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import java.util.Map;

public class Colddrinkstepdef {
	WebDriver driver;
	
		
	@Given("I am on PapaJohns page and Login it")
	public void i_am_on_papa_johns_page_and_login_it() {
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://qa.papajohns.com");
	
	}
	@When("I select the cold drink")
	public void i_select_the_cold_drink() {
	System.out.println("cold drink is selected");
	driver.findElement(By.xpath("//*[contains(@aria-controls,'popup-login')]")).click();
	driver.findElement(By.id("header-account-sign-in-email")).sendKeys("papatestu12@gmail.com");
	driver.findElement(By.id("header-account-sign-in-password")).sendKeys("@Papa007");
	}

	@Then("I am able to see it in the cart")
	public void i_am_able_to_see_it_in_the_cart() {
		System.out.println("I did see them in cart");
	}
	
	
	
	@When("I select the Login {string} and {string}")
	public void i_select_the_login_and(String us, String pass) {
			driver.get("https://qa.papajohns.com");
			driver.findElement(By.xpath("//*[contains(@aria-controls,'popup-login')]")).click();
			driver.findElement(By.id("header-account-sign-in-email")).sendKeys(us);
			driver.findElement(By.id("header-account-sign-in-password")).sendKeys(pass);
			
		}
	@When("I select the Login username and password")
	public void i_select_the_login_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	   List<Map<String,String>> login= dataTable.asMaps(String.class, String.class);
	   for(int i=0;i<1;i++)
	   {
			driver.findElement(By.xpath("//*[contains(@aria-controls,'popup-login')]")).click();
			driver.findElement(By.id("header-account-sign-in-email")).sendKeys(login.get(i).get("username"));
			driver.findElement(By.id("header-account-sign-in-password")).sendKeys(login.get(i).get("password"));
	   }}
	    

	}

	

