package by.homework.sessionfacade;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalogService {

    private final List<Product> products = new ArrayList<>();

    public ProductCatalogService() {
        products.add(new Product(1, "Ноутбук", 3500.00));
        products.add(new Product(2, "Мышь", 120.00));
        products.add(new Product(3, "Клавиатура", 250.00));
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product findProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}