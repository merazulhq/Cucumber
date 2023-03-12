package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import page.LogingPage;

public class HomePage {
	
	public WebDriver driver;
public	LogingPage lp;
@Given("Userlunch chrome browser")
public void userlunch_chrome_browser() {
	
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();	
	 lp = new LogingPage(driver);
}
@When("user opens url {string}")
public void user_opens_url(String url) {
	driver.get(url);   
	driver.manage().window().maximize();
}
@And("User enter Email as {string} and Password as {string}")
public void user_enter_email_as_and_password_as(String email, String password) {
	lp.setUserName(email);
	lp.setPassword(password);    
}
@And("Click on loging")
public void click_on_loging() {
	lp.clickLogin();  
}
@Then("Page Title should be {string}")
public void page_title_should_be(String string) {   
}
@When("User click on log out link")
public void user_click_on_log_out_link() {   
	lp.clickLogout();
}
@Then("Page title should be {string}")
public void page_title_should_be1(String string) {    
}
@And("close browser")
public void close_browser() {
    
}


	
	
	
	

}
