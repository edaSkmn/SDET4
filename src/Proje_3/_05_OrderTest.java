package Proje_3;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

// Senaryo 5: Order Test
//➢ Siteye gidin
//➢ Login olun
//➢ FEATURED PRODUCTS in altında “14.1-inch Laptop” adli ürüne tıklatınız
//➢ Ad To Cart butonuna tıklatınız ve urunun başarılı bir şekilde eklendiğini doğrulayın
//➢ Sopping cart butonuna tıklatıp sepetinize gidin ve urunun orda görüldüğünü doğrulayın
//➢ Agree check box tıklatıp Sartları Kabul edin
//➢ Checkout butonuna tıklatın
//➢ Açılan sayfada tüm bilgileri doldurun ve confirm order butonuna tıklatın
//➢ “Your order has been successfully processed!” mesajının görüldüğünü doğrulayın
public class _05_OrderTest extends BaseDriver {
    @Test
    public void Senaryo5() {

        driver.get("https://demowebshop.tricentis.com/");

        //// Senaryo 5: Order Test Login olundu...
        WebElement login = driver.findElement(By.cssSelector("a[class='ico-login']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(login).click().build().perform();

        WebElement email = driver.findElement(By.cssSelector("input[name='Email']"));
        actions.moveToElement(email).click().sendKeys("grup3_Batch4@TechnoStudy.com").build().perform();

        WebElement password = driver.findElement(By.cssSelector("input[name='Password']"));
        actions.moveToElement(password).click().sendKeys("123grup3").build().perform();

        WebElement submit = driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
        actions.moveToElement(submit).click().build().perform();

        //FEATURED PRODUCTS
        WebElement laptop = driver.findElement(By.linkText("14.1-inch Laptop"));
        actions.moveToElement(laptop).click().build().perform();

        WebElement addToCart = driver.findElement(By.xpath("//*[@type='button' and @id='add-to-cart-button-31']"));
        actions.moveToElement(addToCart).click().build().perform();
        //Mesaj Doğrulama
        WebElement confirm = driver.findElement(By.cssSelector("p[class='content']"));
        Assert.assertTrue("Mesaj Bulunamadı", confirm.getText().contains("The product has been added to your "));

        WebElement soppingCart = driver.findElement(By.xpath("//span[@class='cart-label' and text()='Shopping cart']"));
        actions.moveToElement(soppingCart).click().build().perform();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Product Confirm
        WebElement laptopValidation=driver.findElement(By.linkText("14.1-inch Laptop"));
        Assert.assertTrue(laptopValidation.getText().contains("14.1-inch Laptop"));


        WebElement chxbox = driver.findElement(By.xpath("//*[@id='termsofservice']"));
        actions.moveToElement(chxbox).click().build().perform();

        WebElement checkout = driver.findElement(By.xpath("//*[@id='checkout']"));
        actions.moveToElement(checkout).click().build().perform();

        // Billing Address
        WebElement fname = driver.findElement(By.cssSelector("input[id='BillingNewAddress_FirstName']"));
        actions.moveToElement(fname).click().sendKeys("TechnoStudy").build().perform();

        WebElement lname = driver.findElement(By.cssSelector(" input[id='BillingNewAddress_LastName']"));
        actions.moveToElement(lname).click().sendKeys("Grup3").build().perform();

        WebElement mail = driver.findElement(By.cssSelector("input[id='BillingNewAddress_Email']"));
        actions.moveToElement(mail).click().sendKeys("grup3_Batch4@TechnoStudy.com").build().perform();

        WebElement company = driver.findElement(By.cssSelector("input[id='BillingNewAddress_Company']"));


        WebElement country = driver.findElement(By.cssSelector("select[id='BillingNewAddress_CountryId']"));
        new Select(country).selectByIndex(77);

        WebElement city = driver.findElement(By.cssSelector("input[id='BillingNewAddress_City']"));
        actions.moveToElement(city).click().sendKeys("İstanbul").build().perform();

        WebElement adress = driver.findElement(By.cssSelector("input[id='BillingNewAddress_Address1']"));
        actions.moveToElement(adress).click().sendKeys("TechnoStudy mahallessi 4.batch sokak").build().perform();

        WebElement adresss = driver.findElement(By.cssSelector("input[id='BillingNewAddress_Address2']"));
        actions.moveToElement(adresss).click().sendKeys("TechnoStudy mahallessi 4.batch sokak").build().perform();

        WebElement zipCode = driver.findElement(By.cssSelector("input[id='BillingNewAddress_ZipPostalCode']"));
        actions.moveToElement(zipCode).click().sendKeys("1923").build().perform();

        WebElement phoneNumber = driver.findElement(By.xpath("//*[@name='BillingNewAddress.PhoneNumber']"));
        actions.moveToElement(phoneNumber).click().sendKeys("+905554442233").build().perform();

        WebElement continuee = driver.findElement(By.cssSelector("input[onclick='Billing.save()']"));
        actions.moveToElement(continuee).click().build().perform();

        WebElement click = driver.findElement(By.xpath("//*[@id='PickUpInStore']"));
        actions.moveToElement(click).click().build().perform();

        WebElement cnt = driver.findElement(By.xpath("//*[@onclick='Shipping.save()']"));
        actions.moveToElement(cnt).click().build().perform();

        WebElement paymentCont = driver.findElement(By.xpath("//*[@onclick='PaymentMethod.save()']"));
        actions.moveToElement(paymentCont).click().build().perform();

        WebElement paymentInformation = driver.findElement(By.cssSelector("input[class='button-1 payment-info-next-step-button']"));
        actions.moveToElement(paymentInformation).click().build().perform();

        WebElement confirmOrder = driver.findElement(By.xpath("//*[@onclick='ConfirmOrder.save()']"));
        actions.moveToElement(confirmOrder).click().build().perform();

        WebElement mesageTitle = driver.findElement(By.cssSelector("div[class='title']"));
        Assert.assertTrue("Mesaj Bulunumadı", mesageTitle.getText().contains("Your order has been successfully processed!"));


        driverBekleKapat();
    }
}



