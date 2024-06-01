package gov.uk.check.visa.Pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StartPage extends Utility {

    public void clickOnAcceptCookieButton(){
        WebElement acceptCookie = driver.findElement(By.xpath("//button[contains(text(),'Accept additional cookies')]"));
        clickOnElement(acceptCookie);
    }

    public void clickStartNow(){
        WebElement startNow = driver.findElement(By.xpath("//*[@id='content']/div[2]/div[1]/article/section[1]/a"));
        startNow.click();

    }



}
