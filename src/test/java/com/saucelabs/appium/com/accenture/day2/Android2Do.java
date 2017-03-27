package com.saucelabs.appium.com.accenture.day2;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.net.URL;
import java.util.List;

/**
 * Created by andreicontan on 31/01/2017.
 */
public class Android2Do {

    private AppiumDriver<AndroidElement> driver;
    WebDriverWait wait;

    @Before
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "EMULATOR-5554");
        capabilities.setCapability("platformVersion","6.0");
        capabilities.setCapability("appPackage", "com.guidedways.android2do");
        capabilities.setCapability("appActivity", "com.guidedways.android2do.v2.screens.MainAppActivity");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        wait = new WebDriverWait(driver,5);


    }


    @Test
    public void startApp2Do(){

        //List<AndroidElement> list = driver.findElementsById("listTitleIcon");//(By.id("listTitleIcon"));

        //Assert.assertEquals(8,list.size());
    }


    @Test
    public void todayTest() {
        Assert.assertNotNull(driver.
                findElementsById("com.guidedways.android2do:id/listTitleIconText"));
    }


   // @After
    //public void q(){
       // driver.closeApp();
   // }
}
