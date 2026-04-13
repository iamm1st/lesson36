package by.homework.sessionfacade;

import java.util.ArrayList;
import java.util.List;

public class CartService {

    private final List<Product> cartProducts = new ArrayList<>();

    public void addProduct(Product product) {
        cartProducts.add(product);
        System.out.println("Товар добавлен в корзину: " + product.getName());
    }

    public boolean isEmpty() {
        return cartProducts.isEmpty();
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;

        for (Product product : cartProducts) {
            totalPrice += product.getPrice();
        }

        return totalPrice;
    }

    public void clearCart() {
        cartProducts.clear();
    }
}