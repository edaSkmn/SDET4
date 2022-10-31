package Gun09_Actions;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _07_ActionDragAndDropTest extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement oslo=driver.findElement(By.id("box1"));
        WebElement norvec=driver.findElement(By.id("box101"));

        //1.yontem
       // new Actions(driver).dragAndDrop(oslo, norvec).build().perform(); //kisa yol
        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.dragAndDrop(oslo,norvec).build();
        aksiyon.perform();

        //2.yontem
        WebElement seul=driver.findElement(By.id("box5"));
        WebElement kore=driver.findElement(By.id("box105"));

        aksiyon= aksiyonlar.clickAndHold(seul).build();
        aksiyon.perform(); // suruklenecek elementi mousela tuttum aldim
      //  new Actions(driver).clickAndHold(seul).build().perform(); //kisa yol

        aksiyon= aksiyonlar.moveToElement(kore).release().build();
        aksiyon.perform(); // hedefe gotur(moveToElement) ve birak(release)
        //  new Actions(driver).moteToElement(kore).release().build(). //kisa yol


        MyFunc.bekle(2);
        driverBekleKapat();

    }
}