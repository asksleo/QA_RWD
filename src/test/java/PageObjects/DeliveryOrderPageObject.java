package PageObjects;

public class DeliveryOrderPageObject {

    public static PageElement del_store_address = new PageElement("//input[@id='autocomplete']");
    public static PageElement select_store_address_from_list = new PageElement("//li[@id='autocomplete__option--0']");
    public static PageElement del_store_zipcode = new PageElement("//input[@name='zipcode']");
    public static PageElement del_submit = new PageElement("//input[@class='button button-large']");




}
