package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollPage {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		Thread.sleep(3000);
		WebElement signinLink = driver.findElement(By.xpath("//strong[text()='Katraj Branch']"));
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("window.scrollBy(0,1000)");
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("arguments[0].scrollIntoView();", signinLink);
		
		Thread.sleep(5000);
	
		driver.close();
	}

}
