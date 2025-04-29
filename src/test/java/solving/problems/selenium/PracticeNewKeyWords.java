package solving.problems.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeNewKeyWords {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		
		
		driver.findElement(By.className("gLFyf")).sendKeys("Prabhas");		
		driver.findElement(By.className("gLFyf")).sendKeys(Keys.RETURN);
		
	}
}
