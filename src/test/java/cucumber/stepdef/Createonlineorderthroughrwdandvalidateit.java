package cucumber.stepdef;

import PageObjects.BrowserSession;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;

import static PageObjects.LoginPageObject.Login_Button_Dropdown;

public class Createonlineorderthroughrwdandvalidateit {
    BrowserSession browserSession=new BrowserSession();//open the browser
    public ResourceBundle RB;

    Properties prop= new Properties();
    String rwd_url;
    String zip_code;
    String card_number;
    String name_on_card;
    String card_expiration;
    String card_security_code;
    String card_zip_code;
    String firstname;
    String lastname;
    String email;
    String phone;



    @Given("I am on the OnlineOrder_Home page on RWD application")
    public void i_am_on_the_online_order_home_page_on_rwd_application() throws IOException {
        FileInputStream file_stream= new FileInputStream("src/test/resources/Config.properties");
        prop.load(file_stream);
        file_stream.close();
        browserSession.open_Browser("chrome");
        String title=browserSession.driver.getTitle();
        RB=ResourceBundle.getBundle("Config");
        String QA_TITLE_PAGE= "Papa Johns Pizza Delivery & Carryout – Best Deals on Pizza, Sides & More";
        try{
            Assert.assertEquals(QA_TITLE_PAGE,title,"passed");
        }
        catch (Exception e)
        {
            System.out.println("Not Matched title");
        }
    }
    @When("I click Login button on RWD application")
    public void i_click_login_button_on_rwd_application() {
        //browserSession.driver.findElement(By.xpath("//a[contains(@aria-controls,'popup-login')]")).click();
        Login_Button_Dropdown.getWebElement().click();

    }

    @Then("I should be on OLO Login Screen")
    public void i_should_be_on_olo_login_screen() {
        String title=browserSession.driver.getTitle();
        String QA_TITLE_PAGE= "Papa Johns Pizza Delivery & Carryout – Best Deals on Pizza, Sides & More";
        try{
            Assert.assertEquals(QA_TITLE_PAGE,title,"passed");
        }
        catch (Exception e)
        {
            System.out.println("Not Matched title");
        }
    }

    @Then("I logged in using  username and password on RWD application")
    public void i_logged_in_using_username_and_password_on_rwd_application() throws InterruptedException {
        browserSession.driver.findElement(By.id("header-account-sign-in-email")).sendKeys(RB.getString("username"));
        browserSession.driver.findElement(By.id("header-account-sign-in-password")).sendKeys(RB.getString("password"));
        browserSession.driver.findElement(By.xpath("//*[contains(@value,'Log In')]")).click();
        Thread.sleep(5000);
    }
    @Then("I choose the Product Drink from Drink Page")
    public void i_choose_the_product_pepperoni_from_home_page() throws InterruptedException {
       /* List<WebElement> horz_navi= browserSession.driver.findElements(By.xpath("//*[contains(@class,'justify-content-start nav nav-pills subnavigation--horizontal')]"));
        for (WebElement horz_prod:horz_navi)
        {

         try
         {
             if(horz_prod.getText().equals("DRINKS")) {
             horz_prod.click();
         }
         }
         catch(Exception e)
         {
             System.out.println("Element not found");
         }*/
        browserSession.driver.findElement(By.id("ngb-nav-7")).click();
        Thread.sleep(4000);
        Select pepsi= new Select(browserSession.driver.findElement(By.id("pepsi-quantity-select")));
        pepsi.selectByValue("3: 4");
        System.out.println("4 pepsi is selected");
    }


