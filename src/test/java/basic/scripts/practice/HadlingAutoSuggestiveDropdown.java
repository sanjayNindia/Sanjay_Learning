package basic.scripts.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HadlingAutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://ksrtc.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Select Departure City']")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Search Your City Name'])[1]")).sendKeys("Ben");
		List<WebElement> fromCity = driver.findElements(By.xpath("(//ul[@class='chosen-results'])[1]/li"));

		for (WebElement fromData : fromCity) {

			if (fromData.getText().equalsIgnoreCase("Bengaluru"))
				;
			{
				fromData.click();
				break;
			}
		}
		System.out.println(
				"The Selected From City is: " + driver.findElement(By.xpath("//a[@class='chosen-single']")).getText());

		driver.findElement(By.xpath("//span[text()='Select Destination City']")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Search Your City Name'])[2]")).sendKeys("Pondi");
		List<WebElement> toCity = driver.findElements(By.xpath("(//ul[@class='chosen-results'])[2]/li"));

		for (WebElement toData : toCity) {
			if (toData.getText().equalsIgnoreCase("Pondicherry"))
				;
			{
				toData.click();
				break;
			}
		}
		System.out.println("The Selected To City is: "
				+ driver.findElement(By.xpath("//div[@id='toCity_chosen']/a[@class='chosen-single']")).getText());

		driver.findElement(By.id("departDate")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-hover']")).click();
		WebElement DeptDate = driver.findElement(By.id("departDate"));
		System.out.println("Departure Date:" + DeptDate.getDomAttribute("value"));

		WebElement returnDate = driver.findElement(By.id("returnDate"));

		if (returnDate.isEnabled()) {

			driver.findElement(By.id("returnDate")).click();
			driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")).click();

		} else {
			driver.findElement(By.xpath("//label[@for='radio_roundtrip']")).click();
			driver.findElement(By.id("returnDate")).click();
			driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-hover']")).click();
			driver.findElement(By.id("submitSearch")).click();
			Thread.sleep(2000);
			WebElement ReturnDate = driver.findElement(By.id("returnjdate"));
			System.out.println("Selected Return Date:" + ReturnDate.getDomAttribute("value"));

		}
		// System.out.println("Selected Return Date:"
		// +driver.findElement(By.id("returnDate")).getText());
//driver.quit();
	}

}
