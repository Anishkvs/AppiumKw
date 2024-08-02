package stcGuest;

import java.net.MalformedURLException;
import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.second.DashBoardPage;
import org.testng.annotations.Test;

public class TC_01_HomePageVerify extends BaseTest{
	
		@Test
	public void sc_HomePageVerify() throws MalformedURLException, InterruptedException {
		HomePage home = new HomePage(driver);
		DashBoardPage profile = new DashBoardPage(driver);
		home.viewHomeMenu();
		home.viewEStoreMenu();
		home.viewPointsMenu();
		home.viewMoreMenu();
    	home.setEnglishToArabTransulate();
		Thread.sleep(5000);
		profile.setAllow();
		home.setArabToEnglish();
		Thread.sleep(5000);
		home.viewHello();
		home.viewWelcomeText();
	//	home.viewAlreadyCustomer();
		home.viewQuickPay();
		home.viewRecharge();
		home.viewExploreDevices();
		home.viewRoamingDestinations();
		home.viewStcNews();
	
	}

}
