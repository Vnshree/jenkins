package jenkins.jenkinstest;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Login extends Basepage
{
  
  @BeforeClass
  @Parameters("browser")
  public void setUp(String browser) throws Exception 
  {
	  browserLaunch(browser, getdata("ecommerceurl"));
  }
  
  @Test
  public void customerLogin() 
  {
	 Homepage page=new Homepage(driver);
	 page.login();
	 Assert.assertTrue(page.verifyLoginpage().equalsIgnoreCase("My account"));
  }
  @AfterClass
  public void endProcess() 
  {
	  
  }

}
