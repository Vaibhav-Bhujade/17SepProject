package TestCases;

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

public class LoginPageTest extends TestBase {

	LoginPage login;// = new LoginPage();
	
	@BeforeMethod (alwaysRun = true)
	public void setup() throws Exception
	{
		initalization();
		login = new LoginPage();
	}
	
	@Test (enabled = true, groups = "Regression")
	public void verifyTitleTest() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		AssertJUnit.assertEquals(expTitle, actTitle);
		Reporter.log("Title of web application :- " + actTitle);
	}
	
	@Test (enabled = true)
	public void verifyUrlTest1() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		AssertJUnit.assertEquals(expTitle, actTitle);
		Reporter.log("Title of web application :- " + actTitle);
	}
	
	@Test
	public void loginToAppTest() throws Exception
	{
		String expRes = "https://www.saucedemo.com/inventory.html";
		String actRes = login.loginToApp();
		AssertJUnit.assertEquals(expRes, actRes);
		Reporter.log("URL of web application :- " + actRes);
	}
	
	@Test (enabled = true)
	public void verifyLabelofInventoryTest() throws Exception
	{
		String expRes = "PRODUCTS";
		String actRes = login.verifyLabelofInventory();
		AssertJUnit.assertEquals(expRes, actRes);
		Reporter.log("Label Title :- " + actRes);
	}
	
	@AfterMethod (alwaysRun = true)
	public void closeBrowser()
	{
		driver.close();
	}
	
}
