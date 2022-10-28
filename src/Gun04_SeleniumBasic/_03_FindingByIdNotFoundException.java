package Gun04_SeleniumBasic;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingByIdNotFoundException {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drives/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  // web sayfasini kontrol eden gorevli
        driver.get("https://www.jotform.com/221934510376353"); // web sayfasini acar

        try {
            WebElement element = driver.findElement(By.id("sublabel_8_firs"));
            System.out.println("element.getText() = " + element.getText());

        }catch(Exception ex){
            System.out.println("eleman bulunamadi"+ ex.getMessage());
        }



        MyFunc.bekle(10);
        driver.quit();

    }
}

