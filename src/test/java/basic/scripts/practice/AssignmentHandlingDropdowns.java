package basic.scripts.practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentHandlingDropdowns {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//ul/li/a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> window = driver.getWindowHandles();
		
		Iterator<String> str = window.iterator();
		String parentId = str.next();
		
		driver.switchTo().window(str.next());
		
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		driver.switchTo().window(parentId);
			
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		
	}

}
