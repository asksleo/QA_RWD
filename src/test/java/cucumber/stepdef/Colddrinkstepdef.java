package cucumber.stepdef;


import PageObjects.BrowserSession;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.Wait;

import javax.swing.*;
import java.awt.*;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.logging.Logger;

public class Colddrinkstepdef {
	WebDriver driver;
	public Button changeToCarryOut = new Button("//a[contains(.,' Change Carryout ')] | //a[contains(.,' Change to Carryout ')]");
	BrowserSession browserSession =  new BrowserSession();
	JavascriptExecutor jsp = (JavascriptExecutor) browserSession.driver;
	@Given("I am on PapaJohns page and Login it")
	public void i_am_on_papa_johns_page_and_login_it() {
		browserSession.driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		browserSession.driver.get("https://qa.papajohns.com");
		browserSession.driver.manage().window().maximize();
	}
	@When("I select the cold drink")
	public void i_select_the_cold_drink() {
	System.out.println("cold drink is selected");
		browserSession.driver.findElement(By.xpath("//*[contains(@aria-controls,'popup-login')]")).click();
		browserSession.driver.findElement(By.id("header-account-sign-in-email")).sendKeys("papatestu12@gmail.com");
		browserSession.driver.findElement(By.id("header-account-sign-in-password")).sendKeys("@Papa007");
	}

	@Then("I am able to see it in the cart")
	public void i_am_able_to_see_it_in_the_cart() {
		System.out.println("I did see them in cart");
	}
	
	
	
	@When("I select the Login {string} and {string}")
	public void i_select_the_login_and(String us, String pass) {
		browserSession.driver.get("https://qa.papajohns.com");
		browserSession.driver.findElement(By.xpath("//*[contains(@aria-controls,'popup-login')]")).click();
		browserSession.driver.findElement(By.id("header-account-sign-in-email")).sendKeys(us);
		browserSession.driver.findElement(By.id("header-account-sign-in-password")).sendKeys(pass);
			
		}
	@When("I select the Login username and password")
	public void i_select_the_login_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	   List<Map<String,String>> login= dataTable.asMaps(String.class, String.class);
	   for(int i=0;i<1;i++)
	   {
		   browserSession.driver.findElement(By.xpath("//*[contains(@aria-controls,'popup-login')]")).click();
		   browserSession.driver.findElement(By.id("header-account-sign-in-email")).sendKeys(login.get(i).get("username"));
		   browserSession.driver.findElement(By.id("header-account-sign-in-password")).sendKeys(login.get(i).get("password"));
	   }}



}

	

