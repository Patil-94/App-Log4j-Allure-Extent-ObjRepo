package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.pages.Login;
import com.bridgelabz.selenium.pages.Logout;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

         /*test for Login Page and
    also check actual result and expected result */

public class FacebookAppTest extends BaseClass {

    @Test
    public void loginTo_Application_with_valid_credentials() throws InterruptedException{
        //create object of Login Class
        Login login=new Login(driver);
        login.loginTo_Application();

        //validation
        String expectedurl= driver.getCurrentUrl();
        System.out.println(expectedurl);
        String actualdurl="https://www.facebook.com/?sk=welcome";
        Assert.assertEquals(actualdurl,expectedurl);

    }
    @Test
    public void logoutToApplication() throws InterruptedException {

        //create object of Login Class
        Login login=new Login(driver);
        login.loginTo_Application();

        //create object of Logout Class
        Logout logout =new Logout(driver) ;
        logout.logoutApplication();

        //validation
        String expectedurl= driver.getCurrentUrl();
        System.out.println(expectedurl);
        String actualdurl="https://www.facebook.com/?sk=welcome";
        Assert.assertEquals(actualdurl,expectedurl);
    }
}
