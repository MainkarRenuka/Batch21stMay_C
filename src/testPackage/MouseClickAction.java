package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClickAction 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Renuka Office\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://demoqa.com/droppable/");
		driver.get("https://www.facebook.");
		
		Thread.sleep(3000);
		//jqueryui.com
		
        driver.manage().window().maximize();
        Thread.sleep(3000);
		
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		String Title=driver.getTitle();
		System.out.println(Title);
		
        WebElement button=driver.findElement(By.xpath("//a[contains(text(),'New Account')]"));
        Thread.sleep(3000);
        
       // WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
       // WebElement droppable = driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
        
        Actions act = new Actions(driver);
        
        //act.click();
        //act.contextClick().perform();
        act.moveToElement(button).click().build().perform();
		//act.dragAndDrop(draggable, droppable).perform();
		
	}

}
