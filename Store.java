public class Store {
    private int storeID;
    private String storeName;
    private String storeLocation;

    public Store(int storeID, String storeName, String storeLocation) {
        this.storeID = storeID;
        this.storeName = storeName;
        this.storeLocation = storeLocation;
    }

    public int getStoreID() {
        return storeID;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void displayInfo() {
        System.out.println("Store ID: " + storeID);
        System.out.println("Store Name: " + storeName);
        System.out.println("Store Location: " + storeLocation);
    }
}
