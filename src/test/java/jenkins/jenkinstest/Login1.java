package jenkins.jenkinstest;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Login1 extends Basepage
{
	@BeforeClass
	@Parameters("browser")
	  
	  public void setUp(String browser ) throws Exception 
	  {
		  browserLaunch(browser, getdata("ecommerceurl"));
	  }
	@Test
	  public void customerLogin() 
	  {
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email" )).sendKeys("qatest@gmail.com");
		driver.findElement(By.id("passwd" )).sendKeys("password");
		driver.findElement(By.id("SubmitLogin" )).click();
		String actval =driver.findElement(By.xpath("//h1[text()='My account']")).getText();
		String expval="My account";
				      
		Assert.assertTrue(actval.equalsIgnoreCase(expval));

	  }
	
	@AfterClass
	public void endProcess()
	{
		
	}
}
