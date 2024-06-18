package TestFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.I1;

public class AutomationExercise implements I1
{
	WebDriver driver;
	
	@BeforeTest
	public void Open_WebURL()
	{
		driver=new ChromeDriver();
		driver.get(base_url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority=1)
	public void Signup_page() throws InterruptedException
	{
		driver.findElement(key_name).sendKeys(value_1);
		driver.findElement(key_email).sendKeys(value_2);
		driver.findElement(sign_btn).click();
		Thread.sleep(3000);
	}
	@Test(priority=2)
	 public void ENTER_ACCOUNT_INFORMATION() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		
		Thread.sleep(3000);
		
		driver.findElement(pass_xpath).sendKeys(value_3);
		
		Select sc = new Select(driver.findElement(day_xpath));
		sc.selectByVisibleText("4");
		
		Select sc1 = new Select(driver.findElement(months_xpath));
		sc1.selectByVisibleText("January");
		
		Select sc2 = new Select(driver.findElement(years_xpath));
		sc2.selectByVisibleText("1995");
		
	}
	
}

