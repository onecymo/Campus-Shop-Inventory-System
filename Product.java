public class Product {


    private String productID;
    private String productName;
    private String productCategory;
    private double unitPrice;
    private int quantityInStock;
    
    public Product(String productID, String productName,
                   String productCategory, double unitPrice,
                   int quantityInStock) {

        this.productID = productID;
        this.productName = productName;
        this.productCategory = productCategory;

        setUnitPrice(unitPrice);
        setQuantityInStock(quantityInStock);
    }

    
    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }


    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public final void setUnitPrice(double unitPrice) {
        if (unitPrice >= 0) {
            this.unitPrice = unitPrice;
        } else {
            System.out.println("Error: Price cannot be negative!");
        }
    }

    public final void setQuantityInStock(int quantityInStock) {
        if (quantityInStock >= 0) {
            this.quantityInStock = quantityInStock;
        } else {
            System.out.println("Error: Stock quantity cannot be negative!");
        }
    }
}