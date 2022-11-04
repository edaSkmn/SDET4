package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
/*
   1-driver.get("http://chercher.tech/practice/frames); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
 */

public class _03_IFrameSoru extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("http://chercher.tech/practice/frames");
        driver.switchTo().frame(0);
        WebElement input=driver.findElement(By.cssSelector("#topic + input"));
        input.sendKeys("Turkey");

        driver.switchTo().frame(0); //frame1 icindeki ilk frame e gecis yaptik. frame3 adi

        WebElement checkBox=driver.findElement(By.xpath("//input[@type='checkbox']")); // id("a) , xpath ile //input[@id='a']
        checkBox.click();

        //driver.switchTo().parentFrame(); //frame1 e gecis
        //driver.switchTo().parentFrame(); //ilk sayfaya gecis

        driver.switchTo().defaultContent(); // yukaridaki 2 satirin yerine ilk sayfaya gecis
        driver.switchTo().frame(1);  // selectin oldugu frame(frame2), ilk sayfadaki 2. yani index olarak 1 olan frame

        WebElement menu=driver.findElement(By.id("animals"));
        Select ddMenu=new Select(menu);
        ddMenu.selectByVisibleText("Avatar"); // 4 nolu eleman secildi, ddMenu.getOptions().size()-1 ile son eleman bulunabilir

        driverBekleKapat();
    }
}
