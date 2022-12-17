package pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static helpers.ChecksHelper.waitForElementToBeVisible;

public class LoginPage {

    static final String loginUrl = "https://stellarburgers.nomoreparties.site/login";

    static final By loginButton = By.xpath(".//button[text() = 'Войти']");

    @Step("Ждем, что видна кнопка \"Войти\"")
    public LoginPage waitForRegistrationIsSuccess() {
        waitForElementToBeVisible(loginButton);
        return this;
    }
}