package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
/*
   Senaryo :
   https://chercher.tech/practice/frames sitesine gidiniz
   Ekranda gözüken ilk kutucuğa Türkiye yazınız.
   Daha sonra select in seçeneklerinden Avatar ı seçiniz.
 */

public class _02_IFramelerGecis extends BaseDriver {
    @Test
    public void Test1() {

        driver.get("https://chercher.tech/practice/frames");
        driver.switchTo().frame(0);
        WebElement input = driver.findElement(By.cssSelector("#topic + input"));
        input.sendKeys("Turkiye");

        //driver.switchTo().parentFrame(); // bir adim/kademe icerde oldugundan yine default page e ulasiyor
        driver.switchTo().defaultContent(); // default page yani asil giris sayfasina ulastim ayni sekilde

        // driver.switchTo().defaultContent().switchTo().frame(1); // bu sekilde de 2. frame e gidilebiliyor
        driver.switchTo().frame(1);  // ana sayfadaki 2.frame(index olarak 1) ulasildi. burasi select oldugu yer

        WebElement menu = driver.findElement(By.id("animals"));
        Select ddMenu = new Select(menu);
        ddMenu.selectByVisibleText("Avatar");

        driverBekleKapat();
    }

}
