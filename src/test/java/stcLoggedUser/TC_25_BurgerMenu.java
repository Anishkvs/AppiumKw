package stcLoggedUser;

import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.LoginPage;
import org.stc.pageObjects.android.PaymentPage;
import org.stc.pageObjects.android.second.BurgerPage;
import org.testng.annotations.Test;

public class TC_25_BurgerMenu extends BaseTest {

	@Test(priority=1)
	public void sc_burgerMenuSettings() throws InterruptedException {
		HomePage home = new HomePage(driver);
		PaymentPage pay = new PaymentPage(driver);
		BurgerPage menu = new BurgerPage(driver);
		LoginPage login = new LoginPage(driver);
		login.loginApp("50012053", "50012053@");
		home.getMore();
		menu.viewLastLogin();
		menu.setSettingsButton();
		menu.setCompleteYourProfile();
		home.setEnglishToArabTransulate();
		Thread.sleep(2000);
		menu.setArabToEnglish();
		menu.setNumberProperties();
		menu.setPrimarySim();
		menu.setPayments();
		pay.setCardAndRecurringPay();
		pay.setAutoPay();
		menu.setUserManagement();
		menu.setqitaf();
		menu.setPoolingAndStatus();	
		menu.setSecurityPrivacy();
		menu.setBioMetrics();
		driver.navigate().back();
		driver.navigate().back();
		home.getMore();
		menu.setAboutUs();
	}
	
}
