package Gun13_Scroll_Robot;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;
import java.time.Instant;

public class _05_RobotFileUpload2 extends BaseDriver {
    @Test
    public void Test1() throws AWTException {
        driver.get("http://demo.guru99.com/test/upload/");
        MyFunc.bekle(2);

        WebElement input=driver.findElement(By.id("uploadfile_0"));
        input.sendKeys("C:\\Users\\SSM\\IdeaProjects\\SDET4\\src\\Gun13_Scroll_Robot\\ornek.txt"); // sendKeys yontemi ile dosyayi yukledik

        MyFunc.bekle(2);
        WebElement submit=driver.findElement(By.id("submitbutton"));
        submit.click();

        // butona basıldıktan sonra yazının çıkması süre alıyor, bu beklendi
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement uploadMesaj=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("res")));

        Assert.assertTrue(uploadMesaj.getText().contains("has been successfully uploaded.")); // beklentiyi yazıyoruz

        MyFunc.bekle(2);
        driverBekleKapat();
    }
}