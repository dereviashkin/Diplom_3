import io.qameta.allure.Description;
import org.junit.Test;
import pageobject.RegisterPage;

public class RegisterPageTest extends BaseTest {
    RegisterPage registerPage = new RegisterPage();

    @Test
    @Description("Положительный тест открытия страницы регистрации")
    public void openRegisterPage() {
        registerPage.openRegisterPage();
    }
}
