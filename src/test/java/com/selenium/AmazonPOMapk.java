package com.selenium;

import com.selenium.base.BaseClass;
import com.selenium.pages.AmazonPage;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class AmazonPOMapk extends BaseClass {
    Logger logger=Logger.getLogger(AmazonPOMapk.class.getName());
    AmazonPage amazonPage;
    @BeforeTest
    public void start() throws MalformedURLException {
        setup();
        amazonPage=new AmazonPage(driver);
    }
    @Test
    public void product() throws InterruptedException {
        amazonPage.searching();
    }
}
