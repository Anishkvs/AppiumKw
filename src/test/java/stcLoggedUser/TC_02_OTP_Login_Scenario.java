package stcLoggedUser;

import java.net.MalformedURLException;
import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.HomePage;
import org.stc.pageObjects.android.NumberPage;
import org.stc.pageObjects.android.second.PasswordPage;
import org.testng.annotations.Test;

public class TC_02_OTP_Login_Scenario extends BaseTest{
	

    @Test(priority=1)
	public void sc_VerifyOTPPage() throws MalformedURLException, InterruptedException {
		HomePage home = new HomePage(driver);
		NumberPage num = new NumberPage(driver);
		PasswordPage pass = new PasswordPage(driver);
		home.setAlreadyCustomer();
		num.enterNumber("50012053");
		num.setContinue();
		pass.setForgotYourPassword();
		num.setContinue();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.navigate().back();
		pass.setLoginSMS();
		pass.setSendCode();
		Thread.sleep(2000);
		pass.setEnterFourDigitText();
}
	public void sc_VerifyForgotPasswordButton() throws MalformedURLException, InterruptedException {
		NumberPage num = new NumberPage(driver);
		driver.navigate().back();
		num.setForgotPass();
}
          
    
    
}
