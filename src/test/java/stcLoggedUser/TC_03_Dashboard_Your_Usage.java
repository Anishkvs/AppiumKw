package stcLoggedUser;

import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.LoginPage;
import org.stc.pageObjects.android.second.DashBoardPage;
import org.testng.annotations.Test;

public class TC_03_Dashboard_Your_Usage extends BaseTest{
	
	@Test
	public void sc_Dashboard_Your_Usage() throws Exception  	 {
		DashBoardPage profile = new DashBoardPage(driver); 
		LoginPage login = new LoginPage(driver);
		login.loginApp("50012053", "50012053@");
		profile.viewPostPaidNumber();
		profile.getScrollKuwait();
		profile.viewMinsAvailable();
		profile.viewSmsAvailable();
		profile.getRoaming();
		profile.viewGBAvailableText();
		profile.getViewAll();
	  	profile.getRoaming();
		profile.viewGBAvailableText();
		profile.getInKuwait();
		Thread.sleep(2000);
		driver.navigate().back();

	}
	
}
