package by.homework.frontcontroller;

public class ErrorPageController implements PageController {

    @Override
    public void process() {
        System.out.println("Ошибка: страница не найдена.");
    }
}