package basic.scripts.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://ksrtc.in/");

		// Departure
		driver.findElement(By.xpath("//span[text()='Select Departure City']")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Search Your City Name'])[1]")).sendKeys("Bengaluru");
		WebElement selectDepartureCity = driver.findElement(By.xpath("(//em[text()='Bengaluru'])[1]"));
		selectDepartureCity.click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("(//a[@class='chosen-single'])[1]")).getText());
		// Destination
		driver.findElement(By.xpath("//span[text()='Select Destination City']")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Search Your City Name'])[2]")).sendKeys("Pondicherry");
		WebElement selectDestinationCity = driver.findElement(By.xpath("//em[text()='Pondicherry']"));
		selectDestinationCity.click();
		Thread.sleep(2000);
		System.out.println(driver
				.findElement(
						By.xpath("//a[@class='chosen-single chosen-default']/span[text()='Select Destination City']"))
				.getText());

		driver.quit();

	}

}
