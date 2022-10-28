package Gun04_zHomework;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drives/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAlert = driver.findElement(By.id("fakealerttest"));
        MyFunc.bekle(1);
        fakeAlert.click();

        WebElement submitButton1 = driver.findElement(By.id("modaldialog"));
        MyFunc.bekle(1);
        submitButton1.click();

        WebElement submitButton2 = driver.findElement(By.id("dialog-ok"));
        MyFunc.bekle(1);
        submitButton2.click();

        MyFunc.bekle(10);
        driver.quit();
    }
}
