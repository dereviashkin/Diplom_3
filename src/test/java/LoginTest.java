import io.qameta.allure.Description;
import org.junit.Test;
import pageobject.LoginPage;
import pageobject.MainPage;
import pageobject.RegisterPage;

public class LoginTest extends BaseTest {

    MainPage mainPage = new MainPage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();

    @Test
    @Description("Позитивный тест логина с главной страницы через кнопку \"Войти в аккаунт\"")
    public void loginMainPageLoginButtonSuccess() {
        registerPage
                .openRegisterPage()
                .fillRegisterForm()
                .clickRegisterButton();
        mainPage
                .openMainPage()
                .clickLoginButton();
        loginPage
                .loginWithCreatedAccount()
                .clickLoginButton();
    }

    @Test
    @Description("Позитивный тест логина с главной страницы через кнопку \"Личный кабинет\"")
    public void loginMainPagePersonalAccButtonSuccess() {
        registerPage
                .openRegisterPage()
                .fillRegisterForm()
                .clickRegisterButton();
        mainPage
                .openMainPage()
                .clickPersonalAccButton();
        loginPage
                .loginWithCreatedAccount()
                .clickLoginButton();
    }
}