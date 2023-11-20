import java.util.Arrays;

public class Basket {
    Product[] products = new Product[0];

    public void getAllProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public int summOfPrice() {
        int summ = 0;
        for (Product product : products) {
            summ += product.price;
        }
        return summ;
    }

    public void addProducts(Product product) {
        products = Arrays.copyOf(products, products.length + 1);
        products[products.length - 1] = product;
    }


}
