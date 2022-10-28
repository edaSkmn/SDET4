package Gun05_findingElements;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseDriver {

    public static void main(String[] args) {

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html"); // web sayfasi acma komutu
        MyFunc.bekle(3);
        WebElement element= driver.findElement(By.linkText("Alerts (JavaScript)"));
        element.click();

        System.out.println(driver.getCurrentUrl()); // o anda bulundugum URL`yi verir

        MyFunc.bekle(3);
        driver.navigate().back(); // tarayici history isinde geri geldim.

        MyFunc.bekle(3);
        driver.navigate().forward(); // tarayici historyisinden ileri gittim

        System.out.println(driver.getCurrentUrl()); // o anda bulundugum URL`yi verir

        driverBekleKapat();
    }
}
