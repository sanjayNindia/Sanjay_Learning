package basic.scripts.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2CheckBoxes {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//input[@class='form-control ng-untouched ng-pristine ng-invalid'])[1]"))
				.sendKeys("Sanjay N");

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sanjayn1996@.gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Sanju@123");
		driver.findElement(By.id("exampleCheck1")).click();

		WebElement SelectGender = driver.findElement(By.id("exampleFormControlSelect1"));
		SelectGender.click();

		Select gender = new Select(SelectGender);

		gender.selectByIndex(0);

		driver.findElement(By.id("inlineRadio2")).click();
		WebElement bdate = driver.findElement(By.xpath("//input[@type='date']"));
		bdate.sendKeys("10121996");

		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();

		System.out.println("Return Message:"
				+ driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());

		driver.quit();
	}

}
