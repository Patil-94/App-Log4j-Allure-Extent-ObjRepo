package com.bridgelabz.selenium.objectrepository;
import com.bridgelabz.selenium.utility.LogClass;
import com.bridgelabz.selenium.utility.ReadObjectRepository;
import org.openqa.selenium.By;

import java.io.IOException;

public class Login extends ReadObjectRepository  {

    public void loginTo_Application() throws InterruptedException, IOException {
        Thread.sleep(300);
        LogClass.info("sending email using sendKeys");
        driver.findElement(By.id(ReadObjectRepository.getLocatorProperty(filePath,"userEmailID.id")) ).sendKeys("latikakhairnar10@gmail.com");
        Thread.sleep(500);
        LogClass.info("sending password using sendKeys");
        driver.findElement(By.name(ReadObjectRepository.getLocatorProperty(filePath,"userPassword.name") ) ).sendKeys("latika@123");
        Thread.sleep(1000);
        LogClass.info("clicking on loginBtn for logging into application");
        driver.findElement(By.name(ReadObjectRepository.getLocatorProperty(filePath,"loginBtn.name")) ).click();
        Thread.sleep(2000);
        LogClass.info("getting Title");
        driver.getTitle();
    }
}
