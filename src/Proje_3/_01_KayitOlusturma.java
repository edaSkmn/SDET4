package Proje_3;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.sql.Driver;

//   Senaryo 1: Kayıt oluşturma Testi
//➢ Siteye gidin
//➢ Register butonuna tıklayın
//➢ Kişisel bilgileri doldurun ve register butonuna tıklayın
//➢ Başarılı bir şekilde kaydolduğunuzu doğrulayınız
public class _01_KayitOlusturma extends BaseDriver {

    @Test
    public void Senaryo1() {

        driver.get("http://demowebshop.tricentis.com/");


        WebElement register = driver.findElement(By.cssSelector("a[class='ico-register']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(register).click().build().perform();

        // Kişisel bilgieler -->Senaryo 1: Kayıt oluşturma Testi

        WebElement gender = driver.findElement(By.cssSelector("input[id='gender-male']"));
        actions.moveToElement(gender).click().build().perform();

        WebElement firstname = driver.findElement(By.cssSelector("input[id='FirstName']"));
        actions.moveToElement(firstname).click().sendKeys("TechnoStudy").build().perform();

        WebElement lastname = driver.findElement(By.cssSelector("input[id='LastName']"));
        actions.moveToElement(lastname).click().sendKeys("Grup3").build().perform();

        WebElement email = driver.findElement(By.cssSelector("input[ id = 'Email']"));
        actions.moveToElement(email).click().sendKeys("grup3_Batch4@TechnoStudy.com").build().perform();

        WebElement password = driver.findElement(By.cssSelector("input[ id = 'Password']"));
        actions.moveToElement(password).click().sendKeys("123grup3").build().perform();

        WebElement confirmPassword = driver.findElement(By.cssSelector("input[ id = 'ConfirmPassword']"));
        actions.moveToElement(confirmPassword).click().sendKeys("123grup3").build().perform();

        WebElement registerbutton = driver.findElement(By.cssSelector("input[ id = 'register-button']"));
        actions.moveToElement(registerbutton).click().build().perform();

        WebElement mesage = driver.findElement(By.xpath("//div[@class='result']"));
        Assert.assertTrue("mesaj doğrulanmadı ", mesage.getText().contains("Your registration completed"));

        driverBekleKapat();

    }


}
