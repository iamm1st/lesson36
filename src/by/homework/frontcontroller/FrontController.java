package by.homework.frontcontroller;

public class FrontController {

    private final Dispatcher dispatcher = new Dispatcher();

    public void handleRequest(String request) {
        logRequest(request);

        if (isAuthenticUser()) {
            dispatcher.dispatch(request);
        } else {
            System.out.println("Доступ запрещен. Пользователь не авторизован.");
        }
    }

    private void logRequest(String request) {
        System.out.println("Получен запрос: " + request);
    }

    private boolean isAuthenticUser() {
        return true;
    }
}