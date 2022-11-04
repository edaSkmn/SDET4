package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _01_IFrameGiris extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://chercher.tech/practice/frames");

       // driver.switchTo().frame("frame1"); //id ve name ve webElement ile gecis cok yavas
        driver.switchTo().frame(0); // index cok hizli bir sekilde calisiyor, index ile ilerlenecek bundan sonra
        //System.out.println("gecis tamamlandi");

        WebElement input=driver.findElement(By.cssSelector("#topic + input"));
        input.sendKeys("Turkiye");

        //su anda frame1 ile gosterilen sayfadayiz, diger frame2 veya frame3 veya ilk sayfamizdaki
        //locator laro bulamayiz, cunku driver su anda frame1 isimli sayfayi DRIVE etmekte.

        //1- driver.switchTo().frame(0); --> tekrar yazarsak bunu icteki frame3 e gecis olur.
        //2- driver.switchTo().parentFrame(); --> bir onceki sayfaya geri doneriz
        //3- driver.switchTo().defaultContent(); --> hangi sayfada olursan ol ilk sayfaya direkt gecisi saglar

        driverBekleKapat();
    }

}
