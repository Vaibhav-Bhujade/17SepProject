package TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class DependsonTest extends TestBase {

LoginPage login;// = new LoginPage();
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
		login = new LoginPage();
	}
	
	@Test 
	public void verifyTitleTest() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		AssertJUnit.assertEquals(expTitle, actTitle);
		Reporter.log("Title of web application :- " + actTitle);
	}
	
	@Test (dependsOnMethods = "verifyTitleTest")
	public void loginToAppTest() throws Exception
	{
		String expRes = "https://www.saucedemo.com/inventory.html";
		String actRes = login.loginToApp();
		AssertJUnit.assertEquals(expRes, actRes);
		Reporter.log("URL of web application :- " + actRes);
	}
	
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
