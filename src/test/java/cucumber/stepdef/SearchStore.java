package cucumber.stepdef;

import PageObjects.BrowserSession;
import PageObjects.StaticTestSession;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.awt.*;
import java.time.Duration;
import java.util.Arrays;
import java.util.logging.Logger;

import static PageObjects.SearchStore.*;

public class SearchStore {
    BrowserSession browserSession = StaticTestSession.browserSession;
    TextField expected_store_address = new TextField("101 S Parker St");

    ////////////Prashant////////////
    @Given("I am on store selection page")
    public void iAmOnStoreSelectionPage() {
      //  if (Start_Carryout_Store_Search.isClickableOnPage()) {

        Start_Carryout_Store_Search.getWebElement().click();
        BrowserSession.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        }
   // }

    @When("I click on Want to carry it out button")
    public void iClickOnWantToCarryItOutButton() {
        Click_on_carry_out_button.getWebElement().click();
    }

    @Then("I given the store zip code as {string} for carryout order")
    public void iGivenTheStoreNoAsForCarryoutOrder(String zipcode) {
        Store_Zip_Code.getWebElement().sendKeys(zipcode);
    }

    @Then("I click on submit button")
    public void iClickOnSubmitButton() {
        BrowserSession.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Submit_button.getWebElement().click();
        BrowserSession.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @Then("select the store in store list")
    public void selectTheStoreInStoreList() {
        Store_selection.getWebElement().click();
    }


    @Then("I verify store address as {string} on home page is displayed or not")
    public void iVerifyStoreAddressAsOnHomePageIsDisplayedOrNot(String store_no) {

        //Verify the Store No and full address
        String actText = Actual_Text.getWebElement().getText();
        Actual_Text.getWebElement().click();
       String[] Act_Store_No =  Get_Full_Address_Of_Store.getWebElement().getText().split("#",2);
        if (actText.equalsIgnoreCase(expected_store_address.getText()) && Act_Store_No[1].equals(store_no)) {
            Logger.getLogger(actText);
            System.out.println("Verified the carryout store 1925");
            Logger.getLogger("Verified the carryout store 1925");
        }
    }


    @Then("I close the brower after verifed")
    public void iCloseTheBrowerAfterVerifed() {
        Logger.getLogger("Closed the browser after verified");
        browserSession.Closing_browser();
    }

    @Given("open {string} browser and load the online website URL")
    public void openBrowserAndLoadTheOnlineWebsiteURL(String browsername) {
        browserSession.open_Browser(browsername);

    }

}
