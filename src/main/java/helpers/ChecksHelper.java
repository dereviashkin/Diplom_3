package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static drivermanager.DriverManager.getDriver;
import static drivermanager.DriverManager.getDriverWait;

public class ChecksHelper {

    public static void waitForElementToBeClickable(By locator) {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void waitForElementToBeVisible(By locator) {
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void checkIfButtonActive(By locator) {
        getDriver().findElement(locator).getAttribute("class").contains("current");
    }
}