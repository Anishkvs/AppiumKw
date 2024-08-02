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

public class TC_01_Get_new_line_mobile_prepaid extends BaseTest {

	@Test
	public void sc_GetNewLineMobilePrepaid() throws MalformedURLException, InterruptedException {

		HomePage home = new HomePage(driver);
		eStorePage store = new eStorePage(driver);
		GetNewLineFirstPage lineOne = new GetNewLineFirstPage(driver);
		GetNewLineSecondPage lineTwo = new GetNewLineSecondPage(driver);
		PlanPage confirm = new PlanPage(driver);
		NumberPage num = new NumberPage(driver);
		OrderSummaryPage summary = new OrderSummaryPage(driver);
		PaymentPage pay = new PaymentPage(driver);
		LoginPage login = new LoginPage(driver);
		login.loginApp("50012053", "50012053@");
		home.getEStore();
		store.setMobileAndInternet();
		lineOne.setMobilePrePaid();
		lineTwo.setKD();
		confirm.setConfirmPlan();
		summary.seteSIM();
		num.setContinue();
		driverWait();
		driver.navigate().back();
		driverWait();
		driver.navigate().back();
		driverWait();
		confirm.setConfirmPlan();
		summary.setNormalSIM();
		num.setContinue();
		Thread.sleep(8000);
		driverWait();
		num.setContinue();
		summary.setChangeCalander();
		summary.setSelectDeliveryTime();
		num.setContinue();
		summary.setPay();
		pay.setAddCard();
		pay.setPayKDAmount();
		System.out.println("Get_new_line_mobile_prepaid_with_device");
		Thread.sleep(15000);
	}
	
	
	private void driverWait() throws InterruptedException {
		Thread.sleep(2000);
	}
}
