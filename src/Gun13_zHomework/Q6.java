package Gun13_zHomework;
//https://demoqa.com/dynamic-properties adresine gidin
//1) “Visible After 5 seconds” butonunun gorunur olmasini bekleyin
//2) “Visible After 5 seconds” butonunun gorunur oldugunu test edin

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Q6 extends BaseDriver {
    @Test
    public void Test1() {

        driver.get("https://demoqa.com/dynamic-properties");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));

        WebElement visiblebutton = driver.findElement(By.id("visibleAfter"));
        Assert.assertTrue("button is disable", visiblebutton.isEnabled());

        driverBekleKapat();
    }
}
//         COZUM - 2
//        driver.get("https://demoqa.com/dynamic-properties");
//
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("enableAfter"))));
//        WebElement button= driver.findElement(By.id("enableAfter"));
//        Assert.assertTrue("button is not displayed",button.isDisplayed());