package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static drivermanager.DriverManager.getDriver;
import static drivermanager.DriverManager.getDriverWait;

public class SeleniumHelper {

    public static void openPage(String page, By locator) {
        getDriver().get(page);
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


}
