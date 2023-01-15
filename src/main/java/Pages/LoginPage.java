package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class LoginPage extends TestBase {

	//Object Repository
	@FindBy(xpath = "//div[@class='login_logo']") private WebElement loginLogo;
	@FindBy(xpath = "//div[@class='bot_column']") private WebElement botLogo;
	@FindBy(xpath = "//input[@id='user-name']") private WebElement usernameTextbox;
	@FindBy(xpath = "//input[@id='password']") private WebElement passwordTextbox;
	@FindBy(xpath = "//input[@id='login-button']") private WebElement loginBtn;
	@FindBy(xpath = "//span[@class='title']") private WebElement productLabel;
	
//	driver.findElement(By.xpath(""));

	//COnstructor to initialize the elements of page
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyTitle() throws Exception
	{
		return driver.getTitle();	
	}
	
	public String loginToApp() throws Exception
	{
		usernameTextbox.sendKeys(ReadData.readPropertyFile("username"));
		passwordTextbox.sendKeys(ReadData.readPropertyFile("password"));
		loginBtn.click();
		return driver.getCurrentUrl();
	}
	
	public String verifyLabelofInventory() throws Exception
	{
		loginToApp();
		return productLabel.getText();
	}
}

//static method - use only static
//non static method - No restriction