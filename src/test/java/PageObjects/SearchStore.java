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


    //driver.findElement(By.xpath("//a[contains(text(),'Start Your Order')]"));




}
