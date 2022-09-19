package testPackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow 
{
	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\Renuka Office\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
//		
//		WebElement Alert = driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself')])[1]"));
//		
//		WebElement Confirm = driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself')])[2]"));
//		
//		WebElement Prompt = driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself')])[3]"));
//		
//		WebElement LineBreaks = driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself')])[4]"));
//		
//		Alert.click();
//		Thread.sleep(3000);
//		Confirm.click();
//		Thread.sleep(3000);
//		Prompt.click();
//		Thread.sleep(3000);
//		LineBreaks.click();
		
		List<WebElement> button = driver.findElements(By.xpath("//a[contains(text(),'Try it Yourself')]"));
		
		button.get(0).click();
		Thread.sleep(2000);
		button.get(1).click();
		Thread.sleep(2000);
		button.get(2).click();
		Thread.sleep(2000);
		button.get(3).click();
		Thread.sleep(2000);
		
		
		
		String main=driver.getWindowHandle(); // address of main window
		System.out.println("Main link: "+main);
		
		//driver.getWindowHandles();
		
//		ArrayList<String> addrs = new ArrayList<String>(driver.getWindowHandles());
//		
//		System.out.println(addrs.get(0));
//		System.out.println(addrs.get(1));
//		System.out.println(addrs.get(2));
//		System.out.println(addrs.get(3));
//		System.out.println(addrs.get(4));
//		
//		for(int i=1; i<addrs.size(); i++)
//		{
//			driver.switchTo().window(addrs.get(i));
//			String URL=driver.getCurrentUrl();
//			System.out.println("Index "+ i +": "+URL);
//			Thread.sleep(3000);
//		}
	
	}

}
