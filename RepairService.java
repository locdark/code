class RepairService {
    private int serviceID;
    private double serviceCost;
    private String serviceType;

    public RepairService(int serviceID, String serviceType, double serviceCost) {
        this.serviceID = serviceID;
        this.serviceType = serviceType;
        this.serviceCost = serviceCost;
    }

    public void displayInfo() {
        System.out.println("Service ID: " + serviceID);
        System.out.println("Service Type: " + serviceType);
        System.out.println("Service Cost: " + serviceCost);
    }
}
