package Banking.DebitCards;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class LaunchBrowser  {
	
	WebDriver driver;
	@Test
	public void SetUp() throws IOException 
	{
	Properties p=new Properties();
	FileInputStream f= new FileInputStream("C:\\Users\\sharu\\workspace\\DebitCards\\global.properties");
	
	p.load(f);
	System.out.println(p.getProperty("browser"));
	if(p.getProperty("browser").contains("Firefox"))
	{
	     System.setProperty("webdriver.gecko.driver", "C:\\Users\\sharu\\Downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe");
	     driver =  new FirefoxDriver();
	}
	else if(p.getProperty("browser").equals("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	else if(p.getProperty("browser").equals("Explorer"))
    {
		System.setProperty("webdriver.internetExplorer.driver", "");
	    driver = new InternetExplorerDriver();
    }
	
	driver.get(p.getProperty("url"));
}
}
