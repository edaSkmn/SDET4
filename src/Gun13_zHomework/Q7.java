package Gun13_zHomework;
/*
https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
1) “Add Element” butona basin
2) “Delete” butonu gorunur oluncaya kadar bekleyin
3) “Delete” butonunun gorunur oldugunu test edin
4) Delete butonuna basarak butonu silin
5) Delete butonunun gorunmedigini test edin
 */

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Q7 extends BaseDriver {
    @Test
    public void Test1() {

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        WebElement addElement=driver.findElement(By.cssSelector("[onclick='addElement()']"));
        addElement.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[onclick='deleteElement()']")));

        WebElement deleteConfirm=driver.findElement(By.cssSelector("[onclick='deleteElement()']"));
        Assert.assertTrue(deleteConfirm.getText().contains("Delete"));

        deleteConfirm.click();

        WebElement deleteConfirmation=driver.findElement(By.cssSelector("[id='elements']"));
        Assert.assertFalse(deleteConfirmation.getText().contains("Delete"));

        driverBekleKapat();
    }
}

//               COZUM - 2
/*
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addElement= driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        addElement.click();

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("button[onclick='deleteElement()']"))));

        WebElement delete=driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));
        List<WebElement>list= driver.findElements(By.cssSelector("button[onclick='deleteElement()']"));
        System.out.println("list.size() = " + list.size());
        Assert.assertTrue(list.size()>0);

        delete.click();
        wait.until(ExpectedConditions.invisibilityOf(delete));
        list= driver.findElements(By.cssSelector("button[onclick='deleteElement()']"));
        System.out.println("list.size() = " + list.size());

        Assert.assertEquals("delete is displayed", 0, list.size());

 */