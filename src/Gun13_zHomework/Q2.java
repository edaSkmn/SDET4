package Gun13_zHomework;
//1- https://www.youtube.com/ adresine gidiniz
//2- "Selenium" kelimesi ile video aratınız.
//3- Listelenen sonuçlarda 80 videoaya kadar lsiteyi uzatınız.
//4- Son videonun title ını yazdırınız.

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Q2 extends BaseDriver {
    public static void main(String[] args) throws AWTException {

        driver.get("https://www.youtube.com/");

        WebElement search=driver.findElement(By.cssSelector("input[id='search']"));
        search.sendKeys("Selenium");
        Robot rbt=new Robot();
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement video1=driver.findElement(By.cssSelector("a[title='Selenium Interview Questions and Answers'] > yt-formatted-string[class='style-scope ytd-video-renderer']"));

        js.executeScript("window.scrollBy(0,15);");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(video1));
//        js.executeScript("window.scrollTo(0, 5);");
      //  js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

    }
}