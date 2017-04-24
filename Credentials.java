package Banking.DebitCards;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Credentials {
	
 public static	WebDriver driver;
	
   	
	public Credentials(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}
	public void Login(String userName, String password) throws Exception
	{
		Thread.sleep(3000);
		   driver.findElement(By.id("email")).clear();
		 driver.findElement(By.id("email")).sendKeys(userName);
		 driver.findElement(By.name("pass")).clear();
		 driver.findElement(By.name("pass")).sendKeys(password);
		
		 System.out.println(userName);
		 System.out.println(password);

	}

}
