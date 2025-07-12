package basic.scripts.practice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_5 {

    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollTo(0,500)");

        WebElement tableData = driver.findElement(By.className("table-display"));

        System.out.println("");
        System.out.println("The number of rows present in the Table are: "+tableData.findElements(By.tagName("tr")).size());
        System.out.println("The number of coloumn present in the Table are: "+tableData.findElements(By.tagName("th")).size());

        List<WebElement> rowData = driver.findElements(By.xpath("//table[@class='table-display']//tr"));
        for(int i=0;i<rowData.size();i++){
            if(i==2)
            {
                System.out.println(rowData.get(i).getText());
                break;
            }
        }
        System.out.println("");
        driver.close();
    } 
}
