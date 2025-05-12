package basic.scripts.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames2 {
    
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        
        driver.findElement(By.linkText("Nested Frames")).click();

        driver.switchTo().frame(driver .findElement(By.cssSelector("frame[name='frame-top']")));

        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));

        System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());

    }

}
