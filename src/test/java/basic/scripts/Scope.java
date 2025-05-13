package basic.scripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scope {
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // 1. The 1st case is to identify how links are available in the Web Page
        System.out.println("The Total Links Present on the page: "+driver.findElements(By.tagName("a")).size()); 

        // 2. The 2nd case is to identify how many links are available in the footer section
        WebElement footer = driver.findElement(By.id("gf-BIG"));
        System.out.println("The Total Links Present on the footer section: "+footer.findElements(By.tagName("a")).size()); 

        // 3. The 3rd case is to identify, how many links are present in the first coloumn
        WebElement section = driver.findElement(By.xpath("//table//tbody//tr//td[1]/ul"));
        System.out.println("The Total Links Present on the specific section: "+section.findElements(By.tagName("a")).size());

        // 4. The 4th case is to click each and every link of the Specific section and get the page title.
        for(int i=1; i<section.findElements(By.tagName("a")).size();i++){

            String keyBoardActions = Keys.chord(Keys.COMMAND, Keys.ENTER);
            section.findElements(By.tagName("a")).get(i).sendKeys(keyBoardActions);
            Thread.sleep(2000);
        }
        Set <String> windows = driver.getWindowHandles();
        Iterator <String> navigations = windows.iterator();
        while(navigations.hasNext()){
            driver.switchTo().window(navigations.next());
            System.out.println(driver.getTitle());
        }
        driver.quit();
    }
}
