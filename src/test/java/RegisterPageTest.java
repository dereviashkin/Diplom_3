import io.qameta.allure.Description;
import org.junit.Test;
import pageobject.LoginPage;
import pageobject.RegisterPage;

public class RegisterPageTest extends BaseTest {

    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();

    @Test
    @Description("Положительный тест регистрации нового пользователя")
    public void registerNewUserCorrectSuccess() {
        registerPage
                .openRegisterPage()
                .fillRegisterForm()
                .clickRegisterButton();
        loginPage.waitForRegistrationIsSuccess();
    }

    @Test
    @Description("Негативный тест регистрации нового пользователя, пароль слишком короткий")
    public void registerNewUserShortPassFail() {
        registerPage
                .openRegisterPage()
                .fillRegisterFormShortPass()
                .clickRegisterButton()
                .waitForIncorrectPassMessageAppear();
    }
}