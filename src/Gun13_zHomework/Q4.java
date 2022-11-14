package Gun13_zHomework;

//1) https://demoqa.com/browser-windows adresine gidin
//2) Alerts’e tiklayin
//3) On button click, alert will appear after 5 seconds karsisindaki click me butonuna basin
//4) Allert’in gorunur olmasini bekleyin
//5) Allert uzerindeki yazinin “This alert appeared after 5 seconds” oldugunu test edin
//6) Ok diyerek alerti kapatin

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Q4 extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://demoqa.com/browser-windows");

        WebElement alert=driver.findElement(By.xpath("//span[@class='text'][text()='Alerts']"));
        alert.click();

        WebElement clickMe=driver.findElement(By.id("timerAlertButton"));
        clickMe.click();

        wait.until(ExpectedConditions.alertIsPresent());

        String alertText= driver.switchTo().alert().getText();

        Assert.assertEquals("This alert appeared after 5 seconds",alertText);

        driver.switchTo().alert().accept();
        System.out.println("alertText = " + alertText);
        driverBekleKapat();

    }

}
