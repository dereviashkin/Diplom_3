package pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static steps.SeleniumSteps.clickButton;
import static steps.SeleniumSteps.openPage;

public class ResetPasswordPage {

    private static final String resetPasswordPage = "https://stellarburgers.nomoreparties.site/reset-password";

    private static final By loginButton = By.xpath(".//a[text() = 'Войти']");

    @Step("Открываем главную страницу")
    public ResetPasswordPage openResetPasswordPage() {
        openPage(resetPasswordPage);
        return this;
    }

    @Step("Кликаем по кнопке \"Войти\"")
    public ResetPasswordPage clickLoginButton() {
        clickButton(loginButton);
        return this;
    }
}