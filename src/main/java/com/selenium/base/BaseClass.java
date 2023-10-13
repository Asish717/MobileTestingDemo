package com.selenium.base;

import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseClass {
    Logger logger=Logger.getLogger(BaseClass.class.getName());
    public AndroidDriver driver;
    public void setup() throws MalformedURLException {
        PropertyConfigurator.configure("E:\\MobileDemo\\log4j.properties");
        DesiredCapabilities obj=new DesiredCapabilities();
        obj.setCapability("deviceName","emulator-5554");
        obj.setCapability("platformName","Android");
        obj.setCapability("platformVersion","9.0");
        obj.setCapability("appPackage","com.amazon.mShop.android.shopping");
        obj.setCapability("appActivity","com.amazon.mShop.home.HomeActivity");
        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),obj);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        logger.info("Starting amazon app");
    }
}
