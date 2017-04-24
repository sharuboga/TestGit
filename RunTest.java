package Banking.DebitCards;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RunTest extends LaunchBrowser {
	
	@Test
	public void LoginFacebook() throws Exception
	{
	Credentials cr= new Credentials(driver);
	cr.Login("sharuboga", "password");
	
	driver.findElement(By.cssSelector("#u_0_q")).click();
	System.out.println("Login Sucessfull");
	
	}
	
	
}
