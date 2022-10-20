package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class _04_FindingByClassName {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drives/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  // web sayfasini kontrol eden gorevli
        driver.get("https://www.jotform.com/221934510376353"); // web sayfasini acar


            WebElement submitButton = driver.findElement(By.className("form-submit-button"));
            System.out.println("submitButton.getText() = " + submitButton.getText());  // sayfayi acti
            //submitButton.click(); // butonu tiklattik - asagidaki kod calissin diye kapattik

        // Chrome ctrl+f ye basildiginda inspect bolumunde arar
        // first_name yazarsak butun kelimelerde arar
        // #first_name yazarsak butun ID parametlerinde arar
        // .first_name yazarsak butun CLASS parametlerinde arar

        // birden fazla ayni locator a sahip eleman bulursa findElement ne yapar?
        // cevap : ilk elementi bulur
        WebElement element = driver.findElement(By.className("form-sub-label"));
        System.out.println("element.getText() = " + element.getText());

        // Bu locatora ait elemanlarin hepsini nasil alirim?
        List<WebElement> labels=driver.findElements(By.className("form-sub-label"));
        System.out.println("labels.size()"+labels.size());
        for (WebElement e : labels)
            System.out.println("e.getText()"+ e.getText());


        // findElement bir element bulur. birden fazla ise ilkini bulur. elementi bulamazsa NosuchElement hatasi gonderir.
        // findElementS elementlerin hepsini bulur. locatorda bir sey bulamazsa hata vermez, size i sifir verir.
        MyFunc.bekle(10);
        driver.quit();

    }
}

