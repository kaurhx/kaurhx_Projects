package Day2_maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutPage {
	
	WebDriver driver;
	public LogoutPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	//repository
By logoutlink = By.xpath("//div[@id='navbarText']/descendant::li[3]/child::a");





public void clickonlogout() 
{
	// TODO Auto-generated method stub
	driver.findElement(logoutlink).click();
}

}