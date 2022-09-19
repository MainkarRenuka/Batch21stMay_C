package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm_link 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Renuka Office\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		WebElement UserName=driver.findElement(By.id("txtUsername"));
		
		UserName.sendKeys("Admin");
		
        WebElement Password=driver.findElement(By.id("txtPassword"));
		
		Password.sendKeys("admin123");
		
		WebElement LoginButton=driver.findElement(By.className("button"));
		
		LoginButton.click();
		
	}

}
