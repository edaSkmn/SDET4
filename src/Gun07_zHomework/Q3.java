package Gun07_zHomework;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3 extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");

        WebElement keyword= driver.findElement(By.xpath("//input[@name='keyword']"));
        MyFunc.bekle(1);
        keyword.sendKeys("teddy bear");


        WebElement submitButton = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
        MyFunc.bekle(1);
        submitButton.click();

        WebElement nameDogrulama= driver.findElement(By.xpath("//span[@class='nnn']"));
        if (nameDogrulama.getText().contains("We've got 253 results for teddy bear")){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }

      driverBekleKapat();
    }
}
