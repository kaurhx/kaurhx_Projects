package Day1_maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	//creating parametried constuctor but it will be a local variable. so we need to define above 
	//as globaland using this operator we will assign value to global variable
	public LoginPage(WebDriver driver)
	{
		//assigning local variable to global variable 
		this.driver=driver;
	}
	
	//Creating Repository 
	//userid and passwd are variables defined and username and password is taken from xpath
	By userid =By.id("Email");
	By Passwd =By.id("Password");
	By Loginbutton =By.xpath("//button[@type='submit']");
	
	//method for URL
	public void url() throws InterruptedException
	{
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);
	}

	//method for entring text in Username Box and passing parametr because we are going 
	//to provide at run time 
	public void enterusername(String us) throws InterruptedException
	{
		driver.findElement(userid).clear();
		Thread.sleep(3000);
		driver.findElement(userid).sendKeys(us);
		
	}
	
	//method for entring password
	public void enterpswd(String pw) throws InterruptedException
	{
		driver.findElement(Passwd).clear();
		Thread.sleep(3000);
		driver.findElement(Passwd).sendKeys(pw);
	}
	
	//method for clicking on login button .here we are not writting in parameter becase while run time we are not given to pass any value
	public void loginclick()
	{
		driver.findElement(Loginbutton).click();
	}
	
	}

