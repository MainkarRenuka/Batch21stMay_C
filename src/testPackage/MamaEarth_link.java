package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MamaEarth_link 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Renuka Office\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mamaearth.in");
		
        Thread.sleep(3000);
		
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		String Title=driver.getTitle();
		System.out.println(Title);
		
		Thread.sleep(7000);
		
		WebElement UserName = driver.findElement(By.xpath("//div[text()='Login']"));
		UserName.click();
		
		Thread.sleep(7000);
		
		
		
		
	}

}
