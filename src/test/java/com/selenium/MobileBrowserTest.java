package com.selenium;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileBrowserTest {
    public AndroidDriver driver;
    @Test
    public void setup() throws MalformedURLException, InterruptedException {
        DesiredCapabilities obj=new DesiredCapabilities();
        obj.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        obj.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        obj.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
        //obj.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
        obj.setCapability("app","E:\\MobileDemo\\src\\main\\resources\\chrome.apk");
        obj.setCapability("chromeOptions", ImmutableMap.of("demo",false));
        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),obj);
        //Thread.sleep(2000);
        driver.get("https://www.amazon.com");
        Thread.sleep(30000);
        driver.findElement(By.xpath("//*[text()='Search Amazon']")).sendKeys("Iphone");

    }
}
