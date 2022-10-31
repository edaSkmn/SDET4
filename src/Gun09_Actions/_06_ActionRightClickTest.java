package Gun09_Actions;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionRightClickTest extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://demoqa.com/buttons");

        WebElement element = driver.findElement(By.id("rightClickBtn"));
        MyFunc.bekle(2);

//        Actions aksiyonlar=new Actions(driver); // sinif olusturma
//        Action aksiyon=aksiyonlar.moveToElement(element).contextClick().build(); //aksiyon hazirlama
//        aksiyon.perform(); // aksiyona gecme

        MyFunc.bekle(2);

        new Actions(driver).moveToElement(element).contextClick().build().perform(); // kisa yazimi

        driverBekleKapat();

    }
}