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
import Pages.InventoryPage;
import Pages.LoginPage;

public class InventoryPageTest extends TestBase {

	LoginPage login;
	InventoryPage invent;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
		login = new LoginPage();
		invent = new InventoryPage();
		login.loginToApp();
	}
	
	
	@Test (enabled = true)
	public void verifyPeekLogoTest()
	{
		boolean result = invent.verifyPeekLogo();
		AssertJUnit.assertEquals(result, false);
	}
	
	@Test
	public void addProductTest() throws Exception
	{
		String result = invent.addProduct();
		AssertJUnit.assertEquals(result, "4");  //3
 		Reporter.log("Total product added = " + result);
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
	
}
