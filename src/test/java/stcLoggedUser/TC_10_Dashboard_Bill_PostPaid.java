package stcLoggedUser;

import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.LoginPage;
import org.stc.pageObjects.android.second.BillPage;
import org.stc.pageObjects.android.second.DashBoardPage;
import org.testng.annotations.Test;

public class TC_10_Dashboard_Bill_PostPaid extends BaseTest {

	@Test(priority = 1)
	public void sc_Dashboard_PostPaid_Bill() throws Exception {
		HomePage home = new HomePage(driver);
		LoginPage login = new LoginPage(driver);
		login.loginApp("50012053", "50012053@");
		Thread.sleep(10000);
		bills();
		home.setPayMenu();
		bills();

	}

	private void bills() throws InterruptedException {
		DashBoardPage profile = new DashBoardPage(driver);
		BillPage bil = new BillPage(driver);
		profile.setViewBill();
		Thread.sleep(15000);
		bil.viewViewBillTitle();
		bil.viewBillPDFPage();
		Thread.sleep(5000);
		driver.navigate().back();
	}


}
