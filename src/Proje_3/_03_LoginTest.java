package Proje_3;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

//Senaryo 3: Login Test
//➢ Siteye gidin
//➢ Login butonuna tıklayın   a[class='ico-login']
//➢ Geçerli email ve password I giriniz input[name='Email']   ---  input[name='Password']
//➢ Login butonuna tıklatınız ve login olduğunuzu doğrulayınız  input[class='button-1 login-button']
public class _03_LoginTest extends BaseDriver {
    @Test
    public void Senaryo3(){

        driver.get("https://demowebshop.tricentis.com/");

        //Senaryo 3: Login Test  -Geçerli Login
        WebElement login= driver.findElement(By.cssSelector("a[class='ico-login']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(login).click().build().perform();

        WebElement email= driver.findElement(By.cssSelector("input[name='Email']"));
        actions.moveToElement(email).click().sendKeys("grup3_Batch4@TechnoStudy.com").build().perform();

        WebElement password= driver.findElement(By.cssSelector("input[name='Password']"));
        actions.moveToElement(password).click().sendKeys("123grup3").build().perform();

        WebElement submit=driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
        actions.moveToElement(submit).click().build().perform();

        WebElement mesage= driver.findElement(By.xpath("//a[@class='account' and text()='grup3_Batch4@TechnoStudy.com']"));
        Assert.assertTrue("Login olunmadı",mesage.getText().contains("grup3_Batch4@TechnoStudy.com"));

        driverBekleKapat();
    }


}
