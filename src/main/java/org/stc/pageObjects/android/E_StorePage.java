package org.stc.pageObjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.stc.utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class E_StorePage extends AndroidActions {

	AndroidDriver driver;

	public E_StorePage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "Switch to stc")
	private WebElement SwitchToStc;

	public void setSwitchToStc() throws InterruptedException {
		SwitchToStc.click();
	}
	@AndroidFindBy(accessibility = "Mobile and Internet")
	private WebElement MobileAndInternet;

	public void setMobileAndInternet() throws InterruptedException {
		MobileAndInternet.click();
	}
	
	@AndroidFindBy(accessibility = "SMARTPHONE_List_0")
	private WebElement SmartPhones;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"SMARTPHONE_ViewAll\"]/android.widget.ImageView")
	private WebElement SmartPhonesViewAll;
	
	public void setScrollSmartPhones() throws InterruptedException {
		System.out.println("Scroll to SmartPhones");
		scrollText("Smartphones");
	}
	public void setSmartPhones() throws InterruptedException {
		SmartPhones.click();
	}
	public void setSmartPhonesViewAll() throws InterruptedException {
		SmartPhonesViewAll.click();
	}
	@AndroidFindBy(accessibility = "Continue")
	private WebElement Continue;

	public void setContinue() throws InterruptedException {
		Continue.click();
	}
	
	@AndroidFindBy(accessibility = "DeviceListFilter")
	private WebElement Filter;

	public void setFilter() throws InterruptedException {
		Filter.click();
	}
	@AndroidFindBy(accessibility = "Filter_CheckBox_0")
	private WebElement FilterBrandOne;
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Show Selected')]")
	private WebElement ShowSelected;
	public void setFilterBrandOne() throws InterruptedException {
		FilterBrandOne.click();
		Thread.sleep(2000);
		ShowSelected.click();
	}
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"header-search-icon\"]/android.widget.ImageView")
	private WebElement Search;
	@AndroidFindBy(xpath = "//android.widget.EditText")
	private WebElement EnterWord;
	public void setSearch() throws InterruptedException {
		Search.click();
		EnterWord.sendKeys("Apple");
		Thread.sleep(4000);
		driver.navigate().back();
		driver.navigate().back();
	}
}
