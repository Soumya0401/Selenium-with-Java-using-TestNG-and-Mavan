package TestFramework;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Amazon
{
	WebDriver driver;
	@Test
	@Parameters({"key_base_url"})
	void OpenWebpage(  String  key_base_url)
	{
		System.out.println(key_base_url);
		driver=new ChromeDriver();
		driver.get(key_base_url);
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	@Parameters({"key_name","key_mobile","key_password"})
	void Getdata(  String key_name, String key_mobile  , String key_password )
	{
		System.out.println(key_name +" "+key_mobile+" "+key_password);
		driver.findElement(By.id("ap_customer_name")).sendKeys("key_name");
		driver.findElement(By.id("ap_phone_number")).sendKeys("key_mobile");
		driver.findElement(By.id("ap_password")).sendKeys("key_password");
		driver.findElement(By.id("continue")).click();
	}
}
