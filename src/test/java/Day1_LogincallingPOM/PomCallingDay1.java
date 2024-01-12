package Day1_LogincallingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import is for Loginpage.java class which is written separately .automatically it give error and we add it 

import Day1_maven_project.LoginPage;

//import is for logout maven proect package
import Day2_maven_project.LogoutPage;

public class PomCallingDay1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//now we need to call loignpage.java class which is written in d/f package so we need to create object of it 
		//loginpage constructor is parametried and need to pass here . here aso name is driver so we are pasisng it
		//loginpage is class for which we have created constructor here
		LoginPage lp = new LoginPage(driver);
		lp.url();
		lp.enterusername("admin@yourstore.com");
		lp.enterpswd("admin");
		lp.loginclick();
		
		//code for logout page in POM
		LogoutPage lo = new LogoutPage(driver);
		lo.clickonlogout();

	}

}
