package com.saucelabs.appium.com.accenture.day1;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.List;

/**
 * Created by saikrisv on 26/04/16.
 */
public class AndroidDragAndDrop {
    private AppiumDriver<WebElement> driver;

    @Before
    public void setUp() throws Exception {
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "../../../apps/ApiDemos/bin");
        File app = new File(appDir, "ApiDemos-debug.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Android Emulator");
        capabilities.setCapability("platformVersion", "4.4");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "io.appium.android.apis");
        capabilities.setCapability("appActivity", ".ApiDemos");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @After
    public void tearDown() throws Exception {
        driver.closeApp();
        driver.quit();

    }

    @Test
    public void testDragAndDrop() throws InterruptedException {
        List<WebElement> demos = driver.findElements(By.className("android.widget.TextView"));
//        driver.findElement(By.id("android:id/text1")).click();
        demos.get(11).click();
//        Thread.sleep(5000);

        List<WebElement> elements = driver.findElements(By.className("android.widget.TextView"));
        elements.get(8).click();
        MobileElement calc = (MobileElement) driver.findElementById("io.appium.android.apis:id/drag_dot_1");
        TouchAction touchAction = new TouchAction(driver);
        touchAction.longPress(calc,2).perform();
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        touchAction.moveTo(driver.findElementById("io.appium.android.apis:id/drag_dot_2")).release().perform();
//        Thread.sleep(5000);
        Assert.assertEquals(driver.findElementById("io.appium.android.apis:id/drag_result_text").getText(), "Dropped!");
    }
}
