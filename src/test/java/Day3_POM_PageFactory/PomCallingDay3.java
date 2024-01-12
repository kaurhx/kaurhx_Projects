package Day3_POM_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import is for Loginpage.java class which is written separately .automatically it give error and we add it 
import Day3_POM_PageFactory.LoginPage_Pagefactory;
import Day3_POM_PageFactory.LogoutPage_PageFactory;

public class PomCallingDay3 {
	
	@Test

	public void calling() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//now we need to call loignpage.java class which is written in d/f package so we need to create object of it 
		//loginpage constructor is parametried and need to pass here . here aso name is driver so we are pasisng it
		//loginpage is class for which we have created constructor here
		LoginPage_Pagefactory lp = new LoginPage_Pagefactory(driver);
		LogoutPage_PageFactory lom = new LogoutPage_PageFactory(driver);
		System.out.println("Launching the URL");
		lp.url();
		System.out.println("Entering Username");
		lp.enterusername("admin@yourstore.com");
		System.out.println("Entering Password");
		lp.enterpswd("admin");
		System.out.println("Clicking on Login Button");
		lp.loginclick();
		
		//code for logout page in POM
	
		lom.clickonlogout();

	}

}
