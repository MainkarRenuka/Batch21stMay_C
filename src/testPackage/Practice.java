package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Renuka Office\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Thread.sleep(3000); // to stop the page for perticular time
		
		//driver.get("https://www.youtube.com"); //get method used to load the application, this is the web driver method
		
		//Thread.sleep(3000);
		
		//driver.navigate().to("https://web.whatsapp.com");
		
		//Thread.sleep(3000);
		
		//driver.navigate().back();//to perform backward operation
		
		//Thread.sleep(3000);
		
		//driver.navigate().forward();//to perform forward operation
		
		//driver.navigate().refresh();//to perform page reload operation
		
		String url=driver.getCurrentUrl(); //to get current url
		System.out.println(url);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		//Method chaining
		//driver.manage().window().maximize();// maximize browser window
		
		//Thread.sleep(3000);
		
		//driver.manage().window().minimize();// minimize browser window
		
		//Dimension d = new Dimension(800,700);
		//class from selenium  object  import from java          width,height
		//driver.manage().window().setSize(d);//resize with given dimension
		//Thread.sleep(3000);
		//Point p = new Point(600,300);
		//class from selenium
		
		//driver.manage().window().setPosition(p);
		//driver.close();
		
		//driver.quit();
		
		WebElement UserName=driver.findElement(By.id("email"));
	// interface  ref variable  methods of web driver   class locator
		
		UserName.sendKeys("Velocity");
		
		WebElement Password=driver.findElement(By.name("pass"));
		
		Password.sendKeys("velocity@1234");
		
		WebElement LoginButton=driver.findElement(By.className("login"));
		
		LoginButton.click();
		
		
	}

}
