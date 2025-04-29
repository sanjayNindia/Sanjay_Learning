package basic.scripts.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlicStaticDropDownGlobalQa {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

		WebElement selectDropDown = driver.findElement(By.xpath("//select"));

		Select dropdown = new Select(selectDropDown);

		dropdown.selectByValue("IND");

		System.out.println(dropdown.getFirstSelectedOption().getText());
	}

}
