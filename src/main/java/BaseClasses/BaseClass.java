package BaseClasses;

import java.io.Closeable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;
	
	public static  WebDriver GetBrowser(String browser) {
		if(browser.equalsIgnoreCase("CHROME")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			 driver =new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
				driver =new FirefoxDriver();
				
			}
	driver.manage().window().maximize();
        return driver;
	}
	public static  void Textbox(WebElement element, String value) {
		//Username.sendKeys("monikasathya");
		element.sendKeys(value);
		}
	
	public static void ClickOption(WebElement element) {
		//Login.click();
		element.click();
		}
	
	public static void GetUrl(String url) {
		driver.get(url);		

	}

	public static void Dropdown(WebElement element,String type,String value) {
		Select s= new Select(element);
		  if(type.equalsIgnoreCase("Visibletext")) {
			  s.selectByVisibleText(value);
			  
		  }
		  else if(type.equalsIgnoreCase("ByValue")) {
			  s.selectByValue(value);
			   }
		  
		  else if (type.equalsIgnoreCase("ByIndex")) {
			  int Byindex= Integer.parseInt(value);
			  s.selectByIndex(Byindex);
			  
		  }
		  

	}
}
