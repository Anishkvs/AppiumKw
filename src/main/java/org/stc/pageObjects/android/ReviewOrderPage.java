package org.stc.pageObjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.utils.AndroidActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ReviewOrderPage extends AndroidActions {

	AndroidDriver driver;

	public ReviewOrderPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "stc-button-Continue")
	private WebElement Continue;

	public void setContinue() throws InterruptedException {
		Continue.click();
	}
	
	@AndroidFindBy(accessibility = "I am an stc customer")
	private WebElement IAmAnSTCCustomer;

	public void setIAmAnSTCCustomer() throws InterruptedException {
		IAmAnSTCCustomer.click();
		Continue.click();
	}
	
	@AndroidFindBy(accessibility = "Close")
	private WebElement Close;
	@AndroidFindBy(accessibility = "Submit")
	private WebElement Submit;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Continue\"] | //android.widget.TextView[@text=\"Pre Order Now\"] | //android.widget.TextView[@text=\"Request\"] ")
	private WebElement ContinueOrPreOder;
	
		public void setCompleteOrder() {
			ContinueOrPreOder.click();
			Submit.click();
			Close.click();
		}
		
		@AndroidFindBy(accessibility = "Rate your experience")
		private WebElement RateYourExperience;
		@AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[3]")
		private WebElement Comment;
		@AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[8]")
		private WebElement Emoji;
		@AndroidFindBy(accessibility = "Name-input")
		private WebElement Name;
		@AndroidFindBy(accessibility = "Enter your contact number-input")
		private WebElement Number;
		public void setRateYourExperience(){
			Name.sendKeys("Test");
			Number.sendKeys("51307734");
			Emoji.click();
			Comment.sendKeys("AutomationTest");
			RateYourExperience.click();
		}
		@AndroidFindBy(accessibility = "Continue to Checkout")
		private WebElement ContinueToCheckout;
		@AndroidFindBy(accessibility = "Place Order")
		private WebElement PlaceOrder;
		@AndroidFindBy(accessibility = "MORNING, 9AM TO 12PM")
		private WebElement DeliveryTime;
		@AndroidFindBy(accessibility = "Cash")
		private WebElement Cash;
		@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"View Detailed Specifications\"]")
		private WebElement Details;
		public void setBuydevices() throws InterruptedException{
			waitForElementToAppearWithText(Details, driver, "View Detailed Specifications");
			Thread.sleep(2000);
			swipeActionNew("down");
			scrollText("Cash");
			scrollText("Cash");
			Cash.click();
			ContinueOrPreOder.click();
			Thread.sleep(2000);
			ContinueOrPreOder.click();
			Thread.sleep(2000);
			ContinueOrPreOder.click();
			Thread.sleep(2000);
			DeliveryTime.click();
			ContinueOrPreOder.click();
			Thread.sleep(2000);
			ContinueOrPreOder.click();
			Thread.sleep(2000);
			ContinueToCheckout.click();
			Thread.sleep(2000);
			PlaceOrder.click();
			Thread.sleep(10000);
		}
		
		public void swipeDownThree(){
			scrollText("Roaming Destinations");
			System.out.println("Scroll down to Romaing Destination Uk");
			
		}
}
