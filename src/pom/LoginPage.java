/*Every pom class extend BasePage class and BasePage class has 
 * parameterized constructor . To call parameterized constructor 
 * from child constructor we use super statement.
 * 
 */

package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage

{
		//this portion is called declaration
	
		@FindBy(id="username")
		private WebElement unTextBox;
		
		@FindBy(name="pwd")
		private WebElement pwTextBoX;
		
		@FindBy(id="loginButton")
		private WebElement loginButton;
		
		@FindBy(xpath="//span[contains(text(),'invalid')]")
		private WebElement errMsg;
		
	
		// this portion is called initialization
		
		public LoginPage(WebDriver driver)
		{
			super(driver);
			PageFactory.initElements(driver,this);
		
		}

	
		//this portion is called utilization
	
		public void setUserName(String un)
		{
			unTextBox.sendKeys(un);
		}
	
		public void setPassword(String pw)
		{
			pwTextBoX.sendKeys(pw);
		}
	
		public void clickButton()
		{
			loginButton.click();
		}
	
}
