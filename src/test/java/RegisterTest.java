import io.qameta.allure.Description;
import org.junit.Test;
import pageobject.LoginPage;
import pageobject.RegisterPage;

public class RegisterTest extends BaseTest {

    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();

    @Test
    @Description("Позитивный тест регистрации нового пользователя")
    public void registerNewUserCorrectSuccess() {
        registerPage
                .openRegisterPage()
                .fillRegisterForm()
                .clickRegisterButton();
        loginPage
                .waitForLoginButtonIsVisible();
    }

    @Test
    @Description("Негативный тест регистрации нового пользователя, пароль слишком короткий")
    public void registerNewUserShortPasswordFail() {
        registerPage
                .openRegisterPage()
                .fillRegisterFormShortPass()
                .clickRegisterButton()
                .waitForIncorrectPassMessageAppear();
    }
}