package basic.scripts.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigations {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://lemonpay.tech/");
		driver.navigate().back();
		driver.manage().window().minimize();
		driver.navigate().forward();
		driver.close();
		System.out.println("Script Executed Successfully");

	}

}
