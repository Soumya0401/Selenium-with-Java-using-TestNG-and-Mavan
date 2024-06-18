package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Annotation 
{
	WebDriver driver;
	
	@Test
	public void Open_Browser()
	{
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();	
	}
	@Test
	public void Open_URL()
	{
		driver.get("https://www.google.com/");
		
		String title= driver.getTitle();
		
		System.out.println("Tittle of the Current Page" +title);
		
	}		
}
