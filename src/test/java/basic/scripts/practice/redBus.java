package basic.scripts.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redBus {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://www.redbus.in/");

       List <WebElement> cities = driver.findElements(By.xpath("//div[@class='placeHolderContainer___8dac15']"));
       int size = cities.size();
       
       WebElement data = driver.findElement(By.xpath("(//div[@class='placeHolderContainer___8dac15'])["+(size-1)+"]"));
       
       data.click();

       driver.close(); 

    }
}
