package Gun13_Scroll_Robot;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.tools.Tool;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

/*
     İnterview Soruları :
     1- Windows popupları nasıl kontrol edersiniz ? Robot class la
     2- Dosya yükleme işlemini ne ile yaparsınız ? Robot class la
 */
public class _04_RobotGiris extends BaseDriver {
    public static void main(String[] args) throws AWTException {

        driver.get("http://demo.guru99.com/test/upload/");
        MyFunc.bekle(2);

        Robot rbt=new Robot();

        /*   Accept All için */  //cookies cikarsa hepsini kabul etsin diye yazdil bu kod
//            for(int i=0;i<6;i++) {
//                rbt.keyPress(KeyEvent.VK_TAB);
//                rbt.keyRelease(KeyEvent.VK_TAB);
//            MyFunc.bekle(1);
//        }

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);
        /*****************************/

        for(int i=0;i<21;i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
            MyFunc.bekle(1);
        }

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);// su anda windows pop-up acildi

        /*pop-up i kapatma bolumu
//        for(int i=0;i<4;i++) {  // buradan itibaren sayfayi kapatma kodlari yaziyor
//            rbt.keyPress(KeyEvent.VK_TAB);
//            rbt.keyRelease(KeyEvent.VK_TAB);
//            MyFunc.bekle(1);
//        }
//
//        rbt.keyPress(KeyEvent.VK_ENTER);
//        rbt.keyRelease(KeyEvent.VK_ENTER);

         */

        // bilgisayarımızdaki dosyanın path ini, dosya adının olduğu yere yapıştırmamız gerekiyor bunun için
        // önce dosyanın path , yolunu hafızaya kopyalayıp, sonra ctrl+v ile açılan windows popup ın
        // dosya adı bölümüne yapıştırmamız gerekiyor.// hafızaya path i kopyaladık

        //hafizaya path i kopyaladim
        StringSelection selection = new StringSelection("C:\\Users\\SSM\\IdeaProjects\\SDET4\\src\\Gun13_Scroll_Robot\\ornek.txt");
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);

        MyFunc.bekle(1);
        // ctrl+v yaptim/bastim
        rbt.keyPress(KeyEvent.VK_CONTROL); //kopyaladim
        rbt.keyPress(KeyEvent.VK_V);  //yapistirdim

        MyFunc.bekle(1);
        // ctrl+v biraktim
        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyRelease(KeyEvent.VK_V);

        //Enter a basarak pop-up i biraktim
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        WebElement chcBox = driver.findElement(By.xpath("//*[@id='terms']"));
        chcBox.click();

        WebElement submit = driver.findElement(By.id("submitbutton"));
        submit.click();

        // butona basıldıktan sonra yazının çıkması süre alıyor, bu beklendi
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement uploadMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("res")));

        Assert.assertTrue(uploadMessage.getText().contains("has been successfully uploaded.")); //bekleneni/olmasi gerekeni yazdik

        driverBekleKapat();
    }
}

