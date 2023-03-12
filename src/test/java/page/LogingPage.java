package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LogingPage  {
	
	
	public WebDriver ldriver;
	
	public LogingPage(WebDriver rdriver) {
		
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);	
	}
	@FindBy(xpath="//input[@id='Email']")
	WebElement txtEmail;
	@FindBy(xpath="//input[@id='Password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btnloging;
	
	@FindBy(linkText="Logout")
	WebElement linkLogout;
	
	public void  setUserName(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);	
	}
	
	public void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
		
	}
	
	public void clickLogin() {
		btnloging.click();
	}
	public void clickLogout() {
		linkLogout.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
