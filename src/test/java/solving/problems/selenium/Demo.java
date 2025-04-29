package solving.problems.selenium;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {
	WebDriver driver =  new ChromeDriver();
	
	public void BrowserStart() {
		driver.get("https://www.flipkart.com/register/p/itmdvxgzej5zyzje");
	}
	public void Login() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     	driver.findElement(By.xpath("(//button[normalize-space()='Request OTP'])[1]")).click();
     	
     	try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Please enter the OTP: ");
			 String otp = scanner.nextLine();

			 WebElement otpField = driver.findElement(By.xpath("//input [@class='r4vIwl IX3CMV']"));
			 otpField.sendKeys(otp);
		}
    }
	
	public void Registration(){
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element =  driver.findElement(By.className("wsejfv"));
		Actions actions_hoverAction = new Actions(driver);
        actions_hoverAction.moveToElement(element).perform();
        driver.findElement(By.className("yFCbwN")).click();
        System.out.println("Elements are Re-cognised");
        driver.findElement(By.xpath("//input [@class='r4vIwl BV+Dqf']")).sendKeys("8147051129");
        driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']")).click();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement toaster = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='eIDgeN']")));
        String message = toaster.getText();
        
        if(message.equals("You are already registered. Please log in.")) {
        	
        	Login();
        	System.out.println("Script Execution Successful");
            
        	}else {
        		System.out.println("Script Execution Failed");
        	}
        }
                
}

