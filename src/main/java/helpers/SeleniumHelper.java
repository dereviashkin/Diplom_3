package helpers;

import org.openqa.selenium.By;

import static drivermanager.DriverManager.getDriver;

public class SeleniumHelper {

    public static void openPage(String page) {
        getDriver().get(page);
    }

    public static void sendKeysToInputField(String stringToSend, By locator) {
        getDriver().findElement(locator).sendKeys(stringToSend);
    }

    public static void clickButton(By locator) {
        getDriver().findElement(locator).click();
    }
}