package Gun09_Actions;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionClickTest extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://demoqa.com/buttons");

        WebElement element=driver.findElement(By.xpath("//button[text()='Click Me']"));
        //element.click(); normal click bunu bu sekilde de yapabilirim ama actions ile yapacagim bu sefer

        Actions aksiyonlar=new Actions(driver);
        System.out.println("Aksiyon oncesi tum aksiyonlari calistiracagimiz ana aksiyonlar sinifi olusturuldu");

        Action aksiyon=aksiyonlar.moveToElement(element).click().build();
                    //elementin uzerine gidildi click aksiyonu hazirda bekliyor, henuz click yapilmadi
        System.out.println("aksiyon hazirlandi");

        MyFunc.bekle(2);
        aksiyon.perform(); // aksiyon gerceklesir - AKSIYON PERFORM ILE OLUSUR/GERCEKLESIR
        System.out.println("Aksiyon gerceklesti");

       // aksiyonlar.moveToElement(element).click().build().perform(); // kisa hali
        driverBekleKapat();


    }
}
