package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSource_link 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Renuka Office\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource.com/user/login?current=/node/35436");
		
		Thread.sleep(3000);
		
		WebElement UserName = driver.findElement(By.id("edit-name"));
		UserName.sendKeys("Admin");
		
		WebElement Password = driver.findElement(By.id("edit-pass"));
		Password.sendKeys("Admin@1234");
		
		WebElement Button=driver.findElement(By.id("edit-submit"));
		Button.click();
		
		WebElement Button1=driver.findElement(By.partialLinkText("Create new"));
		Button1.click();
		
	}

}
