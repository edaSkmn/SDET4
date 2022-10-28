package Gun06_zHomework;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6 extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAlert = driver.findElement(By.cssSelector("a[id='fakealerttest']"));
        MyFunc.bekle(1);
        fakeAlert.click();

        WebElement submitButton1 = driver.findElement(By.cssSelector("input[value='Show modal dialog']"));
        MyFunc.bekle(1);
        submitButton1.click();

        WebElement submitButton2 = driver.findElement(By.cssSelector("button[class='dialog-button']"));
        MyFunc.bekle(1);
        submitButton2.click();

     driverBekleKapat();
    }
}
