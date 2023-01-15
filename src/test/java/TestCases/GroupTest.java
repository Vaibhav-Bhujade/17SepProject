package TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class GroupTest extends TestBase {

	LoginPage login;// = new LoginPage();
	
	@BeforeMethod (alwaysRun = true)
	public void setup() throws Exception
	{
		initalization();
		login = new LoginPage();
	}
	
	@Test (groups = {"Sanity","Regression"})
	public void Test1() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		AssertJUnit.assertEquals(expTitle, actTitle);
		Reporter.log("Title of web application :- " + actTitle);
	}
	
	@Test (groups = "Smoke")
	public void Test2() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		AssertJUnit.assertEquals(expTitle, actTitle);
		Reporter.log("Title of web application :- " + actTitle);
	}
	
	@Test (groups = {"Smoke","Regression"})
	public void Test3() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		AssertJUnit.assertEquals(expTitle, actTitle);
		Reporter.log("Title of web application :- " + actTitle);
	}
	
	@Test (groups = "Sanity")
	public void Test4() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		AssertJUnit.assertEquals(expTitle, actTitle);
		Reporter.log("Title of web application :- " + actTitle);
	}
	
	@AfterMethod (alwaysRun = true)
	public void closeBrowser()
	{
		driver.close();
	}
	
}
