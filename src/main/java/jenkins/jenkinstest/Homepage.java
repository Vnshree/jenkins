package jenkins.jenkinstest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	@FindBy(linkText="Sign in")WebElement signin;
	@FindBy(id="email" )WebElement email;
	@FindBy(id="passwd")WebElement passwd;
	@FindBy(id="SubmitLogin")WebElement SubmitLogin;
	@FindBy(xpath=("//h1[text()='My account']"))WebElement verifyaccount;
	
	
	
	
	public Homepage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login()
	{
		
	/**
	 * @author DELL
	 */
		signin.click();
		email.sendKeys("qatest@gmail.com");
		passwd.sendKeys("password");
		SubmitLogin.click();
	}
/**
 * 
 * @return
 */
	
	public String verifyLoginpage ()
	{
		return verifyaccount.getText();
	}
}
