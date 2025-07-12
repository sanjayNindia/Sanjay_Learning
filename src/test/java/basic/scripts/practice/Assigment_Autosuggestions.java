package basic.scripts.practice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment_Autosuggestions {
    
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        String city = "India";

        driver.findElement(By.id("autocomplete")).sendKeys("ind");
        Thread.sleep(2000);
        List<WebElement> cityList = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/div"));
        for(int i=0;i<cityList.size();i++){
            System.out.println(city.contains(cityList.get(i).getText()));
            if(city.contentEquals(cityList.get(i).getText())){
                    driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/div")).get(i).click();
                    break;
                }
            }
            System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
            driver.close();
        }
        
        
}
