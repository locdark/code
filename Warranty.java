public class Warranty {
    private int warrantyID;
    private int warrantyPeriod;
    private String warrantyDescription;

    public Warranty(int warrantyID, int warrantyPeriod, String warrantyDescription) {
        this.warrantyID = warrantyID;
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyDescription = warrantyDescription;
    }

    public int getWarrantyID() {
        return warrantyID;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public String getWarrantyDescription() {
        return warrantyDescription;
    }

    public void displayInfo() {
        System.out.println("Warranty ID: " + warrantyID);
        System.out.println("Warranty Period: " + warrantyPeriod + " months");
        System.out.println("Warranty Description: " + warrantyDescription);
    }
}
