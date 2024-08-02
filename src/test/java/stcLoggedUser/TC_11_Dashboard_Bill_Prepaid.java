package stcLoggedUser;

import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.LoginPage;
import org.stc.pageObjects.android.second.BillPage;
import org.stc.pageObjects.android.second.DashBoardPage;
import org.testng.annotations.Test;

public class TC_11_Dashboard_Bill_Prepaid extends BaseTest {

	@Test(priority = 1)
	public void sc_Dashboard_Prepaid_Bill() throws InterruptedException {
		DashBoardPage profile = new DashBoardPage(driver);
		LoginPage login = new LoginPage(driver);
		login.loginApp("50010470", "50010470@");
		Thread.sleep(10000);
		profile.setAddValidity();
		driverWait();
		driver.navigate().back();
		profile.setRecharge();
		driverWait();
		driver.navigate().back();
		profile.setViewBill();
		Thread.sleep(15000);
		profile.viewHistoryPage();
		driver.navigate().back();

	}

	private void bills() throws InterruptedException {
		DashBoardPage profile = new DashBoardPage(driver);
		BillPage bil = new BillPage(driver);
		profile.viewActive();
		profile.setViewBill();
		Thread.sleep(15000);
		bil.viewViewBillTitle();
		bil.viewBillPDFPage();
		driver.navigate().back();
	}

	private void logout() throws InterruptedException {
		HomePage home = new HomePage(driver);
		DashBoardPage profile = new DashBoardPage(driver);
		Thread.sleep(2000);
		home.getMore();
		Thread.sleep(2000);
		profile.setSignOut();
		Thread.sleep(2000);
	}
	
	private void driverWait() throws InterruptedException {
		Thread.sleep(1000);
		}
}
