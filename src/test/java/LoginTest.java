import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pageobject.LoginPage;
import pageobject.MainPage;
import pageobject.RegisterPage;
import pageobject.ResetPasswordPage;

public class LoginTest extends BaseTest {

    private MainPage mainPage = new MainPage();
    private RegisterPage registerPage = new RegisterPage();
    private LoginPage loginPage = new LoginPage();
    private ResetPasswordPage resetPasswordPage = new ResetPasswordPage();

    @Test
    @DisplayName("Позитивный тест логина с главной страницы через кнопку \"Войти в аккаунт\"")
    public void loginMainPageLoginButtonSuccess() {
        registerPage
                .openRegisterPage()
                .fillRegisterForm()
                .clickRegisterButton();
        mainPage
                .openMainPage()
                .clickLoginToAccountButton();
        loginPage
                .loginWithCreatedAccount()
                .clickLoginButton();
    }

    @Test
    @DisplayName("Позитивный тест логина с главной страницы через кнопку \"Личный кабинет\"")
    public void loginMainPagePersonalAccountButtonSuccess() {
        registerPage
                .openRegisterPage()
                .fillRegisterForm()
                .clickRegisterButton();
        mainPage
                .openMainPage()
                .clickPersonalAccountButton();
        loginPage
                .loginWithCreatedAccount()
                .clickLoginButton();
    }

    @Test
    @DisplayName("Позитивный тест логина после регистрации")
    public void loginRegisterCorrectSuccess() {
        registerPage
                .openRegisterPage()
                .fillRegisterForm()
                .clickRegisterButton();
        loginPage
                .openLoginPage()
                .waitForLoginButtonIsVisible()
                .loginWithCreatedAccount()
                .clickLoginButton();
    }

    @Test
    @DisplayName("Позитивный тест логина на странице восстановления пароля")
    public void loginResetPasswordCorrectSuccess() {
        registerPage
                .openRegisterPage()
                .fillRegisterForm()
                .clickRegisterButton();
        resetPasswordPage
                .openResetPasswordPage()
                .clickLoginButton();
        loginPage
                .waitForLoginButtonIsVisible()
                .loginWithCreatedAccount()
                .clickLoginButton();
    }
}