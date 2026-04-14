package by.homework.frontcontroller;

public class Main {

    public static void main(String[] args) {
        FrontController frontController = new FrontController();

        frontController.handleRequest("home");
        System.out.println();

        frontController.handleRequest("profile");
        System.out.println();

        frontController.handleRequest("settings");
    }
}