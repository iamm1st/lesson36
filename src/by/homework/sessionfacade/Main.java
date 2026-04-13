package by.homework.sessionfacade;

public class Main {

    public static void main(String[] args) {
        OrderSessionFacade facade = new OrderSessionFacade();

        facade.showCatalog();
        System.out.println();

        facade.addProductToCart(1);
        facade.addProductToCart(2);
        System.out.println();

        facade.checkout("г. Минск, ул. Независимости, 10");
    }
}