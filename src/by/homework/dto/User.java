package by.homework.dto;

public class User {

    private final int id;
    private final String fullName;
    private final String email;
    private final String password;
    private final int age;

    public User(int id, String fullName, String email, String password, int age) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }
}