package com.bridgelabz.selenium.base;

import com.bridgelabz.selenium.utility.LogClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {

    public static WebDriver driver;

    //execute before test
    @BeforeTest

    public void setup() throws InterruptedException
    {
        LogClass.info("This test is start");
        //Handling browser level show notification popup window
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");

        //launch cromedriver
        LogClass.info("launching the browser");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver(chromeOptions);

        /*  launch facebook url and maximaize windows */
        LogClass.info("This is navigating the url");
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(500);
    }


    //execute after test
    @AfterTest

    /* teardown method for close the browser*/

    public void tearDown()
    {
        driver.close();
    }

}