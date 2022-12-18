import io.qameta.allure.Description;
import org.junit.Test;
import pageobject.MainPage;

public class ConstructorTest extends BaseTest {

    MainPage mainPage = new MainPage();

    @Test
    @Description("Позитивный тест проверки переходов по разделам")
    public void ingredientsSectionsChangeSuccess() {
        mainPage
                .openMainPage()
                .waitAssembleBurgerToBeVisible()
                .clickAndCheckActiveSaucesButton()
                .clickAndCheckActiveFillingsButton()
                .sleepLittle()
                .clickAndCheckActiveBunsButton();
    }
}