public class CustomerList {
    private Customer[] customers;
    private int size;

    public CustomerList(int capacity) {
        customers = new Customer[capacity];
        size = 0;
    }

    public void addCustomer(Customer customer) {
        if (size < customers.length) {
            customers[size] = customer;
            size++;
        } else {
            System.out.println("Danh sách khách hàng đã đầy. Không thể thêm nữa.");
        }
    }

    public void displayAll() {
        for (int i = 0; i < size; i++) {
            customers[i].displayInfo();
        }
    }

    // Thêm các phương thức khác để thao tác với danh sách khách hàng
}
