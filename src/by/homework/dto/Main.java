package by.homework.dto;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserService();

        UserDto userDto = userService.getUserDtoById(1);

        if (userDto != null) {
            System.out.println("Получен DTO-объект:");
            System.out.println(userDto);
        } else {
            System.out.println("Пользователь не найден.");
        }
    }
}