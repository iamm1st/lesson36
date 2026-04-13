package by.homework.sessionfacade;

import java.util.List;

public class OrderSessionFacade {

    private final ProductCatalogService productCatalogService = new ProductCatalogService();
    private final CartService cartService = new CartService();
    private final PaymentService paymentService = new PaymentService();
    private final DeliveryService deliveryService = new DeliveryService();

    public void showCatalog() {
        List<Product> products = productCatalogService.getAllProducts();

        System.out.println("Каталог товаров:");
        for (Product product : products) {
            System.out.println(product.getId() + ". " + product.getName() + " - " + product.getPrice());
        }
    }

    public void addProductToCart(int productId) {
        Product product = productCatalogService.findProductById(productId);

        if (product == null) {
            System.out.println("Товар не найден.");
            return;
        }

        cartService.addProduct(product);
    }

    public void checkout(String address) {
        if (cartService.isEmpty()) {
            System.out.println("Корзина пуста. Оформление невозможно.");
            return;
        }

        double totalPrice = cartService.getTotalPrice();
        boolean paymentResult = paymentService.pay(totalPrice);

        if (paymentResult) {
            deliveryService.arrangeDelivery(address);
            System.out.println("Заказ успешно оформлен.");
            cartService.clearCart();
        } else {
            System.out.println("Ошибка оплаты.");
        }
    }
}