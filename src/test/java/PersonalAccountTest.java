import io.qameta.allure.Description;
import org.junit.Test;
import pageobject.LoginPage;
import pageobject.MainPage;
import pageobject.PersonalAccountPage;
import pageobject.RegisterPage;

public class PersonalAccountTest extends BaseTest {

    MainPage mainPage = new MainPage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();

    PersonalAccountPage personalAccountPage = new PersonalAccountPage();
    @Test
    @Description("Позитивный тест перехода в личный кабинет")
    public void personalAccountProfileCorrectSuccess() {
        registerPage
                .openRegisterPage()
                .fillRegisterForm()
                .clickRegisterButton();
        loginPage
                .waitForLoginButtonIsVisible()
                .loginWithCreatedAccount()
                .clickLoginButton();
        mainPage
                .clickPersonalAccountButton();
        personalAccountPage
                .waitForLogoutButtonIsVisible();
    }

    @Test
    @Description("Позитивный тест выхода из своей учетной записи")
    public void personalAccountLogoutCorrectSuccess() {
        registerPage
                .openRegisterPage()
                .waitForRegisterButtonToAppear()
                .fillRegisterForm()
                .clickRegisterButton();
        loginPage
                .waitForLoginButtonIsVisible()
                .loginWithCreatedAccount()
                .clickLoginButton();
        mainPage
                .clickPersonalAccountButton();
        personalAccountPage
                .waitForLogoutButtonIsVisible()
                .clickLogoutButton();
        loginPage
                .waitForLoginButtonIsVisible();
    }

    @Test
    @Description("Позитивный тест перехода на главную из личного кабинета по кнопке \"Конструктор\"")
    public void personalAccountConstructorSuccess() {
        registerPage
                .openRegisterPage()
                .fillRegisterForm()
                .clickRegisterButton();
        loginPage
                .waitForLoginButtonIsVisible()
                .loginWithCreatedAccount()
                .clickLoginButton();
        mainPage
                .clickPersonalAccountButton();
        personalAccountPage
                .waitForLogoutButtonIsVisible();
        mainPage
                .clickConstructorButton()
                .waitAssembleBurgerToBeVisible();
    }

    @Test
    @Description("Позитивный тест перехода на главную из личного кабинета по кнопке \"Stellar Burgers\"")
    public void personalAccountStellarBurgerSuccess() {
        registerPage
                .openRegisterPage()
                .fillRegisterForm()
                .clickRegisterButton();
        loginPage
                .waitForLoginButtonIsVisible()
                .loginWithCreatedAccount()
                .clickLoginButton();
        mainPage
                .clickPersonalAccountButton();
        personalAccountPage
                .waitForLogoutButtonIsVisible();
        mainPage
                .clickStellarBurgersButton()
                .waitAssembleBurgerToBeVisible();
    }
}