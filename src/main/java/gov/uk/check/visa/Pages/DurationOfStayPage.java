package gov.uk.check.visa.Pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;

public class DurationOfStayPage extends Utility {
    public void selectLengthOfStay(String moreOrLess) {
        switch (moreOrLess) {
            case "6 months or less":
                clickOnElement(By.cssSelector("#response-0"));
                break;
            case "longer than 6 months":
                clickOnElement(By.cssSelector("#response-1"));
                break;
        }
    }
    public void clickNextStepButton(){
        clickOnElement(By.xpath("//div[@id='current-question']/button"));
    }
}
