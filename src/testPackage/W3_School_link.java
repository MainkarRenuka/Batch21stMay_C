package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3_School_link 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Renuka Office\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com");
		
		Thread.sleep(3000);
		
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		String Title=driver.getTitle();
		System.out.println(Title);
		
		WebElement UserName=driver.findElement(By.id("modalusername"));
		UserName.sendKeys("Admin");
		
		WebElement Password=driver.findElement(By.id("current-password"));
		Password.sendKeys("admin1234");
		
		WebElement Button=driver.findElement(By.className("LoginModal_cta_bottom_box_button_login__5Fbwv"));
		Button.click();
		
		WebElement Button1=driver.findElement(By.partialLinkText("Forgot"));
		Button1.click();
		
		
	}

}
