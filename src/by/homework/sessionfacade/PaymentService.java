package by.homework.sessionfacade;

public class PaymentService {

    public boolean pay(double amount) {
        System.out.println("Выполнена оплата на сумму: " + amount);
        return true;
    }
}