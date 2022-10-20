package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingById {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drives/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  // web sayfasini kontrol eden gorevli
        driver.get("https://www.jotform.com/221934510376353"); // web sayfasini acar

        WebElement name= driver.findElement(By.id("first_8")); // elemani bulduk
        name.sendKeys("ismet"); // kutucuga yazi gonderdik

        WebElement surName= driver.findElement(By.id("last_8")); // burada elemani bulduk
        surName.sendKeys("temur"); // ilgili kutucuga yazdirdik

        WebElement labelFirstName= driver.findElement(By.id("sublabel_8_first"));
        System.out.println("labelFirstName.getText()"+labelFirstName.getText());

        WebElement labelLastName= driver.findElement(By.id("sublabel_8_last"));
        System.out.println("labelLastName.getText()"+labelLastName.getText());

        MyFunc.bekle(10);
        driver.quit();

    }
}