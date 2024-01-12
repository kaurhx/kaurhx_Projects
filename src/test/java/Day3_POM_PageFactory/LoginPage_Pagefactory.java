package Day3_POM_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Pagefactory {
	
	WebDriver driver;
	public LoginPage_Pagefactory(WebDriver idriver)
	{
		driver = idriver ;
		
		//pagefactory method is responsible for initializing web elements
		PageFactory .initElements(driver, this);
		
	}

	//repository - here we are not storing but creating webelements
	@FindBy (id="Email") WebElement email;
	@FindBy (id="Password") WebElement pass;
	@FindBy (xpath ="//button[@type='submit']") WebElement loginbtn;
	

public void url() throws InterruptedException
{
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	Thread.sleep(3000);
}


public void enterusername(String us) throws InterruptedException
{
	email.clear();
	Thread.sleep(3000);
	email.sendKeys(us);
	
}

//method for entring password
public void enterpswd(String pw) throws InterruptedException
{
	pass.clear();
	Thread.sleep(3000);
	pass.sendKeys(pw);
}

//method for clicking on login button .here we are not writting in parameter becase while run time we are not given to pass any value
public void loginclick()
{
	loginbtn.click();
}

}