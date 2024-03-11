package PageObjects;

import java.awt.*;

public class LoginPageObject {
    public static PageElement Login_button_dropdowm = new PageElement("/html/body/div[2]/header/section[1]/header/ul/li[4]/a");
 public static PageElement Login_Button_Dropdown=new PageElement("//a[contains(@aria-controls,'popup-login')]");
    public static PageElement Email_Address = new PageElement("//*[@id = \"header-account-sign-in-email\"]");

    public static PageElement Passwords =  new PageElement("//*[@id = \"header-account-sign-in-password\"]");

    public static PageElement Login_button = new PageElement("//*[@value=\"Log In\"]");

    public  static PageElement addtocartbutton_pepperoni = new PageElement("//button[@aria-label='ADD TO ORDER Pepperoni Pizza' and contains(.,'ADD TO ORDER')][2]");
    public  static PageElement addtocartbutton_sausage = new PageElement("//button[@aria-label='ADD TO ORDER Sausage Pizza' and contains(.,'ADD TO ORDER')][2]");

    public static PageElement addtocartbutton_Cheesesticks = new PageElement("//button[@aria-label='Cheesesticks']");
    public static PageElement addtocartbutton_JalapenoPapaBites = new PageElement("//button[@aria-label='Jalapeno Papa Bites']");
    public static PageElement addtoorder_extras = new PageElement("//*[contains(text(),'Add To Order')]");
    public static PageElement checkoout = new PageElement("//*[contains(text(),'Checkout')]");
    public static PageElement Return_To_Order_Page = new PageElement("//*[@id=\"addToOrder\"]");
    public static PageElement More_Payment_Option = new PageElement("//*[contains(text(),'More Payment Options')]");
    public static PageElement GC = new PageElement("//*[contains(text(),'Gift Card')][1]");
    public static PageElement gift_card_number = new PageElement("//*[@id='gift-card-number']");
    public static PageElement gift_card_pin = new PageElement("//*[@id='gift-card-pin']");
    public static PageElement Cash = new PageElement("//*[contains(text(),'Cash')]");
    public static PageElement Credit_Card = new PageElement("//*[contains(text(),'Credit or Debit Card')]");
    public static PageElement Credit_Card_Number = new PageElement("//*[@id='card-number']");
    public static PageElement Credit_Card_Name = new PageElement("//*[@id='name-on-card']");
    public static PageElement Credit_Card_CVV = new PageElement("//*[@id='card-security-code']");
    public static PageElement Credit_Card_MMYY = new PageElement("//*[@id='card-expiration']");
    public static PageElement Credit_Card_Zipcode = new PageElement("//*[@id='card-zip-code']");
    public static PageElement Review_Order = new PageElement("//*[contains(text(),'REVIEW ORDER')]");
    public static PageElement Place_Order = new PageElement("//*[contains(text(),' Place Order ')]");
    public static PageElement Document_Model_Popup_on_order_confirmation_page = new PageElement("//*[contains(text(),'GET ORDER UPDATES TO YOUR PHONE')]");
    public static PageElement Close_popup = new PageElement("//*[@aria-label='Close Dialog'][2]");
    public static PageElement Order_Details = new PageElement("//*[@id='order-details-button']");



    public static PageElement Firstname = new PageElement("//input[@id='firstName']");
    public static PageElement LastName = new PageElement("//input[@id='lastName']");
    public static PageElement Email = new PageElement("//input[@id='email']");
    public static PageElement Phone_no = new PageElement("//input[@id='phone']");




    public  static TextField Pepperonitext=new TextField("//div[@class='card-header']/h2[@class='title h3']/span[text()='Pepperoni']");
    public  static TextField Sausagetext=new TextField("//div[@class='card-header']/h2[@class='title h3']/span[text()='Sausage']");

}
