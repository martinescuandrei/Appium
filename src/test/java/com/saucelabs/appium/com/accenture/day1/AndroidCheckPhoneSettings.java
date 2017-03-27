package com.saucelabs.appium.com.accenture.day1;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.List;

public class AndroidCheckPhoneSettings {

  private AppiumDriver<WebElement>            driver;
  private static final String     url    = "http://127.0.0.1:4723/wd/hub";

  @Test
  public void apiDemo() throws Exception {
    driver.scrollTo("about phone").click();
    List<WebElement> details = driver.findElements(By.id("android:id/summary"));
    Assert.assertEquals("6.0", details.get(2).getText());
  }


  @Before
  public void setUp() throws Exception {
    final DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("deviceName", "Android Emulator");
    capabilities.setCapability("appPackage", "com.android.settings");
    capabilities.setCapability("appActivity", ".Settings");
    driver = new AndroidDriver<>(new URL(url), capabilities);
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
  }
}