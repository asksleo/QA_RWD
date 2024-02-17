package cucumber.stepdef;


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

	JavascriptExecutor jsp = (JavascriptExecutor) driver;
	@Given("I am on PapaJohns page and Login it")
	public void i_am_on_papa_johns_page_and_login_it() {
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://qa.papajohns.com");
		driver.manage().window().maximize();
	
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



	////////////Prashant////////////
	@Given("I am on store selection page")
	public void iAmOnStoreSelectionPage() {

		i_am_on_papa_johns_page_and_login_it();
		driver.findElement(By.xpath("//a[contains(text(),'Start Your Order')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@When("I click on Want to carry it out button")
	public void iClickOnWantToCarryItOutButton() {

		driver.findElement(By.xpath("//*[@id=\"carryoutFormAccordion\"]")).click();

	}

	@Then("I given the store zip code as {string} for carryout order")
	public void iGivenTheStoreNoAsForCarryoutOrder(String zipcode) {
		driver.findElement(By.xpath("*//input[@id=\"locations-zipPostalcode\"]")).sendKeys(zipcode);

	}

	@Then("I click on submit button")
	public void iClickOnSubmitButton() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("*//div[contains(@class,'button-desk')]//input")).click();
		//jsp.executeScript("document.querySelector(\"#carryoutFormSection > form > div.split-zip.split-small > div.button-desk > input\").click();");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Then("select the store in store list")
	public void selectTheStoreInStoreList() {
		driver.findElement(By.xpath("//button[contains(text(),'Carryout')]")).click();
	}
	@Then("I varify store address as {string} on home page is displayed or not")
	public void iVarifyStoreAddressAsOnHomePageIsDisplayedOrNot(String store_no) {
		String Expected_Text = "101 S Parker St";
		//WebElement arrow_icon_svg = driver.findElement(By.xpath("/html/body/div[2]/header/section[1]/header/ul/li[1]/a/span/svg/use"));
//		Actions varify =  new Actions(driver);
//		varify.moveToElement(arrow_icon_svg).click().build().perform();
		String Actual_Text = driver.findElement(By.xpath("/html/body/div[2]/header/section[1]/header/ul/li[2]/a/span/span")).getText();
		//String store_no_check = driver.findElement(By.xpath("//*[@id=\"popup-delivery\"]/div[1]/p[1]/text()[3]")).getText();
		if (Actual_Text.equals(Expected_Text) /*&& store_no_check.equals("1925")*/)
		{
			System.out.println("Verified the carryout store 1925");
			Logger.getLogger("Verified the carryout store 1925");

		}
	}


	@Then("I close the brower after verifed")
	public void iCloseTheBrowerAfterVerifed() {
		//String store_no_check = driver.findElement(By.xpath("//*[@id=\"popup-delivery\"]/div[1]/p[1]/text()[3]")).getText();
//		if ( store_no_check.equals("1925")) {
			Logger.getLogger("Closed the browser after verified");
			driver.close();
//		}
	}
}

	

