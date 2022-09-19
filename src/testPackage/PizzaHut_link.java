package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzaHut_link 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Renuka Office\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.pizzahut.co.in/");
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
        Thread.sleep(3000);
		
		WebElement UserName = driver.findElement(By.xpath("//a[text()='Sign in']"));
		UserName.click();
		
		Thread.sleep(2000);
		
		WebElement MobNo = driver.findElement(By.xpath("//input[@name='phone']"));
		MobNo.sendKeys("4433225566");
		
		WebElement Button = driver.findElement(By.xpath("//button[@type='submit']"));
		Button.click();
		
		
	}

}
