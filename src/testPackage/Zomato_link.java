package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato_link 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Renuka Office\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.zomato.com/");
		
		driver.manage().window().maximize();
		
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
		
		String Title=driver.getTitle();
		System.out.println(Title);
		
		WebElement UserName = driver.findElement(By.xpath("//a[text()='Sign up']"));
		
		Thread.sleep(5000);
		
		
		
		
	}

}
