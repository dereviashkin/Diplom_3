import drivermanager.DriverManager;
import org.junit.BeforeClass;

public abstract class BaseTest {

    /**
     * Инициализируем вебдрайвер. Подходящие имена бразуера: chrome, yandex.
     * Инициализируем вебдрайвервейт.
     */
    @BeforeClass
    public static void initChromeDriver() {
        DriverManager.setDriver("chrome");
        DriverManager.setDriverWait();
    }
}