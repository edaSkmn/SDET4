package Gun13_zHomework;
//1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
//2- random 100 e kadar 2 sayı üretiniz.
//3- Sayıları hesap makinesinin bütün fonksiyonları için çalıştırınız.
//4- Sonuçları Assert ile kontrol ediniz.
//5- Yukarıdaki işlemi 5 kez tekrar ettiriniz.

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Q1 extends BaseDriver {
    @Test
    public void Test1() {

        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

        //Add

       WebElement firstNo=driver.findElement(By.cssSelector("[id='number1Field']"));
        firstNo.sendKeys(""+sayi1());

        WebElement secondNo=driver.findElement(By.cssSelector("[id='number2Field']"));
        secondNo.sendKeys(""+sayi1());

        WebElement operation1 = driver.findElement(By.cssSelector("[id='selectOperationDropdown']"));
        new Select(operation1).selectByValue("0");

        WebElement calculation1 = driver.findElement(By.cssSelector("[id='calculateButton']"));
        calculation1.click();


//        List<WebElement> topla = driver.findElements(By.cssSelector("form[id='calcForm']>[class='row']>[class='col-sm-3']~[class='col-sm-7']>[class='element text medium']"));
//        double toplam = 0;
//        for (WebElement e : topla) {
//          //  System.out.println(e.getText());
//            toplam += Double.parseDouble(e.getText());  // [$].""  veya  replace("$","")
//        }
//        System.out.println("toplam = " + toplam);

//
//        WebElement answer=driver.findElement(By.cssSelector("[name='numberAnswer']"));
//        double altToplam = Double.parseDouble(answer.getText().substring(0));
//        System.out.println("altToplam = " + altToplam);
//
//        Assert.assertTrue("Değerler eşit değil = ", (toplam == altToplam));


        //Substract
//
//        driver.findElement(By.cssSelector("[id='number1Field']")).sendKeys(""+sayi1());
//
//        driver.findElement(By.cssSelector("[id='number2Field']")).sendKeys(""+sayi2());
//
//        WebElement operation2 = driver.findElement(By.cssSelector("[id='selectOperationDropdown']"));
//        new Select(operation2).selectByValue("1");
//
//        WebElement calculation2 = driver.findElement(By.cssSelector("[id='calculateButton']"));
//        calculation2.click();
//
//        //Multiply
//
//        driver.findElement(By.cssSelector("[id='number1Field']")).sendKeys(""+sayi1());
//
//        driver.findElement(By.cssSelector("[id='number2Field']")).sendKeys(""+sayi2());
//
//        WebElement operation3 = driver.findElement(By.cssSelector("[id='selectOperationDropdown']"));
//        new Select(operation3).selectByValue("2");
//
//        WebElement calculation3 = driver.findElement(By.cssSelector("[id='calculateButton']"));
//        calculation3.click();
//
//        //Divide
//
//        driver.findElement(By.cssSelector("[id='number1Field']")).sendKeys(""+sayi1());
//
//        driver.findElement(By.cssSelector("[id='number2Field']")).sendKeys(""+sayi2());
//
//        WebElement operation4 = driver.findElement(By.cssSelector("[id='selectOperationDropdown']"));
//        new Select(operation4).selectByValue("3");
//
//        WebElement calculation4 = driver.findElement(By.cssSelector("[id='calculateButton']"));
//        calculation4.click();
//
//        //Concatenate
//
//        driver.findElement(By.cssSelector("[id='number1Field']")).sendKeys(""+sayi1());
//
//        driver.findElement(By.cssSelector("[id='number2Field']")).sendKeys(""+sayi2());
//
//        WebElement operation5 = driver.findElement(By.cssSelector("[id='selectOperationDropdown']"));
//        new Select(operation5).selectByValue("4");
//
//        WebElement calculation5 = driver.findElement(By.cssSelector("[id='calculateButton']"));
//        calculation5.click();

        driverBekleKapat();
    }

    public int sayi1() {
        int sayi = (int) (Math.random() * 100);
        return sayi;
    }
    public int sayi2() {
        int number = (int) (Math.random() * 100);
        return number;
    }

}