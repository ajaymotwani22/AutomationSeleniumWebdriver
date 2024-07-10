package ohtertest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		for(WebElement alllinks : link)
		{
			String links = alllinks.getText();
			System.out.println(links); 
			
			String url = alllinks.getAttribute("href");
			System.out.println(url);
		}
		driver.close();
	}

}
