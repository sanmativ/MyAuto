package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EnterTimeTrackerPage extends BasePage
{

	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	@FindBy(xpath="(//div[@class='popup_menu_arrow'])[3]")
	private WebElement helpLink;
	
	@FindBy(linkText="About actiTIME")
	private WebElement aboutLink;
	
	@FindBy(xpath="//span[@class='productVersion']")
	private WebElement productVersion;
	
	@FindBy(xpath="//img[@title='Close']")
	private WebElement closeButton;
	
	
	public EnterTimeTrackerPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogoutLink()
	{
		logoutLink.click();
	}
	
	public void clickHelpLink()
	{
		helpLink.click();
	}
	
	public void clickAboutLink()
	{
		aboutLink.click();
	}

	public void verifyProductVersion(String eVersion)
	{
		String aVersion=productVersion.getText();
		
		Assert.assertEquals(aVersion, eVersion);
		
	}
	
	public void clickCloseButton()
	{
		closeButton.click();
	}
}
