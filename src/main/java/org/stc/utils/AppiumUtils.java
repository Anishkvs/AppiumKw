package org.stc.utils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public abstract class AppiumUtils {

	public AppiumDriverLocalService service;

	
	public Double getFormattedAmount(String amount)
	{
		Double price = Double.parseDouble(amount.substring(1));
		return price;
		
	}
/*
	public List<HashMap<String, String>> getJsonData(String jsonFilePath) throws IOException {
		//System.getProperty("user.dir")+"//src//test//java//org//rahulshettyacademy//testData//eCommerce.json"
				// conver json file content to json string
				String jsonContent = FileUtils.readFileToString(new File(jsonFilePath),StandardCharsets.UTF_8);

				ObjectMapper mapper = new ObjectMapper();
				List<HashMap<String, String>> data = mapper.readValue(jsonContent,
						new TypeReference<List<HashMap<String, String>>>() {
						});

				return data;

			}
	*/
	public AppiumDriverLocalService startAppiumServer(String ipAddress,int port)
	{
		 service = new AppiumServiceBuilder().withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js"))
					.withIPAddress(ipAddress).usingPort(port).build();
				service.start();
				return service;
	}
	
	
	public void waitForElementToAppear(WebElement ele, AppiumDriver driver, String cart)
	{
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.attributeContains((ele),"text" , cart));
	}
	
	
	public String getScreenshotPath(String testCaseName, AppiumDriver driver) throws IOException
	{
		File source = driver.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"/reports/screenshot/"+testCaseName+".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;		
		
		
	}
	
	
}
