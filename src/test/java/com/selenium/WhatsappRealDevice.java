package com.selenium;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class WhatsappRealDevice {
    public AndroidDriver driver;
    @Test
    public void setup() throws MalformedURLException, InterruptedException {
        DesiredCapabilities obj=new DesiredCapabilities();
        obj.setCapability("deviceName","f349382");
        obj.setCapability("platformName","Android");
        obj.setCapability("platformVersion","13");
        obj.setCapability("appPackage","com.whatsapp");
        obj.setCapability("appActivity","com.whatsapp.Conversation");
        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),obj);
        Thread.sleep(1000);
        System.out.println("Start Automation");
    }
}
