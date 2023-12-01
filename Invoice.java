public class Invoice {
    private int invoiceID;
    private Order order;
    private Payment payment;

    public Invoice(int invoiceID, Order order, Payment payment) {
        this.invoiceID = invoiceID;
        this.order = order;
        this.payment = payment;
    }

    public void generateInvoice() {

            double totalAmount = order.calculateTotalAmount();
            System.out.println("Generating Invoice for Order ID: " + order.getOrderID());
            System.out.println("Total Amount: " + totalAmount);
            System.out.println("Payment Method: " + payment.getPaymentMethod());
            System.out.println("Payment Amount: " + payment.getPaymentAmount());
            System.out.println("Invoice generated successfully.");
        }

    public void displayInvoiceDetails() {
        System.out.println("Invoice ID: " + invoiceID);
        System.out.println("Order Information:");
        order.displayOrderDetails();
        System.out.println("Payment Information:");
        payment.displayInfo();
    }
}
