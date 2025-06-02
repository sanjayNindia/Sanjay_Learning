package basic.scripts.practice;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assigment_3 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        String radioText = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
        driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]/input")).click();


        Select select = new Select(driver.findElement(By.id("dropdown-class-example")));
        select.selectByVisibleText(radioText);

        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//fieldset[@class='pull-right']/input[1]"))).click().sendKeys(radioText).build().perform();
        driver.findElement(By.id("alertbtn")).click();

        String alertText = driver.switchTo().alert().getText();

        if(alertText.contains(radioText)){
            System.out.println("Script Executed Sucessfully");
        }

           
    }
    
}
