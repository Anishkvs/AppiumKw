package stcLoggedUser;

import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.LoginPage;
import org.stc.pageObjects.android.PaymentPage;
import org.stc.pageObjects.android.second.AddOnsPage;
import org.stc.pageObjects.android.second.eVouchersPage;
import org.testng.annotations.Test;

public class TC_09_Dashboard_EVoucher extends BaseTest {

	@Test
	public void sc_Dashboard_EVoucher() throws Exception {

		eVouchersPage voucher = new eVouchersPage(driver);
		LoginPage login = new LoginPage(driver);
		login.loginApp("50012053", "50012053@");
    	voucher.setEVoucherOne();
		buyEVouchers();
		voucher.setEVoucherViewAll();
		voucher.setiTunesUSA();
		buyEVouchers();

	}

	private void buyEVouchers() throws InterruptedException {

		PaymentPage pay = new PaymentPage(driver);
		eVouchersPage voucher = new eVouchersPage(driver);
		AddOnsPage addOn = new AddOnsPage(driver);
		addOn.setKD();
		voucher.setBuyEVoucher();
		pay.setKNet();
		pay.setAddCard();		
		pay.setPayKDAmount();
		pay.setPaymentFrameBox();
		voucher.backThree();
	}
	public void buyVouchers() {
		eVouchersPage voucher = new eVouchersPage(driver);
		voucher.setBuyEVoucher();
	}
	
	
}
