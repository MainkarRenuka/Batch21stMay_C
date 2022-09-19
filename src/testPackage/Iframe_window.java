package testPackage;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_window 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Renuka Office\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		WebElement button = driver.findElement(By.xpath("//a[contains(text(),'Try it Yourself')]"));
		
		button.click();
		Thread.sleep(2000);
		
		ArrayList<String> addrs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addrs.get(1));
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
		driver.switchTo().frame(1); // by index
	    //driver.switchTo().frame("iframeResult");
	    //driver.switchTo().frame(iframe);
		Thread.sleep(2000);
		//driver.switchTo().parentFrame(); //to switch on immediate parent frame
		//driver.switchTo().defaultContent(); //to switch on main page
		
		WebElement tryButton = driver.findElement(By.xpath("//button[text()='Try it']"));
		tryButton.click();
		
		Alert alt = driver.switchTo().alert(); //to switch the focus
		String txt = alt.getText();
		System.out.println(txt);
		Thread.sleep(2000);
		alt.accept(); 
		
		
		//Implicit wait
		//Explicit wait
		//Fluent wait
		
	}

}
