package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.pages.Login;
import com.bridgelabz.selenium.pages.Homepage;
import com.bridgelabz.selenium.listener.CustomListener;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

         /*test for Login Page and
    also check actual result and expected result */

@Listeners (CustomListener.class)
public class FacebookAppTest extends BaseClass {
    @Severity(SeverityLevel.CRITICAL)
    @Story("Test Login")
    @Description("Login to application with valid credentials")
    @Test
    public void loginTo_Application_with_valid_credentials() throws InterruptedException{
        //create object of Login Class
        Login login=new Login(driver);
        login.loginTo_Application();

        //validation
        String expectedUrl= driver.getCurrentUrl();
        System.out.println(expectedUrl);
        String actualUrl="https://www.facebook.com/?sk=welcome";
        Assert.assertEquals(actualUrl,expectedUrl);

    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("Test Logout")
    @Description("Logout to application with valid credentials")
    @Test
    public void logoutToApplication() throws InterruptedException {

        //create object of Login Class
        Login login=new Login(driver);
        login.loginTo_Application();

        //create object of Logout Class
        Homepage logout =new Homepage(driver) ;
        logout.logoutApplication();

        /*//validation
        String expectedurl= driver.getCurrentUrl();
        System.out.println(expectedurl);
        String actualdurl="https://www.facebook.com/?sk=welcome";
        Assert.assertEquals(actualdurl,expectedurl);*/
    }
}
