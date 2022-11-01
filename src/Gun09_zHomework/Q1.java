package Gun09_zHomework;

import Utility.BaseDriver;
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
    public void Test1(){
    driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

    List< WebElement> capitals=driver.findElements(By.cssSelector("div[id='answerDiv'][style='visibility: visible;']"));
    Actions aksiyonlar=new Actions(driver);
//    Action aksiyon=aksiyonlar.dragAndDrop().build();




}

}
