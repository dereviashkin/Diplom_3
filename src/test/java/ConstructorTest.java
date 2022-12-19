import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pageobject.MainPage;

public class ConstructorTest extends BaseTest {

    private MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Позитивный тест проверки переходов по разделам")
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