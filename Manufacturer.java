public class Manufacturer {
    private int manufacturerID;
    private String manufacturerName;
    private String manufacturerCountry;

    public Manufacturer(int manufacturerID, String manufacturerName, String manufacturerCountry) {
        this.manufacturerID = manufacturerID;
        this.manufacturerName = manufacturerName;
        this.manufacturerCountry = manufacturerCountry;
    }

    public int getManufacturerID() {
        return manufacturerID;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void displayInfo() {
        System.out.println("Manufacturer ID: " + manufacturerID);
        System.out.println("Manufacturer Name: " + manufacturerName);
        System.out.println("Country: " + manufacturerCountry);
    }
}
