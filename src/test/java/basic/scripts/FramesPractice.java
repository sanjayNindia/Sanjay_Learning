package basic.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesPractice {
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

       

        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[id='frm1']")));
        System.out.println("------------Fetched The Total Frames Availble-------------");
        System.out.println("The total frames in the Web Page:"+driver.findElements(By.tagName("iframe")).size());

        //WebElement elementLookUp = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("course"))));

        WebElement dropDown = driver.findElement(By.id("course"));

        Select list = new Select(dropDown);
        list.selectByIndex(1);
        System.out.println(list.getFirstSelectedOption().getText());
    }
}
