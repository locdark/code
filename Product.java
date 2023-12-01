import java.util.Scanner;

public class Product {
    private String ID;
    private String name;
    private String model;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(String ID, String name, String model, double price, int quantity) {
        this.ID = ID;
        this.name = name;
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }

    
    // Các phương thức getter và setter

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void infoProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name: ");
        setName(sc.nextLine());
        System.out.print("Enter product model (C: Computer/ M: Mouse/ K: Keyboard): ");
        setModel(sc.nextLine());
        System.out.print("Enter product price: ");
        setPrice(sc.nextDouble());
        System.out.print("Enter product quantity: ");
        setQuantity(sc.nextInt());
        sc.nextLine(); // Đọc dòng mới để xử lý lỗi nhập không mong muốn
    }

    @Override
    public String toString() {
        return String.format("| %10s | %15s | %10s | %15f | %10d |", ID, name, model, price, quantity);
    }

    public void displayInfoProduct() {
        System.out.println(toString());
    }

}
