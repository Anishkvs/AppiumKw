package stcGuest;

import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.LoginPage;
import org.stc.pageObjects.android.second.PasswordPage;
import org.stc.pageObjects.android.second.RoamingPage;
import org.testng.annotations.Test;

public class TC_12_GuestRoamingDestination extends BaseTest {

	@Test
	public void sc_GuestUser_RoamingDestination() throws InterruptedException {
		HomePage home = new HomePage(driver);
		LoginPage log = new LoginPage(driver);
		RoamingPage roaming = new RoamingPage(driver);
		PasswordPage pass = new PasswordPage(driver);
		home.viewRoamingDestinations();
		home.getRoamingUk();
		home.getRoamingViewAll();
		roaming.setUAE();
		roaming.LoginToSubscribe();
		log.loginApp("50012053", "50012053@");
		roaming.setRoamingKD();
		roaming.setRoamingSubscribe();
		roaming.OkSubscribe();
		pass.setEnterFourDigitText();

	}
}
