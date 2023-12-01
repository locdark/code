import java.util.Scanner;

public class Mouse extends Product{
    private boolean wireless;

    public Mouse() {
    }

    public Mouse(String ID, String name, String model, double price, int quantity, boolean wireless) {
        super(ID, name, model, price, quantity);
        this.wireless = wireless;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    public void mouseInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Chọn wireless (true: có/false: không): ");
        setWireless(sc.nextBoolean());
        sc.close();
    }

    public String toString() {
        return super.toString() + String.format(" | Wireless: %s", wireless ? "Yes" : "No");
    }

    public void displayMouseInfo() {
        System.out.println(toString());
    }
}
