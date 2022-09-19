package testPackage;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class ScreenShot 
{
public static WebDriver driver;
	
	public static void Scrshot() throws IOException
	{
		Date d1 = new Date();
		String date1 = d1.toString().replace(":", "-");
				
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File store = new File("D:\\Renuka Office\\Automation\\ScreenShots\\"+date1+".png");
		
		FileHandler.copy(source, store);
		
	}
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Renuka Office\\chromedriver.exe");
		
		driver=new ChromeDriver();	
		
        driver.get("https://www.facebook.com");
        Scrshot();
		
        driver.findElement(By.xpath("//a[contains(text(),'New Account')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("R");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("M");		
		Scrshot();
		
		driver.findElement(By.xpath("//div[contains(text(), 'Mobile number or email address')]/following-sibling::input")).sendKeys("8855336544");
		Scrshot();
		
		driver.findElement(By.xpath("//div[contains(text(), 'New password')]/following-sibling::input")).sendKeys("pass@123");
		Scrshot();
		
		Select date = new Select(driver.findElement(By.id("day")));
		date.selectByValue("13");
		Thread.sleep(3000);
		
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByValue("7");
		Thread.sleep(3000);
		
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("1986");
		Scrshot();
		
	}

}
