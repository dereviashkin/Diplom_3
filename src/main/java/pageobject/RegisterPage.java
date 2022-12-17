package pageobject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static helpers.SeleniumHelper.openPage;


public class RegisterPage {

    public static final String registerUrl = "https://stellarburgers.nomoreparties.site/register";

    public static final By registerButton = By.xpath(".//button[text() = 'Зарегистрироваться']");

    @Step("Открываем страницу регистрации и ждем отображения кнопки \"Зарегистрироваться\"")
    public RegisterPage openRegisterPage() {
        openPage(registerUrl, registerButton);
        return this;
    }
}
