package basic.scripts.practice;


import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addCartParctice {

	public static void main(String[] args) throws InterruptedException {
		
		String[] veggies = {"Brocolli","Cucumber","Beetroot"};
		WebDriver driver = new ChromeDriver();
		addToCart(driver, veggies);
        
	}
	
	public static void addToCart(WebDriver driver,String[] veggies) {
		
		int j=0;
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        
        for(int i=0;i<products.size();i++) {
        	
        	String[] name = products.get(i).getText().split("-");
        	
        	String formattedName = name[0].trim();
        
        	List<String> veggiesList = Arrays.asList(veggies);
        	
        	if(veggiesList.contains(formattedName)) {
        		j++;
        		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
        		
        		if(j==veggies.length) {
        			break;
     
        		}
        	}
        }
	}
}
 