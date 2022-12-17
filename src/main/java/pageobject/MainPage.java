package pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static helpers.SeleniumHelper.clickButton;
import static helpers.SeleniumHelper.openPage;

public class MainPage {

    static final String mainPageUrl = "https://stellarburgers.nomoreparties.site";

    static final By loginToAccount = By.xpath(".//button[text()='Войти в аккаунт']");
    static final By personalAccount = By.xpath(".//p[text() = 'Личный Кабинет']");

    @Step("Открываем главную страницу")
    public MainPage openMainPage() {
        openPage(mainPageUrl);
        return this;
    }

    @Step("Кликаем по кнопке \"Войти в аккаунт\"")
    public MainPage clickLoginButton() {
        clickButton(loginToAccount);
        return this;
    }

    @Step("Кликаем по кнопке \"Личный кабинет\"")
    public MainPage clickPersonalAccButton() {
        clickButton(personalAccount);
        return this;
    }
}