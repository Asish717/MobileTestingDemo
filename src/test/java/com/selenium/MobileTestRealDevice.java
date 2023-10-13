package com.selenium;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileTestRealDevice {
    public static AndroidDriver driver;
    @BeforeTest
    public void setup() throws MalformedURLException, InterruptedException {
        DesiredCapabilities obj=new DesiredCapabilities();
        obj.setCapability("deviceName","f349382");
        obj.setCapability("platformName","Android");
        obj.setCapability("platformVersion","13");
        obj.setCapability("appPackage","com.oneplus.calculator");
        obj.setCapability("appActivity","com.android.calculator2.Calculator");
        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),obj);
        Thread.sleep(1000);
        System.out.println("Start Automation");
    }
    @Test(priority = 0)
    public void add(){
        driver.findElement(By.id("com.oneplus.calculator:id/digit_2")).click();
        driver.findElement(By.id("com.oneplus.calculator:id/op_add")).click();
        driver.findElement(By.id("com.oneplus.calculator:id/digit_2")).click();
        driver.findElement(By.id("com.oneplus.calculator:id/eq")).click();
        String result=driver.findElement(By.id("com.oneplus.calculator:id/result")).getText();
        Assert.assertEquals(result,"4");
    }
    @Test(priority = 1)
    public void Sub(){
        driver.findElement(By.id("com.oneplus.calculator:id/digit_2")).click();
        driver.findElement(By.id("com.oneplus.calculator:id/op_sub")).click();
        driver.findElement(By.id("com.oneplus.calculator:id/digit_2")).click();
        driver.findElement(By.id("com.oneplus.calculator:id/eq")).click();
        String result=driver.findElement(By.id("com.oneplus.calculator:id/result")).getText();
        Assert.assertEquals(result,"0");
    }
    @Test(priority = 2)
    public void multi(){
        driver.findElement(By.id("com.oneplus.calculator:id/digit_2")).click();
        driver.findElement(By.id("com.oneplus.calculator:id/op_mul")).click();
        driver.findElement(By.id("com.oneplus.calculator:id/digit_2")).click();
        driver.findElement(By.id("com.oneplus.calculator:id/eq")).click();
        String result=driver.findElement(By.id("com.oneplus.calculator:id/result")).getText();
        Assert.assertEquals(result,"4");
    }
    @Test(priority = 3)
    public void div(){
        driver.findElement(By.id("com.oneplus.calculator:id/digit_2")).click();
        driver.findElement(By.id("com.oneplus.calculator:id/op_div")).click();
        driver.findElement(By.id("com.oneplus.calculator:id/digit_2")).click();
        driver.findElement(By.id("com.oneplus.calculator:id/eq")).click();
        String result=driver.findElement(By.id("com.oneplus.calculator:id/result")).getText();
        Assert.assertEquals(result,"1");
    }
}
