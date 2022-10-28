package Gun06_zHomework;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 extends BaseDriver {

    public static void main(String[] args) {

        driver.get("http://demoqa.com/text-box"); // web sayfasini acar

        WebElement fullName= driver.findElement(By.cssSelector("[id='userName']"));
        MyFunc.bekle(1);
        fullName.sendKeys("Automation");

        WebElement email= driver.findElement(By.cssSelector("[id='userEmail']"));
        MyFunc.bekle(1);
        email.sendKeys("Testing@gmail.com");

        WebElement Caddress= driver.findElement(By.cssSelector("[id='currentAddress']"));
        MyFunc.bekle(1);
        Caddress.sendKeys("Testing Current Address");

        WebElement pAddress= driver.findElement(By.cssSelector("[id='permanentAddress']"));
        MyFunc.bekle(1);
        pAddress.sendKeys("Testing Permanent Address");

        WebElement submitButton = driver.findElement(By.cssSelector("button[id='submit']"));
        MyFunc.bekle(1);
        submitButton.click();

        WebElement nameDogrulama= driver.findElement(By.cssSelector("[id='output']"));
        if (nameDogrulama.getText().contains("Automation")){
            System.out.println("Isim Dogrulama basarili");
        }else {
            System.out.println("Isim Dogrulama basarisiz");
        }
        WebElement emailDogrulama= driver.findElement(By.cssSelector("[id='output']"));
        if (emailDogrulama.getText().contains("Testing@gmail.com")){
            System.out.println("e-Mail Dogrulama basarili");
        }else {
            System.out.println("e-Mail Dogrulama basarisiz");
        }
        driverBekleKapat();
    }
}