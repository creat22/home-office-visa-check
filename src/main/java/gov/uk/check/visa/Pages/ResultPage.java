package gov.uk.check.visa.Pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ResultPage extends Utility {

    public String getResultMessage() {

        return getTextFromElement(By.xpath("//div[@class='govuk-!-margin-bottom-6']/h2"));
    }
    public void confirmResultMessage(String expectedMessage){
        String actualResultMessage = getResultMessage();
        Assert.assertEquals(expectedMessage,actualResultMessage,"result message are not match");
    }
}

