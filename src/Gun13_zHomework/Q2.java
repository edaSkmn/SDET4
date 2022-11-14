package Gun13_zHomework;
//1- https://www.youtube.com/ adresine gidiniz
//2- "Selenium" kelimesi ile video aratınız.
//3- Listelenen sonuçlarda 80 videoaya kadar lsiteyi uzatınız.
//4- Son videonun title ını yazdırınız.

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.junit.Test;
import java.util.List;

public class Q2 extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://www.youtube.com/");
        // WebElement accept= driver.findElement(By.xpath("(//*[@class='yt-spec-touch-feedback-shape__fill'])[11] "));
        // accept.click();

        MyFunc.bekle(2);
        WebElement search=driver.findElement(By.cssSelector("input[id='search']"));
        search.sendKeys("Selenium");
        search.sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.urlContains("Selenium"));
        List<WebElement> videoList =driver.findElements(By.cssSelector("h3[class*='style-scope']>[id='video-title']"));

        do {
            videoList= driver.findElements(By.cssSelector("h3[class*='style-scope']>[id='video-title']"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,1000)");

        }while (videoList.size()<80);

        System.out.println("videoList.size() = " + videoList.size());
        System.out.println(videoList.get(79).getText());
        driverBekleKapat();

    }
}