package stcGuest;

import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.second.PasswordPage;
import org.stc.pageObjects.android.second.eVouchersPage;
import org.testng.annotations.Test;

public class TC_13_GuestUserEVouchers extends BaseTest {

	@Test
	public void sc_GuestUser_eVouchers() throws InterruptedException {
		eVouchersPage voucher = new eVouchersPage(driver);
		PasswordPage pass = new PasswordPage(driver);
    	voucher.setEVoucherOne();
    	voucher.setBuyEVoucher();
    	voucher.setCheckout("50885069", "test@test.com");
    	voucher.setContinue();
    	pass.setEnterFourDigitText();
    	voucher.backThree();
		voucher.setEVoucherViewAll();
		voucher.setFirstVoucher();
    	voucher.setBuyEVoucher();

	}

	
}
