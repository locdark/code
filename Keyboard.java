import java.util.Scanner;

public class Keyboard extends Product{
    private boolean backlit;

    public Keyboard() {
    }

    public Keyboard(String ID, String name, String model, double price, int quantity, boolean backlit) {
        super(ID, name, model, price, quantity);
        this.backlit = backlit;
    }

    public boolean isBacklit() {
        return backlit;
    }

    public void setBacklit(boolean backlit) {
        this.backlit = backlit;
    }
    public void setKeyboardInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter backlit (true: Có/false: Không): ");
        setBacklit(sc.nextBoolean());
        sc.close();
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Backlit: %s", backlit ? "Yes" : "No");
    }

    public void displayKeyboardInfo() {
        System.out.println(toString());
    }
}
