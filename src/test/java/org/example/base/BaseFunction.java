package org.example.base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseFunction {
    public static AndroidDriver driver;
    public void setAppiumLocal() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid("emulator-5554")
                .setApp("/Users/olvilora/Documents/Automation/APK/App-Login_Tes_4.0_Apkpure.apk");
        driver = new AndroidDriver(
                // Set appium port running in local
                new URL("http://127.0.0.1:4723"), options
        );
    }

    public void quitAppium(){
        driver.quit();
    }
}
