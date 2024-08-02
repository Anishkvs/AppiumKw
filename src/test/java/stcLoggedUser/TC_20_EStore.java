package stcLoggedUser;

import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.android.second.DashBoardPage;
import org.stc.pageObjects.android.second.PasswordPage;
import org.stc.pageObjects.android.second.eStorePage;
import org.testng.annotations.Test;

public class TC_20_EStore extends BaseTest {

	@Test
	public void sc_EStore() throws Exception {
		DashBoardPage profile = new DashBoardPage(driver);
		HomePage home = new HomePage(driver);
		eStorePage eStore = new eStorePage(driver);
		PostPaid_login();
		home.getEStore();
		profile.setHelpCenter();
		eStore.setSearch("Apple");
		driver.navigate().back();
		driver.navigate().back();
		eStore.setEstoreSmartphones();
		eStore.setViewAllTwo();
		eStore.setfilter();
		Thread.sleep(10000);

	}

	private void PostPaid_login() throws Exception {
		DashBoardPage profile = new DashBoardPage(driver);
		HomePage home = new HomePage(driver);
		NumberPage num = new NumberPage(driver);
		PasswordPage pass = new PasswordPage(driver);
		home.setAlreadyCustomer();
		num.enterNumber("51602474");
		num.setContinue();
		pass.enterPassword("51602474.");
		pass.setSignIn();
		profile.setNotNow();
	}
}
