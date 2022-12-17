import org.junit.AfterClass;
import org.junit.BeforeClass;
import drivermanager.DriverManager;

public abstract class BaseTest {

    /**
     * Инициализируем вебдрайвер. Подходящие имена бразуера: chrome, yandex.
     * Инициализируем вебдрайвервейт.
     */
    @BeforeClass
    public static void initChromeDriver() {
        DriverManager.setDriver("yandex");
        DriverManager.setDriverWait();
    }

    /**
     * Закрываем сессию и окна браузера
     */
    @AfterClass
    public static void quitBrowser() {
        DriverManager.quitDriver();
    }
}