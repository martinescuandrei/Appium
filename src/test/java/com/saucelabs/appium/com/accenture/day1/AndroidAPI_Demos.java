package com.saucelabs.appium.com.accenture.day1;

import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AndroidAPI_Demos {

//    private AppiumDriver<WebElement> driver;

    AndroidDriver<WebElement> driver;

    @Before
    public void setUp() throws Exception {
//        File classpathRoot = new File(System.getProperty("user.dir"));
//        File appDir = new File(classpathRoot, "../../../apps/ApiDemos/bin");
//        File app = new File(appDir, "ApiDemos-debug.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Android Snow");
        capabilities.setCapability("platformVersion", "5.1");
//        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "io.appium.android.apis");
        capabilities.setCapability("appActivity", ".ApiDemos");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void testElementsFromAPIDemoList(){
//        MobileElement mel = driver.findElement(MobileBy.className("android"));

        WebElement el = driver.findElement(By.xpath(".//*[@text='Animation']"));

//        WebElement el = driver.findElement(By.className("android.widget.TextView"));
        assertEquals("Animation", el.getText());
        el = driver.findElementByClassName("android.widget.TextView");
        assertEquals("API Demos", el.getText());
        el = driver.findElement(By.xpath(".//*[@text='App']"));
        el.click();
        List<WebElement> els = driver.findElementsByClassName("android.widget.TextView");
        assertEquals("Activity", els.get(2).getText());
    }


}