    @Then("I click on Cart button on home page")
    public void i_click_on_cart_button_on_home_page() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) browserSession.driver;
        js.executeScript("window.scrollBy(0,250)", "");
        System.out.println("scroll is done");


        WebElement add_pepsi2=browserSession.driver.findElement(By.xpath("//button[2][contains(@aria-label,'ADD TO ORDER Pepsi')]"));

        boolean pepsi2=add_pepsi2.isDisplayed();
        System.out.println("add to order button is displayed "+pepsi2);
        if(pepsi2==true)
        {
            add_pepsi2.click();
        }
        System.out.println("add to order button is clicked ");
        WebDriverWait wait3= new WebDriverWait(browserSession.driver, Duration.ofSeconds(30));
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@aria-label,'Close Add a little extra!!')]")));
        WebElement close=browserSession.driver.findElement(By.xpath("//button[contains(@aria-label,'Close Add a little extra!!')]"));

        Boolean close_true=close.isDisplayed();
        if(close_true==true)
        {
            close.click();
            System.out.println("close button is closed");
        }else
        {

            System.out.println("close button not appeared");
        }

    }
    @Then("I click on Olo Cart Checkout button on Cart page")
    public void i_click_on_olo_cart_checkout_button_on_cart_page() throws InterruptedException {
        WebElement checkout = browserSession.driver.findElement(By.xpath("//main[@id='maincontent']/div/div/div/div/div/a[1]"));
        WebDriverWait wait4 = new WebDriverWait(browserSession.driver, Duration.ofSeconds(30));
        wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//main[@id='maincontent']/div/div/div/div/div/a[1]")));
        Boolean checkout_true = checkout.isDisplayed();
        if (checkout_true == true) {
            checkout.click();
            System.out.println("checkout button is closed");
        } else {

            System.out.println("checkout button not appeared");
        }


        System.out.println("checkout button is clicked");

        Thread.sleep(4000);

    }


    @Then("I click on Credit button on Contact and Payment page")
    public void i_click_on_cash_button_on_contact_and_payment_page() throws InterruptedException {
        JavascriptExecutor js1 = (JavascriptExecutor) browserSession.driver;
        //calling the method
        js1.executeScript("document.querySelector('rwd-checkout section .sticky-column .terms-and-conditions-container .custom-control-label',':after').click()");
        Thread.sleep(3000);
        js1.executeScript("scroll(0,750)");
        browserSession.driver.findElement(By.id("card-number")).sendKeys(card_number);
        browserSession.driver.findElement(By.id("name-on-card")).sendKeys(name_on_card);
        browserSession.driver.findElement(By.id("card-expiration")).sendKeys(card_expiration);
        browserSession.driver.findElement(By.id("card-security-code")).sendKeys(card_security_code);
        browserSession.driver.findElement(By.id("card-zip-code")).sendKeys(card_zip_code);
        //js1.executeScript("document.querySelector('.pso-container .pso-option-item rwd-radio.pso-option .custom-control-label',':after').click()");

        System.out.println("credit is selected");
        Thread.sleep(3000);
        js1.executeScript("scroll(0,1250)");
    }
 /*   @Then("I click on review your order button on  Contact and Payment page")
    public void i_click_on_review_your_order_button_on_contact_and_payment_page() {

        browserSession.driver.findElement(By.id("firstName")).sendKeys(firstname);
        browserSession.driver.findElement(By.id("lastName")).sendKeys(lastname);
        browserSession.driver.findElement(By.id("email")).sendKeys(email);
        browserSession.driver.findElement(By.id("phone")).sendKeys(phone);

        browserSession.driver.findElement(By.xpath("//button[contains(@class,'button button--large button--red mb-0 p-0 cta')]")).click();
        WebDriverWait wait6=new WebDriverWait(browserSession.driver,Duration.ofSeconds(30));

        wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@class,'button button--large button--red mb-0 p-0 cta')]")));
    }
*/

  /*  @Then("I click on Olo Place Your Order button on Cart page")
    public void i_click_on_olo_place_your_order_button_on_cart_page() {


        browserSession.driver.findElement(By.xpath("//button[contains(@class,'button button--large button--red mb-0 p-0 cta')]")).click();
        WebDriverWait final_wait=new WebDriverWait(browserSession.driver,Duration.ofSeconds(30));
        final_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button--small button--red']")));
        WebElement duplicate_order=browserSession.driver.findElement(By.xpath("//button[@class='button button--small button--red']"));
        Boolean check=duplicate_order.isDisplayed();
        if(check==true)
        {
            duplicate_order.click();
            System.out.println("duplicate order");
        }
        else
        {
            System.out.println("not a duplicate order");
        }

    }
*/
   /* @Then("I should be on Order Detail Page")
    public void i_should_be_on_order_detail_page() {

    }
    @When("I am logged in and clocked in as team member with helpdesk username and hdhdhd password")
    public void i_am_logged_in_and_clocked_in_as_team_member_with_helpdesk_username_and_hdhdhd_password() {

    }
    @When("I am using Order Entry application")
    public void i_am_using_order_entry_application() {

    }
    @When("I go to Browse Order screen")
    public void i_go_to_browse_order_screen() {

    }
    @Then("I should be on Browse Order page")
    public void i_should_be_on_browse_order_page() {

    }
    @Then("I get the POS OrderID")
    public void i_get_the_pos_order_id() {

    }
    @Then("I search and select Online order {string}")
  */

}
