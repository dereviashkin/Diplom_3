package pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static steps.ChecksSteps.waitForElementToBeClickable;
import static steps.SeleniumSteps.clickButton;
import static steps.SeleniumSteps.openPage;

public class PersonalAccountPage {

    private static final String accountPageUrl = "https://stellarburgers.nomoreparties.site/account/profile";

    private static final By logoutButton = By.xpath(".//button[text() = 'Выход']");

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