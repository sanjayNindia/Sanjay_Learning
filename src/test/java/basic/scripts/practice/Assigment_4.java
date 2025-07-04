package basic.scripts.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select; 

public class Assigment_4 {
    
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://blazedemo.com/");

        Select fromPort = new Select(driver.findElement(By.name("fromPort")));
        fromPort.selectByValue("Boston");
        
        Select toPort = new Select(driver.findElement(By.name("toPort")));
        toPort.selectByValue("London");

        driver.findElement(By.cssSelector("input[class='btn btn-primary']")).click();

        List <WebElement> totalRowCount = driver.findElements(By.xpath("//table[@class='table']//tr"));
        int rowCount = totalRowCount.size();
        
        System.out.println("The Fetched Row Count is: "+rowCount);

        List <WebElement> lastColData = driver.findElements(By.xpath("//table[@class='table']//tbody//tr/td[6]"));

        List<String> list = new ArrayList<String>();
        for(int i=0;i<lastColData.size();i++){
           list.add(lastColData.get(i).getText().replace("$", "")); 
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list.get(0));

        driver.findElement(By.xpath("//table[@class='table']//tbody/tr/td[contains(text(), '"+list.get(0)+"')]/ancestor::tr/td/input")).click();
    }
}
