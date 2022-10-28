package Gun06_Css;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelector_2 extends BaseDriver {

    @Test
    public void test1(){
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        String mesajim="hello tester"; // metod olusturuldu boylece hata olasiligi azaltildi ve tekrar tekrar mesaji yazmaya gerek kalmadi
        WebElement message= driver.findElement(By.cssSelector("[placeholder='Please enter your Message']"));
        MyFunc.bekle(1);
        message.sendKeys(mesajim);

        WebElement btn = driver.findElement(By.cssSelector("button[onclick='showInput();']"));
        MyFunc.bekle(1);
        btn.click();


        WebElement msg= driver.findElement(By.cssSelector("span[id='display']"));
//        if (msg.getText().contains("hello tester")){
//            System.out.println("Passed");
//        }else {
//            System.out.println("Failed");
//        }

        Assert.assertTrue(mesajim+" message not found",msg.getText().contains(mesajim)); // expected
        //assertTrue: icindeki deger True mu? True ise hicbir sey yapmaz, mesaj vermez
        //degilse beklenen olmamis demektedir ve hata mesaji verir
        //yani genel kural : hata var ise goster

        driverBekleKapat();
    }
}

