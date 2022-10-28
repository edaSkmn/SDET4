package Gun07_Xpath;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _02_SenaryoXPath extends BaseDriver {
    @Test
    public void Test1() {

//        (//class='input_error form_input'])[1]
//        //*[@placeholder='Username']
//        //*[text()='Accepted usernames are']
//
//        //*[text()='Accepted usernames are']/..  bir adim geri gider

        //WebElement elemet= driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div[1]/input"));
        // uzun path oldugundan hem yazim zorlugu var hem de yolun bozulma ihtimali cok yuksek : ABSOLUTE XPATH

        // WebElement element= driver.findElement(By.xpath("//input[@id='user-name']"));


        driver.navigate().to("https://www.saucedemo.com/");
        WebElement e1 = driver.findElement(By.xpath("//input[@id='user-name']"));
        e1.sendKeys("standard_user");
        MyFunc.bekle(1);

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        MyFunc.bekle(1);

        WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();
        MyFunc.bekle(1);

        WebElement backPack = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")); //button[@id='add-to-cart-sauce-labs-backpack']
        backPack.click();
        MyFunc.bekle(1);

        WebElement select = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        select.click();
        MyFunc.bekle(1);

        WebElement backtoProduct = driver.findElement(By.xpath("//button[@name='back-to-products']"));
        backtoProduct.click();
        MyFunc.bekle(1);

        WebElement tisort = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        tisort.click();
        MyFunc.bekle(1);

        WebElement selectTisort = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")); //button[text()='Add to cart']
        selectTisort.click();
        MyFunc.bekle(1);

        WebElement sepet = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        sepet.click();
        MyFunc.bekle(1);

        WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkout.click();
        MyFunc.bekle(1);

        WebElement firstName = driver.findElement(By.xpath("//input[@id='first-name']"));
        firstName.sendKeys("sam");
        MyFunc.bekle(1);

        WebElement lastName = driver.findElement(By.xpath("//input[@id='last-name']"));
        lastName.sendKeys("purple");
        MyFunc.bekle(1);

        WebElement zipCode = driver.findElement(By.xpath("//input[@id='postal-code']"));
        zipCode.sendKeys("12345");
        MyFunc.bekle(1);

        WebElement devam = driver.findElement(By.xpath("//input[@id='continue']"));
        devam.click();
        MyFunc.bekle(1);

        // ürünlerin ücretleri
        List<WebElement> ucretler = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        double toplam = 0;
        for (WebElement e : ucretler) {
            //System.out.println(e.getText());  //$29.99
            toplam += Double.parseDouble(e.getText().substring(1));  // [$].""  veya  replace("$","")
        }
        System.out.println("toplam = " + toplam);

        WebElement webAltToplam = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        //System.out.println("webAltToplam = " + webAltToplam.getText());
        double altToplam = Double.parseDouble(webAltToplam.getText().substring(13));
        System.out.println("altToplam = " + altToplam);

        Assert.assertTrue("Değerler eşit değil = ", (toplam == altToplam));

        driverBekleKapat();
    }
}

