package org.stc.pageObjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.pageObjects.android.second.DashBoardPage;
import org.stc.pageObjects.android.second.PasswordPage;
import org.stc.utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends AndroidActions {

	AndroidDriver driver;

	public LoginPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void loginApp(String username, String password) throws InterruptedException {
		NumberPage num = new NumberPage(driver);
		PasswordPage pass = new PasswordPage(driver);
		DashBoardPage profile = new DashBoardPage(driver);
		HomePage home = new HomePage(driver);
		home.setAlreadyCustomer();
		num.enterNumber(username);
		num.setContinue();
		pass.enterPassword(password);
		pass.setSignIn();
		profile.setAllow();
		profile.setNotNow();
	}
//	public void loginTTApp(String username, String password) throws InterruptedException {
//		NumberPage num = new NumberPage(driver);
//		PasswordPage pass = new PasswordPage(driver);
//		DashBoardPage profile = new DashBoardPage(driver);
//		HomePage home = new HomePage(driver);
//		home.setAlreadyCustomer();
//		num.enterNumber(username);
//		num.setContinue();
//		pass.enterPassword(password);
//		pass.setSignIn();
//		profile.setAllow();
//		profile.setNotNow();
//	}
	
	
//	public void PrepaidLogin(String username, String password) throws InterruptedException {
//		NumberPage num = new NumberPage(driver);
//		PasswordPage pass = new PasswordPage(driver);
//		DashBoardPage profile = new DashBoardPage(driver);
//		HomePage home = new HomePage(driver);
//		home.setAlreadyCustomer();
//		num.enterNumber(username);
//		num.setContinue();
//		pass.enterPassword(password);
//		pass.setSignIn();
//		profile.setAllow();
//		profile.setNotNow();
//		
//	}
	public void loginAppTwo(String username, String password) throws InterruptedException {
		NumberPage num = new NumberPage(driver);
		PasswordPage pass = new PasswordPage(driver);
		DashBoardPage profile = new DashBoardPage(driver);
		HomePage home = new HomePage(driver);
	//	home.setAlreadyCustomer();
		num.enterNumber(username);
		num.setContinue();
		pass.enterPassword(password);
		pass.setSignIn();
		profile.setAllow();
		profile.setNotNow();
	}
	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"KD 2 \"]")
	private WebElement TwoKD;
	
	public void setTwoKD() throws InterruptedException {
		TwoKD.click();
	}
}
