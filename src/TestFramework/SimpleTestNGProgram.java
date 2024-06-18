package TestFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleTestNGProgram 
{
	WebDriver driver;
	
	@BeforeTest
	public void lunch_Browser()
	{
		driver= new ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void Set_Title()
	{
		String title=driver.getTitle();
		System.out.println("Tittle of the Page is ="+title);
	}
	@AfterTest
	public void CloseBrowser()
	{
		driver.close();
	}

}
