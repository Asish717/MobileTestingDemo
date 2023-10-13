package com.selenium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AmazonTestApp {
    public AndroidDriver driver;
    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities obj=new DesiredCapabilities();
        obj.setCapability("deviceName","emulator-5554");
        obj.setCapability("platformName","Android");
        obj.setCapability("platformVersion","9.0");
        obj.setCapability("appPackage","com.amazon.mShop.android.shopping");
        obj.setCapability("appActivity","com.amazon.mShop.home.HomeActivity");
        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),obj);
    }
    @Test
    public void searchAndAddProduct() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.id("com.amazon.mShop.android.shopping:id/skip_sign_in_button")).click();
        Thread.sleep(20000);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.findElement(By.id("com.amazon.mShop.android.shopping:id/chrome_search_hint_view")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("com.amazon.mShop.android.shopping:id/rs_search_src_text")).sendKeys("iphone 13");
        Thread.sleep(5000);
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        Thread.sleep(5000);
        driver.findElement(By.xpath("//android.")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//android.")).click();
    }
}
//Add to Cart
//iPhone 13 Mini, 128GB, Blue - Unlocked (Renewed)
