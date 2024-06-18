package TestFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenUrl {
@Test
	public void Open_URL()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationexercise.com/");	

	}

}
