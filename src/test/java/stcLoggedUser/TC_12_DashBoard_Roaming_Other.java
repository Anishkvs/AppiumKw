package stcLoggedUser;

import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.android.second.DashBoardPage;
import org.stc.pageObjects.android.second.PasswordPage;
import org.stc.pageObjects.android.second.RoamingPage;
import org.testng.annotations.Test;

public class TC_12_DashBoard_Roaming_Other extends BaseTest {

	@Test
	public void RoamingDestination() throws Exception {
		DashBoardPage profile = new DashBoardPage(driver); 
		RoamingPage roaming = new RoamingPage(driver);
		PostPaid_login();
		profile.setRoamingDestinationsUk();
		roaming.viewRoamingDestinationsSubscribe();
		driver.navigate().back();
		profile.setRoamingViewAll();
	    roaming.setUAE();
		roaming.viewRoamingDestinationsSubscribe();
		roaming.setRoamingKD();
		roaming.setRoamingSubscribe();
		roaming.setRoamingCancel();
		driverWait();
		driver.navigate().back();
		driverWait();
		driver.navigate().back();
		driverWait();
		driver.navigate().back();
		driverWait();
	}
	
	private void PostPaid_login() throws Exception  	 {
		DashBoardPage profile = new DashBoardPage(driver); 
		HomePage home = new HomePage(driver);
		NumberPage num = new NumberPage(driver);
		PasswordPage pass = new PasswordPage(driver);
		home.setAlreadyCustomer();
		num.enterNumber("50012026");
		num.setContinue();
		Thread.sleep(5000);
		pass.enterPassword("0000000.");
		pass.setSignIn();
		profile.setAllow();
		profile.setNotNow();	
	
}
	private void driverWait() throws InterruptedException {
		Thread.sleep(1000);
		}
}
