package basic.scripts.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingStaticDropdowns {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		WebElement selectDropDown = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));

		Select dropdown = new Select(selectDropDown);

		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());

	}

}
