package Gun14_EkranKaydet;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _02_EkranKaydet extends BaseDriver {
    public static void main(String[] args) throws IOException {

        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement name=driver.findElement(By.name("username"));
        name.sendKeys("admin");

        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("123");

        WebElement submit= driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();

        List<WebElement> hataMesaji=driver.findElements(By.cssSelector("div[role='alert']"));

        if (hataMesaji.size() > 0){
            System.out.println("Login olmadi, Hata mesaji gorundu");

            TakesScreenshot ts=(TakesScreenshot) driver; //1.Asama ekran goruntusunu alma degiskenini tanimladim
            File hafizadakiHali=ts.getScreenshotAs(OutputType.FILE); //2.Asama ekran goruntusu alindi, su an hafizada
            FileUtils.copyFile(hafizadakiHali, new File("ekranGoruntuleri\\screenshot.png")); // ekran goruntusunu dosya olarak aldik

            //TODO: Burada her hatada ayni dosyayi yeniliyor ve uzerine yaziyor
            //      biz istiyoruz ki her dosya ayri olsun, her kayit ayri olsun
            //      bunu nasil yapariz?
            //      LocalDateTime alinacak bilgileri
            //      yilAyGunSaatDakikaSaniye -> 2022_10_07_1319_20.png

        }
        MyFunc.bekle(2);
        driverBekleKapat();

    }
}
