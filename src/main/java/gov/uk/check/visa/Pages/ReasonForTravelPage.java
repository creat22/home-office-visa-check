package gov.uk.check.visa.Pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ReasonForTravelPage extends Utility {
    public void selectReasonForVisit(String reason){
        List<WebElement> reasonForVisitList = driver.findElements(By.xpath("//div[@class='govuk-radios']//label[text()]"));

        for(WebElement element:reasonForVisitList){
            if(element.getText().contains(reason)){
                clickOnElement(element);
                break;
            }
        }
    }
    public void clickNextStepButton(){
            clickOnElement(By.xpath("//div[@id='current-question']/button"));
        }
    }

