package Gun07_zHomework;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement submitButton = driver.findElement(By.xpath("//a[@id='calculate']"));
        MyFunc.bekle(1);
        submitButton.click();

        WebElement number1= driver.findElement(By.xpath("//input[@id='number1']"));
        MyFunc.bekle(1);
        number1.sendKeys("5");

        WebElement number2= driver.findElement(By.xpath("//input[@id='number2']"));
        MyFunc.bekle(1);
        number2.sendKeys("15");


        WebElement submitButton2 = driver.findElement(By.xpath("//input[@type='submit']"));
        submitButton2.click();

        WebElement result = driver.findElement(By.xpath("//span[@id='answer']"));
        System.out.println("result = " + result.getText());
       
        driverBekleKapat();
    }
}
