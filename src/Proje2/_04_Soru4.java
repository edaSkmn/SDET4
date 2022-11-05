package Proje2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _04_Soru4 extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://shopdemo.e-junkie.com/");

        WebElement eBook = driver.findElement(By.xpath("/html/body/div[2]/div/div/a[2]"));
        eBook.click();

        WebElement addToCard = driver.findElement(By.xpath("//button[text()=' Add To Cart']"));
        addToCard.click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[class='EJIframeV3 EJOverlayV3']")));


        WebElement iframe1 = driver.findElement(By.cssSelector("iframe[class='EJIframeV3 EJOverlayV3']"));
        driver.switchTo().frame(iframe1); //(  driver.switchTo().frame(5)  )

        WebElement usingDebitCard = driver.findElement(By.cssSelector("button[class='Payment-Button CC']"));
        usingDebitCard.click();

        WebElement frame = driver.findElement(By.cssSelector("div[id='Stripe-Element'] iframe"));
        driver.switchTo().frame(frame);

        WebElement cardNo = driver.findElement(By.cssSelector("input[placeholder='Card number']"));
        cardNo.sendKeys("4242 4242 4242 4242 12/22 000");

        driver.switchTo().defaultContent();
        driver.switchTo().frame(5);
        WebElement email=driver.findElement(By.cssSelector("input[placeholder='Email']"));
        email.sendKeys("abc@gmail.com");


        WebElement emailconfirmation=driver.findElement(By.cssSelector("input[placeholder='Confirm Email']"));
        emailconfirmation.sendKeys("abc@gmail.com");


        WebElement name=driver.findElement(By.cssSelector("input[placeholder='Name On Card']"));
        name.sendKeys("Group3");


        WebElement phoneNumber=driver.findElement(By.cssSelector("[class='Billing-Phone Inline']>input"));
        phoneNumber.sendKeys("05553333320");


        WebElement company=driver.findElement(By.cssSelector("[class='Billing-Company']>input"));
        company.sendKeys("Campus");

        WebElement payButton= driver.findElement(By.xpath("//button[text()='Pay 0.50 USD']"));
        payButton.click();

        WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait1.until(ExpectedConditions.textToBe(By.xpath("//span[text()=' your order is confirmed. Thank you!']"),"your order is confirmed. Thank you!"));

        WebElement text=driver.findElement(By.xpath("//span[text()=' your order is confirmed. Thank you!']"));
        Assert.assertTrue(text.getText().contains("your order is confirmed. Thank you!"));

        driverBekleKapat();

    }
}