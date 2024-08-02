package stcLoggedUser;

import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.LoginPage;
import org.stc.pageObjects.android.second.DashBoardPage;
import org.stc.pageObjects.android.second.DeviceAndAccessories;
import org.stc.pageObjects.android.second.UnBilledAmountPage;
import org.testng.annotations.Test;

public class TC_05_Subscription_Upgrade_ComparePlan extends BaseTest{
	
	@Test
	public void sc_Subscription_Upgrade_ComparePlan() throws Exception  	 {
		
		DashBoardPage profile = new DashBoardPage(driver); 
    	UnBilledAmountPage bill = new UnBilledAmountPage(driver);
		DeviceAndAccessories device = new DeviceAndAccessories(driver);
		LoginPage login = new LoginPage(driver);
		login.loginApp("50012053", "50012053@");
		profile.getViewAll();
		bill.setSubscriptions();
		bill.setUpgrade();
		bill.setComparePackages();
		bill.setChoose();
		bill.setChangePackage();
		bill.setCancelPackage();
		bill.setChooseACommitment();
		device.setAppleDevice();
		device.setContinueOrCallBack();
		driver.navigate().back();
		driver.navigate().back();
		bill.setChangePackage();
		bill.setSubscribe();
		Thread.sleep(20000);
		

	}

	
}
