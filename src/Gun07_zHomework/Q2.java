package Gun07_zHomework;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drives/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.applitools.com/");

        WebElement userName= driver.findElement(By.xpath("//input[@id='username']"));
        MyFunc.bekle(1);
        userName.sendKeys("ttechno@gmail.com");

        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        MyFunc.bekle(1);
        password.sendKeys("techno123.");

        WebElement submitButton = driver.findElement(By.xpath("//a[@id='log-in']"));
        MyFunc.bekle(1);
        submitButton.click();

        WebElement nameDogrulama= driver.findElement(By.xpath("//h6[@id='time']"));
        if (nameDogrulama.getText().contains("Your nearest branch closes in: 30m 5s")){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }
        MyFunc.bekle(5);
        driver.quit();

    }
}