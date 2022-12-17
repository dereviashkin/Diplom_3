package pageobject;

import entities.User;
import helpers.UserHelper;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static helpers.ChecksHelper.waitForElementToBeVisible;
import static helpers.GeneratorHelper.*;
import static helpers.SeleniumHelper.*;


public class RegisterPage {

    static final String registerPageUrl = "https://stellarburgers.nomoreparties.site/register";

    static final By buttonRegister = By.xpath(".//button[text() = 'Зарегистрироваться']");
    static final By inputFieldName = By.xpath(".//label[text() = 'Имя']/following-sibling::input");
    static final By inputFieldEmail = By.xpath(".//label[text() = 'Email']/following-sibling::input");
    static final By inputFieldPassword = By.xpath(".//label[text() = 'Пароль']/following-sibling::input");
    static final By messageIncorrectPassword = By.xpath(".//p[text() = 'Некорректный пароль']");

    @Step("Открываем страницу регистрации")
    public RegisterPage openRegisterPage() {
        openPage(registerPageUrl);
        return this;
    }

    @Step("Ждем отображения кнопки \"Зарегистрироваться\"")
    public RegisterPage waitForRegisterButtonToAppear() {
        waitForElementToBeVisible(buttonRegister);
        return this;
    }

    @Step("Заполняем поля для регистрации нового пользователя")
    public RegisterPage fillRegisterForm() {
        User user = new UserHelper().getRandomUser();
        sendKeysToInputField(user.getName(), inputFieldName);
        sendKeysToInputField(user.getEmail(), inputFieldEmail);
        sendKeysToInputField(user.getPassword(), inputFieldPassword);
        return this;
    }

    @Step("Заполняем поля для регистрации нового пользователя, но пароль короткий")
    public RegisterPage fillRegisterFormShortPass() {
        sendKeysToInputField(randomName(), inputFieldName);
        sendKeysToInputField(randomEmail(), inputFieldEmail);
        sendKeysToInputField(randomPasswordShort(), inputFieldPassword);
        return this;
    }

    @Step("Кликаем по кнопке \"Зарегистрироваться\"")
    public RegisterPage clickRegisterButton() {
        clickButton(buttonRegister);
        return this;
    }

    @Step("Ждем отображения ошибки о некорректном пароле")
    public RegisterPage waitForIncorrectPassMessageAppear() {
        waitForElementToBeVisible(messageIncorrectPassword);
        return this;
    }
}