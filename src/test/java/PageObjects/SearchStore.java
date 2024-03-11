package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchStore{


    public static PageElement Start_Carryout_Store_Search = new PageElement("//a[contains(text(),'Start Your Order')]");
    public static PageElement Click_on_carry_out_button = new PageElement("//*[@id=\"carryoutFormAccordion\"]");
    public static PageElement Store_Zip_Code = new PageElement("*//input[@id=\"locations-zipPostalcode\"]");
    public static PageElement Submit_button = new PageElement("*//div[contains(@class,'button-desk')]//input");
    public static PageElement Store_selection = new PageElement("//button[contains(text(),'Carryout')]");
    public static PageElement Actual_Text = new PageElement("/html/body/div[2]/header/section[1]/header/ul/li[2]/a/span/span");
    public static PageElement Get_Full_Address_Of_Store =  new PageElement("//*[@id=\"popup-delivery\"]/div[1]/p[1]");

   //For New UI of store selection page
    public static PageElement canray_URL_type =  new PageElement("/html/body/div[2]/footer/div/section[2]/div[2]/p[9]/text()[2]");

    public static PageElement New_UI_Click_on_carry_out_button = new PageElement("//*[@class=\"order-type-button m-0 carryout active\"]");
    public static PageElement New_UI_Store_Zip_Code = new PageElement("*//input[@id=\"postal-code\"]");
    public static PageElement New_UI_Submit_button = new PageElement("//*[contains(text(),'SUBMIT')]");
    public static PageElement New_UI_Store_selection = new PageElement("//*[contains(text(),' Start Your Order')]");


    //driver.findElement(By.xpath("//a[contains(text(),'Start Your Order')]"));




}
