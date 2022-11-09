package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

    public static WebDriver driver;

    public static WebDriverWait wait;

    static { // methodu cagirmaya gerek yok boylece
        //ilk adimda calisan kod kismi

        KalanOncekileriKapat();

        Logger logger= Logger.getLogger(""); // sisteme ait butun loglari ureten objeye/servise ulastim.
        logger.setLevel(Level.SEVERE); // sadece errorlari goster

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver", "Drives/chromedriver.exe");
        driver = new ChromeDriver();  // web sayfasini kontrol eden gorevli

        driver.manage().window().maximize();  // Ekrani max yapiyor.
        driver.manage().deleteAllCookies();  // sitenin senin bilgisayarinda yaptigi ayarlar siliniyor, sayfa baslangic ayarlarina donuyor

        Duration dr=Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr); // sadece tum sayfanin kodlarinin bilgisayariniza inmesi suresiyle ilgili
        // bu eklenmezse Selenium sayfa yuklenene kadar (sonsuza) bekler. 30 sn suresince sayfanin yuklenmesini bekle. yuklenmezse hata ver diyoruz.
        // eger 2 snde yuklerse sayfayi 30 sn beklemez.

        driver.manage().timeouts().implicitlyWait(dr); // Butun webEelementlerin element bazinda, elemente ozel islem yapilmadan once
        // hazir hale gelmesi icin verilen sure/muhlet.

        wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    }

    public static void KalanOncekileriKapat() {

        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception ignored) {

        }
    }
    public static void driverBekleKapat(){
        MyFunc.bekle(5);
        driver.quit();
    }

}
