import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pageobject.LoginPage;
import pageobject.RegisterPage;

public class RegisterTest extends BaseTest {

    private RegisterPage registerPage = new RegisterPage();
    private LoginPage loginPage = new LoginPage();

    @Test
    @DisplayName("Позитивный тест регистрации нового пользователя")
    public void registerNewUserCorrectSuccess() {
        registerPage
                .openRegisterPage()
                .fillRegisterForm()
                .clickRegisterButton();
        loginPage
                .waitForLoginButtonIsVisible();
    }

    @Test
    @DisplayName("Негативный тест регистрации нового пользователя, пароль слишком короткий")
    public void registerNewUserShortPasswordFail() {
        registerPage
                .openRegisterPage()
                .fillRegisterFormShortPass()
                .clickRegisterButton()
                .waitForIncorrectPassMessageAppear();
    }
}