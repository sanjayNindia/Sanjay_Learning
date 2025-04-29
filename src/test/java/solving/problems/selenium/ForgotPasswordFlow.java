package solving.problems.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPasswordFlow {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String password = forgotPassword(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Sanjay");
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		System.out.println("Script Executed Successfully");
		
	}
	
	public static String forgotPassword(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.className("infoMsg")).getText();
		driver.findElement(By.className("go-to-login-btn")).click();
		String [] splitValue = passwordText.split("'");
		String password = splitValue[1].split("'")[0];
		return password;
	}
	
}
