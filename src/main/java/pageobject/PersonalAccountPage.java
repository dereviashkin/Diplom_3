package pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static helpers.ChecksHelper.waitForElementToBeClickable;
import static helpers.SeleniumHelper.clickButton;
import static helpers.SeleniumHelper.openPage;

public class PersonalAccountPage {

    static final String accountPageUrl = "https://stellarburgers.nomoreparties.site/account/profile";

    static final By logoutButton = By.xpath(".//button[text() = 'Выход']");

    @Step("Открываем страницу профиля")
    public PersonalAccountPage openAccountPage() {
        openPage(accountPageUrl);
        return this;
    }

    @Step("Кликаем по кнопке \"Выход\"")
    public PersonalAccountPage clickLogoutButton() {
        clickButton(logoutButton);
        return this;
    }

    @Step("Ждем, что кнопка \"Выход\" стала кликабельна")
    public PersonalAccountPage waitForLogoutButtonIsVisible() {
        waitForElementToBeClickable(logoutButton);
        return this;
    }
}