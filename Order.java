public class Order {
    private int orderID;
    private Customer customer;
    private Product[] products;

    public Order(int orderID, Customer customer, Product[] products) {
        this.orderID = orderID;
        this.customer = customer;
        this.products = products;
    }

    public int getOrderID() {
        return orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product[] getProducts() {
        return products;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer Information:");
        customer.displayInfo();

        System.out.println("Ordered Products:");
        for (Product product : products) {
            product.displayInfoProduct();
        }
    }

    public double calculateTotalAmount() {
        double totalAmount = 0.0;
        for (Product product : products) {
            totalAmount += product.getPrice();
        }
        return totalAmount;
    }
}
