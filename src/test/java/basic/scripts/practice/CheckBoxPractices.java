package basic.scripts.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxPractices {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Checking on the Check box, is this Check box will be checked.
		// driver.findElement(By.id("checkBoxOption1")).click();
		// Checking weather the check box checked, the Expected result should be true.
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		// System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		// Un-checking the Check box, in this case Check box will be unchecked.
		driver.findElement(By.id("checkBoxOption1")).click();
		// Checking weather the check box unchecked, the Expected result should be true.
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		// System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		// Fetching the No of Check boxes available in the Web page.
		List<WebElement> count = driver.findElements(By.xpath("//input[@type='checkbox']"));
		// Displaying the count of check boxes.
		System.out.println("The Number of CheckBoxes Are:" + count.size());
	}

}
