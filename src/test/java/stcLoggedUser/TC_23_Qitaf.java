package stcLoggedUser;

import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.second.qitafPage;
import org.testng.annotations.Test;

public class TC_23_Qitaf extends BaseTest {

  @Test(priority=1)
	public void sc_Qitaf_Search_Reward_banner() throws InterruptedException {
		HomePage home = new HomePage(driver);
		qitafPage qitaf = new qitafPage(driver);
		home.setQitafMenu();
		qitaf.setSearch("qitaf");
		qitaf.setRewards();
	
	}
	
    @Test(priority=2)
	public void sc_BurgerMenuOptions() throws InterruptedException {
		HomePage home = new HomePage(driver);
		qitafPage qitaf = new qitafPage(driver);
		home.getMore();
		qitaf.setSignIn();
		home.getMore();
		qitaf.setHelpCenter();
		home.getMore();
		qitaf.setSettings();
		home.getMore();
		qitaf.setQuickPay();
				
	}

}
