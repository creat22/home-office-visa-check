package gov.uk.check.visa.Pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WorkTypePage extends Utility {
    public void selectJobType(String job){
        List<WebElement> jobTypeList = driver.findElements(By.xpath("//div[@class='govuk-radios']//label[text()]"));

        for(WebElement element:jobTypeList){
            if(element.getText().contains(job)){
                clickOnElement(element);
                break;
            }
        }
    }
    public void clickNextStepButton(){
        clickOnElement(By.xpath("//div[@id='current-question']/button"));
    }
}
