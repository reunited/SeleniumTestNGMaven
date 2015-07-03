package com.example.test.tests.functional.test.education;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.example.test.helpers.EducationService;
import com.example.test.tests.base.BaseTestCandidate;
import com.example.test.tests.helpers.Links;
import com.example.test.tests.helpers.PageTitles;
import com.example.test.tests.helpers.Users;
import com.example.test.tests.pages.candidate.CandiateTitlePageAddNewRecordPage;
import com.example.test.tests.pages.candidate.CandidateTitlePage;
import com.example.test.tests.pages.candidate.CandidateTitlePageManageEducation;

public class F_ManageEducationInfoTest extends BaseTestCandidate {

	CandidateTitlePage CTP = null;
	CandidateTitlePageManageEducation CTPME = null;
	CandiateTitlePageAddNewRecordPage CTPANRP = null;
	Users U = null;
	PageTitles pt = null;
	Links l = null;

@Override
public void onBeforeClassAfter() {
	super.onBeforeClassAfter();
	
	CTP = initPage(CandidateTitlePage.class);
	CTPME = initPage(CandidateTitlePageManageEducation.class);
	CTPANRP = initPage(CandiateTitlePageAddNewRecordPage.class);
	U = initPage(Users.class);
	pt = initPage(PageTitles.class);
	l = initPage(Links.class);
}

private String VerifyStartText() {
	StringBuffer TemporaryVarible = new StringBuffer(CTPME.getVerifyStartDateOfStudyText().getText());
    String NewString=TemporaryVarible.delete(4,CTPME.getVerifyStartDateOfStudyText().getText().length()).toString(); 
	return NewString;
}

private void GoToEducationModuleAndAddNewRecord() {
	try{
	wait.visible(CTP.getResumeManageEducationInfo());
	wait.clickable(CTP.getResumeManageEducationInfo());
	as.click(CTP.getResumeManageEducationInfo());
	wait.visible(CTPME.getAddEducationRecordButton());
	wait.clickable(CTPME.getAddEducationRecordButton());
	as.click(CTPME.getAddEducationRecordButton());
	}
	catch(Exception e){}
}
private void  sendEnterInUniversityField(){
	CTPANRP.getUniversitySchoolInputField().sendKeys(Keys.ENTER);	
}

private void DeleteCreatedRecord() {
	wait.visible(CTPME.getDeleteRecord());
	wait.clickable(CTPME.getDeleteRecord());
	as.click(CTPME.getDeleteRecord());
	wait.visible(CTPME.getYesDeleteRecordButton());
	wait.clickable(CTPME.getYesDeleteRecordButton());
	as.click(CTPME.getYesDeleteRecordButton());	
}

private void CheckValues(String ExpectedStartDate, String ActualStartDate, String UniversityName, 
		String CityName, String StateValue, String CountryName) {
	
	wait.visible(CTPME.getVerifyUniversityStateCityCountryText());
	as.checkText(CTPME.getVerifyUniversityStateCityCountryText(), UniversityName+" ("+CityName+", "
			+ ""+StateValue+", "+CountryName+")");
	wait.visible(CTPME.getVerifyPresentText());
	as.checkText(CTPME.getVerifyPresentText(), "PRESENT");
	as.checkStrings(ExpectedStartDate, ActualStartDate);
}

private void CheckValues2(CandiateTitlePageAddNewRecordPage el, String Degree, String StartDate, String EndDate, 
		String UniversityName, String City, String State, String Country){
	wait.visible(CTPME.getVerifyUniversityStateCityCountryText());
	as.checkText(CTPME.getVerifyUniversityStateCityCountryText(), UniversityName + " "
			+ "("+City+", "+State+", "+Country+")");
	as.checkText(CTPME.getVerifyDegreeText(), Degree);
	wait.visible(CTPME.getVerifyEndDateOfStudyText());
	as.checkText(CTPME.getVerifyEndDateOfStudyText(), EndDate);
	as.checkStrings(StartDate, VerifyStartText());
}

@Test(enabled=true)
public void F_AddNewRecordAllFieldsTypeInAndCancelIt() {	
	
	//Open Education record page and click add new record. 
	//Enter data and click cancel, make sure that entered data doesn't save
	//and new record doenst't created
	// #1

	GoToEducationModuleAndAddNewRecord();
	getService(EducationService.class).AddNewEducationRecordWithAllFieldsAndCancel(CTPANRP, 
			U.getCandidateRandomUniversityName(), U.getDegree(), U.getFieldOfStudy(), U.getRandomCity1());
	wait.clickable(CTPANRP.getCancelButtonTextUnderForm());
	as.click(CTPANRP.getCancelButtonTextUnderForm());
	wait.visible(CTPME.getAddEducationRecordButton());
	as.isElementNotPresent(CTPME.getDeleteRecord());
	
}	

@Test(enabled=true)
public void F_AddNewRecordWithRequiredFieldsOnly() {
	
	//Open Education record page and add new record with REQUIRED fields only
	//then click save and verify saved data and displayed data
	// #2

	GoToEducationModuleAndAddNewRecord();
	wait.visible(CTPANRP.getUniversitySchoolInputField());
	getService(EducationService.class).AddNewRecordWithRequiredFieldsonly(CTPANRP, 
			U.getCandidateRandomUniversityName(), U.getRandomCity1());
	wait.clickable(CTPANRP.getSaveButtonTextUnderForm());
	as.click(CTPANRP.getUniversitySchoolInputField());
	as.click(CTPANRP.getSaveButtonTextUnderForm());
	wait.visible(CTP.getResumeEducationEditIcon());
	CheckValues(EducationService.StartDate, VerifyStartText(), U.getCandidateRandomUniversityName(),
			U.getRandomCity1(), EducationService.TypedStateValue,EducationService.TypedCountryValue );

	String TempStateValue = EducationService.TypedStateValue;
	String TempCountryValue = EducationService.TypedCountryValue;
	String TempStartDate = EducationService.StartDate;
	
	//edit required fields only and click cancel
	//verify that new data doesn't saved
	// #2.1

	as.click(CTP.getResumeEducationEditIcon());
	getService(EducationService.class).AddNewRecordWithRequiredFieldsonly(CTPANRP,
			U.getCandidateRandomUniversityName2(),U.getRandomCity2());
	as.click(CTPANRP.getCancelButtonTextUnderForm());
	CheckValues(TempStartDate,VerifyStartText(), U.getCandidateRandomUniversityName(), 
			U.getRandomCity1(),TempStateValue,TempCountryValue);

	//edit required fields only and click save
	//verify that new data saved
	// #2.2

	as.click(CTP.getResumeEducationEditIcon());
	getService(EducationService.class).AddNewRecordWithRequiredFieldsonly(CTPANRP, 
			U.getCandidateRandomUniversityName3(), U.getRandomCity3());
	as.click(CTPANRP.getSaveButtonUnderForm());
	CheckValues(EducationService.StartDate, VerifyStartText(),U.getCandidateRandomUniversityName3(),  
			U.getRandomCity3(),EducationService.TypedStateValue, EducationService.TypedCountryValue);

	//Click delete then cancel button
	//make sure that record wasn't delete
	// #2.3.1

	as.click(CTPME.getDeleteRecord());
	wait.visible(CTPME.getCancelDeleteRecord());
	as.click(CTPME.getCancelDeleteRecord());
	CheckValues(EducationService.StartDate, VerifyStartText(), U.getCandidateRandomUniversityName3(), 
			U.getRandomCity3(), EducationService.TypedStateValue,EducationService.TypedCountryValue);
	
	//Click delete then delete button
	//make sure that record deleted
	// #2.3.2

	DeleteCreatedRecord();
	wait.visible(CTPME.getAddEducationRecordButton());
	wait.clickable(CTPME.getAddEducationRecordButton());
	as.isElementNotPresent(CTPME.getDeleteRecord());
}

@Test(enabled=true)
public void F_AddNewRecordTypeAllFieldsAndSaveIt() {
	
	//Open Education record page and click add new record. 
	//Enter data in all fields, save it, verify that saved data is equal with showing data in records list
	// #3

	GoToEducationModuleAndAddNewRecord();
	wait.visible(CTPANRP.getUniversitySchoolInputField());
	getService(EducationService.class).AddNewEducationRecordWithAllFieldsAndSave(CTPANRP,
			U.getCandidateRandomUniversityName(), U.getDegree(), U.getFieldOfStudy(),U.getRandomCity1());
	
	wait.visible(CTPANRP.getSaveButtonUnderForm());
	wait.clickable(CTPANRP.getSaveButtonUnderForm());
	as.click(CTPANRP.getSaveButtonUnderForm());
	
	CheckValues2(CTPANRP, U.getDegree(), EducationService.StartDate, 
			EducationService.EndDate, U.getCandidateRandomUniversityName(), U.getRandomCity1(), 
			EducationService.TypedStateValue, EducationService.TypedCountryValue);

	//click edit link and type in new information, click cancel
	//Make sure that new typed data DOESN'T saved
	// #3.1

	as.click(CTP.getResumeEducationEditIcon());
	getService(EducationService.class).AddNewEducationRecordWithAllFieldsAndCancel(CTPANRP, 
			U.getCandidateRandomUniversityName2(), U.getDegree2(), U.getFieldOfStudy2(),U.getRandomCity2());
	
	wait.visible(CTPANRP.getCancelButtonTextUnderForm());
	as.click(CTPANRP.getCancelButtonTextUnderForm());
	
	CheckValues2(CTPANRP, U.getDegree(), EducationService.StartDate,  
			EducationService.EndDate, U.getCandidateRandomUniversityName(), U.getRandomCity1(), 
		EducationService.TypedStateValue, EducationService.TypedCountryValue);

	//click edit link and type in new information, save it
	//Make sure that new typed data saved
	// #3.2

	wait.visible(CTP.getResumeEducationEditIcon());
	wait.clickable(CTP.getResumeEducationEditIcon());
	as.click(CTP.getResumeEducationEditIcon());
	getService(EducationService.class).EditEducationRecordAllFields(CTP, CTPANRP, 
			U.getCandidateRandomUniversityName2(), U.getDegree2(), U.getFieldOfStudy2(),U.getRandomCity2());
	
	wait.visible(CTPANRP.getSaveButtonUnderForm());
	wait.clickable(CTPANRP.getSaveButtonUnderForm());
	as.click(CTPANRP.getSaveButtonUnderForm());
	
	CheckValues2(CTPANRP, U.getDegree2(), EducationService.EditStartDate, 
			EducationService.EditEndDate, U.getCandidateRandomUniversityName2(), U.getRandomCity2(), 
			EducationService.EditTypedStateValue, EducationService.EditTypedCountryValue);
	DeleteCreatedRecord();

}

@Test(enabled=true)
public void F_ChekingErrorMesagesWhenRequiredFieldsAreEmpty() {
	
	// MAKE SURE THAT SAVE BUTTON DOESN'T WORK, DATA DOESN'T SAVE, ERROR MESSAGE SHOWING UP
	// WHEN UNIVERSITY/SCHOOL And City Fields are EMPTY
	// #4

	GoToEducationModuleAndAddNewRecord();
	wait.visible(CTPANRP.getUniversitySchoolInputField());
	getService(EducationService.class).AddNewRecordWithRequiredFieldsonly(CTPANRP, 
			U.getCandidateRandomUniversityName2(), U.getRandomCity1());
	as.click(CTPANRP.getUniversitySchoolInputField());
	as.click(CTPANRP.getSaveButtonUnderForm());
	getService(EducationService.class).EditEducationRecordEmptyUniversitySchoolField(CTP, CTPANRP);
	getService(EducationService.class).EditEducationRecordEmptyCityField(CTP, CTPANRP);
	wait.visible(CTPANRP.getCancelButtonTextUnderForm());
	wait.clickable(CTPANRP.getCancelButtonTextUnderForm());
	as.click(CTPANRP.getCancelButtonTextUnderForm());
	DeleteCreatedRecord();
}

@Test(enabled=true)	
public void F_EducationInfo() {

	//NEGATIVE TESTING: Open edit education record page. Add new record save it,
	//click edit education record, clean university field and hit Enter.
	//Record with empty university fields must be not saved.
	// #5

	GoToEducationModuleAndAddNewRecord();
	wait.visible(CTPANRP.getUniversitySchoolInputField());
	getService(EducationService.class).AddNewRecordWithRequiredFieldsonly(CTPANRP, 
			U.getCandidateRandomUniversityName2(), U.getRandomCity1());
	as.click(CTPANRP.getUniversitySchoolInputField());
	as.click(CTPANRP.getSaveButtonUnderForm());
	wait.visible(CTP.getResumeEducationEditIcon());
	wait.clickable(CTP.getResumeEducationEditIcon());
	as.click(CTP.getResumeEducationEditIcon());
	as.clear(CTPANRP.getUniversitySchoolInputField());
	wait.clickable(CTPANRP.getDegreeInputField());
	as.click(CTPANRP.getDegreeInputField());
	sendEnterInUniversityField();
	as.click(CTPANRP.getCancelButtonTextUnderForm());
	wait.visible(CTPME.getVerifyUniversityStateCityCountryText());
	as.checkText(CTPME.getVerifyUniversityStateCityCountryText(), U.getCandidateRandomUniversityName2()+" "
			+ "("+U.getRandomCity1()+", "+EducationService.TypedStateValue+", "+EducationService.TypedCountryValue+")");
	DeleteCreatedRecord();
}
}