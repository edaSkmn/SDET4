package Gun06_Css;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.junit.Assert; // javanin kendi Test kontrol ve organize sinifi


public class _01_CssSelector extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement message= driver.findElement(By.cssSelector("[placeholder='Please enter your Message']"));
        MyFunc.bekle(1);
        message.sendKeys("hello tester");

        WebElement btn = driver.findElement(By.cssSelector("button[onclick='showInput();']"));
        MyFunc.bekle(1);
        btn.click();


        WebElement msg= driver.findElement(By.cssSelector("span[id='display']"));
//        if (msg.getText().contains("hello tester")){
//            System.out.println("Passed");
//        }else {
//            System.out.println("Failed");
//        }

        Assert.assertTrue("message not found",msg.getText().contains("hello tester1")); // expected
        //assertTrue: icindeki deger True mu? True ise hicbir sey yapmaz, mesaj vermez
        //degilse beklenen olmamis demektedir ve hata mesaji verir
        //yani genel kural : hata var ise goster

        driverBekleKapat();
    }
}
