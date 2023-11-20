import java.math.BigDecimal;

public class Product {
    public String productName;
    public double price;

    public Product() {
    }

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return
                "productName :" + productName +
                        "       price: " + price
                ;
    }
}
