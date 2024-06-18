package TestFramework;

import org.testng.annotations.Test;

public class PriorityTest 
{
	@Test(priority=0 , enabled=true , description = "This is RegistrationPage")
	public void Register()
	{
		System.out.println("Registration Page");
	}
	@Test(priority=2 , enabled =false , description="This is User Login")
	public void User_Login()
	{
		System.out.println("User Login");
	}
	@Test(priority=-1, enabled=true)
	public void index()
	{
		System.out.println("Index Page");
	}
	@Test(priority=1, enabled=true)
	public void Admin_Login()
	{
		System.out.println("Admin Login");
	}
}
