package org.stc.pageObjects.android.second;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class eVouchersPage extends AndroidActions {

	AndroidDriver driver;

	public eVouchersPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"iTunes USA\"] | //android.widget.TextView[@text=\"iTunes KSA\"] | //android.widget.TextView[@text=\"PSN UAE\"]")
	private WebElement EVoucherOne;
	
	public void setEVoucherOne() throws InterruptedException {
		System.out.println("TC_17: Scroll to eVoucher");
		scrollText("Roaming Destinations");
		scrollText("eVouchers");
		iTunesUSA.click();
	}
	public void setFirstVoucher() throws InterruptedException {
		iTunesUSA.click();
	}
	
	@AndroidFindBy(accessibility = "Buy")
	private WebElement BuyEVoucher;
	
	public void setBuyEVoucher() {
		BuyEVoucher.click();
	}
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"View All\"])[2]")
	private WebElement ViewAll;
	
	public void setViewAll() {
		ViewAll.click();
	}
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Evouchers_View_All\"]/android.widget.ImageView")
	private WebElement EVoucherViewAll;
	
	public void setEVoucherViewAll() throws InterruptedException {
		EVoucherViewAll.click();
		Thread.sleep(4000);
	}
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"SEE ALL\"])[1]")
	private WebElement SeeAll;
	
	public void setSeeAll() {
		SeeAll.click();
	}
	@AndroidFindBy(accessibility = "iTunes")
	private WebElement iTunesUSA;
	
	public void setiTunesUSA() {
		iTunesUSA.click();
	}
	@AndroidFindBy(accessibility = "Mobile Number*-input")
	private WebElement MobileNumber;
	@AndroidFindBy(accessibility = "Email Address*-input")
	private WebElement eMail;
	public void setCheckout(String number, String Mail) {
		MobileNumber.sendKeys(number);
		eMail.sendKeys(Mail);
	}
	@AndroidFindBy(accessibility = "Continue")
	private WebElement Continue;
	
	public void setContinue() {
		Continue.click();
	}
	public void backThree() {
			driver.navigate().back();
			driver.navigate().back();
			driver.navigate().back();

	}
}
