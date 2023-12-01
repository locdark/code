class Feedback {
    private int feedbackID;
    private Customer customer;
    private String feedbackText;

    public Feedback(int feedbackID, Customer customer, String feedbackText) {
        this.feedbackID = feedbackID;
        this.customer = customer;
        this.feedbackText = feedbackText;
    }

    public void displayFeedbackDetails() {
        System.out.println("Feedback ID: " + feedbackID);
        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Feedback Text: " + feedbackText);
    }
}
