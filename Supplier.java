public class Supplier {
    private int supplierID;
    private String supplierName;
    private String supplierAddress;

    public Supplier(int supplierID, String supplierName, String supplierAddress) {
        this.supplierID = supplierID;
        this.supplierName = supplierName;
        this.supplierAddress = supplierAddress;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void displayInfo() {
        System.out.println("Supplier ID: " + supplierID);
        System.out.println("Supplier Name: " + supplierName);
        System.out.println("Supplier Address: " + supplierAddress);
    }
}
