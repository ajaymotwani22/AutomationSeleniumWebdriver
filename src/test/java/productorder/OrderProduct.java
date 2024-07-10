package productorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrderProduct {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		driver.findElement(By.id("item_4_title_link")).click();
		driver.findElement(By.name("add-to-cart")).click();
		driver.findElement(By.className("shopping_cart_badge")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.name("firstName")).sendKeys("aj");
		driver.findElement(By.name("lastName")).sendKeys("kk");
		driver.findElement(By.id("postal-code")).sendKeys("1234");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
		
		
		String text = driver.findElement(By.className("complete-header")).getText();
		
		if(text.equals("Thank you for your order!"))
		{
			System.out.println(text);
		}else
		{
			System.out.println("order failed");
		}
		driver.close();

	}

}
