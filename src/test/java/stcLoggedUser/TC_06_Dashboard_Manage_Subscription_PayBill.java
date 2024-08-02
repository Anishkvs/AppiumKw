package stcLoggedUser;

import org.stc.pageObjects.android.AmountEditPage;
import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.LoginPage;
import org.stc.pageObjects.android.PaymentPage;
import org.stc.pageObjects.android.second.DashBoardPage;
import org.stc.pageObjects.android.second.UnBilledAmountPage;
import org.testng.annotations.Test;

public class TC_06_Dashboard_Manage_Subscription_PayBill extends BaseTest {

	@Test
	public void sc_Dashboard_Manage_Subscription_PayBill() throws Exception  	 {
		
		DashBoardPage profile = new DashBoardPage(driver); 
		PaymentPage pay = new PaymentPage(driver);
		AmountEditPage edit = new AmountEditPage(driver);
		UnBilledAmountPage bill = new UnBilledAmountPage(driver);
		LoginPage login = new LoginPage(driver);
		login.loginApp("50012053", "50012053@");
		Thread.sleep(10000);
		profile.setManageAllSubscriptions();
		bill.setPay();
		edit.setCustom();
		edit.setEditAmount("2");
		edit.setProceed();
		edit.setProceed();
		pay.setAddCard();
		pay.setPayKDAmount();
		pay.setPaymentFrameBox();

	}

}
