package Gun04_zHomework;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drives/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com/");

        WebElement keyword= driver.findElement(By.name("keyword"));
        MyFunc.bekle(1);
        keyword.sendKeys("teddy bear");


        WebElement submitButton = driver.findElement(By.className("searchTextSpan"));
        MyFunc.bekle(1);
        submitButton.click();

        WebElement nameDogrulama= driver.findElement(By.className("nnn"));
        if (nameDogrulama.getText().contains("We've got 262 results for teddy bear")){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }

        MyFunc.bekle(10);
        driver.quit();
    }
}
