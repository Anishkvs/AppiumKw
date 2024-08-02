package stcLoggedUser;

import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.LoginPage;
import org.stc.pageObjects.android.second.qitafPage;

public class TC_24_Qitaf_login extends BaseTest {

	//@Test(priority=1)
	public void sc_Qitaf_SMS_Internet_Minutes() throws InterruptedException {
		HomePage home = new HomePage(driver);
		qitafPage qitaf = new qitafPage(driver);
		LoginPage login = new LoginPage(driver);
		login.loginApp("50012053", "50012053@");
		home.setPointsQitaf();
		qitaf.viewStcRewards();
		qitaf.setSMSRewards();
		qitaf.setPts();
		qitaf.setRedeemNow();
		qitaf.setRedeemCancel();
		qitaf.setInternetRewards();
		qitaf.setPts();
		qitaf.setRedeemNow();
		qitaf.setRedeemCancel();
		qitaf.setMinutesRewards();
		qitaf.setPts();
		qitaf.setRedeemNow();
		qitaf.setRedeemCancel();
	}
	
	  

}
