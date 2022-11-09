package Gun10_DragandDrop_Alert;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionTusKontrolSendKeys extends BaseDriver {

    @Test
    public void Test1(){
     driver.get("https://demoqa.com/auto-complete");

        WebElement element=driver.findElement(By.id("autoCompleteSingleInput"));

        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar
                .moveToElement(element) //kutucuga git
                .click()                // icine tiklat
                .keyDown(Keys.SHIFT)    //Shifte bas
                .sendKeys("a")          //a ya bas/yaz
                .keyUp(Keys.SHIFT)      //shifti birak
                .sendKeys("hmet")
                .build();               //hmet yaz

        MyFunc.bekle(2);
        aksiyon.perform();

        driverBekleKapat();
    }
}
