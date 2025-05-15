package basic.scripts.practice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingCalenderUI {
    public static void main(String[] args) {

        String reqYear = "2027";
        String monthNumber = "6";
        String date = "15";

        String calenderDates[] = {monthNumber, date, reqYear};
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        driver.findElement(By.linkText("Top Deals")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> navigation = windows.iterator();
        navigation.next();

        driver.switchTo().window(navigation.next());
        WebElement calender = driver.findElement(By.xpath("//div[@class='react-date-picker__wrapper']/button[2]"));
        calender.click();

        driver.findElement(By.xpath("//div[@class='react-calendar__navigation']/button[3]")).click();
        driver.findElement(By.xpath("//div[@class='react-calendar__navigation']/button[3]")).click();
        
        driver.findElement(By.xpath("//button[text()='"+reqYear+"']")).click();
        driver.findElements(By.xpath("//button[@class='react-calendar__tile react-calendar__year-view__months__month']")).get(Integer.parseInt(monthNumber)).click();
        driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
        
        List<WebElement> selectedDate = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));

        for(int i=0;i<selectedDate.size();i++){
            System.out.println(selectedDate.get(i).getAttribute("value"));
            Assert.assertEquals(selectedDate.get(i).getAttribute("value"), calenderDates[i]);
        }
    }
}
