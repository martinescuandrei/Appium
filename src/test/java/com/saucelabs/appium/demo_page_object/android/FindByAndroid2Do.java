package com.saucelabs.appium.demo_page_object.android;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.RemoteWebElement;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by andrei.martinescu on 09-Feb-17.
 */


public class FindByAndroid2Do {

   // com.guidedways.android2do:id/v2_action_new_task
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.guidedways.android2do:id/v2_action_new_task\")")
    public AndroidElement plusButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageButton\")")
    public AndroidElement discardButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.guidedways.android2do:id/md_content\")")
    public AndroidElement discardTaskText;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.guidedways.android2do:id/md_buttonDefaultNeutral\")")
    public AndroidElement saveDraftButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.guidedways.android2do:id/md_buttonDefaultNegative\")")
    public AndroidElement cancelButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.guidedways.android2do:id/md_buttonDefaultPositive\")")
    public AndroidElement discardRedButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.guidedways.android2do:id/taskTypeIcon\")")
    public AndroidElement newTaskBullet;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.guidedways.android2do:id/taskName\")")
    public AndroidElement newTaskDescription;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.guidedways.android2do:id/taskTypePrioExpandIcon\")")
    public AndroidElement newTaskExpandIcon;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.guidedways.android2do:id/v2_action_quickadd\")")
    public AndroidElement quickAdd;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.guidedways.android2do:id/v2_action_save\")")
    public AndroidElement saveButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.guidedways.android2do:id/taskeditorBtnTypeTask\")")
    public AndroidElement typeTask;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.guidedways.android2do:id/taskeditorBtnTypeProject\")")
    public AndroidElement typeProject;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.guidedways.android2do:id/taskeditorBtnTypeChecklist\")")
    public AndroidElement typeChecklist;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.guidedways.android2do:id/ribbonText\")")
    public AndroidElement homeButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.guidedways.android2do:id/ribbonRightTail\")")
    public AndroidElement homeButtonTail;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.guidedways.android2do:id/taskNotePreview\")")
    public AndroidElement notes;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.guidedways.android2do:id/tagsIcon\")")
    public AndroidElement tagIcon;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.guidedways.android2do:id/taskTagsPreview\")")
    public AndroidElement tagText;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.guidedways.android2do:id/propertyClearButton\")")
    public AndroidElement clearbutton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.guidedways.android2do:id/secondaryLabel\")")
    public AndroidElement secondaryLabel;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.guidedways.android2do:id/newTaskQuickPresetDateToday\")")
    public AndroidElement todayButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.guidedways.android2do:id/newTaskQuickPresetDateTomorrow\")")
    public AndroidElement tomorrowButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.guidedways.android2do:id/newTaskQuickPresetDateDayAfterTomorrow\")")
    public AndroidElement dayAfterTomorrow;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.guidedways.android2do:id/newTaskQuickPresetDatePick\")")
    public AndroidElement pickDate;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.guidedways.android2do:id/newTaskQuickPresetTime1\")")
    public AndroidElement fistTimeOption;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.guidedways.android2do:id/newTaskQuickPresetTime2\")")
    public AndroidElement secondTimeOption;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.guidedways.android2do:id/newTaskQuickPresetTime3\")")
    public AndroidElement thirdTimeOption;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.guidedways.android2do:id/newTaskQuickPresetTime4\")")
    public AndroidElement fourTimeOption;





















    public void screenShot(String name,AndroidDriver driver) throws IOException {
        File screenShot = driver.getScreenshotAs(OutputType.FILE);
        File location = new File("screenshots");
        String screemShotname = location.getAbsolutePath() + File.separator + name + ".png";
        FileUtils.copyFile(screenShot, new File(screemShotname));
    }
}
