package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.utility.LogClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/*
 * Description- created Login-page class for logging in the application
 * created Login method for logging into application
*/

public class Login extends BaseClass {

    /* @Description - Using FindBy for locating elements */

    @FindBy(id = "email")
    WebElement emailid;

    @FindBy(name = "pass")
    WebElement userPassword;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginBtn;

      /*create a parameterized constuctor.
       * initialization
       */
    public Login(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public void loginTo_Application() throws InterruptedException {
        Thread.sleep(300);
        LogClass.info("sending email using sendkeys");
        emailid.sendKeys("latikakhairnar10@gmail.com");
        Thread.sleep(200);
        LogClass.info("sending password using sendkeys");
        userPassword.sendKeys("latika@123");
        Thread.sleep(200);
        LogClass.info("clicking on loginBtn for logging into application");
        loginBtn.click();
        Thread.sleep(200);
        LogClass.info("getting Title");
        driver.getTitle();
    }
}

