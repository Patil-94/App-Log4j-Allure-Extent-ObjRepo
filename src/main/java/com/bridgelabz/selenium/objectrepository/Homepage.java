package com.bridgelabz.selenium.objectrepository;
import com.bridgelabz.selenium.utility.LogClass;
import com.bridgelabz.selenium.utility.ReadObjectRepository;
import org.openqa.selenium.By;
import java.io.IOException;

public class Homepage extends ReadObjectRepository  {

    public void logoutApplication() throws InterruptedException, IOException {
        Thread.sleep(1000);
        LogClass.info("clicking on account for logout into application");
        driver.findElement(By.xpath(ReadObjectRepository.getLocatorProperty(filePath,"clickOnAccount.xpath ")) ).click();
        Thread.sleep(2000);
        LogClass.info("clicking on logout for successfully logout into application");
        driver.findElement(By.xpath(ReadObjectRepository.getLocatorProperty(filePath,"logoutBtn.xpath"))).click();
        Thread.sleep(500);
    }
}
