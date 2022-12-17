package drivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class DriverManager {
    private static WebDriver driver;
    private static WebDriverWait driverWait;

    /**
     * Инициализация Вебдрайвера в зависимости от переданного имени браузера
     */
    private static WebDriver init(String browserName) {
        File driverPath = new File("");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        switch (browserName) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", driverPath.getAbsolutePath() + "\\src\\main\\resources\\webdrivers\\chromedriver.exe");
            case "yandex":
                System.setProperty("webdriver.chrome.driver", driverPath.getAbsolutePath() + "\\src\\main\\resources\\webdrivers\\yandexdriver.exe");
        }
        driver = new ChromeDriver(chromeOptions);
        return driver;
    }

    /**
     * Геттер вебдрайвера
     *
     * @return объект драйвера
     */
    public static WebDriver getDriver() {
        return driver;
    }

    /**
     * Сеттер вебдрайвера
     *
     * @param browserName обозначение браузера
     */
    public static void setDriver(String browserName) {
        if (driver == null) {
            init(browserName);
        }
    }

    /**
     * Закрыть все сессии браузера
     */
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    /**
     * Инициализация Вебдрайвервейта
     *
     * @return объект вебдрайвервейта
     */
    private static WebDriverWait initWait() {
        Duration duration = Duration.ofSeconds(10);
        return new WebDriverWait(driver, duration);
    }

    /**
     * Геттер для вебдрайвервейта
     *
     * @return объект вебдрайвервейта
     */
    public static WebDriverWait getDriverWait() {
        return driverWait;
    }

    /**
     * Присваиваем ссылку объекту вебдрайвервейта
     */
    public static void setDriverWait() {
        if (driverWait == null) {
            driverWait = initWait();
        }
    }
}
