package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_link 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Renuka Office\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(3000);
		
		//driver.get("https://www.whatsapp.com");
		
		//Thread.sleep(3000);
		
		//driver.navigate().to("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		String Title=driver.getTitle();
		System.out.println(Title);
		
		//WebElement UserName=driver.findElement(By.id("email"));
		//UserName.sendKeys("Admin");
		
		//WebElement Password=driver.findElement(By.id("pass"));
		//Password.sendKeys("admin@1234");
		
		//WebElement Button=driver.findElement(By.name("login"));
		//Button.click();
		
		//Thread.sleep(10000);
		
		driver.findElement(By.xpath("//a[contains(text(),'New Account')]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("R");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("M");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[contains(text(), 'Mobile number or email address')]/following-sibling::input")).sendKeys("8855336544");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[contains(text(), 'New password')]/following-sibling::input")).sendKeys("pass@123");
		Thread.sleep(3000);
		
		Select date = new Select(driver.findElement(By.id("day")));
		date.selectByValue("13");
		Thread.sleep(3000);
		
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByValue("7");
		Thread.sleep(3000);
		
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("1986");
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//select[@id='day']")).sendKeys("13");
		//Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//select[@id='month']")).sendKeys("July");
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1986");
		//Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		//Thread.sleep(2000);
		
		WebElement CustomRadioButton=driver.findElement(By.xpath("//label[text()='Custom']/following-sibling::input"));
		CustomRadioButton.click();
		Thread.sleep(2000);
		
		boolean result = CustomRadioButton.isSelected();
		System.out.println(result);
		
		WebElement Gender=driver.findElement(By.xpath("//input[@name='custom_gender']"));
		Gender.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@name='preferred_pronoun']")).sendKeys("She: \"Wish her a happy birthday!\"");
		
		boolean d=Gender.isDisplayed();
		System.out.println(d);
		
		if(d==true)
		{
			Gender.sendKeys("abcde");
		}
		
		Thread.sleep(2000);
		
		boolean e=Gender.isEnabled();
		System.out.println(e);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
				
	}

}
