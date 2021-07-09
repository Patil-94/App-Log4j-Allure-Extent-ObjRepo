package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.utility.LogClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 * Description- created Logout-page class for logout in the application
 * created Logout method for logout into application
 */

public class Logout extends BaseClass {

    /* @Description - Using FindBy for locating elements */

    @FindBy(xpath = "//img[@class='s45kfl79 emlxlaya bkmhp75w spb7xbtv']")
    WebElement clickonAccount;

    @FindBy(xpath = "//span[@class='d2edcug0 hpfvmrgz qv66sw1b c1et5uql lr9zc1uh a8c37x1j keod5gw0 nxhoafnm aigsh9s9 d3f4x2em fe6kdd0r mau55g9w c8b282yb iv3no6db jq4qci2q a3bd9o3v ekzkrbhg oo9gr5id hzawbc8m'][contains(.,'Log Out')]")
    WebElement logoutBtn;

    public Logout(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public void logoutApplication() throws InterruptedException
    {
        Thread.sleep(500);
        LogClass.info("clicking on account for logout into application");
        clickonAccount.click();
        Thread.sleep(500);
        LogClass.info("clicking on logout for successfully logout into application");
        logoutBtn.click();
        Thread.sleep(500);
    }
}
