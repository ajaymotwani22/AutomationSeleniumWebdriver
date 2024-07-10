package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginInvalidCred {

	public static void main(String[] args)  {
		//Scenarion login with invalid credentials (usernmae and password)		
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.saucedemo.com/");
				driver.findElement(By.name("user-name")).sendKeys("standard");
				driver.findElement(By.name("password")).sendKeys("secret");
				driver.findElement(By.name("login-button")).click();
				String error = driver.findElement(By.xpath("//h3[@data-test=\"error\"]")).getText();
				System.out.println(error);

	}

}
