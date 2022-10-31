package Gun08_FacebookOrnegi;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Soru_Cozum2 extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://www.facebook.com/");
        //driver.manage().deleteAllCookies();  // girildikten sonrada cookies ler silindi

        // //*[text()='Allow essential and optional cookies']
//        WebElement cookiesAccept=driver.findElement(By.xpath("//*[text()='Allow essential and optional cookies']"));
//        cookiesAccept.click();

        WebElement btnYeniHesap = driver.findElement(By.linkText("Create New Account"));
        btnYeniHesap.click();

        MyFunc.bekle(1);
        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("kevin");

        MyFunc.bekle(1);
        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("martin");

        //2. yontem  //#fullname_field+div+div   - attribute ile buluyoruz - webElementi buldu, getAttribute ile class kontrolu yapti
        //gorunmuyor

        WebElement hiddenElement=driver.findElement(By.cssSelector("#fullname_field+div+div"));
        Assert.assertTrue("Email girmeden once gizli durumu",hiddenElement.getAttribute("class").equals("hidden_elem"));

        MyFunc.bekle(1);
        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("kmar@hotmail.com");

        //gorunuyor

        hiddenElement=driver.findElement(By.cssSelector("#fullname_field+div+div"));
        Assert.assertFalse("Email girmeden sonra gizli durumu",hiddenElement.getAttribute("class").equals("hidden_elem"));



    }
}