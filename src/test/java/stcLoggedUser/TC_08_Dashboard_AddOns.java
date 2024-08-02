package stcLoggedUser;

import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.LoginPage;
import org.stc.pageObjects.android.second.AddOnsPage;
import org.stc.pageObjects.android.second.DashBoardPage;
import org.testng.annotations.Test;

public class TC_08_Dashboard_AddOns extends BaseTest {

	@Test
	public void sc_Dashboard_AddOns() throws Exception  	 {
		
		DashBoardPage profile = new DashBoardPage(driver); 
		LoginPage login = new LoginPage(driver);
		login.loginApp("50012053", "50012053@");
		Thread.sleep(10000);
		profile.setAddOns();
		AddOnsPage addOn = new AddOnsPage(driver);
		addOn.checkSubscribePage();
		profile.setViewAll();
		addOn.setKD();
		addOn.checkSubscribePage();
		addOn.setExtra();
		addOn.setKD();
		addOn.checkSubscribePage();
		addOn.setRoaming();
		addOn.setKD();
		addOn.checkSubscribePage();	
		addOn.setEntertainment();
		addOn.setKD();
		addOn.checkSubscribePage();	
		addOn.setBoosters();
		addOn.setKD();
		addOn.checkSubscribePage();

	}

}
