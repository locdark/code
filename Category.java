public class Category {
    private int categoryID;
    private String categoryName;
    private String categoryDescription;

    public Category(int categoryID, String categoryName, String categoryDescription) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void displayInfo() {
        System.out.println("Category ID: " + categoryID);
        System.out.println("Category Name: " + categoryName);
        System.out.println("Category Description: " + categoryDescription);
    }
}
