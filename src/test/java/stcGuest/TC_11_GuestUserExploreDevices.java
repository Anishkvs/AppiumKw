package stcGuest;

import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.LoginPage;
import org.stc.pageObjects.android.ReviewOrderPage;
import org.testng.annotations.Test;

public class TC_11_GuestUserExploreDevices extends BaseTest {

	@Test
	public void sc_GuestUser_ExploreDevices() throws InterruptedException {
		HomePage home = new HomePage(driver);
		ReviewOrderPage order = new ReviewOrderPage(driver);
		LoginPage log = new LoginPage(driver);
		home.setExploreDevices();
		home.setExploreviewAll();
		order.setIAmAnSTCCustomer();
		log.loginAppTwo("50012053", "50012053@");
		order.setBuydevices();
	}
	
}
