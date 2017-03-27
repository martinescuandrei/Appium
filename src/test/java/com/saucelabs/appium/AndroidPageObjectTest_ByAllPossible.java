package com.saucelabs.appium;

import com.saucelabs.appium.demo_page_object.android.ApiDemosListViewScreenByAllPossible;
import com.saucelabs.appium.demo_page_object.android.ApiDemosListViewScreenChained;
import com.saucelabs.appium.demo_page_object.android.ApiDemosListViewScreenSimple;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Please read about Page Object design pattern here:
 *  https://code.google.com/p/selenium/wiki/PageObjects
 *  
 *  Please look at:
 *  {@link ApiDemosListViewScreenSimple}
 *  {@link ApiDemosListViewScreenChained}
 *  {@link ApiDemosListViewScreenByAllPossible}
 *
 */
public class AndroidPageObjectTest_ByAllPossible {

	private WebDriver driver;
	private ApiDemosListViewScreenByAllPossible apiDemosPageObject;
	
	@Before
	public void setUp() throws Exception {
		File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "../../../apps/ApiDemos/bin");
	    File app = new File(appDir, "ApiDemos-debug.apk");
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
	    capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	    driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        
	    apiDemosPageObject = new ApiDemosListViewScreenByAllPossible();
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), 
				apiDemosPageObject);
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	/**
	 * Page Object best practice is to describe interactions with target 
	 * elements by methods. These methods describe business logic of the page/screen.
	 * Here test interacts with lazy instantiated elements directly.
	 * It was done so just for obviousness
	 */
	
	@Test
	public void findAllElementTest(){
		Assert.assertNotEquals(null, apiDemosPageObject.findAllElementView.getAttribute("text"));
	}	
	
	@Test
	public void findAllElementsTest(){
		Assert.assertNotEquals(0, apiDemosPageObject.findAllElementViews.size());
	}	
}
