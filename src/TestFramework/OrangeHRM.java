package TestFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRM
{
	WebDriver driver;
	
		@BeforeTest
		public void lunch_Browser()
		{
			driver= new ChromeDriver();
			driver.manage().window().maximize();
	}
		@Test(priority=-2)
		public void lunch_URL()
		{
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		}
	@Test(priority=-1)
	public void login_test() throws InterruptedException 
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		
	}
	@Test(priority =0)
	public void CurrURLTest()
	{
		String url= driver.getCurrentUrl();
		System.out.println("Current URL ="+url);
	}
	@Test(priority =1)
	public void Tittle_test()
	{
		String title=driver.getTitle();
		System.out.println("Tittle of the Page = "+title);
	}
	public void Close_Broswer()
	{
		driver.close();
	}
	
	

}
