package scripts;

import org.testng.annotations.Test;

import generics.Excel;
import pom.LoginPage;

public class InvalidLoginLogOut extends BaseTest
{
	@Test
	public static void testInvalidLoginLogOut()
	{
		
		int rc=Excel.getRowCount(XL_PATH, "invalidloginlogout");
		
		for(int i=1;i<=rc;i++)
		{
			String un=Excel.getCellValue(XL_PATH,"invalidloginlogout",i, 0);
			String pw=Excel.getCellValue(XL_PATH,"invalidloginlogout",i, 1);
			
			LoginPage l=new LoginPage(driver);
			
			//enter user name
			
			l.setUserName(un);
			
			//enter password
			l.setPassword(pw);
			
			//click on submit button
			l.clickButton();
			
			//verify error message displayed
			l.verifyErrMsgDisplayed();
			
			
		}
	}

}
