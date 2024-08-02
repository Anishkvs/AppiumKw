package stcGetNewLine;

import java.net.MalformedURLException;
import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.LoginPage;
import org.stc.pageObjects.android.OrderSummaryPage;
import org.stc.pageObjects.android.PaymentPage;
import org.stc.pageObjects.android.second.GetNewLineFirstPage;
import org.stc.pageObjects.android.second.GetNewLineSecondPage;
import org.stc.pageObjects.android.second.PlanPage;
import org.stc.pageObjects.android.second.eStorePage;
import org.testng.annotations.Test;

public class TC_04_Get_new_line_internet_prepaid extends BaseTest {

	@Test
	public void sc_Get_new_line_internet_prepaid() throws MalformedURLException, InterruptedException {

		HomePage home = new HomePage(driver);
		eStorePage store = new eStorePage(driver);
		GetNewLineFirstPage lineOne = new GetNewLineFirstPage(driver);
		GetNewLineSecondPage lineTwo = new GetNewLineSecondPage(driver);
		PlanPage plan = new PlanPage(driver);
		OrderSummaryPage summary = new OrderSummaryPage(driver);
		PaymentPage pay = new PaymentPage(driver);
		LoginPage login = new LoginPage(driver);
		login.loginApp("50012053", "50012053@");
		home.getEStore();
		store.setMobileAndInternet();
		lineOne.setInternetPrePaid();
		lineTwo.setKD();
		plan.setConfirmPlan();
		summary.setNormalSIM();
		lineTwo.setContinue();
		driverWait();
		lineTwo.setContinue();
		summary.setChangeCalander();
		summary.setSelectDeliveryTime();
		lineTwo.setContinue();
		summary.setPay();
		driverWait();
		pay.setKNet();
		pay.setPayKDAmount();
		System.out.println("Get_new_line_Internet_prepaid_with_device");
		Thread.sleep(15000);
		pay.setAddCard();
	}
	
	private void driverWait() throws InterruptedException {
		Thread.sleep(2000);
	}
}
