package Gun09_Actions;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_isDisplayed extends BaseDriver {
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

        WebElement reMail=driver.findElement(By.name("reg_email_confirmation__"));
      //  System.out.println("reMail.isDisplayed() = " + reMail.isDisplayed());
        Assert.assertFalse(reMail.isDisplayed());

        MyFunc.bekle(1);
        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("kmar@hotmail.com");

        WebElement reEmail=driver.findElement(By.name("reg_email_confirmation__"));
      //  System.out.println("email2.isDisplayed() = " + reEmail.isDisplayed());
        Assert.assertTrue(reEmail.isDisplayed());

        driverBekleKapat();


    }
}
