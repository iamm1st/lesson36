package by.homework.frontcontroller;

public class Dispatcher {

    public void dispatch(String request) {
        PageController controller = switch (request) {
            case "home" -> new HomePageController();
            case "profile" -> new ProfilePageController();
            default -> new ErrorPageController();
        };

        controller.process();
    }
}