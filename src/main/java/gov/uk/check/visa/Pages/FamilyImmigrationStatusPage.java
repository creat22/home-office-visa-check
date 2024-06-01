package gov.uk.check.visa.Pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;

public class FamilyImmigrationStatusPage extends Utility {

    public void selectImmigrationStatus(String status) {
        switch (status) {
            case "Yes":
                clickOnElement(By.id("response-0"));
                break;
            case "No":
                clickOnElement(By.id("response-1"));
            default:
                System.out.println("Invalid selection");
        }
    }
    public void clickNextStepButton(){
        clickOnElement(By.xpath("//div[@id='current-question']/button"));
    }

}
