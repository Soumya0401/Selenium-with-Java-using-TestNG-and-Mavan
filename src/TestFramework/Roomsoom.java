package TestFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Roomsoom 
{
	public class Testingroomsoom {
		WebDriver driver;
		@Test
	void openurl() 
		{
			driver=new ChromeDriver();
			driver.get("https://www.roomsoom.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
		
		@Test
		void testroomsoom() throws InterruptedException 
		{
			driver.findElement(By.xpath("//button[@type='button']")).click();
			
			WebElement wc=driver.findElement(By.xpath("//select[@name='city']"));
			Select sc=new Select(wc);
			sc.selectByIndex(1);
			
			WebElement we1=driver.findElement(By.xpath("//select[@name='type']"));
			Select sc1=new Select(we1);
			sc1.selectByIndex(1);
			
			driver.findElement(By.xpath("//input[@value='Search']")).click();
			
			WebElement wc2=driver.findElement(By.xpath("//a[@class='list_title']"));
			String value =wc2.getText();
			
			System.out.println(value);
			if(value.equals("FLAT in Delhi"))
			{
				System.out.println("test case pass");
			}
				else 
				{
					System.out.println("test case fail");
				}
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@class='request_call']")).click();
			Thread.sleep(3000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)",0);
		}
	}

}
