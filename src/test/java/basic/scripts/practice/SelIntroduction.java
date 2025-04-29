package basic.scripts.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/");

		System.out.println(driver.getTitle());

		driver.getCurrentUrl();

		driver.close();

		driver.quit();
	}

}
