package Gun10_DragandDrop_Alert;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _05_ActionHoverTest extends BaseDriver {
    //Jewellery -> Neckless -> Bib Neckless click
    //tıklatma işleminden sonra URL de
    //bib-necklaces kelimesinin geçtiğini doğrulayın.

    @Test
    public void Test1() {
        driver.get("https://www.etsy.com/");

        //1-isDisplay ve isEnable gibi kontroller, element HTML nin icinde var fakat gorunur degil(hidden)
        //2-bazi durumlarda element HTML icinde hic yoktur

        List<WebElement> cookiesAccept=driver.findElements(By.cssSelector("data-gdpr-single-choice-accept")); // eger cookies cikarsa yazilacak kod
        //elementi bulamazsa implicity wait devreye girer ve verilen sure kadar bulmaya calisir
        if (cookiesAccept.size() > 0) //varsa
            cookiesAccept.get(0).click(); //kapat

        WebElement jewelry= driver.findElement(By. cssSelector("span[id='catnav-primary-link-10855']"));
        WebElement necklaces = driver.findElement(By.cssSelector("span[id='side-nav-category-link-10873']"));
        WebElement bibNecklaces = driver.findElement(By.cssSelector("a[id='catnav-l3-10881']"));


        Actions aksiyonlar=new Actions(driver);
        aksiyonlar.moveToElement(jewelry).build().perform();
        MyFunc.bekle(2);
        aksiyonlar.moveToElement(necklaces).build().perform();
        MyFunc.bekle(2);
        aksiyonlar.moveToElement(bibNecklaces).build().perform();
        MyFunc.bekle(2);

        bibNecklaces.click();

        Assert.assertTrue("Url de bib Kolye var mi",driver.getCurrentUrl().contains("bib"));

        driverBekleKapat();

    }
}