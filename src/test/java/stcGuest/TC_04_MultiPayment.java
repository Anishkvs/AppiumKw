package stcGuest;

import org.stc.pageObjects.android.AmountChoosePage;
import org.stc.pageObjects.android.AmountEditPage;
import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.android.PaymentPage;
import org.testng.annotations.Test;

public class TC_04_MultiPayment extends BaseTest {

	@Test
	public void sc_MultiplePaymentScenario() throws InterruptedException {
		HomePage home = new HomePage(driver);
		NumberPage num = new NumberPage(driver);
		AmountEditPage amountEdit = new AmountEditPage(driver);
		AmountChoosePage amount = new AmountChoosePage(driver);
		PaymentPage pay = new PaymentPage(driver);
		home.setQuickPay();
		num.guestEnterNumber("51195933");
		num.setContinue();
		amountEdit.setAmount();
		amount.setTwoKD();
		amount.setContinue();
		amountEdit.setContinueButton();
		pay.setPaymentBack();
		amountEdit.setEdit();
		amount.setThreeKD();
		amount.setContinue();
		amountEdit.setContinueButton();
		pay.setPaymentBack();
		amountEdit.setEdit();
		amount.setFiveKD();
		amount.setContinue();
		amountEdit.setContinueButton();
		pay.setPaymentBack();
		amountEdit.setEdit();
		amount.setTenKD();
		amount.setContinue();
		amountEdit.setContinueButton();
		pay.setPaymentBack();
		amountEdit.setEdit();
		amount.setTwentyKD();
		amount.setContinue();
		amountEdit.setContinueButton();
		pay.setPaymentBack();
		amountEdit.setEdit();
		amount.setTwentyFiveKD();
		amount.setContinue();
		amountEdit.setContinueButton();
		pay.setPaymentBack();
		amountEdit.setEdit();
		amount.setEnterAmount("2");
		amount.setContinue();
		Thread.sleep(5000);
		amountEdit.setContinueButton();
		Thread.sleep(2000);
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
