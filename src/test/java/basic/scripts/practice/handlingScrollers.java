package basic.scripts.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class handlingScrollers {
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("scrollBy(0,500)");

        Thread.sleep(3000);

        js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");

        List<WebElement> value = driver.findElements(By.xpath("//table[@id='product']//td[4]"));
        int sum = 0;
        for(int i = 0; i<value.size();i++){
            sum = sum + Integer.parseInt(value.get(i).getText());
        }
        int finalValue =  Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());

        Assert.assertEquals(sum, finalValue);

        driver.close();
    }
}
