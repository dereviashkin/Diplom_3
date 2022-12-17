package helpers;

import entities.User;

import static helpers.GeneratorHelper.*;

public class UserHelper {

    static User user;

    public User getRandomUser() {
        user = new User(randomName(), randomEmail(), randomPassword());
        return user;
    }

    public static String getCurrentPassword() {
        return user.getPassword();
    }

    public static String getCurrentEmail() {
        return user.getEmail();
    }
}