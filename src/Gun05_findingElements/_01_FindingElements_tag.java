package Gun05_findingElements;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_FindingElements_tag extends BaseDriver { // extend ettik boylece her seferinde uzun uzun yazmamamiza gerek kalmadi
    public static void main(String[] args) {

        driver.get("https://www.hepsiburada.com/"); // web sayfasini acar

        List<WebElement> linkler = driver.findElements(By.tagName("a")); // tag etiketine gore bulur. findElement dersem ilk elementi bulur.
        // bu bana sayfadaki tum linkleri verir. findelementS dedik cunku.

        for (WebElement e : linkler) {
            if (e.getText().equals("")) { // kirik link yani ekranda gorunen kismi yok

                System.out.println("link.getAttribute(href) = " + e.getAttribute("href"));
                System.out.println("link.getAttribute(title) = " + e.getAttribute("title"));
                System.out.println("link.getAttribute(rel) = " + e.getAttribute("rel"));

                // System.out.println(e.getText()); // a ile baslayan tum elementleri yazdirdik yukaridaki if olmazsa eger
            }
        }
        driverBekleKapat();
    }
}
