package basic.scripts.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassPractice {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Actions move = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_ya_signin']"));
		
		move.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("brush").doubleClick().build().perform();
		
		move.moveToElement(element).contextClick().build().perform();

	}

}
