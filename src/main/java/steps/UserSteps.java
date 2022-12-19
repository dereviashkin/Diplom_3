package steps;

import entities.User;

import static steps.GeneratorSteps.*;

public class UserSteps {

    static User user;

    public User getRandomUser() {
        user = new User(randomName(), randomEmail(), randomPassword());
        System.out.printf("\nИмя: %s, Email: %s, Пароль: %s", user.getName(), user.getEmail(), user.getPassword());
        return user;
    }

    public static String getCurrentPassword() {
        return user.getPassword();
    }

    public static String getCurrentEmail() {
        return user.getEmail();
    }
}