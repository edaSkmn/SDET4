package Proje_3;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//Senaryo 4: Negatif Login Test
//➢ Siteye gidin
//➢ Login butonuna tıklayın
//➢ Geçersiz email veya password giriniz
//➢ Login butonuna tıklatınız ve login olamadığınızı doğrulayınız
public class _04_NegatifLogin extends BaseDriver {
    @Test
    public void Senaryo4() {

        driver.get("https://demowebshop.tricentis.com/");

        //Senaryo 4: Negatif Login Test  - Geçersiz Giriş -invalid Login
        WebElement login = driver.findElement(By.cssSelector("a[class='ico-login']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(login).click().build().perform();

        WebElement email = driver.findElement(By.cssSelector("input[name='Email']"));
        actions.moveToElement(email).click().sendKeys("grup3@TechnoStudy.com").build().perform();

        WebElement password = driver.findElement(By.cssSelector("input[name='Password']"));
        actions.moveToElement(password).click().sendKeys("123grup3").build().perform();

        WebElement submit = driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
        actions.moveToElement(submit).click().build().perform();

        WebElement mesage = driver.findElement(By.cssSelector("div[class='validation-summary-errors']"));
        Assert.assertTrue("Login Başarılı", mesage.getText().contains("Login was unsuccessful"));
        driverBekleKapat();
    }


}


