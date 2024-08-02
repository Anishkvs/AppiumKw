package org.stc.pageObjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AmountChoosePage extends AndroidActions {

	AndroidDriver driver;

	public AmountChoosePage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"KD 2 \"]")
	private WebElement TwoKD;
	
	public void setTwoKD() throws InterruptedException {
		//Thread.sleep(2000);
		TwoKD.click();
		Thread.sleep(1000);
		TwoKD.click();
	}
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"KD 3 \"]")
	private WebElement ThreeKD;
	
	public void setThreeKD() throws InterruptedException {
		ThreeKD.click();
		Thread.sleep(1000);
		ThreeKD.click();
	}
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"KD 5 \"]")
	private WebElement FiveKD;
	
	public void setFiveKD() throws InterruptedException {
		FiveKD.click();
		Thread.sleep(1000);
		FiveKD.click();
	}
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"KD 10 \"]")
	private WebElement TenKD;
	
	public void setTenKD() throws InterruptedException {
		TenKD.click();
		Thread.sleep(1000);
		TenKD.click();
	}
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"KD 20 \"]")
	private WebElement TwentyKD;
	
	public void setTwentyKD() throws InterruptedException {
		TwentyKD.click();
		Thread.sleep(1000);
		TwentyKD.click();
	}
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"KD 25 \"]")
	private WebElement TwentyFiveKD;
	
	public void setTwentyFiveKD() throws InterruptedException {
		scrollText("25");
		TwentyFiveKD.click();
		Thread.sleep(1000);
		TwentyFiveKD.click();
	}
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text=\"Who are you paying for?\"]")
	private WebElement WhoPayForTitle;
	@AndroidFindBy(accessibility= "stc-button-Continue")
	private WebElement continueAmount;
	
	public void setContinue() throws InterruptedException {
		//Thread.sleep(5000);
		continueAmount.click();
		waitForElementToAppearWithText(WhoPayForTitle, driver, "Who are you paying for?");

		
	}

	@AndroidFindBy(xpath= "//android.widget.EditText[@text=\"Amount\"]")
	private WebElement enterAmount;
	
	public void setEnterAmount(String num) {
		enterAmount.sendKeys(num);
	}
	
	@AndroidFindBy(xpath= "//android.widget.EditText[@text=\"Amount\"]")
	private WebElement clearEnterAmount;
	
	public void setclearEnterAmount() throws InterruptedException {
		Thread.sleep(1000);
		clearEnterAmount.clear();
		}
	

}
