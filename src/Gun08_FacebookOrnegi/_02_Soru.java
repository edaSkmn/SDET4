package Gun08_FacebookOrnegi;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _02_Soru extends BaseDriver {

    @Test
    public void Test1(){

//        Test Senaryosu
//        1- https://www.facebook.com/  sayfasına gidiniz
//        2- CreateNewAccount a tıklatınız.
//        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
//        4- Doğum tarihinizi Select sınıfı ile seçiniz
//        5- Email i tekrar girmenizi isteyen bir input daha açıldığını
//        öncesinde de görünmediğini assert ile doğrulayınız.

        driver.get("https://www.facebook.com/");
        //driver.manage().deleteAllCookies();  // girildikten sonrada cookies ler silindi

        // //*[text()='Allow essential and optional cookies']
//        WebElement cookiesAccept=driver.findElement(By.xpath("//*[text()='Allow essential and optional cookies']"));
//        cookiesAccept.click();

        WebElement btnYeniHesap=driver.findElement(By.linkText("Create New Account"));
        btnYeniHesap.click();

        MyFunc.bekle(1);
        WebElement firstname=driver.findElement(By.name("firstname"));
        firstname.sendKeys("kevin");

        MyFunc.bekle(1);
        WebElement lastname=driver.findElement(By.name("lastname"));
        lastname.sendKeys("martin");

        //1.yontem // [id='reg_form_box'] > [class='hidden_elem']  - elemani direkt aliyoruz- direct webElmenet arandi, class ozelligi ile
        //gorunmediginin kontrol edilecegi yer
        List<WebElement> secondEmail=driver.findElements(By.cssSelector("[id='reg_form_box'] > [class='hidden_elem']"));
        Assert.assertTrue("2.email su an gozukuyor mu",(secondEmail.size()==1));

        MyFunc.bekle(1);
        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("kmar@hotmail.com");

        secondEmail=driver.findElements(By.cssSelector("[id='reg_form_box'] > [class='hidden_elem']"));
        Assert.assertTrue("2.email su an gozukuyor mu",(secondEmail.size()==0));

        MyFunc.bekle(1);
        WebElement email2=driver.findElement(By.name("reg_email_confirmation__")); //2.emaili girdik
        email2.sendKeys("kmar@hotmail.com");

        MyFunc.bekle(1);
        WebElement password=driver.findElement(By.id("password_step_input"));
        password.sendKeys("KZ76hm");

        WebElement selectMenu1=driver.findElement(By.name("birthday_day"));
        Select day=new Select(selectMenu1);
        day.selectByIndex(21);

        WebElement selectMenu2=driver.findElement(By.name("birthday_month"));
        Select month=new Select(selectMenu2);
        month.selectByVisibleText("May");

        WebElement selectMenu3=driver.findElement(By.name("birthday_year"));
        Select year=new Select(selectMenu3);
        year.selectByValue("2000");


        driverBekleKapat();

    }
}
