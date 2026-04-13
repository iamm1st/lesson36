package by.homework.dto;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private final List<User> users = new ArrayList<>();

    public UserRepository() {
        users.add(new User(1, "Полина Александровна", "poly@mail.ru", "qwerty123", 19));
        users.add(new User(2, "Сергей Сергеев", "serj@mail.ru", "password456", 25));
    }

    public User findById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}