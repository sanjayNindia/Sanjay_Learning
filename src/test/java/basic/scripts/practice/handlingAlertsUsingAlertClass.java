package basic.scripts.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingAlertsUsingAlertClass {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		driver.findElement(By.id("name")).sendKeys("Sanjay N");
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		Alert alerts = driver.switchTo().alert();
		System.out.println(alerts.getText());
		alerts.accept();

		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(alerts.getText());
		alerts.dismiss();
		driver.quit();

	}

}
