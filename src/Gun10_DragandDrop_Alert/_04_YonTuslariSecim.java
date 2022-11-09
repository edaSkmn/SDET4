package Gun10_DragandDrop_Alert;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_YonTuslariSecim extends BaseDriver {
    // kutucuga git, icine tiklar
    // b harfine bas, asagi yon tusuna bas
    // enter a bas

    @Test
    public void Test1() {
        driver.get("https://demoqa.com/auto-complete");

        WebElement element = driver.findElement(By.id("autoCompleteSingleInput"));

        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar
                .moveToElement(element)
                .click()
                .sendKeys("b")
                .build();
        aksiyon.perform();

        MyFunc.bekle(2);
        aksiyon=aksiyonlar
                .sendKeys(Keys.DOWN)   //keyDown - keyUp  olurdu  -- birden fazla down dersen asagiya iner 2 kere 5 kere fark etmez
                .sendKeys(Keys.ENTER)
                .build();
        aksiyon.perform();

        driverBekleKapat();


    }
}