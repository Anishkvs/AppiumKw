package stcLoggedUser;

import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.android.second.DashBoardPage;
import org.stc.pageObjects.android.second.PasswordPage;
import org.testng.annotations.Test;

public class TC_01_CivilId_LoginScenario extends BaseTest{
	
		@Test(priority=1)
    public void loginCivilId() throws InterruptedException {
    	HomePage home = new HomePage(driver);
		NumberPage num = new NumberPage(driver);
		PasswordPage pass = new PasswordPage(driver);
		DashBoardPage profile = new DashBoardPage(driver);
		home.setAlreadyCustomer();
		num.setLoginViaCivilId();
		num.enterCivilIdNumber("288082100675");
		num.setContinue();
		pass.enterPassword("0000000.");
		pass.setSignIn();
		profile.setAllow();
		profile.setEnable();
		Thread.sleep(5000);
    }


      
    public void login() throws InterruptedException {
    	HomePage home = new HomePage(driver);
		NumberPage num = new NumberPage(driver);
		PasswordPage pass = new PasswordPage(driver);
		DashBoardPage profile = new DashBoardPage(driver);
		home.setAlreadyCustomer();
		num.enterNumber("51307734");
		num.setContinue();
		pass.enterPassword("51307734@");
		pass.setSignIn();
		profile.setNotNow();
    }
    
    public void logout() throws InterruptedException {
    	HomePage home = new HomePage(driver);
		DashBoardPage profile = new DashBoardPage(driver);
    	home.getMore();
		profile.setSignOut();
    }
    
}
