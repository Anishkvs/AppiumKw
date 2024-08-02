package stcGetNewLine;

import java.net.MalformedURLException;
import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.LoginPage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.android.OrderSummaryPage;
import org.stc.pageObjects.android.PaymentPage;
import org.stc.pageObjects.android.second.GetNewLineFirstPage;
import org.stc.pageObjects.android.second.GetNewLineSecondPage;
import org.stc.pageObjects.android.second.PlanPage;
import org.stc.pageObjects.android.second.eStorePage;
import org.testng.annotations.Test;

public class TC_03_Get_new_line_internet_postpaid_without_device extends BaseTest {

	@Test
	public void sc_Get_new_line_internet_postpaid_without_device() throws MalformedURLException, InterruptedException {

		HomePage home = new HomePage(driver);
		eStorePage store = new eStorePage(driver);
		GetNewLineFirstPage lineOne = new GetNewLineFirstPage(driver);
		GetNewLineSecondPage lineTwo = new GetNewLineSecondPage(driver);
		PlanPage plan = new PlanPage(driver);
		NumberPage num = new NumberPage(driver);
		OrderSummaryPage summary = new OrderSummaryPage(driver);
		PaymentPage pay = new PaymentPage(driver);
		LoginPage login = new LoginPage(driver);
		login.loginApp("50012053", "50012053@");
		home.getEStore();
		store.setMobileAndInternet();
		lineOne.setInternetPostpaid();
		lineTwo.setKD();
		plan.setConfirmPlan();
		lineOne.setVacant();
		driverWait();
		plan.setChooseSim();
		lineOne.setSimDeliver();
		driverWait();
		lineOne.setContinue();
		summary.setSelectDeliveryTime();
		num.setContinue();
		driverWait();
		num.setContinue();
		summary.setContinueToCheckout();
		pay.setPlaceOrder();
		System.out.println("Get_new_line_Internet_postpaid_with_device");
		Thread.sleep(15000);
	}
	private void driverWait() throws InterruptedException {
		Thread.sleep(2000);
	}
}
