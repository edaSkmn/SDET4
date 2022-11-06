package Gun09_zHomework;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import sun.awt.windows.WEmbeddedFrame;

import javax.xml.ws.WebEndpoint;
import java.util.List;

public class Q1 extends BaseDriver {

//    Ödev 1 : http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html
//    buradaki ülke ve şehirleri findElements ile topluca bularak bir döngü ile bütün şehirleri doğru ülkere dağıtınız.

    @Test
    public void Test1() {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

        List<WebElement> capitals = driver.findElements(By.cssSelector("div[id='answerDiv']>div[id^='a']"));
        List<WebElement> boxes = driver.findElements(By.cssSelector("div[id='questionDiv']>div[id^='q']+div"));
        Actions islemler = new Actions(driver);

        for (WebElement sehir : capitals) {
            for (WebElement ulke : boxes) {
                islemler.moveToElement(sehir).clickAndHold().perform();

                MyFunc.bekle(1);
                islemler.release(ulke).perform();
                if (sehir.getAttribute("class").contains("correct")) {
                    boxes.remove(ulke);
                    break;
                }

            }
        }

        driverBekleKapat();

    }

}
