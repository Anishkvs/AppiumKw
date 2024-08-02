package stcLoggedUser;

import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.LoginPage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.android.PaymentPage;
import org.stc.pageObjects.android.second.DashBoardPage;
import org.stc.pageObjects.android.second.UnBilledAmountPage;
import org.testng.annotations.Test;

public class TC_13_Dashboard_Usage_Subscription_Recharge_PayBill extends BaseTest{
	
	@Test
	public void sc_Dashboard_Usage_Subscription_Recharge_PayBill() throws Exception  	 {
		
		NumberPage num = new NumberPage(driver);
		DashBoardPage profile = new DashBoardPage(driver); 
		PaymentPage pay = new PaymentPage(driver);
		UnBilledAmountPage bill = new UnBilledAmountPage(driver);
		LoginPage login = new LoginPage(driver);
		login.loginApp("50012053", "50012053@");
		Thread.sleep(10000);
		profile.getViewAll();
		bill.setRecharge();
		num.enterRechargeNumber("2");
		Thread.sleep(5000);
		num.setConfirm();
		pay.setAddCard();
		pay.setPayKDAmount();
		pay.setPaymentFrameBox();
		backFour();
		profile.getViewAll();
		bill.setSubscriptions();
		bill.setBills();
		
	}

	private void backFour() {
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
	}
	
}
