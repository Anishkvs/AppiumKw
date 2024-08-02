package stcGetNewLine.TT;

import java.net.MalformedURLException;
import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.LoginPage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.android.OrderSummaryPage;
import org.stc.pageObjects.android.PaymentPage;
import org.stc.pageObjects.android.second.DeviceAndAccessories;
import org.stc.pageObjects.android.second.GetNewLineFirstPage;
import org.stc.pageObjects.android.second.GetNewLineSecondPage;
import org.stc.pageObjects.android.second.PlanPage;
import org.stc.pageObjects.android.second.eStorePage;
import org.testng.annotations.Test;

public class TC_12_Get_new_line_mobile_postpaid_with_device extends BaseTest {

	@Test
	public void sc_Get_new_line_mobile_postpaid_with_device() throws MalformedURLException, InterruptedException {

		HomePage home = new HomePage(driver);
		eStorePage store = new eStorePage(driver);
		GetNewLineFirstPage lineOne = new GetNewLineFirstPage(driver);
		GetNewLineSecondPage lineTwo = new GetNewLineSecondPage(driver);
		PlanPage plan = new PlanPage(driver);
		NumberPage num = new NumberPage(driver);
		OrderSummaryPage summary = new OrderSummaryPage(driver);
		PaymentPage pay = new PaymentPage(driver);
		DeviceAndAccessories device = new DeviceAndAccessories(driver);
		LoginPage login = new LoginPage(driver);
		login.loginApp("51064748", "51064748!");
		home.getEStore();
		store.setMobileAndInternet();
		lineOne.setMobilePostpaid();
		lineTwo.setFortyFive();
		plan.setConfirmPlan();
		lineOne.setVacant();
		driverWaits();
		plan.setChoosePlan();
		lineOne.setAddDevice();
		device.setAppleDevice();
		driverWaits();
		num.setContinue();
		lineOne.setAddPrimaryDevice();
		lineOne.setAddAccessoriesDevice();
		device.setAppleDevice();
		driverWaits();
		num.setContinue();
		lineOne.setAddAsAccessory();
		num.setContinue();
		driverWait();
		num.setContinue();
		driverWait();
		lineOne.setLocationTwo();
		driverWait();
		lineOne.ShippingAddress();
		driverWait();
		summary.setSelectDeliveryTime();
		num.setContinue();
		driverWait();
		num.setContinue();
		summary.setContinueToCheckout();
		driverWait();
		pay.setPlaceOrder();
		System.out.println("Get_new_line_mobile_postpaid_with_device");
		Thread.sleep(15000);
		}
	private void driverWait() throws InterruptedException {
		Thread.sleep(2000);
		}
	private void driverWaits() throws InterruptedException {
		Thread.sleep(5000);
		}
}
