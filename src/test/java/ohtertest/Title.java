package ohtertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {
	public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.name("user-name")).sendKeys("standard_user");
	driver.findElement(By.name("password")).sendKeys("secret_sauce");
	driver.findElement(By.name("login-button")).click();
	
	//title validation
	String title = driver.getTitle();
	
	if(title.equals("Swag Labs"))
	{
		System.out.println("Title matched");
	}else
	{
		System.out.println("Title not matched");
	}
	
	String url = driver.getCurrentUrl();
	if(url.equals("https://www.saucedemo.com/inventory.html"))
	{
		System.out.println("url matched");
	}else
	{
		System.out.println("url not matched");
	}
	
	driver.close();
	
	
}
}
