package pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static steps.ChecksSteps.waitForElementToBeVisible;
import static steps.SeleniumSteps.*;
import static steps.UserSteps.getCurrentEmail;
import static steps.UserSteps.getCurrentPassword;

public class LoginPage {

    private static final String loginPageUrl = "https://stellarburgers.nomoreparties.site/login";

    private static final By loginButton = By.xpath(".//button[text() = 'Войти']");
    private static final By inputFieldEmail = By.xpath(".//label[text() = 'Email']/following-sibling::input");
    private static final By inputFieldPassword = By.xpath(".//label[text() = 'Пароль']/following-sibling::input");

    @Step("Ждем, что видна кнопка \"Войти\"")
    public LoginPage waitForLoginButtonIsVisible() {
        waitForElementToBeVisible(loginButton);
        return this;
    }

    @Step("Открываем страницу логина")
    public LoginPage openLoginPage() {
        openPage(loginPageUrl);
        return this;
    }

    @Step("Заполняем поля данными созданной учетки")
    public LoginPage loginWithCreatedAccount() {
        sendKeysToInputField(getCurrentEmail(), inputFieldEmail);
        sendKeysToInputField(getCurrentPassword(), inputFieldPassword);
        return this;
    }

    @Step("Кликаем по кнопке \"Войти\"")
    public LoginPage clickLoginButton() {
        clickButton(loginButton);
        return this;
    }
}