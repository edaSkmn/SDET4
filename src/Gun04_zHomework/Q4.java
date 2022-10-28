package Gun04_zHomework;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drives/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement submitButton = driver.findElement(By.id("calculate"));
        MyFunc.bekle(1);
        submitButton.click();

        WebElement number1= driver.findElement(By.id("number1"));
        MyFunc.bekle(1);
        number1.sendKeys("5");

        WebElement number2= driver.findElement(By.id("number2"));
        MyFunc.bekle(1);
        number2.sendKeys("15");


        WebElement submitButton2 = driver.findElement(By.id("calculate"));
        submitButton2.click();

        WebElement result = driver.findElement(By.id("answer"));
        System.out.println("result.getText() = " + result.getText());
       

        MyFunc.bekle(10);
        driver.quit();
    }
}
