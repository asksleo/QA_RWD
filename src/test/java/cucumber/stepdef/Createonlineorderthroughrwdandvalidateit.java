package cucumber.stepdef;

import PageObjects.BrowserSession;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.IOException;
import java.util.ResourceBundle;

public class Createonlineorderthroughrwdandvalidateit {
    BrowserSession browserSession=new BrowserSession();//open the browser
    public ResourceBundle RB;



    @Given("I am on the OnlineOrder_Home page on RWD application")
    public void i_am_on_the_online_order_home_page_on_rwd_application() throws IOException {
        browserSession.open_Browser("chrome");
      String title=browserSession.driver.getTitle();
        RB=ResourceBundle.getBundle("Config");

      try{
          Assert.assertEquals(RB.getString("QA_TITLE_PAGE"),title,"passed");
      }
      catch (Exception e)
      {
          System.out.println("Not Matched title");
      }
    }
 /*   @When("I click Login button on RWD application")
    public void i_click_login_button_on_rwd_application() {

   }
    @Then("I should be on OLO Login Screen")
    public void i_should_be_on_olo_login_screen() {

    }
    @Then("I logged in using webautomation@gmail.com username and TestUser!{int} password on RWD application")
    public void i_logged_in_using_webautomation_gmail_com_username_and_test_user_password_on_rwd_application(Integer int1) {

    }
    @Then("I choose the Product Pepperoni from home Page")
    public void i_choose_the_product_pepperoni_from_home_page() {

    }
    @Then("I click on Cart button on home page")
    public void i_click_on_cart_button_on_home_page() {

    }
    @Then("I click on Olo Cart Checkout button on Cart page")
    public void i_click_on_olo_cart_checkout_button_on_cart_page() {

    }
    @Then("I select papapriority option")
    public void i_select_papapriority_option() {

    }
    @Then("I click on Cash button on Contact and Payment page")
    public void i_click_on_cash_button_on_contact_and_payment_page() {

    }
    @Then("I click on review your order button on  Contact and Payment page")
    public void i_click_on_review_your_order_button_on_contact_and_payment_page() {

    }
    @Then("I click on Olo Place Your Order button on Cart page")
    public void i_click_on_olo_place_your_order_button_on_cart_page() {

    }
    @Then("I should be on Order Detail Page")
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
    public void i_search_and_select_online_order(String string) {

    }
*/
}
