package Proje_3;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//Senaryo 2: Negatif kayıt Testi
//        ➢ Siteye gidin
//        ➢ Register butonuna tıklayın
//        ➢ Yukarda kaydolduğunuz email ile kayıt olmaya calisin
//        ➢ Register butonuna tıkayınız
//        ➢ “The specified email already exists” mesajının görüldüğünü doğrulayınız
public class _02_NegatifKayitTesti extends BaseDriver {
    @Test
    public void Senaryo2() {  //Senaryo 2: Negatif kayıt Testi

        driver.get("http://demowebshop.tricentis.com/");


        WebElement register = driver.findElement(By.cssSelector("a[class='ico-register']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(register).click().build().perform();

        // Kişisel bilgieler -->Senaryo 2: Negatif kayıt Testi

        WebElement gender = driver.findElement(By.cssSelector("input[id='gender-male']"));
        actions.moveToElement(gender).click().build().perform();

        WebElement firstname = driver.findElement(By.cssSelector("input[id='FirstName']"));
        actions.moveToElement(firstname).click().sendKeys("TechnoStudy").build().perform();

        WebElement lastname = driver.findElement(By.cssSelector("input[id='LastName']"));
        actions.moveToElement(lastname).click().sendKeys("Grup3").build().perform();

        WebElement email = driver.findElement(By.cssSelector("input[ id = 'Email']"));
        actions.moveToElement(email).click().sendKeys("grup3@TechnoStudy.com").build().perform();

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
