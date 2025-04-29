package basic.scripts.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsPractice {

	public static void main(String[] args) {
		
		String productNames[] = {"iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry"};
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		login(driver,wait);
		addToCart(driver, productNames);
		checkOutPage(driver);
		
	}
	
	public static void login(WebDriver driver, WebDriverWait wait) {
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//label[@class='customradio']/span[text()=' User']")).click();
		WebElement popUpAction = wait.until(ExpectedConditions.elementToBeClickable(By.id("okayBtn")));
		
		
		popUpAction.click();
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		
		WebElement userList = driver.findElement(By.xpath("//select[@class='form-control']"));
		
		Select dropDown = new Select(userList);
		
		dropDown.selectByIndex(1);
		//System.out.println("Select Dropdown is:" +dropDown.getFirstSelectedOption().getText());
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
	}
	
	public static void addToCart(WebDriver driver, String[] productNames ) {
		List<WebElement> products =  driver.findElements(By.xpath("//div[@class='card-body']/h4[@class='card-title']"));
		
		for(int i=0; i<products.size();i++) {

			products.get(i).getText();
			//driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
			//List<String> productList = Arrays.asList(productNames);
			//System.out.println(productList);
		
//			if(productList.contains(products.get(i).getText())) {
//				
//				driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
//			}
		
		}
	}
	
	public static void checkOutPage(WebDriver driver) {
		driver.findElement(By.xpath("//div[@id='navbarResponsive']/ul[@class='navbar-nav ml-auto']")).click();
	}
}