package PageObjects;

import java.awt.*;

public class LoginPageObject {
    public static PageElement Login_button_dropdowm = new PageElement("/html/body/div[2]/header/section[1]/header/ul/li[4]/a");

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
    public static PageElement GC = new PageElement("//*[@id='GIFT_CARD-selectedPaymentCategory']");
    public static PageElement gift_card_number = new PageElement("//*[@id='gift-card-number']");
    public static PageElement gift_card_pin = new PageElement("//*[@id='gift-card-pin']");
    public static PageElement Cash = new PageElement("//*[contains(text(),'Cash')]");
    public static PageElement C_Firstname = new PageElement("//input[@id='firstName']");
    public static PageElement C_LastName = new PageElement("//input[@id='lastName']");
    public static PageElement Email = new PageElement("//input[@id='email']");
    public static PageElement Phone_no = new PageElement("//input[@id='phone']");




    public  static TextField Pepperonitext=new TextField("//div[@class='card-header']/h2[@class='title h3']/span[text()='Pepperoni']");
    public  static TextField Sausagetext=new TextField("//div[@class='card-header']/h2[@class='title h3']/span[text()='Sausage']");

}
