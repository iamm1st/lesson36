package by.homework.frontcontroller;

public class HomePageController implements PageController {

    @Override
    public void process() {
        System.out.println("Открыта главная страница.");
    }
}