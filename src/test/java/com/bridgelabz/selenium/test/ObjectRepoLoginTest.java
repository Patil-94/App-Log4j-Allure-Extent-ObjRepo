package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.objectrepository.Login;
import com.bridgelabz.selenium.objectrepository.Homepage;
import com.bridgelabz.selenium.utility.LogClass;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class ObjectRepoLoginTest extends BaseClass {
    @Severity(SeverityLevel.CRITICAL)
    @Story("Test Login")
    @Description("Login to application with valid credentials")
    @Test
    public void loginApplication() throws IOException, InterruptedException {
        Login loginObject =new Login() ;
        loginObject.loginTo_Application();

        LogClass.info("This is validation");
        String expectedUrl= driver.getCurrentUrl();
        System.out.println(expectedUrl);
        String actualUrl="https://www.facebook.com/?sk=welcome";
        Assert.assertEquals(actualUrl,expectedUrl);

    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("Test Logout")
    @Description("Logout to application with valid credentials")
    @Test
    public void logoutToApplication() throws InterruptedException, IOException {

        //create object of Login Class

        Login loginObject =new Login() ;
        loginObject.loginTo_Application();

        //create object of Logout Class
         Homepage logout = new Homepage();
         logout.logoutApplication();
    }
}
