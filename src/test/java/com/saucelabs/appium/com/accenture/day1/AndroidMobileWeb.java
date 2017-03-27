package com.saucelabs.appium.com.accenture.day1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by andreicontan on 31/01/2017.
 */
public class AndroidMobileWeb {

    public WebDriver driver;
    WebDriverWait wait;


    @Before
    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities = DesiredCapabilities.android();

        capabilities.setCapability("browserName","chrome");
        capabilities.setCapability("deviceName","BUC4C16928011754");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("appPackage","com.android.chrome");
        capabilities.setCapability("appActivity","com.google.android.apps.chrome.Main");
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        wait = new WebDriverWait(driver, 5);



    }

    @Test
    public void testWebSite(){
        driver.navigate().to("http://www.romaniatesting.ro");
        Assert.assertEquals(driver.getTitle(), "Romanian Testing Conference 2017");
    }



}
