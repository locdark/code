import java.util.Scanner;

public class Computer extends Product {
    private String cpu;
    private int ramSize;

    public Computer() {
    }

    public Computer(String ID, String name, String model, double price, int quantity, String cpu, int ramSize) {
        super(ID, name, model, price, quantity);
        this.cpu = cpu;
        this.ramSize = ramSize;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public void computerInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CPU: ");
        setCpu(sc.nextLine());
        System.out.print("Enter RAM size: ");
        setRamSize(sc.nextInt());
        sc.nextLine(); // Đọc và loại bỏ new line

        sc.close();
    }

    public String toString() {
        return super.toString() + String.format("| CPU: %s | RAM Size: %d GB", cpu, ramSize);
    }

    public void displayInfo() {
        System.out.println(toString());
    }
}
