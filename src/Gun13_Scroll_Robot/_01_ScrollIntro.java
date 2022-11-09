package Gun13_Scroll_Robot;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

/*
    Selenium da Sayfayı aşağı kaydırılması gereken durumlar vardır:
    Bunlar , sayfa kaydırıldıkça yüklenen elemanlar için
    Bu işlem javascript executer ile yapılır.Bu interface sayesinde
    sayfa kaydırma işlemi ve javascript komutları çalıştırılabilir
    sayfa üzerinde.

    window.scrollBy(0, 3000);
    window.scrollTo(0, document.body.scrollHeight);
    "arguments[0].scrollIntoView(true);", elemen
    "arguments[0].click();", element
 */
public class _01_ScrollIntro extends BaseDriver {
    @Test
    public void Test1()
    {
        driver.get("https://triplebyte.com/");

        MyFunc.bekle(2);
        // JavaScript komutlarını çalıştırmak için önce js değişkeni tanımlandı.
        JavascriptExecutor js= (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0, 3000);");
        // (0,3000) -> (x,y) Sayfayı sağa x kadar ve aşağı y kaydırır
        // 3000 px kadar aşağı kaydıracak.

        MyFunc.bekle(2);
        js.executeScript("window.scrollBy(0, -3000);"); // - yani yukari

        // scrollTo : Verilen pixele gider. (direk verilene gider)
        // scrollBy : Verilen kadar daha ileri gider.  (append)

        MyFunc.bekle(5);
        driverBekleKapat();
    }

}

