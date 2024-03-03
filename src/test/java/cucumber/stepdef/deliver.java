package cucumber.stepdef;

import PageObjects.BrowserSession;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class deliver {
    public static BrowserSession browserSession = new BrowserSession();

    @Given("I am store selection page")
    public void i_am_store_selection_page() {
        BrowserSession.driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        BrowserSession.driver.get("https://qa.papajohns.com/order/menu");
        BrowserSession.driver.manage().window().maximize();
        BrowserSession.driver.findElement(By.xpath("//a[text()='Start Your Order']")).click();
    }


    @When("I entered  street details and zip code in delivery section")
    public void i_entered_street_details_and_zip_code_in_delivery_section() {
        BrowserSession.driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("101 s parker street olathe");
        BrowserSession.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        BrowserSession.driver.findElement(By.xpath("//li[@id='autocomplete__option--0']")).click();
        BrowserSession.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        BrowserSession.driver.findElement(By.xpath("//input[@name='zipcode']")).sendKeys("66061");

    }
    @Then("I clicked on my submit button")
    public void i_clicked_on_my_submit_button() {
        BrowserSession.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        BrowserSession.driver.findElement(By.xpath("//input[@class='button button-large']")).click();
        BrowserSession.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}





