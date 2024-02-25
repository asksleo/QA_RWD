package PageObjects;

public enum OnlineOrderProductsEnum {

    PEPPERONI("pepperoni"),

    SAUSAGE("sausage"),

    CHEESE_PIZZA("Cheese Pizza"),

    PIZZA("pizza"),

    STIX("stix"),

    DRINKS("drinks"),

    SWEET_ENDINGS("sweet endings"),

    FOURTEEN_INCH_ORIGINAL("14\" original"),

    SIXTEEN_INCH_ORIGINAL("16\" original"),

    FOURTEEN_INCH_THIN("14\" thin"),

    TWELVE_INCH_ORIGINAL("12\" original"),

    TEN_INCH_ORIGINAL("10\" original"),

    TWELVE_INCH_PAN("12\" pan"),

    TOPPING("toppings"),

    INSTRUCTIONS("instructions"),

    SPECIALTIES("specialties"),

    TYPESIZE("type/size"),

    TEN_INCH_STIX("ten inch stix"),

    TWENTY_OUNCE_DRINK("twenty ounce drink"),

    TWElVE_OUNCE_DRINK("twelve ounce drink"),

    CRUSH_DRINK("crush drink"),

    PEPSI_DRINK("pepsi drink"),

    TWELVE_PEPSI_DRINK("12 pepsi drink"),

    PEPSI_2LITER("pepsi two liter"),

    DIET_PEPSI_2LITER("diet pepsi two liter"),

    PEPSI_MAX_2LITER("pepsi max two liter"),

    MTN_DEW_2LITER("mountain dew two liter"),

    DIET_MTN_DEW_2LITER("diet mountain dew two liter"),

    SIERRA_MIST_2LITER("sierra mist two liter"),

    DR_PEPPER_2LITER("dr pepper two liter"),

    CRUSH_2LITER("crush two liter"),

    APPLE_PIE("apple pie"),

    MODIFIERS("modifiers"),

    SLICE("slice"),

    SLICE14("slice14"),

    SLICE16("slice16"),

    COOKIE("cookie"),

    BROWNIE("brownie"),

    SELLABLES("sellables"),

    DONATION("donation"),

    CATERING("catering"),

    NAPKINS("napkins"),

    WINGS("wings"),

    ALL_IN_ONE("all in one"),

    TWELVE_INCH_BAC_CSTX("12 inch bac cstx"),

    CREDITCARD("creditcard"),

    GIFTCARD("giftcard"),

    PAYPAL("paypal"),

    CHEESESTICKS("cheesesticks"),
    JALAPENOPAPABITES("jalapeno papa bites");

    private final String value;

    OnlineOrderProductsEnum(String v) {
        this.value = v;
    }

    public String value() {
        return value;
    }

    public static OnlineOrderProductsEnum fromValue(String v) {
        for (OnlineOrderProductsEnum p : OnlineOrderProductsEnum.values()) {
            if (p.value.equals(v)) {
                return p;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

