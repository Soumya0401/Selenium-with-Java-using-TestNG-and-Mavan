package TestFramework;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotationExecution 
{
	@BeforeSuite
	public void Before_Suite()
	{
		System.out.println("BeforeSuite is Executed");
	}
	@AfterSuite
	public void After_Suite()
	{
		System.out.println("AfterSuite is Executed");
	}
	@BeforeTest
	public void Before_Test()
	{
		System.out.println("Before Test is Executed");
	}
	@AfterTest
	public void After_Test()
	{
		System.out.println("AfterTest is Executed");
	}
	@BeforeClass
	public void Before_Class()
	{
		System.out.println("Before class is Executed");
	}
	@AfterClass
	public void After_Class()
	{
		System.out.println("AfterClass is Executed");
	}
	@BeforeMethod
	public void Before_Method()
	{
		System.out.println("BeforeMethod is Executed");
	}
	@AfterMethod
	public void After_Method()
	{
		System.out.println("AfterMethod is Executed");
	}
	@Test
	public void Test_Method1()
	{
		System.out.println("TestMethod1 is Executed");
	}
	@Test
	public void Test_Method2()
	{
		System.out.println("TestMethod2 is Executed");
	}
}
