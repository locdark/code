public class Payment {
    private int paymentID;
    private String paymentMethod;
    private double paymentAmount;

    public Payment(int paymentID, String paymentMethod, double paymentAmount) {
        this.paymentID = paymentID;
        this.paymentMethod = paymentMethod;
        this.paymentAmount = paymentAmount;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void displayInfo() {
        System.out.println("Payment ID: " + paymentID);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Payment Amount: " + paymentAmount);
    }
}
