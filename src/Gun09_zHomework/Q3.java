package Gun09_zHomework;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Q3 extends BaseDriver {

    //Ödev 3: http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html
    //         buradaki bütün şehirleri bütün ülkere doğru şekilde topluca dağıtınız.

    @Test
    public void Test1() {
        driver.get(" http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");
        List<WebElement> sehirler = driver.findElements(By.cssSelector("[id='allItems']>[id^='node']"));
        List<WebElement> ulkeler = driver.findElements(By.cssSelector("[id^='box']"));
        Actions islemler = new Actions(driver);

        for (WebElement sehir : sehirler) {
            for (WebElement ulke : ulkeler) {
                islemler.moveToElement(sehir).clickAndHold().perform();
                MyFunc.bekle(1);
                islemler.release(ulke).perform();
                if (sehir.getAttribute("class").contains("correct")) {
                    break;
                }

            }
        }
        driverBekleKapat();
    }
}