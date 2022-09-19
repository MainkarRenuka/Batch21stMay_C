package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hamleys_link 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Renuka Office\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.hamleys.in/login");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		String Title=driver.getTitle();
		System.out.println(Title);
		
		driver.findElement(By.xpath("//input[contains(@id,'exampleInputEmail1')]")).sendKeys("7766554433");
		Thread.sleep(10000);

		
		driver.findElement(By.linkText("Continue")).click();
		
		
		
		
		
	}

}
