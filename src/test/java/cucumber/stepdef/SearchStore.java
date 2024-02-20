package cucumber.stepdef;

import PageObjects.BrowserSession;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.logging.Logger;

;import static PageObjects.SearchStore.Start_Carryout_Store_Search;

public class SearchStore {
    BrowserSession browserSession =  new BrowserSession();
    ////////////Prashant////////////
    @Given("I am on store selection page")
    public void iAmOnStoreSelectionPage() {
        if (Start_Carryout_Store_Search.isVisibleOnPage()) {

            browserSession.driver.findElement(By.xpath("//a[contains(text(),'Start Your Order')]")).click();
            browserSession.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        }
    }

    @When("I click on Want to carry it out button")
    public void iClickOnWantToCarryItOutButton() {

        browserSession.driver.findElement(By.xpath("//*[@id=\"carryoutFormAccordion\"]")).click();

    }

    @Then("I given the store zip code as {string} for carryout order")
    public void iGivenTheStoreNoAsForCarryoutOrder(String zipcode) {
        browserSession.driver.findElement(By.xpath("*//input[@id=\"locations-zipPostalcode\"]")).sendKeys(zipcode);

    }

    @Then("I click on submit button")
    public void iClickOnSubmitButton() {
        browserSession.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        browserSession.driver.findElement(By.xpath("*//div[contains(@class,'button-desk')]//input")).click();
        //jsp.executeScript("document.querySelector(\"#carryoutFormSection > form > div.split-zip.split-small > div.button-desk > input\").click();");
        browserSession.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @Then("select the store in store list")
    public void selectTheStoreInStoreList() {
        browserSession.driver.findElement(By.xpath("//button[contains(text(),'Carryout')]")).click();
    }
    @Then("I varify store address as {string} on home page is displayed or not")
    public void iVarifyStoreAddressAsOnHomePageIsDisplayedOrNot(String store_no) {
        String Expected_Text = "101 S Parker St";
        //WebElement arrow_icon_svg = driver.findElement(By.xpath("/html/body/div[2]/header/section[1]/header/ul/li[1]/a/span/svg/use"));
//		Actions varify =  new Actions(driver);
//		varify.moveToElement(arrow_icon_svg).click().build().perform();
        String Actual_Text = browserSession.driver.findElement(By.xpath("/html/body/div[2]/header/section[1]/header/ul/li[2]/a/span/span")).getText();
        //String store_no_check = browserSession.driver.findElement(By.xpath("//*[@id=\"popup-delivery\"]/div[1]/p[1]/text()[3]")).getText();
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
        browserSession.Closing_browser();
//		}
    }

    @Given("opne {string} browser and load the online website URL")
    public void opneBrowserAndLoadTheOnlineWebsiteURL(String browsername) {
        browserSession.open_Browser(browsername);

    }

}
