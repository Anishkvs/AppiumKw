package stcGuest;

import org.stc.pageObjects.android.AmountChoosePage;
import org.stc.pageObjects.android.AmountEditPage;
import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.android.PaymentPage;
import org.testng.annotations.Test;

public class TC_03_Recharge extends BaseTest {

		@Test
	public void sc_RechargeScenario() throws InterruptedException {
	
		HomePage home = new HomePage(driver);
		NumberPage num = new NumberPage(driver);
		AmountEditPage amountEdit = new AmountEditPage(driver);
		AmountChoosePage amount = new AmountChoosePage(driver);
		PaymentPage pay = new PaymentPage(driver);
		home.setRecharge();
		num.guestEnterNumber("51195933");
		num.setContinue();
		amountEdit.setAmount();
		amount.setTwoKD();
		amount.setContinue();
		amountEdit.setContinueButton();
		pay.setAddCard();
		pay.setPayKDAmount();
		pay.setPaymentFrameBox();
	}

		public void backToHome() throws InterruptedException {
		PaymentPage pay = new PaymentPage(driver);
		AmountEditPage amountEdit = new AmountEditPage(driver);
		NumberPage num = new NumberPage(driver);
		driver.navigate().back();
		pay.setPaymentBack();
		amountEdit.setClose();
		num.backButtonOnNumber();
		Thread.sleep(2000);
	}

}
