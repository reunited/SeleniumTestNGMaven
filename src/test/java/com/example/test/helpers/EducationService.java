package com.example.test.helpers;

import com.example.test.tests.base.BaseService;
import com.example.test.tests.pages.candidate.CandiateTitlePageAddNewRecordPage;
import com.example.test.tests.pages.candidate.CandidateTitlePage;
import com.example.test.tests.pages.candidate.CandidateTitlePageManageEducation;

public class EducationService extends BaseService {

	public static String TypedStateValue="";
	public static String TypedCountryValue="";
	public static String StartDate ="";
	public static String StartDateForRequiredFieldOnly ="";
	public static String EndDate="";

private String GenerateEndYear() {
		String[] arr = {"2007","2008","2009","2010","2011","2012","2013","2014"};
		int length = arr.length;
		int rand = (int) (Math.random() * length);
	return arr[rand];
}

public void CleanAllRecordFromEducationModule(CandidateTitlePage CTP,CandidateTitlePageManageEducation CTPME) {
	wait.visible(CTP.getResumeSquareResume());
	wait.clickable(CTP.getResumeSquareResume());
	as.click(CTP.getResumeSquareResume());
	wait.clickable(CTP.getResumeManageEducationInfo());
	wait.visible(CTP.getResumeManageEducationInfo());
	as.click(CTP.getResumeManageEducationInfo());
	try {
	while (CTPME.getDeleteRecord().isDisplayed()) 
	{	
		as.click(CTPME.getDeleteRecord());
		wait.clickable(CTPME.getYesDeleteRecordButton());
		as.click(CTPME.getYesDeleteRecordButton());
	}	 
		} catch(Exception e) {}	
}
	
private String ClickOnCountryUnderSearchCountryField(CandiateTitlePageAddNewRecordPage a) {	
	String CountryValue="";
	CountryValue = as.getText(a.getClickOnCountry());
	wait.clickable(a.getClickOnCountry());
	as.click(a.getClickOnCountry());
	return CountryValue;
}

private String GenerateStartYear() {
	String[] arr = {"1985","1986","1987","1988","1989","1990"};
	int length = arr.length;
	int rand = (int) (Math.random() * length);
return arr[rand];
}


public String GenerateEndYear2() {
	String[] arr2 = {"1999","2000","2001","2002","2003","2004","2005","2006"};
	int length2 = arr2.length;
	int rand2 = (int) (Math.random() * length2);
return arr2[rand2];
}

private String GenerateStartYear2(){
	String[] arr2 = {"1991","1992","1993","1994","1995","1996","1997","1998"};
	int length2 = arr2.length;
	int rand2 = (int) (Math.random() * length2);
return arr2[rand2];
}

private String TypeInStateDtopDownInputField(CandiateTitlePageAddNewRecordPage a){	
	String StateValue = "";
	
	if (a.getCountrySelectDropDownSearchResultToCopy().getText().equals("Albania")) 
	{
		String[] objects = {"Berat", "Elbasan", "Fier"};
        
        int length = objects.length;
		{
            int rand = (int) (Math.random() * length);
            StateValue  = objects[rand];
            wait.visible(a.getStateFieldArrowOpenButton());
            wait.visible(a.getCityInputField());
            wait.visible(a.getStartYear());
            wait.clickable(a.getStateFieldArrowOpenButton());
         	as.click(a.getStateFieldArrowOpenButton());
        	wait.visible(a.getStateDropDownInputField());
            as.type(a.getStateDropDownInputField(), StateValue);
        }
	}
	else if (a.getCountrySelectDropDownSearchResultToCopy().getText().equals("Australia"))
	{
		String[] objects = {"Queensland", "Tasmania", "Victoria"};
        
        int length = objects.length;
		{
            int rand = (int) (Math.random() * length);
            StateValue  = objects[rand];
            wait.visible(a.getStateFieldArrowOpenButton());
            wait.visible(a.getCityInputField());
            wait.visible(a.getStartYear());
            wait.clickable(a.getStateFieldArrowOpenButton());
            as.click(a.getStateFieldArrowOpenButton());
            wait.visible(a.getStateDropDownInputField());
            as.type(a.getStateDropDownInputField(), StateValue);
        }
	}
	else if (a.getCountrySelectDropDownSearchResultToCopy().getText().equals("Brazil"))
	{
		String[] objects = {"Acre", "Bahia", "Sergipe"};
        
        int length = objects.length;
		{
            int rand = (int) (Math.random() * length);
            StateValue  = objects[rand];
            wait.visible(a.getStateFieldArrowOpenButton());
            wait.visible(a.getCityInputField());
            wait.visible(a.getStartYear());
            wait.clickable(a.getStateFieldArrowOpenButton());
            as.click(a.getStateFieldArrowOpenButton());
            wait.visible(a.getStateDropDownInputField());
            as.type(a.getStateDropDownInputField(), StateValue);
        }
	}
	else if (a.getCountrySelectDropDownSearchResultToCopy().getText().equals("Bangladesh"))
	{
		String[] objects = {"Khulna bibhag", "Dhaka bibhag", "Barisal bibhag"};
        
        int length = objects.length;
		{
            int rand = (int) (Math.random() * length);
            StateValue  = objects[rand];
            wait.visible(a.getStateFieldArrowOpenButton());
            wait.visible(a.getCityInputField());
            wait.visible(a.getStartYear());
            wait.clickable(a.getStateFieldArrowOpenButton());
            as.click(a.getStateFieldArrowOpenButton());
            wait.visible(a.getStateDropDownInputField());
            as.type(a.getStateDropDownInputField(), StateValue);
        }
	}
	else if (a.getCountrySelectDropDownSearchResultToCopy().getText().equals("Cambodia"))
	{
	    String[] objects = {"Battambang", "Kampot", "Pousaat"};
        
        int length = objects.length;
		{
            int rand = (int) (Math.random() * length);
            StateValue  = objects[rand];
            wait.visible(a.getStateFieldArrowOpenButton());
            wait.visible(a.getCityInputField());
            wait.visible(a.getStartYear());
            wait.clickable(a.getStateFieldArrowOpenButton());
            as.click(a.getStateFieldArrowOpenButton());
            wait.visible(a.getStateDropDownInputField());
            as.type(a.getStateDropDownInputField(), StateValue);
        }
	}
	else if (a.getCountrySelectDropDownSearchResultToCopy().getText().equals("Cameroon"))
	{
		String[] objects = {"Far North", "Littoral", "South-West"};
        
        int length = objects.length;
		{
            int rand = (int) (Math.random() * length);
            StateValue  = objects[rand];
            wait.visible(a.getStateFieldArrowOpenButton());
            wait.visible(a.getCityInputField());
            wait.visible(a.getStartYear());
            wait.clickable(a.getStateFieldArrowOpenButton());
            as.click(a.getStateFieldArrowOpenButton());
            wait.visible(a.getStateDropDownInputField());
            as.type(a.getStateDropDownInputField(), StateValue);
        }
	}	
	else if (a.getCountrySelectDropDownSearchResultToCopy().getText().equals("Canada"))
	{
	    String[] objects = {"Ontario", "Yukon", "Manitoba"};
        
        int length = objects.length;
		{
            int rand = (int) (Math.random() * length);
            StateValue  = objects[rand];
            wait.visible(a.getStateFieldArrowOpenButton());
            wait.visible(a.getCityInputField());
            wait.visible(a.getStartYear());
            wait.clickable(a.getStateFieldArrowOpenButton());
            as.click(a.getStateFieldArrowOpenButton());
            wait.visible(a.getStateDropDownInputField());
            as.type(a.getStateDropDownInputField(), StateValue);
        }
	}
		else if (a.getCountrySelectDropDownSearchResultToCopy().getText().equals("Taiwan"))
	{
	    String[] objects = {"Hualien", "Miaoli", "Tainan"};
        
        int length = objects.length;
		{
            int rand = (int) (Math.random() * length);
            StateValue  = objects[rand];
            wait.visible(a.getStateFieldArrowOpenButton());
            wait.visible(a.getCityInputField());
            wait.visible(a.getStartYear());
            wait.clickable(a.getStateFieldArrowOpenButton());
            as.click(a.getStateFieldArrowOpenButton());
            wait.visible(a.getStateDropDownInputField());
            as.type(a.getStateDropDownInputField(), StateValue);   
        }
	}
	
	else if (a.getCountrySelectDropDownSearchResultToCopy().getText().equals("Tajikistan"))
	{
        String[] objects = {"Gorno-Badakhshan", "Khatlon", "Sughd"};
        
        int length = objects.length;
		{
            int rand = (int) (Math.random() * length);
            StateValue  = objects[rand];
            wait.visible(a.getStateFieldArrowOpenButton());
            wait.visible(a.getCityInputField());
            wait.visible(a.getStartYear());
            wait.clickable(a.getStateFieldArrowOpenButton());
            as.click(a.getStateFieldArrowOpenButton());
            wait.visible(a.getStateDropDownInputField()); 
            as.type(a.getStateDropDownInputField(), StateValue);
        }
	}
	return StateValue;
}

private void TypeInCountryDropDownInputField(CandiateTitlePageAddNewRecordPage a){
    String[] objects = {"Albania", "Australia", "Brazil", "Bangladesh", "Cambodia", "Cameroon", "Canada", "Taiwan", "Tajikistan"};

    int length = objects.length;
    int rand = (int) (Math.random() * length); 
    as.type(a.getCountrySearchField(), objects[rand]);
}

private void ClearAndTypeUniversityDegreeFields(CandiateTitlePageAddNewRecordPage a,String Degree, String UniversityName){
	wait.visible(a.getUniversitySchoolInputField());
	as.clear(a.getUniversitySchoolInputField());
	as.type(a.getUniversitySchoolInputField(), UniversityName);
	as.clear(a.getDegreeInputField());
	as.type(a.getDegreeInputField(), Degree);
}

private void ClearAndTypeCityField(CandiateTitlePageAddNewRecordPage a, String City) {
	as.clear(a.getCityInputField());
	as.type(a.getCityInputField(), City);
}

private void ClearAndTypeStudyFieldAndClickDropDown(CandiateTitlePageAddNewRecordPage b, String FieldOfStudy) {
	wait.clickable(b.getFieldOfStudyInputField());
	as.clear(b.getFieldOfStudyInputField());
	as.type(b.getFieldOfStudyInputField(), FieldOfStudy);	
	as.click(b.getCountryDropDown());
}

public void AddNewEducationRecordWithAllFieldsAndSave(CandiateTitlePageAddNewRecordPage a,String UniversityName,String Degree,String FieldOfStudy,String City) {
	try{
	ClearAndTypeUniversityDegreeFields(a, Degree, UniversityName);
	ClearAndTypeStudyFieldAndClickDropDown(a, FieldOfStudy);
	TypeInCountryDropDownInputField(a);
	TypedCountryValue = ClickOnCountryUnderSearchCountryField(a);
	wait.visible(a.getStateFieldArrowOpenButton());
	wait.clickable(a.getStateFieldArrowOpenButton());
	wait.visible(a.getUniversitySchoolInputField());
	wait.clickable(a.getUniversitySchoolInputField());
	as.click(a.getStateFieldArrowOpenButton());
	TypedStateValue = as.getText(a.getFirstSearchResultOfState());
	wait.clickable(a.getFirstSearchResultOfState());
	as.click(a.getFirstSearchResultOfState());
	ClearAndTypeCityField(a,City);
	wait.visible(a.getStartYearField());
	StartDate = GenerateStartYear();
	as.type(a.getStartYearField(), StartDate);
	EndDate = GenerateEndYear();
	as.type(a.getEndYearField(), EndDate);}
	catch(Exception e){}
}
	
public void AddNewEducationRecordWithAllFieldsAndCancel(CandiateTitlePageAddNewRecordPage a,String UniversityName,String Degree,String FieldOfStudy, String City) {
	ClearAndTypeUniversityDegreeFields(a, Degree, UniversityName);
	ClearAndTypeStudyFieldAndClickDropDown(a, FieldOfStudy);
	TypeInCountryDropDownInputField(a);
	ClickOnCountryUnderSearchCountryField(a);
	TypeInStateDtopDownInputField(a);
	wait.clickable(a.getSearchResultOfState());
	as.click(a.getSearchResultOfState());
	ClearAndTypeCityField(a,City);
	wait.visible(a.getStartYearField());
	as.type(a.getStartYearField(), GenerateStartYear());
	as.type(a.getEndYearField(), GenerateEndYear());
}

public void AddNewRecordWithRequiredFieldsonly(CandiateTitlePageAddNewRecordPage a, String UniversityName, String City) {
	as.clear(a.getUniversitySchoolInputField());
	as.type(a.getUniversitySchoolInputField(), UniversityName);
	as.click(a.getCountryDropDown());
	TypeInCountryDropDownInputField(a);
	TypedCountryValue = ClickOnCountryUnderSearchCountryField(a);
	TypedStateValue = TypeInStateDtopDownInputField(a);
	wait.clickable(a.getSearchResultOfState());
	as.click(a.getSearchResultOfState());
	ClearAndTypeCityField(a,City);
	StartDate = GenerateStartYear();
	as.type(a.getStartYearField(), StartDate);
}	

