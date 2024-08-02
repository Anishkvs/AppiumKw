package stcLoggedUser;

import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.android.ReviewOrderPage;
import org.stc.pageObjects.android.second.DashBoardPage;
import org.stc.pageObjects.android.second.PasswordPage;
import org.testng.annotations.Test;

public class TC_21_MainDashBoard extends BaseTest {

	@Test
	public void sc_GuestUser_MainDashBoard() throws InterruptedException {
		HomePage home = new HomePage(driver);
		DashBoardPage dashboard = new DashBoardPage(driver);
		ReviewOrderPage order = new ReviewOrderPage(driver);
		DashBoardPage profile = new DashBoardPage(driver);
		home.setExploreDevices();
		home.setExploreviewAll();
		order.setIAmAnSTCCustomer();
		login();
		order.setBuydevices();
		home.getMore();
		profile.setSignOut();
		Thread.sleep(2000);
		order.swipeDownThree();
		dashboard.setRoamingDestinations();
		dashboard.setLoginToSubscribe();
		dashboard.setKD();
		Thread.sleep(2000);
	}

	private void login() throws InterruptedException {
		NumberPage num = new NumberPage(driver);
		PasswordPage pass = new PasswordPage(driver);
		DashBoardPage profile = new DashBoardPage(driver);
		num.enterNumber("50012026");
		num.setContinue();
		pass.enterPassword("0000000.");
		pass.setSignIn();
		profile.setAllow();
		profile.setNotNow();
		
	}

	  

}
