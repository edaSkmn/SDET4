package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_FindingByLinkText {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drives/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  // web sayfasini kontrol eden gorevli
        driver.get("https://www.hepsiburada.com/"); // web sayfasini acar

        WebElement link= driver.findElement(By.linkText("Siparişlerim")); // linkin ekranda gorulen text kismi yazilir
        // sadece a TAGleri icin ozel locator bulma yontemi

        System.out.println("link.getText() = " + link.getText());
        
        System.out.println("link.getAttribute(href) = " + link.getAttribute("href"));
        System.out.println("link.getAttribute(title) = " + link.getAttribute("title"));
        System.out.println("link.getAttribute(rel) = " + link.getAttribute("rel"));

        MyFunc.bekle(10);
        driver.quit();
        
    }   
}
