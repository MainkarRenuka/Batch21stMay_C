package testPackage;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class PopUpWindow 
{
public static WebDriver driver;
	
//	public static void Scrshot() throws IOException
//	{
//		Date d1 = new Date();
//		String date1 = d1.toString().replace(":", "-");
//				
//		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		File store = new File("D:\\Renuka Office\\Automation\\ScreenShots\\"+date1+".png");
//		
//		FileHandler.copy(source, store);
//		
//	}
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Renuka Office\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.xpath("//*[@name='submit']"));
		submit.click();
		Thread.sleep(3000);
		
		Alert alt = driver.switchTo().alert(); //to switch the focus
		String txt = alt.getText();
		System.out.println(txt);
		Thread.sleep(2000);
		alt.accept(); // ok,submit,accept
		//alt.dismiss(); //cancel, dismiss
		//alt.sendKeys(txt);
//		Scrshot();
		Thread.sleep(3000);
		alt.accept();
		
//		Scrshot();
	}

}
