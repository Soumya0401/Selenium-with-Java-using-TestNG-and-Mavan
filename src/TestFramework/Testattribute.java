package TestFramework;

import org.testng.annotations.Test;

public class Testattribute 
{
	@Test(enabled=true , alwaysRun=false)
	public void Attribute_Test() 
	{
		System.out.println("Attribute of TestNG");
	}
	@Test(enabled=false, alwaysRun=true)
	public void Attribute_Check()
	{
		System.out.println("Attribute  to Check");
	}
	@Test(dependsOnMethods = "Register")
	public void Login()
	{
		System.out.println("Login Methods");
	}
	public void Register()
	{
		System.out.println("Register Methods");
	}
}
