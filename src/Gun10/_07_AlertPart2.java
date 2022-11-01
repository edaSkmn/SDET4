package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _07_AlertPart2 extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe2 = driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']"));
        clickMe2.click();
        MyFunc.bekle(2);

        driver.switchTo().alert().dismiss(); // Alert kutucuguna gecildi ve CANCEL(iptal) butonuna tiklandi
        MyFunc.bekle(2);

        driverBekleKapat();

    }
}