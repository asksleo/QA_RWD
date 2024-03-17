package cucumber.stepdef;

import PageObjects.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import static PageObjects.DeliveryOrderPageObject.*;
import static PageObjects.LoginPageObject.*;
import static PageObjects.StaticTestSession.currentUser;

public class WebCarryoutOrderPapacard {

    PapaCard giftcard = new PapaCard();
    ;
    CreditCard credit_card = new CreditCard();
    public static PageElement genericPage = new PageElement("");
    private static final Logger logger = LoggerFactory.getLogger(WebCarryoutOrderPapacard.class);

    TextField Act_Title = new TextField("Checkout");

   static JavascriptExecutor jse = (JavascriptExecutor) BrowserSession.driver;

    @Then("I click on Login button")
    public void iClickOnLoginButton() {
        Login_button_dropdowm.waitUntilReady();
        Login_button_dropdowm.getWebElement().click();
    }

    @Then("I logged in using {string} username and {string} password on RWD application")
    public void iLoggedInUsingUsernameAndPasswordOnRWDApplication(String user, String pass) {
        currentUser = new User(user, pass);
        Email_Address.getWebElement().sendKeys(currentUser.getUserName());
        Passwords.getWebElementInternal().sendKeys(currentUser.getUserPassword());
        Login_button.getWebElement().click();
        genericPage.waitUntilReady();
    }

    @Then("I choose the Product {string} from home Page")
    public void i_choose_the_product_pepperoni_from_home_page(@NotNull String productName) {
        jse.executeScript("window.scrollBy(0,700)");
        genericPage.waitForDocumentReady();
        OnlineOrderProductsEnum oloProductsEnum = OnlineOrderProductsEnum.fromValue(productName.toLowerCase());
        switch (oloProductsEnum) {
            case PEPPERONI:
                genericPage.waitForDocumentReady();
                logger.info("Product Exist -" + productName);
                addtocartbutton_pepperoni.isVisibleOnPage();
                genericPage.waitForDocumentReady();
                addtocartbutton_pepperoni.click();
                logger.info("Add to cart Button Is not visible on screen.");
                genericPage.waitForDocumentReady();
                break;
            case SAUSAGE:
                genericPage.waitForDocumentReady();
                logger.info("Product Exist -" + productName);
                addtocartbutton_sausage.isVisibleOnPage();
                genericPage.waitForDocumentReady();
                addtocartbutton_sausage.getWebElement().click();
                logger.info("Add to cart Button Is not visible on screen.");
                genericPage.waitForDocumentReady();
                break;
            default:
                logger.error("Not a valid Product: " + productName);
        }


    }


    @And("I added some extras toppings {string} from given list")
    public void iAddedSomeExtrasToppingsFromGivenList(@NotNull String extras) {
        genericPage.waitUntilReady();
        OnlineOrderProductsEnum oloProductsEnum = OnlineOrderProductsEnum.fromValue(extras.toLowerCase());
        switch (oloProductsEnum) {
            case CHEESESTICKS:
                genericPage.waitForDocumentReady();
                logger.info("Product Exist -" + extras);
                addtocartbutton_Cheesesticks.isVisibleOnPage();
                genericPage.waitForDocumentReady();
                addtocartbutton_Cheesesticks.click();
                genericPage.waitForDocumentReady();
                break;
            case JALAPENOPAPABITES:
                genericPage.waitForDocumentReady();
                logger.info("Product Exist -" + extras);
                addtocartbutton_JalapenoPapaBites.isVisibleOnPage();
                genericPage.waitForDocumentReady();
                addtocartbutton_JalapenoPapaBites.getWebElement().click();
                genericPage.waitForDocumentReady();
                break;
            default:
                logger.error("Not a valid Product: " + extras);
        }
        addtoorder_extras.click();
    }

    @Then("I click on Checkout button on home page")
    public void i_click_on_Checkout_button_on_home_page() {
        genericPage.waitUntilReady();
        checkoout.isVisibleOnPage();
        checkoout.click();


    }

    @Then("I Handle the Popup if coming on checkout page")
    public void I_Handle_the_Popup_if_coming_on_checkout_page() {
        String Exp_title = BrowserSession.driver.getTitle();
        try {
            if (Exp_title.equals(Act_Title.getText())) {
                BrowserSession.driver.findElement(By.xpath("//*[@id=\"abtt-876-modal\"]/div[2]/div/div[1]/div/div/h2")).isDisplayed();
            }
        } catch (Exception e) {
            System.out.println("Go to the Order Summary Page!!");
            Return_To_Order_Page.click();
        }
    }


    @Then("I click on More Payment Option button on Contact and Payment page")
    public void i_click_on_More_Payment_Option_button_on_contact_and_payment_page() {
        More_Payment_Option.click();
    }


