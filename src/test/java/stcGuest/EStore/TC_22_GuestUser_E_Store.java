package stcGuest.EStore;

import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.second.eStorePage;
import org.testng.annotations.Test;

public class TC_22_GuestUser_E_Store extends BaseTest {

	@Test
	public void sc_GuestUser_E_Store() throws InterruptedException {
		HomePage home = new HomePage(driver);
		eStorePage estore = new eStorePage(driver);
		home.getEStore();	
		estore.setSearch("Apple");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();  
		estore.setSwitchToStc();
		driver.navigate().back();
		estore.setMobileAndInternet();
		driver.navigate().back();
		estore.setEstoreSmartphones();
		estore.setSmartPhoneViewAll();
		estore.setfilter();
		estore.setViewAllWearable();
		estore.setWearable();
		home.getEStore();
		estore.setAccessories();
		estore.setViewAllAccessories();
		estore.setEStoreVouchers();
		estore.setViewAllEStoreVouchers();
		estore.setEStoreCategories();
	}

}
