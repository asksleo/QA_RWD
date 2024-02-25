package cucumber.stepdef;

import PageObjects.BrowserSession;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GuestUser {
    public BrowserSession browserSession = Deliveryorders.browserSession;

    @Then("I go to menu page and check available pizza")
    public void i_go_to_menu_page_and_check_available_pizza() throws InterruptedException {
        Thread.sleep(4000);
        browserSession.driver.navigate().to("https://qa.papajohns.com/order/menu");
        browserSession.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        browserSession.driver.findElement(By.xpath("//nav[@role='navigation']//*[contains(text(),'Menu')]")).click();
        browserSession.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @Then("select  Pepperoni Pizza")
    public void select_pepperoni_pizza() {
         browserSession.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        browserSession.driver.findElement(By.xpath("//button[@class='button button--small d-none d-md-inline-block'][@aria-label='ADD TO ORDER Pepperoni Pizza']")).click();

    }
    @Then("I add to order in my cart page")
    public void i_add_to_order_in_my_cart_page()  {
        browserSession.driver.findElement(By.xpath("//button[@class='button button--medium m-0']")).click();
        //browserSession.driver.findElement(By.xpath("//div[@class='modal-content']//button[@class='close']")).click();
        browserSession.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        browserSession.driver.findElement(By.xpath("//a[@class='shopcart-section tooltip-key-focus']"));
        browserSession.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Then("I checkout my order that is inside my cart")
    public void i_checkout_my_order_that_is_inside_my_cart() {

        browserSession.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        browserSession.driver.findElement(By.xpath("//li[@id=\"cart\"]")).click();
        browserSession.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        browserSession.driver.findElement(By.xpath("//button[@class='button button--medium m-0']")).click();
        browserSession.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        browserSession.driver.findElement(By.xpath("//div[@class=\"pricing-info__buttons\"]//*[text()=' Check Out ']")).click();
    }
    @Then("I Select payment option is cash")
    public void i_select_payment_option_is_cash() {
        browserSession.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        browserSession.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) browserSession.driver;
        js.executeScript("window.scrollBy(300,600)", "");
       browserSession.driver.findElement(By.xpath("//div[@class='payment-option-label']//*[text()='Cash']")).click();

    }
    /*Given("I enter First Name, Last Name ,Email and Phone Number")
    public void i_enter_first_name_last_name_email_and_phone_number() {

        browserSession.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        browserSession.driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Shubham");
        browserSession.driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Singhvi");
        browserSession. driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test@gmail.com");
        browserSession.driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("(959) 898-4986");
    }*/

    @Given("I enter \\(First Name:{string},Last Name:{string}, Email:{string},Phone Number :{string})")
    public void i_enter_first_name_last_name_email_phone_number(String F_Name, String L_Name, String Email, String num) {
        browserSession.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        browserSession.driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(F_Name);
        browserSession.driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(L_Name);
        browserSession. driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Email);
        browserSession.driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(num);
    }
    @Then("I check Understand and Terms conditions checkbox")
    public void i_check_understand_and_terms_conditions_checkbox() {
        browserSession.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        browserSession.driver.findElement(By.xpath("//div[@class='terms-and-conditions-container']")).click();



    }
    @Then("I click on Review button and place guest user order")
    public void i_click_on_review_button_and_place_guest_user_order() {
        browserSession.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        browserSession.driver.findElement(By.xpath("//button[@class=\"button button--large button--red mb-0 p-0 cta\"]")).click();
        browserSession.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        browserSession.driver.findElement(By.xpath("//*[text()=' Place Order ']")).click();

    }
}
