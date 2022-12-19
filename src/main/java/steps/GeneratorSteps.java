package steps;

import com.github.javafaker.Faker;
import io.qameta.allure.Step;

import java.util.UUID;

public class GeneratorSteps {

    private static String name;

    public static String randomString(int length) {
        return UUID.randomUUID().toString().replace("-", "").substring(0, length);
    }

    @Step("Генерируем пароль длиной 8 знаков")
    public static String randomPassword() {
        return randomString(8);
    }

    @Step("Генерируем пароль длиной 5 знаков")
    public static String randomPasswordShort() {
        return randomString(5);
    }

    @Step("Генерируем имя пользователя")
    public static String randomName() {
        name = new Faker().name().firstName();
        return name;
    }

    @Step("Генерируем почтовый ящик")
    public static String randomEmail() {
        if (name != null) {
            return name.toLowerCase() + randomString(3) + "@yandex.ru";
        } else return randomString(3) + "@yandex.ru";
    }
}