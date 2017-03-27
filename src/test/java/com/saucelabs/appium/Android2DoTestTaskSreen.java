package com.saucelabs.appium;

import com.saucelabs.appium.demo_page_object.android.ApiDemosListViewScreenByAllPossible;
import com.saucelabs.appium.demo_page_object.android.FindByAndroid2Do;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by andrei.martinescu on 09-Feb-17.
 */
public class Android2DoTestTaskSreen
{
    WebDriverWait wait;
    AndroidDriver driver;
    private FindByAndroid2Do apiDemosPageObject;
    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "EMULATOR-5554");
        capabilities.setCapability("platformVersion", "6.0");
        capabilities.setCapability("appPackage", "com.guidedways.android2do");
        capabilities.setCapability("appActivity", "com.guidedways.android2do.v2.screens.MainAppActivity");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        wait = new WebDriverWait(driver, 5);

        apiDemosPageObject = new FindByAndroid2Do();
        PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS),
                apiDemosPageObject);
        apiDemosPageObject.plusButton.click();
        driver.hideKeyboard();
    }
//driver.hidekeyboard
    @Test
    public void PressDiscardButton() throws IOException {

            apiDemosPageObject.discardButton.click();

            Assert.assertEquals(apiDemosPageObject.discardTaskText.getText(), "Discard new task?");
            Assert.assertEquals(apiDemosPageObject.saveDraftButton.getText(), "Save Draft");
            Assert.assertEquals(apiDemosPageObject.cancelButton.getText(), "Cancel");
            Assert.assertEquals(apiDemosPageObject.discardRedButton.getText(), "Discard");
            apiDemosPageObject.screenShot("PressDiscardButton",driver);
            apiDemosPageObject.cancelButton.click();

    }

    @Test
    public void QuickAddButtonPresent() throws IOException {

            Assert.assertEquals(apiDemosPageObject.quickAdd.getAttribute("clickable"), "true");
            apiDemosPageObject.screenShot("QuickAddButtonPresent",driver);

    }

    @Test
    public void SaveButtonPresent() throws IOException {

            Assert.assertEquals(apiDemosPageObject.saveButton.getAttribute("clickable"), "true");
            apiDemosPageObject.screenShot("SaveButtonPresent",driver);
    }

    @Test
    public void TaskScreenBullet() throws IOException {
        Assert.assertEquals(apiDemosPageObject.newTaskBullet.getAttribute("clickable"),"true");
        apiDemosPageObject.screenShot("TaskScreenBullet",driver);
    }

    @Test
    public void TaskDescription() throws IOException {
        Assert.assertEquals(apiDemosPageObject.newTaskDescription.getAttribute("clickable"),"true");
        apiDemosPageObject.screenShot("TaskDescription",driver);
    }

    @Test
    public void ExpandIcon() throws IOException {
        Assert.assertEquals(apiDemosPageObject.newTaskExpandIcon.getAttribute("clickable"),"true");
        apiDemosPageObject.screenShot("ExpandIcon",driver);
    }

    @Test
    public void ExpandIconEnabled() throws IOException {
        Assert.assertEquals(apiDemosPageObject.typeChecklist.getAttribute("clickable"),"true");
        Assert.assertEquals(apiDemosPageObject.typeProject.getAttribute("clickable"),"true");
        Assert.assertEquals(apiDemosPageObject.typeTask.getAttribute("clickable"),"true");
        apiDemosPageObject.screenShot("ExpandIconEnabled",driver);
    }
//
    @Test(expected = NoSuchElementException.class)
    public void ExpandIconDisabled() throws IOException {

        apiDemosPageObject.newTaskExpandIcon.click();

        apiDemosPageObject.screenShot("ExpandIconDisabled",driver);

        apiDemosPageObject.typeChecklist.click();
    //    apiDemosPageObject.typeProject.click();
     //   apiDemosPageObject.typeTask.click();

    }


    @Test
    public void HomeButtonPresent() throws IOException {
        Assert.assertEquals(apiDemosPageObject.homeButton.getAttribute("clickable"),"false");
        apiDemosPageObject.screenShot("HomeButtonPresent",driver);
    }


    @Test
    public void HomeButtonTailPresent() throws IOException {
        Assert.assertEquals(apiDemosPageObject.homeButtonTail.getAttribute("clickable"),"false");
        apiDemosPageObject.screenShot("HomeButtonTailPresent",driver);
    }


    @Test
    public void NotesButtonPresent() throws IOException {
        Assert.assertEquals(apiDemosPageObject.notes.getAttribute("clickable"),"true");
        apiDemosPageObject.screenShot("NotesButtonPresent",driver);
    }

    @Test
    public void TagIconPresent() throws IOException {
        Assert.assertEquals(apiDemosPageObject.tagIcon.getAttribute("clickable"),"true");
        apiDemosPageObject.screenShot("TagIconPresent",driver);
    }

    @Test
    public void TagTextPresent() throws IOException {
        Assert.assertEquals(apiDemosPageObject.tagText.getAttribute("clickable"),"true");
        apiDemosPageObject.screenShot("TagTextPresent",driver);
    }

    @Test
    public void ClearButtonPresent() throws IOException {
        Assert.assertEquals(apiDemosPageObject.clearbutton.getAttribute("clickable"),"true");
        apiDemosPageObject.screenShot("ClearButtonPresent",driver);
    }


    @Test
    public void TodayButton() throws IOException {
        Assert.assertEquals(apiDemosPageObject.todayButton.getAttribute("clickable"),"true");
        apiDemosPageObject.screenShot("TodayButton",driver);
    }

    @Test
    public void TomorrowButton() throws IOException {
        Assert.assertEquals(apiDemosPageObject.tomorrowButton.getAttribute("clickable"),"true");
        apiDemosPageObject.screenShot("TomorrowButton",driver);
    }

    @Test
    public void DayAfterTomorrowButton() throws IOException {
        Assert.assertEquals(apiDemosPageObject.dayAfterTomorrow.getAttribute("clickable"),"true");
        apiDemosPageObject.screenShot("DayAfterTomorrowButton",driver);
    }

    @Test
    public void PickDate() throws IOException {
        Assert.assertEquals(apiDemosPageObject.pickDate.getAttribute("clickable"),"true");
        apiDemosPageObject.screenShot("PickDate",driver);
    }

    @Test
    public void SecondaryLabelPresent() throws IOException {
        Assert.assertEquals(apiDemosPageObject.secondaryLabel.getAttribute("clickable"),"false");
        apiDemosPageObject.screenShot("SecondaryLabelPresent",driver);
    }

    @Test
    public void FirstTimeOption() throws IOException {
        Assert.assertEquals(apiDemosPageObject.fistTimeOption.getAttribute("clickable"),"true");
        apiDemosPageObject.screenShot("FirstTimeOption",driver);
    }

    @Test
    public void SecondTimeOption() throws IOException {
        Assert.assertEquals(apiDemosPageObject.secondTimeOption.getAttribute("clickable"),"true");
        apiDemosPageObject.screenShot("SecondTimeOption",driver);
    }

    @Test
    public void ThirdTimeOption() throws IOException {
        Assert.assertEquals(apiDemosPageObject.thirdTimeOption.getAttribute("clickable"),"true");
        apiDemosPageObject.screenShot("ThirdTimeOption",driver);
    }

    @Test
    public void FourTimeOption() throws IOException {
        Assert.assertEquals(apiDemosPageObject.fourTimeOption.getAttribute("clickable"),"true");
        apiDemosPageObject.screenShot("FourTimeOption",driver);
    }

    @After
    public void tearDown()
    {
        driver.closeApp();
    }


}
