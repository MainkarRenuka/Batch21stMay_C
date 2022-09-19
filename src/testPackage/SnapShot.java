package testPackage;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SnapShot 
{
	public static WebDriver driver;
	static int s=1;
	
	public static void Scrshot() throws IOException
	{
		//Date d1 = new Date();
		//String date1 = d1.toString().replace(":", "-");
		
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File store = new File("D:\\Renuka Office\\Automation\\ScreenShots\\"+s+".png");
		s++;
		FileHandler.copy(source, store);
		
	}
	
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Renuka Office\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		Scrshot();
		
	}

}
