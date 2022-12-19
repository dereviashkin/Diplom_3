package pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static steps.ChecksSteps.*;
import static steps.SeleniumSteps.clickButton;
import static steps.SeleniumSteps.openPage;

public class MainPage {

    private static final String mainPageUrl = "https://stellarburgers.nomoreparties.site";

    private static final By loginToAccountButton = By.xpath(".//button[text()='Войти в аккаунт']");
    private static final By personalAccountButton = By.xpath(".//p[text() = 'Личный Кабинет']");
    private static final By assembleBurgerHeader = By.xpath(".//h1[text() = 'Соберите бургер']");
    private static final By constructorButton = By.xpath(".//p[text() = 'Конструктор']");
    private static final By stellarBurgersButton = By.xpath(".//div[contains(@class, 'AppHeader_header__logo')]");
    private static final By bunsButton = By.xpath(".//span[text()='Булки']/parent::div");
    private static final By saucesButton = By.xpath(".//span[text()='Соусы']/parent::div");
    private static final By fillingsButton = By.xpath(".//span[text()='Начинки']/parent::div");

    @Step("Открываем главную страницу")
    public MainPage openMainPage() {
        openPage(mainPageUrl);
        return this;
    }

    @Step("Кликаем по кнопке \"Войти в аккаунт\"")
    public MainPage clickLoginToAccountButton() {
        clickButton(loginToAccountButton);
        return this;
    }

    @Step("Кликаем по кнопке \"Конструктор\"")
    public MainPage clickConstructorButton() {
        clickButton(constructorButton);
        return this;
    }

    @Step("Кликаем по кнопке \"Stellar Burgers\"")
    public MainPage clickStellarBurgersButton() {
        clickButton(stellarBurgersButton);
        return this;
    }

    @Step("Кликаем по кнопке \"Личный кабинет\"")
    public MainPage clickPersonalAccountButton() {
        clickButton(personalAccountButton);
        return this;
    }

    @Step("Кликаем по кнопке \"Соусы\"")
    public MainPage clickAndCheckActiveSaucesButton() {
        clickButton(saucesButton);
        checkIfButtonActive(saucesButton);
        waitForElementToBeClickable(fillingsButton);
        return this;
    }

    @Step("Кликаем по кнопке \"Начинки\"")
    public MainPage clickAndCheckActiveFillingsButton() {
        clickButton(fillingsButton);
        checkIfButtonActive(fillingsButton);
        waitForElementToBeClickable(bunsButton);
        return this;
    }

    @Step("Кликаем по кнопке \"Булки\"")
    public MainPage clickAndCheckActiveBunsButton() {
        clickButton(bunsButton);
        checkIfButtonActive(bunsButton);
        waitForElementToBeClickable(saucesButton);
        return this;
    }

    @Step("Ждём, что отобразилась надпись \"Соберите бургер\"")
    public MainPage waitAssembleBurgerToBeVisible() {
        waitForElementToBeVisible(assembleBurgerHeader);
        return this;
    }

    @Step("Сон")
    public MainPage sleepLittle() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this;
    }
}