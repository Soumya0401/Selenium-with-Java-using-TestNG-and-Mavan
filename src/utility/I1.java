package utility;

import org.openqa.selenium.By;

public interface I1 
{
	String base_url="https://automationexercise.com/login";
	
	//Locators
	
	By key_name =By.name("name");
	By key_email=By.xpath("//input[@data-qa='signup-email']");
	By sign_btn=By.xpath("//button[@data-qa='signup-button']");
	
	By pass_xpath=By.xpath("//input[@id='password']");
	By day_xpath=By.xpath("//select[@name='days']");
	By months_xpath=By.xpath("//select[@name='months']");
	By years_xpath=By.xpath("//select[@name='years']");
	
	
	
	//Values
	String value_1="Soumya";
	String value_2="soumaya@xyz.com";
	String value_3="Light@12345";
	

}
