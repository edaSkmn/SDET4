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

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(65));
        wait.until(ExpectedConditions.urlToBe("https://www.facebook.com/"));
        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.facebook.com/"));


        driver.close();

    }

}
//        Robot rbt = new Robot();
//        rbt.keyPress(KeyEvent.VK_CONTROL);
//        rbt.keyPress(KeyEvent.VK_T);
//
//        rbt.keyRelease(KeyEvent.VK_CONTROL);
//        rbt.keyRelease(KeyEvent.VK_T);

//        To switch to the new tab
//        ArrayList<String> tabs = new ArrayList<String>(drive.getWindowHandles());
//        drive.switchTo().window(tabs.get(1));
//       To navigate to new link/URL in 2nd new tab
//       drive.get("http://facebook.com");