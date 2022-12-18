package pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static helpers.ChecksHelper.waitForElementToBeVisible;
import static helpers.SeleniumHelper.clickButton;
import static helpers.SeleniumHelper.sendKeysToInputField;
import static helpers.UserHelper.getCurrentEmail;
import static helpers.UserHelper.getCurrentPassword;

public class LoginPage {

    static final String loginPageUrl = "https://stellarburgers.nomoreparties.site/login";

    static final By loginButton = By.xpath(".//button[text() = 'Войти']");
    static final By inputFieldEmail = By.xpath(".//label[text() = 'Email']/following-sibling::input");
    static final By inputFieldPassword = By.xpath(".//label[text() = 'Пароль']/following-sibling::input");

    @Step("Ждем, что видна кнопка \"Войти\"")
    public LoginPage waitForLoginButtonIsVisible() {
        waitForElementToBeVisible(loginButton);
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