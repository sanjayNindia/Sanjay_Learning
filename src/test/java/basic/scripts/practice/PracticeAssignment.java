package basic.scripts.practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeAssignment {
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        String checkBoxText =  driver.findElement(By.xpath("//label[@for='bmw']")).getText();
        driver.findElement(By.id("checkBoxOption1")).click();

        WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
        Select action = new Select(dropDown);
        action.selectByVisibleText(checkBoxText);

        driver.findElement(By.id("name")).sendKeys(checkBoxText);
        driver.findElement(By.id("alertbtn")).click();

       String alertText =  driver.switchTo().alert().getText();
       driver.switchTo().alert().accept();

       if(alertText.contains(checkBoxText)){
        System.out.println("Yes, the Text is matching..! Script Executed Successfully.");
       }else{
        System.out.println("Somthing Went Wrong");
       }

       driver.quit();
    }
}
