package p1.Repository;

import p1.Entity.Product;

import java.util.ArrayList;

public class ProductRepository {
    public static ArrayList<Product> getAll() {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(1, "Jabłko", 150));
        products.add(new Product(2, "Pomrańcz", 350));
        products.add(new Product(3, "Banan", 220));
        products.add(new Product(4, "Gruszka", 250));
        products.add(new Product(5, "Śliwka", 200));

        return products;
    }
}
