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
import org.stc.pageObjects.android.second.eStorePage;
import org.testng.annotations.Test;

public class TC_15_Get_new_line_mobile_postpaid_Verify_YouthPlan_With_Devices extends BaseTest {

	@Test
	public void sc_Get_new_line_mobile_postpaid_YouthPlan_With_Devices() throws MalformedURLException, InterruptedException {

		HomePage home = new HomePage(driver);
		eStorePage store = new eStorePage(driver);
		GetNewLineFirstPage lineOne = new GetNewLineFirstPage(driver);
		GetNewLineSecondPage lineTwo = new GetNewLineSecondPage(driver);
		NumberPage num = new NumberPage(driver);
		OrderSummaryPage summary = new OrderSummaryPage(driver);
		PaymentPage pay = new PaymentPage(driver);
		DeviceAndAccessories device = new DeviceAndAccessories(driver);
		LoginPage login = new LoginPage(driver);
		login.loginApp("51064748", "51064748!");
		home.getEStore();
		store.setMobileAndInternet();
		lineOne.setMobilePostpaid();
		lineOne.setyouthPlansTitle();
		lineTwo.setYouth_7();
		lineTwo.setConfirmPlan();
		lineTwo.setYouth_11();
		lineTwo.setConfirmPlan();
		lineTwo.setYouth_22();
		lineTwo.setConfirmPlan();
		lineTwo.setYouthPlan22();
		lineOne.setAddAccessoriesDevice();
		device.setAppleDevice();
		System.out.println("Continue is Enable");
		Thread.sleep(10000);
		num.setContinue();
		lineOne.setAddPrimaryDevice();
		driverWait();
		driverWait();
		lineOne.setSwipeDown();
		lineOne.setAddAccessoriesDevice();
		device.setAppleDevice();
		System.out.println("Continue is Enable");
		Thread.sleep(10000);
		num.setContinue();
		lineOne.setAddAsAccessory();
		lineTwo.setContinue();
		driverWait();
		lineTwo.setContinue();
		summary.setChangeCalander();
		summary.setSelectDeliveryTime();
		num.setContinue();
		driverWait();
		summary.setPay();
		driverWait();
		pay.setPlaceOrder();
		System.out.println("Get_new_line_mobile_postpaid_with_device");
		Thread.sleep(15000);
	
	}
	private void driverWait() throws InterruptedException {
		Thread.sleep(2000);
		}
}
