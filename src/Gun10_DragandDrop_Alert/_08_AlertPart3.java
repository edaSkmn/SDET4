package Gun10_DragandDrop_Alert;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _08_AlertPart3 extends BaseDriver {
    //3. Alerte tiklayaniz, isminizi alert e yaziniz, daha sonra OK a basip,
    //HTML sayfasinda isminizin goruntulendigini Assert ile kontrol ediniz.

    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe3 = driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']"));
        clickMe3.click();
        MyFunc.bekle(2);

        driver.switchTo().alert().sendKeys("john");
        driver.switchTo().alert().accept();
        MyFunc.bekle(2);

        WebElement txtActual = driver.findElement(By.cssSelector("[id='prompt-demo']"));
        Assert.assertTrue("ismi yazmadi",txtActual.getText().contains("john"));

        driverBekleKapat();

    }
}