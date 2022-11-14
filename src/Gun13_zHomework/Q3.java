package Gun13_zHomework;

//Senaryo
//1- google.com ile sayfayı açınız.
//2- Daha sonra Yeni bir TAB (ctrl+T) açınız.
//3- Bu açılan yeni sayfada facebook.com u açınız.
//4- Bu sayfanın açıldığını URL sinden kontrol ediniz.
//4- Daha sonra facebook.com sayfasını kapatınız.

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;

public class Q3 extends BaseDriver {
    @Test
    public void Test1(){

        driver.get("https://www.google.com/");

        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://www.facebook.com/");

        Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));

        driver.close();

    }

}
//                COZUM-2
// driver.get("https://www.google.com/");
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_T);
//        robot.keyRelease(KeyEvent.VK_CONTROL);
//        robot.keyRelease(KeyEvent.VK_T);
//
//        List<String> windows= new ArrayList<>(driver.getWindowHandles());
//        driver.switchTo().window(windows.get(1));
//        driver.get("https://www.facebook.com/");
//
//        Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));
//        bekle(2);
//        driver.close();
