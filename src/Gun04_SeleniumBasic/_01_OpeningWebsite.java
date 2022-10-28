package Gun04_SeleniumBasic;

import Utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebsite {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drives/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  // web sayfasini kontrol eden gorevli
        driver.get("https://www.techno.study/"); // web sayfasini acar

        MyFunc.bekle(5);
        driver.quit();  // driver.close() var birde, bu sadece aktif olan sayfayi kapatir
                        // driver.quit() -> tum acik olanlari kapatir

    }
}



