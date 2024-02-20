package PageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StaticTestSession {
    public static BrowserSession browserSession = new BrowserSession();
  //  public static DriverDispatchSession driverDispatchSession = new DriverDispatchSession();

    public static User currentUser = null;

    public static String currentOrderId = null;
    public static String currentOrderIdOnPayment = null;
    public static String currentApiOrderId = null;
    public static String previousOrderId = null;
    public static String currentOrderOid = null;
    public static String previousOrderOid = null;
    public static String customerPhoneNumber = null;
    public static String Amount_To_Collect = null;
    public static String Reg_Miles_Amount = null;
    public static Double estOnlineOrderAmount = null;
    public static Double balanceOnlineOrderAmount = null;
    public static Double estOnlineOrderAmountUpdated = null;
    public static String amountPaidWithGiftCard1 = null;
    public static String amountPaidWithGiftCard2 = null;


    public static long onlineOrderId;
    public static int onlineOrderPassCode;
    public static String onlineErrorCode;
    public static String onlineExpectedErrorCode;

    public static String orderSource = null;
    public static String orderDestination = null;
    public static String paymentType1 = null;
    public static String paymentType2 = null;
    public static String position = null;
    public static boolean isTill = false;
    public static boolean makeLineQualityRedeemCustomerReference = false;

    public static String creditCardNumber1 = null;
    public static String creditCardNumber2 = null;
    public static String papaCardNumber = null;

    public static String expirationDate = null;

    public static String cvv = null;
    public static String pcPin = null;
    public static String ccZipCode = null;


    public static boolean isCompleted = false;
    public static double subTotal;

    public static boolean isForPapaCardTest = false;

    public static boolean isForPreviousOrderTest = false;

    public static boolean isCanadaTest=false;
    public static boolean ignoreCountry=true;

    public static String maxMakelineRow = null;

    public static String customerName=null;

    public static int UPDATED_ORDERS_LARGE_COUNT_VALUE = 0;

    public static String ORDERS_LARGE_COUNT_VALUE = null;
    public static String ORDERS_ADDITIONAL_MINUTE = null;
    public static String PRODUCTS_LARGE_COUNT_VALUE = null;
    public static String PRODUCTS_ADDITIONAL_MINUTE = null;
    public static String DEFAULT_AVERAGE_OTD = null;
    public static String DEFAULT_ESTIMATED_TRIP_TIME = null;
    public static String estimatedDeliveryCarryoutTime = null;
    public static String customerQuoteTimeForPao = null;
    //public static EDTMaintenance EDT_MAINTENANCE_PARAMETER = new EDTMaintenance();

    public static String PAYPAL_TOKEN = null;
    public static String PAYPAL_PAYERID = null;
    public static String ALTPMTID = null;
    // this is for validating pc issue screen for a void and non-delivery order.So, do not reset this value anytime.
    public static String currentOrderId_for_pc_validationn = null;

    public static boolean isEMVEnabled = false;
    public static boolean isRefund = false;
    public static String authPacketStatus = null;

    public static float cardAmount;

    public static String ttidPayment1 = null;
    public static String ttidPayment2 = null;

    public static long saleTTID;
    public static long preauthTTID;

    public static boolean reduceTimeFlag = true;
    public static int reduceTimeCount = 0;

    public static String storeCashBalance = null;
    public static String tillABalance = null;
    public static String tillBBalance = null;

    public static String CURRENT_TEST_NAME = null;
    public static String mileageRateText = null;
    public static String DRIVER_PASSWORD = null;
    public static List<Map<String, Object>> ctdForPCScreen = new ArrayList<>();
    public static String CURRENT_SCENARIO_NAME;
    public static String jwtToken ;
    public static String papaDoughBalance ;
    public static String runningEnvironment ;
   // public static ClientResponse apiResponce ;


    public static void resetValues() {
        currentOrderId = null;
        currentOrderOid = null;
        onlineOrderId = 0;
        onlineOrderPassCode = 0;
        onlineErrorCode = null;
        orderSource = null;
        paymentType1 = null;
        paymentType2 = null;
        position = null;
        isTill = false;
        creditCardNumber1 = null;
        creditCardNumber2 = null;
        expirationDate = null;
        cvv = null;
        isCompleted = false;
        isForPapaCardTest = false;
        isForPreviousOrderTest = false;
        papaCardNumber=null;
        pcPin=null;
        ccZipCode=null;
        customerPhoneNumber = null;
        previousOrderId = null;
        previousOrderOid = null;
        customerName=null;
        ORDERS_LARGE_COUNT_VALUE = null;
        ORDERS_ADDITIONAL_MINUTE = null;
        PRODUCTS_LARGE_COUNT_VALUE = null;
        PRODUCTS_ADDITIONAL_MINUTE = null;
        DEFAULT_AVERAGE_OTD = null;
        DEFAULT_ESTIMATED_TRIP_TIME = null;
        estimatedDeliveryCarryoutTime = null;
        //EDT_MAINTENANCE_PARAMETER = new EDTMaintenance();
        PAYPAL_TOKEN = null;
        PAYPAL_PAYERID = null;
        ALTPMTID = null;
        isRefund = false;
        authPacketStatus = null;
        cardAmount = 0.0f;
        ttidPayment1 = null;
        ttidPayment2 = null;
        ctdForPCScreen = new ArrayList<>();
        CURRENT_TEST_NAME = null;
        makeLineQualityRedeemCustomerReference = false;
    }
}