	public static String EditTypedStateValue="";
	public static String EditTypedCountryValue="";
	public static String EditStartDate ="";
	public static String EditEndDate="";

public void EditEducationRecord(CandidateTitlePage a, CandiateTitlePageAddNewRecordPage b, 
		String UniversityName, String City) {

	//click edit record button, type in ONLY REQUIRED fields new data
	//click save button
	EditTypedStateValue="";
	EditTypedCountryValue="";
	as.click(a.getResumeEducationEditIcon());
	as.clear(b.getUniversitySchoolField());
	as.click(b.getUniversitySchoolField());
	as.type(b.getUniversitySchoolField(), UniversityName);
	as.click(b.getCountryDropDown());
	EditTypedCountryValue = ClickOnCountryUnderSearchCountryField(b);
	as.click(b.getStateDropDownInputField());
//	EditTypedStateValue = ClickOnSearchResultOfState(b);
	as.clear(b.getCityInputField());
	as.type(b.getCityInputField(), City);	
	EditStartDate = GenerateStartYear2();
	as.type(b.getStartYearField(), EditStartDate);
} 
 
public void EditEducationRecordAllFields(CandidateTitlePage a, CandiateTitlePageAddNewRecordPage b, 
		String UniversityName, String Degree, String FieldOfStudy, String City) {
	//click edit record button, type in ALL fields new data
	wait.visible(b.getDegreeInputField());
	wait.clickable(b.getDegreeInputField());
	wait.visible(b.getUniversitySchoolInputField());
	wait.clickable(b.getUniversitySchoolInputField());
	wait.visible(b.getCityInputField());
	wait.clickable(b.getCityInputField());
	ClearAndTypeUniversityDegreeFields(b, Degree, UniversityName);
	ClearAndTypeStudyFieldAndClickDropDown(b,FieldOfStudy);
	TypeInCountryDropDownInputField(b);
	EditTypedCountryValue = ClickOnCountryUnderSearchCountryField(b);
	EditTypedStateValue = TypeInStateDtopDownInputField(b);
	
	wait.clickable(b.getSearchResultOfState());
	as.click(b.getSearchResultOfState());
	
	ClearAndTypeCityField(b,City);
	EditStartDate = GenerateStartYear2();
	as.type(b.getStartYearField(), EditStartDate);		
	EditEndDate = GenerateEndYear2();
	as.type(b.getEndYearField(), EditEndDate);
	//as.click(b.getDegreeInputField());
}

public void EditEducationRecordEmptyUniversitySchoolField(CandidateTitlePage a, CandiateTitlePageAddNewRecordPage b) {

	//click edit record clean university field, click (save) cancel button
	//make sure that record doesn't save and error message showing up
	wait.clickable(a.getResumeEducationEditIcon());
	wait.visible(a.getResumeEducationEditIcon());
	as.click(a.getResumeEducationEditIcon());
	as.clear(b.getUniversitySchoolInputField());
	wait.visible(b.getCityInputField());
	wait.visible(b.getDegreeInputField());
	wait.visible(b.getCancelButtonTextUnderForm());
	wait.clickable(b.getCancelButtonTextUnderForm());
	as.click(b.getCancelButtonTextUnderForm());
	as.checkText(b.getUniversitySchoolField(), b.getErrorMessageUniversitySchoolFieldText());
	as.click(b.getCancelButtonTextUnderForm());
}

public void EditEducationRecordEmptyCityField(CandidateTitlePage a, CandiateTitlePageAddNewRecordPage b) {
	
	//click edit record clean city field, then click cancel  (save) button
	//make sure that record doesn's save and error message showing up
	wait.visible(a.getResumeEducationEditIcon());
	wait.clickable(a.getResumeEducationEditIcon());
	as.click(a.getResumeEducationEditIcon());
	as.clear(b.getCityInputField());
	wait.visible(b.getCancelButtonTextUnderForm());
	wait.clickable(b.getCancelButtonTextUnderForm());
	as.click(b.getCancelButtonTextUnderForm());
	as.checkText(b.getErrorMessageCityField(), b.getErrorMessageCityFieldText());
}
}