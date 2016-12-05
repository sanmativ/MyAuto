package scripts;

import org.testng.annotations.Test;

import generics.Excel;
import pom.EnterTimeTrackerPage;
import pom.LoginPage;

public class ValidLoginLogOut extends BaseTest
{

	@Test
	public void testValidLoginLogout()
	{
		
		String un=Excel.getCellValue(XL_PATH,"validloginlogout", 1, 0);
		
		String pw=Excel.getCellValue(XL_PATH, "validloginlogout", 1, 1);
		
		String homePage=Excel.getCellValue(XL_PATH, "validloginlogout", 1, 2);
		
		String loginPage=Excel.getCellValue(XL_PATH, "validloginlogout", 1, 3);
		
		//enter valid un
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(un);
		
		//enter valid password
		lp.setPassword(pw);
		
		//click on login button
		lp.clickButton();
		
		//verify home page
		EnterTimeTrackerPage e=new EnterTimeTrackerPage(driver);
		e.verifyTitle(homePage);
		e.clickLogoutLink();
		
		//verify login page
		lp.verifyTitle(loginPage);
	}
}
