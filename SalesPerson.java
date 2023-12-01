public class SalesPerson {
    private int salesPersonID;
    private String salesPersonName;
    private String salesPersonEmail;

    public SalesPerson(int salesPersonID, String salesPersonName, String salesPersonEmail) {
        this.salesPersonID = salesPersonID;
        this.salesPersonName = salesPersonName;
        this.salesPersonEmail = salesPersonEmail;
    }

    public int getSalesPersonID() {
        return salesPersonID;
    }

    public String getSalesPersonName() {
        return salesPersonName;
    }

    public String getSalesPersonEmail() {
        return salesPersonEmail;
    }

    public void displayInfo() {
        System.out.println("Salesperson ID: " + salesPersonID);
        System.out.println("Name: " + salesPersonName);
        System.out.println("Email: " + salesPersonEmail);
    }
}
