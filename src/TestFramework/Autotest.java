package TestFramework;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Autotest
{
	WebDriver  driver;
	@BeforeTest
	public void Open_Browser()
	{
		driver =new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
	}
	//Registration Page
	
	@Test(priority=1, enabled=false)
	public void Sign_up_Page() throws InterruptedException 
	{	
		driver.findElement(By.name("name")).sendKeys("Soumya");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("soumaya@gmail.com");
		driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
		
	}
		@Test(priority=2, enabled=false)
		public void Account_Information() throws InterruptedException
		{
		driver.findElement(By.xpath("//input[@id='id_gender2']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(3000);	
		driver.findElement(By.id("password")).sendKeys("Light@12345");
		
		Select day=new Select(driver.findElement(By.id("days")));
		day.selectByValue("29");
		
		driver.findElement(By.name("months")).sendKeys("June");
		
		
		Select year=new Select(driver.findElement(By.id("years")));
		year.selectByValue("2000");
		
		driver.findElement(By.xpath("//input[@id='newsletter']")).click();
		driver.findElement(By.xpath("//input[@id='optin']")).click();
		
			
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Sohan");
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Raj");
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(3000);
		
		driver.findElement(By.id("company")).sendKeys("TCS");
		driver.findElement(By.id("address1")).sendKeys("Noida Sector 16 ");
		
		Select count=new Select(driver.findElement(By.xpath("//select[@id=\"country\"]")));
		count.selectByValue("Canada");
		
		driver.findElement(By.id("state")).sendKeys("UP");
		driver.findElement(By.id("city")).sendKeys("Noida");
		driver.findElement(By.id("zipcode")).sendKeys("876954");
		driver.findElement(By.id("mobile_number")).sendKeys("8877665544");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
		@Test (priority=3, enabled=false)
		public void Account_Created() throws InterruptedException
		{
			System.out.println("Congratulations! Your new account has been successfully created!");
			driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
			Thread.sleep(3000);
		}
		@Test(priority=4, enabled= false)
		public void Logout()
		{
			driver.findElement(By.linkText("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		}
		
		//Login to your account
		@Test(priority=5)
		public void Login_Account() throws InterruptedException
		{
			driver.findElement(By.name("email")).sendKeys("soumaya@gmail.com");
			driver.findElement(By.name("password")).sendKeys("Light@12345");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,250)", "");
			Thread.sleep(3000);
		}
		@Test(priority=6)
		public void Contact_us()
		{
			driver.findElement(By.linkText("Contact  us")).click();
			
		}
}	