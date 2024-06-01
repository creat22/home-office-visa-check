package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.Pages.*;
import gov.uk.check.visa.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends TestBase {
    DurationOfStayPage durationOfStayPage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;
    ReasonForTravelPage reasonForTravelPage;
    ResultPage resultPage;
    SelectNationalityPage selectNationalityPage;
    StartPage startPage;
    WorkTypePage workTypePage;
    @BeforeMethod
    public void inIt(){
        durationOfStayPage= new DurationOfStayPage();
        startPage = new StartPage();
        workTypePage = new WorkTypePage();
        selectNationalityPage = new SelectNationalityPage();
        reasonForTravelPage = new ReasonForTravelPage();
        familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
        resultPage = new ResultPage();
    }
    @Test (groups = {"sanity" , "smoke" , "regression"})
    public void anAustralianCominToUKForTourism(){
        startPage.clickOnAcceptCookieButton();
        startPage.clickStartNow();
        selectNationalityPage.selectNationality("Australia");
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit("tourism");
        reasonForTravelPage.clickNextStepButton();
        //String actualResultMessage = resultPage.getResultMessage();
        //resultPage.confirmResultMessage("You will not need a visa to come to the UK");
    }
    @Test (groups = {"regression"})
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths(){
        startPage.clickOnAcceptCookieButton();
        startPage.clickStartNow();
        selectNationalityPage.selectNationality("Chile");
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit("work");
        reasonForTravelPage.clickNextStepButton();
        durationOfStayPage.selectLengthOfStay("longer_than_six_months");
        durationOfStayPage.clickNextStepButton();
        workTypePage.selectJobType("Health and care professional");
        workTypePage.clickNextStepButton();
        //String actualResultMessage = resultPage.getResultMessage();
        //resultPage.confirmResultMessage("You will not need a visa to come to the UK");
    }
    @Test (groups = {"sanity" , "regression"})
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(){
        startPage.clickOnAcceptCookieButton();
        startPage.clickStartNow();
        selectNationalityPage.selectNationality("Colombia");
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit("Join partner or family for a long stay");
        reasonForTravelPage.clickNextStepButton();
        //familyImmigrationStatusPage.selectImmigrationStatus("yes");
        //familyImmigrationStatusPage.clickNextStepButton();
        //String actualResultMessage = resultPage.getResultMessage();
        //resultPage.confirmResultMessage("You'll need a visa to join family or partner in the UK");


    }




}
