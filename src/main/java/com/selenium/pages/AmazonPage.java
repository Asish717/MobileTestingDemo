package com.selenium.pages;

import com.selenium.base.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class AmazonPage  extends BaseClass {
    Logger logger=Logger.getLogger(AmazonPage.class.getName());
    //AndroidDriver driver;
    @FindBy(id = "com.amazon.mShop.android.shopping:id/skip_sign_in_button")
    WebElement skipButton;
    @FindBy(id = "com.amazon.mShop.android.shopping:id/chrome_search_hint_view")
    WebElement search;
    @FindBy(id = "com.amazon.mShop.android.shopping:id/rs_search_src_text")
    WebElement searchBar;
    public AmazonPage(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void searching() throws InterruptedException {
        Thread.sleep(5000);
        skipButton.click();
        Thread.sleep(20000);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        search.click();
        Thread.sleep(5000);
        searchBar.sendKeys("iphone 13");
        Thread.sleep(5000);
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        Thread.sleep(5000);
    }
}
