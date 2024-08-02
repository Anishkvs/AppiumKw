package stcLoggedUser;

import org.stc.pageObjects.android.AmountEditPage;
import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.LoginPage;
import org.stc.pageObjects.android.PaymentPage;
import org.stc.pageObjects.android.second.DashBoardPage;
import org.testng.annotations.Test;

public class TC_07_Dashboard_PayAdvance extends BaseTest {

	@Test
	public void sc_Dashboard_PayAdvance() throws Exception  	 {
		
		HomePage home = new HomePage(driver);
		DashBoardPage profile = new DashBoardPage(driver); 
		PaymentPage pay = new PaymentPage(driver);
		LoginPage login = new LoginPage(driver);
		AmountEditPage edit = new AmountEditPage(driver);
		login.loginApp("50012053", "50012053@");
		profile.setPayAdvance();
		edit.setCustom();
		edit.setEditAmount("2");
		edit.setProceed();
		pay.setPayKDAmount();
		pay.setPaymentFrameBox();
		driver.navigate().back();
		driver.navigate().back();
		home.setPayMenu();
		profile.setPayAdvance();
		edit.setCustom();
		edit.setEditAmount("2");
		edit.setProceed();
		pay.setPayKDAmount();
		pay.setPaymentFrameBox();
	}

}
