package stcGuest.EStore;

import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.E_StorePage;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.LoginPage;
import org.stc.pageObjects.android.ReviewOrderPage;
import org.testng.annotations.Test;

public class TC_20_GuestUserSmartPhones extends BaseTest {

	@Test
	public void sc_GuestUserSmartPhones() throws InterruptedException {
	
		E_StorePage eStore = new E_StorePage(driver);
		HomePage home = new HomePage(driver);
		ReviewOrderPage order = new ReviewOrderPage(driver);
		LoginPage log = new LoginPage(driver);
		home.getEStore();
		eStore.setScrollSmartPhones();
		eStore.setSmartPhonesViewAll();
		eStore.setFilter();
		eStore.setFilterBrandOne();
		eStore.setSearch();
		eStore.setSmartPhones();
		eStore.setContinue();
		order.setIAmAnSTCCustomer();
		log.loginApp("50012053", "50012053@");
		order.setBuydevices();
	}

	
}