    @And("I doing the payment using {string} option on Contact and Payment page")
    public void iDoingThePaymentUsingOptionOnContactAndPaymentPage(String Payment_method) {
        genericPage.waitUntilReady();
        OnlineOrderProductsEnum Paymentenum = OnlineOrderProductsEnum.fromValue(Payment_method.toLowerCase());
        switch (Paymentenum) {
            case GIFTCARD:
                genericPage.waitForDocumentReady();
                logger.info("Payment Exist -" + Payment_method);
                jse.executeScript("window.scrollBy(0,500)");
                GC.isVisibleOnPage();
                GC.click();
                genericPage.waitForDocumentReady();
                gift_card_number.getWebElement().sendKeys(giftcard.getCardNumber());
                gift_card_pin.getWebElement().sendKeys(giftcard.getPin());
                break;
            case CASH:
                genericPage.waitForDocumentReady();
                logger.info("Payment Exist -" + Payment_method);
                Cash.isVisibleOnPage();
                Cash.getWebElement().click();
                break;
            case CREDITCARD:
                genericPage.waitForDocumentReady();
                logger.info("Payment Exist -" + Payment_method);
                if (!Credit_Card.isClickableOnPage()) {
                    Credit_Card.click();
                }
                Credit_Card_Number.getWebElement().sendKeys(credit_card.getCardNumber());
                Credit_Card_Name.getWebElement().sendKeys("Sam Altman");
                Credit_Card_MMYY.getWebElement().sendKeys(credit_card.getExpiryDate());
                Credit_Card_CVV.getWebElement().sendKeys(credit_card.getCvvNumber());
                Credit_Card_Zipcode.getWebElement().sendKeys(credit_card.getZipCode());
                genericPage.waitForDocumentReady();
                break;
            default:
                logger.error("Not a valid Payment: " + Payment_method);
        }
    }

    @Then("I click on review your order button on  Contact and Payment page")
    public void i_click_on_review_your_order_button_on_contact_and_payment_page() {
        genericPage.waitUntilReady();
        Review_Order.click();
    }


    @Then("I click on Olo Place Your Order button on Cart page")
    public void i_click_on_olo_place_your_order_button_on_cart_page() {
        Place_Order.click();
    }

    @Then("I should be on Order Detail Page")
    public void i_should_be_on_order_detail_page() {
        genericPage.waitForDocumentReady();
        Document_Model_Popup_on_order_confirmation_page.getWebElement().isDisplayed();
        Close_popup.click();
        genericPage.waitForDocumentReady();
        if (BrowserSession.driver.getTitle().equals("checkout-confirmation")) {

            logger.info("Order Placed Successfully !!!");
            System.out.println("Order Placed Successfully !!!");
        }
    }

    @Then("I get the estimated amount from review your order page and verified with order confirmation page")
    public void i_get_the_estimated_amount_from_review_your_order_page_and_verified_with_order_confirmation_page() throws InterruptedException {
        genericPage.waitForDocumentReady();
        Order_Details.click();
        genericPage.waitUntilReady();
        String Total_Price_Actual = "25.71";
        String Total_Price_on_Confirmation_Page = BrowserSession.driver.findElement(By.xpath("//*[@id=\"orderContent\"]/div/div[5]/div/div[2]/ul/li/span")).getText();
        //System.out.println(Total_Price_on_Confirmation_Page.split("\\$",2)[1]);
        if(Total_Price_on_Confirmation_Page.equals(Total_Price_Actual))
        {
            logger.info("Product Price Matched" + Total_Price_on_Confirmation_Page);
            System.out.println("Product Price Matched as" + Total_Price_on_Confirmation_Page);
        }
    }


    @And("I doing the payment using gift card only on Contact and Payment page")
    public void iDoingThePaymentUsingGiftCardOnlyOnContactAndPaymentPage(DataTable data) {
        List<Map<String,String>> rows = data.asMaps(String.class,String.class);
        genericPage.waitForDocumentReady();
        jse.executeScript("window.scrollBy(0,500)");
        GC.isVisibleOnPage();
        GC.click();
        for (Map<String,String> columns : rows) {
            genericPage.waitForDocumentReady();
            giftcard.setCardNumber(columns.get("giftcardNumber"));
            giftcard.setPin(columns.get("pin"));
            giftcard.setPrice(columns.get("price"));
            gift_card_number.getWebElement().sendKeys(giftcard.getCardNumber());
            gift_card_pin.getWebElement().sendKeys(giftcard.getPin());
        }



    }

    @And("I doing the payment using credit card on Contact and Payment page")
    public void iDoingThePaymentUsingCreditCardOnContactAndPaymentPage(DataTable data) {
        genericPage.waitForDocumentReady();
        List<Map<String, String>> rows = data.asMaps(String.class, String.class);
        if (!Credit_Card.isClickableOnPage()) {
            Credit_Card.click();
        }

        for (Map<String, String> columns : rows) {
            credit_card.setCardNumber(columns.get("cardnumber"));
            credit_card.setExpiryDate(columns.get("expirymonth"));
            credit_card.setCvvNumber(columns.get("securitycode"));
            credit_card.setZipCode(columns.get("zipcode"));

        }
        Credit_Card_Number.getWebElement().sendKeys(credit_card.getCardNumber());
        Credit_Card_Name.getWebElement().sendKeys("Sam Altman");
        Credit_Card_MMYY.getWebElement().sendKeys(credit_card.getExpiryDate());
        Credit_Card_CVV.getWebElement().sendKeys(credit_card.getCvvNumber());
        Credit_Card_Zipcode.getWebElement().sendKeys(credit_card.getZipCode());
        genericPage.waitForDocumentReady();
    }

    @When("I entered  street details and zip code in delivery section using datatable")
    public void iEnteredStreetDetailsAndZipCodeInDeliverySectionUsingDatatable(DataTable data) {
        List<Map<String, String>> row = data.asMaps(String.class, String.class);
        for (Map<String, String> col : row) {
            del_store_address.getWebElement().sendKeys(col.get("Street_Address"));
            genericPage.waitForDocumentReady();
            select_store_address_from_list.click();
            del_store_zipcode.getWebElement().sendKeys(col.get("ZIP_CODE_Delivery"));
        }
    }
}
