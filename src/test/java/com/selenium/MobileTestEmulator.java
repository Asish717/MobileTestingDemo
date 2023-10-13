package com.selenium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileTestEmulator {
    public static AndroidDriver driver;
    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities obj=new DesiredCapabilities();
        obj.setCapability("deviceName","emulator-5554");
        obj.setCapability("platformName","Android");
        obj.setCapability("platformVersion","9.0");
        obj.setCapability("appPackage","com.android.calculator2");
        obj.setCapability("appActivity","com.android.calculator2.Calculator");
        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),obj);
        System.out.println("Start Automation");
    }

    @Test(priority = 0)
    public void calculatorAdd(){
        WebElement num1=driver.findElement(By.id("com.android.calculator2:id/digit_2"));
        num1.click();
        WebElement plus=driver.findElement(AppiumBy.accessibilityId("plus"));
        plus.click();
        WebElement num2=driver.findElement(By.id("com.android.calculator2:id/digit_2"));
        num2.click();
        WebElement equal=driver.findElement(AppiumBy.accessibilityId("equals"));
        equal.click();
        String result=driver.findElement(By.id("com.android.calculator2:id/result")).getText();
        Assert.assertEquals(result,"4");
        System.out.println("Addition result verified");
    }

    @Test(priority = 1)
    public void calculatorSub(){
        WebElement num1=driver.findElement(By.id("com.android.calculator2:id/digit_2"));
        num1.click();
        WebElement sub=driver.findElement(AppiumBy.accessibilityId("minus"));
        sub.click();
        WebElement num2=driver.findElement(By.id("com.android.calculator2:id/digit_2"));
        num2.click();
        WebElement equal=driver.findElement(AppiumBy.accessibilityId("equals"));
        equal.click();
        String result=driver.findElement(By.id("com.android.calculator2:id/result")).getText();
        Assert.assertEquals(result,"0");
        System.out.println("Subtraction result verified");
    }

    @Test(priority = 2)
    public void calculatorMulti(){
        WebElement num1=driver.findElement(By.id("com.android.calculator2:id/digit_2"));
        num1.click();
        WebElement multi=driver.findElement(AppiumBy.accessibilityId("multiply"));
        multi.click();
        WebElement num2=driver.findElement(By.id("com.android.calculator2:id/digit_2"));
        num2.click();
        WebElement equal=driver.findElement(AppiumBy.accessibilityId("equals"));
        equal.click();
        String result=driver.findElement(By.id("com.android.calculator2:id/result")).getText();
        Assert.assertEquals(result,"4");
        System.out.println("Multiplication result verified");
    }

    @Test(priority = 3)
    public void calculatorDiv(){
        WebElement num1=driver.findElement(By.id("com.android.calculator2:id/digit_2"));
        num1.click();
        WebElement div=driver.findElement(AppiumBy.accessibilityId("divide"));
        div.click();
        WebElement num2=driver.findElement(By.id("com.android.calculator2:id/digit_2"));
        num2.click();
        WebElement equal=driver.findElement(AppiumBy.accessibilityId("equals"));
        equal.click();
        String result=driver.findElement(By.id("com.android.calculator2:id/result")).getText();
        Assert.assertEquals(result,"1");
        System.out.println("Division result verified");
    }
}
