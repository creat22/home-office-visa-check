package gov.uk.check.visa.Pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;

public class SelectNationalityPage extends Utility {


    public void selectNationality(String nationality){
        selectByVisibleTextFromDropDown(By.cssSelector("#response"),nationality);
    }
    public void clickNextStepButton(){
        clickOnElement(By.xpath("//div[@id='current-question']/button"));
    }





}
