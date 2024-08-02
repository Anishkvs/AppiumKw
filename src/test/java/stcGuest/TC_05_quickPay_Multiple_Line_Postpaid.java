package stcGuest;

import java.net.MalformedURLException;
import org.stc.pageObjects.android.AmountEditPage;
import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.android.PaymentPage;
import org.testng.annotations.Test;

public class TC_05_quickPay_Multiple_Line_Postpaid extends BaseTest {

	@Test
	public void sc_quickPay_Multiple_Line_Postpaid_Scenario() throws MalformedURLException, InterruptedException {
		HomePage home = new HomePage(driver);
		NumberPage num = new NumberPage(driver);
		AmountEditPage amountEdit = new AmountEditPage(driver);
		PaymentPage pay = new PaymentPage(driver);
		AmountEditPage edit = new AmountEditPage(driver);
		String num1 ="51602474";
		String num2 = "51601159";
		home.setQuickPay();
		num.guestEnterNumber(num1);
		num.setContinue();
		amountEdit.setAddNumber();
		num.guestNumberBoxTwo(num2);
		num.setContinue();
		num.setChangeOne();
		edit.setCustom();
		edit.setEditAmount("2");
		edit.setProceed();
		num.setChangeTwo();
		edit.setCustom();
		edit.setEditAmount("2");
		edit.setProceed();
		num.setContinue();
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
