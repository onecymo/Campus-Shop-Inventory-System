
public class Main {

    
    public static final class Product {

        // Private attributes
        private final String productID;
        private final String productName;
        private final  String productCategory;
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

    

        public void setUnitPrice(double unitPrice) {

            if (unitPrice >= 0) {
                this.unitPrice = unitPrice;
            } else {
                System.out.println(
                    "Invalid unit price. It must be not-negative.");
            }
        }

        public void setQuantityInStock(int quantityInStock) {

            if (quantityInStock >= 0) {
                this.quantityInStock = quantityInStock;
            } else {
                System.out.println(
                    "Invalid quantity in stock. It must be non-negative.");
            }
        }
    }
    public static void main(String[] args) {

        // Creating five Product objects

        Product product1 = new Product(
            "P001", "Exercise Book", "Stationery", 3000, 50);

        Product product2 = new Product(
            "P002", "Blue Pen", "Writing Materials", 1000, 100);

        Product product3 = new Product(
            "P003", "Printing Paper", "Paper Products", 15000, 30);

        Product product4 = new Product(
            "P004", "Flash Disk", "Electronics", 25000, 20);

        Product product5 = new Product(
            "P005", "Calculator", "Electronics", 35000, 15);

        // Storing products in an array

        Product[] products = {
            product1, product2, product3, product4, product5
        };

    

        System.out.println("==============================================");
        System.out.println("       CAMPUS SHOP INVENTORY SYSTEM");
        System.out.println("==============================================");

        System.out.println("\nINITIAL PRODUCT INFORMATION");

        for (Product product : products) {

            System.out.println("----------------------------------------------");
            System.out.println("Product ID: " + product.getProductID());
            System.out.println("Product Name: " + product.getProductName());
            System.out.println("Category: " + product.getProductCategory());
            System.out.println("Unit Price: UGX " + product.getUnitPrice());
            System.out.println("Quantity in Stock: " +
                               product.getQuantityInStock());
        }

    

        System.out.println("\nUPDATING PRODUCT INFORMATION");

        product1.setUnitPrice(3500);

        product2.setQuantityInStock(150);

        

        System.out.println("\nTESTING INVALID PRICE");

        product3.setUnitPrice(-5000);

        // Testing invalid stock

        System.out.println("\nTESTING INVALID STOCK");

        product4.setQuantityInStock(-10);

    

        System.out.println("\nUPDATED PRODUCT INFORMATION");

        for (Product product : products) {

            System.out.println("----------------------------------------------");
            System.out.println("Product ID: " + product.getProductID());
            System.out.println("Product Name: " + product.getProductName());
            System.out.println("Category: " + product.getProductCategory());
            System.out.println("Unit Price: UGX " + product.getUnitPrice());
            System.out.println("Quantity in Stock: " +
                               product.getQuantityInStock());
        }

        System.out.println("----------------------------------------------");

        System.out.println("\nInventory system executed successfully!");
    }
}