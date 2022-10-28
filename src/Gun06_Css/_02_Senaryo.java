package Gun06_Css;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Senaryo extends BaseDriver {
    @Test
         public void test1(){
//        1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
//        2- Business i çekleyin.
//        3- discover XYZ ye tıklatın ve online Advertising i seçin
//        4- Every day i seçin
//        5- Good u seçin
//        6- using XYZ yi tıklatın ve 3.seçeneği seçin

        driver.get( "https://formsmarts.com/form/yu?mode=h5");
        WebElement business = driver.findElement(By.cssSelector("[type='radio'][value='Business']"));
        business.click();
        MyFunc.bekle(1);

        WebElement dropDownDiscover = driver.findElement(By.cssSelector("select[id$='_4588'] > :nth-last-child(3)"));
        dropDownDiscover.click();
        MyFunc.bekle(1);

        WebElement optionOnlineAdvertising=driver.findElement(By.cssSelector("input[id='u_uMY_89585_0'] ~ [class='label-body']")); //  > option[value='Online Advertising']
        optionOnlineAdvertising.click();
        MyFunc.bekle(1);

        WebElement buttonEveryDay=driver.findElement(By.cssSelector("[type='radio'][value='Every Day']"));
        buttonEveryDay.click();
        MyFunc.bekle(1);

        WebElement goodRadio=driver.findElement(By.cssSelector("[type='radio'][value='Good']"));
        goodRadio.click();
        MyFunc.bekle(1);

        WebElement howLongDropDown=driver.findElement(By.cssSelector("select[name$='_4597']"));  // > option[value*='month or more']
        howLongDropDown.click();
        MyFunc.bekle(1);

        WebElement secenek4=driver.findElement(By.cssSelector("select[id$='_4597'] > :nth-child(4)"));
        secenek4.click();
        MyFunc.bekle(1);

        goodRadio.click(); // sadece son acilan dropDown kapansin diye herhangi bir yere tiklattik

        driverBekleKapat();
    }

}
