package Day3_POM_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage_PageFactory {
	
	WebDriver driver;
	public LogoutPage_PageFactory(WebDriver idriver)
	{
		driver = idriver; 
		PageFactory .initElements(driver, this);

	}




//repository
@FindBy (xpath= "//div[@id='navbarText']/descendant::li[3]/child::a") WebElement res;







public void clickonlogout() 
{
// TODO Auto-generated method
	res.click();
}

}