package PageObjects;

public class PapaCard {
    private String cardNumber;

    private String pin;

    private String price;

    private String papaCardTip;

    private String authNumber;

    private String refNumber;

    private String batchId;

    private String cardName;

    public PapaCard() {
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPapaCardTip() {
        return papaCardTip;
    }

    public void setPapaCardTip(String papaCardTip) {
        this.papaCardTip = papaCardTip;
    }

    public String getAuthNumber() {
        return authNumber;
    }

    public void setAuthNumber(String authNumber) {
        this.authNumber = authNumber;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public PapaCard(String cardNumber, String price, String pin) {
        this.cardNumber = cardNumber;
        this.price = price;
        this.pin = pin;
    }

    public PapaCard(String cardNumber, String pin) {
        this.cardNumber = cardNumber;
        this.pin = pin;
    }
}
