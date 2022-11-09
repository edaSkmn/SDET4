package Gun13_Scroll_Robot;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _02_ScrollToBottomOfThePage extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://triplebyte.com/");

        JavascriptExecutor js=(JavascriptExecutor) driver;

        MyFunc.bekle(2);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        // sayfa sonuna kadar kaydır

        MyFunc.bekle(2);
        js.executeScript("window.scrollTo(0, 0);");
        // sayfa başına git

        driverBekleKapat();
    }
}
