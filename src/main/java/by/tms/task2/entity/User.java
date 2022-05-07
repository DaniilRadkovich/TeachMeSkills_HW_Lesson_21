package by.tms.task2.entity;

public class User {
    private final String name;
    private final String login;
    private final String password;

    public User(String name, String password, String login) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
