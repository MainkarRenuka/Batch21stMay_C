package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Renuka Office\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement elemnt = driver.findElement(By.xpath("//a[text()='Widget Factory']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,700)"); // scroll down
		//Thread.sleep(3000);

		//js.executeScript("window.scrollBy(0,-700)"); // scroll up
		//Thread.sleep(3000);

		//js.executeScript("window.scrollBy(800,0)"); // scroll right
		//Thread.sleep(3000);

		//js.executeScript("window.scrollBy(-500,0)"); // scroll left
		//Thread.sleep(3000);
		
		js.executeScript("arguments[0].scrollIntoView(true)", elemnt);
		
		
	}

}
