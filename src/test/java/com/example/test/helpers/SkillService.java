package com.example.test.helpers;

import static org.testng.Assert.*;
import org.openqa.selenium.WebElement;

import com.example.test.tests.base.BaseService;
import com.example.test.tests.pages.candidate.CandidateTitlePage;
import com.example.test.tests.pages.candidate.CandidateTitlePageManageSkills;

public class SkillService extends BaseService {
	
	private static String BCSkill;
	private static String ELSkill;
	private static String MSSkill;
    private static String PLSkill;
    private static String PPSkill;
    private static String WFSkill;
    private static String BCDate;
	private static String ELDate;
	private static String MSDate;
    private static String PLDate;
    private static String PPDate;
    private static String WFDate;
    private static String BCLevel;
 	private static String ELLevel;
 	private static String MSLevel;
 	private static String PLLevel;
    private static String PPLevel;
    private static String WFLevel;
	private String Row;

    private String RowSkill;
    
    
public void AddSkill(CandidateTitlePageManageSkills a, String skill) {
	wait.visible(a.getAddSkillDropDownArrow());
    wait.clickable(a.getAddSkillDropDownArrow());
    as.click(a.getAddSkillDropDownArrow());
    wait.clickable(a.getDropDownField());
    wait.visible(a.getDropDownField());
    as.type(a.getDropDownField(), skill);
    wait.clickable(a.getMatchingSkillAfterTyping());
    as.click(a.getMatchingSkillAfterTyping());
}
    
public String TypeIntoOverviewSkillDropDown(WebElement el) {
	wait.visible(el);
    String[] objects = { "Beginner", "Intermediate", "Good", "Strong", "Expert" };
    													        
    				int length = objects.length; {
    					int rand = (int) (Math.random() * length);
    					RowSkill = objects[rand];
    					wait.visible(el);
    					as.type(el, RowSkill);
    					return RowSkill;
    } 
}
    
public String TypeIntoOverviewYearDropDown(WebElement el) {
	String[] objects = { "2 years", "3 years", "4 years", "5 years", "6 years", "7 years", "8 years", "9 years", "10 years",
"11 years", "12 years", "13 years", "14 years", "15 years", "16 years", "17 years", "18 years", "19 years", "20 years" };
			        
	int length = objects.length; {
		int rand = (int) (Math.random() * length);
	    Row = objects[rand];
	    as.type(el, Row);
	    return Row;
	}
}
    	
public void TypeAndAddRandomBussinessCommunicationSkill(CandidateTitlePageManageSkills a) {
	wait.visible(a.getHeader());
	wait.visible(a.getSubHeader());
		{
	        String[] objects = { 
	        		
	        		"Business Management",  
	        		"Communication Skills",
	        		"SCRUM"};
	        
	        int length = objects.length;
			{
	            int rand = (int) (Math.random() * length);
	            BCSkill = objects[rand];
	            AddSkill(a, BCSkill);
			}
		}
	}
	
	public void TypeAndAddRandomElectricalSkill(CandidateTitlePageManageSkills a) {
		wait.visible(a.getHeader());
		wait.visible(a.getSubHeader());
		{
	        String[] objects = { 
	        		
	        		"Circuit Design",  
	        		"FPGA Testing",
	        		"Statistical Analyis",
	        		"Communication",
	        		"Memory Design", 
	        		"Digital Signaling Processing",
	        		"TS/SCI security clearance"};
	        
	        int length = objects.length;
			{
	            int rand = (int) (Math.random() * length);
	            ELSkill = objects[rand];
	            AddSkill(a, ELSkill);
			}
		}
	}
	
	public void TypeAndAddRandomManagementSkill(CandidateTitlePageManageSkills a) {
		wait.visible(a.getHeader());
		wait.visible(a.getSubHeader());
		{
	        String[] objects = { 
	        		
	        		"Budgeting",  
	        		"Career Development",
	        		"Employee Relations",
	        		"Leadership",
	        		"Product Life Management",
	        		"Public Speaking",
	        		"Reports",
	        		"Customer Relationship Management"};
	        
	        int length = objects.length;
			{
	            int rand = (int) (Math.random() * length);
	            MSSkill = objects[rand];
	            AddSkill(a, MSSkill);
			}
		}
	}
	
	public void TypeAndAddRandomProgrammingLanguagesSkill(CandidateTitlePageManageSkills a) {
		wait.visible(a.getHeader());
		wait.visible(a.getSubHeader());
		{
	        String[] objects = { 
	        		
	        		"@Formula",  
	        		"CDuce",
	        		"Easy Programming Language",
	        		"Fortran - ISO/IEC 1539",
	        		"MicroScript",
	        		"Prolog",
	        		"Visual Objects",
	        		"Subtext"};
	        
	        int length = objects.length;
			{
	            int rand = (int) (Math.random() * length);
	            PLSkill = objects[rand];
	            AddSkill(a, PLSkill);
			}
		}
	}
	
	public void TypeAndAddRandomProgrammingParadigmsSkill(CandidateTitlePageManageSkills a) {
		wait.visible(a.getHeader());
		wait.visible(a.getSubHeader());
		{
	        String[] objects = { 
	        		
	        		"Automata Based Programming",  
	        		"Functional Programming",
	        		"Structured Programming",
	        		"Declarative Programming",
	        		"Imperative Programming",
	        		"Event-driven Programming",
	        		"Object Oriented Programming"};
	        
	        int length = objects.length;
			{
	            int rand = (int) (Math.random() * length);
	            PPSkill = objects[rand];
	            AddSkill(a, PPSkill);
			}
		}
	}
	
public void TypeAndAddRandomWebFrameworksSkill(CandidateTitlePageManageSkills a) {
	wait.visible(a.getHeader());
	wait.visible(a.getSubHeader());
	{
	        String[] objects = { 
	        		
	        		"Apache OFBiz",  
	        		"Happstack",
	        		"Ruby on Rails",
	        		"Symfony",
	        		"Wakanda",
	        		"Pyramid",
	        		"TurboGears",
	        		"Ze Framework"};
	        
	    int length = objects.length;
		{
            int rand = (int) (Math.random() * length);
            WFSkill = objects[rand];
            AddSkill(a, WFSkill);
		}
	}
}
	
public void CleanAllSkills(CandidateTitlePageManageSkills a, CandidateTitlePage b) {
	wait.clickable(b.getResumeSquareResume());
	as.click(b.getResumeSquareResume());
	wait.clickable(b.getResumeManageSkillsButton());
	as.click(b.getResumeManageSkillsButton());
	wait.visible(a.getHeader());
	wait.visible(a.getSubHeader());
	try {
		driver.refresh();
		wait.visible(a.getOverviewButton());
		wait.clickable(a.getOverviewButton());
		wait.visible(a.getHeader());
		wait.visible(a.getSubHeader());
		while (a.getOverviewFirstRowRemoveIcon().isDisplayed()) {
		wait.visible(a.getOverviewButton());
		wait.clickable(a.getOverviewButton()); 
		wait.visible(a.getOverviewFirstRowRemoveIcon());
		wait.clickable(a.getOverviewFirstRowRemoveIcon());
			as.click(a.getOverviewFirstRowRemoveIcon());
		wait.visible(a.getOverviewButton());
		wait.clickable(a.getOverviewButton());
		wait.visible(a.getHeader());
		wait.visible(a.getSubHeader());
		} 
	 } catch(Exception e){
	 }	 
	wait.visible(a.getBlankSkillPage());
	wait.visible(a.getOverviewButton());
	wait.clickable(a.getOverviewButton());
	wait.visible(a.getHeader());
	wait.visible(a.getSubHeader());
	assertEquals(a.getBlankSkillPageText(), as.getText(a.getBlankSkillPage()));
}
	
public void SetRandomAmountOfYearsForSixRows(CandidateTitlePageManageSkills a) {
		
	BCDate = TypeIntoOverviewYearDropDown(a.getOverviewFirstRowYearDropDown());
	ELDate = TypeIntoOverviewYearDropDown(a.getOverviewSecondRowYearDropDown());
	MSDate = TypeIntoOverviewYearDropDown(a.getOverviewThirdRowYearDropDown());
	PLDate = TypeIntoOverviewYearDropDown(a.getOverviewForthRowYearDropDown());
	PPDate = TypeIntoOverviewYearDropDown(a.getOverviewFifthRowYearDropDown());
	WFDate = TypeIntoOverviewYearDropDown(a.getOverviewSixthRowYearDropDown());
}
	
public void SetRandomSkillKnowledgeForSixRows(CandidateTitlePageManageSkills a) {
		
	BCLevel = TypeIntoOverviewSkillDropDown(a.getOverviewFirstRowSkillDropDown());
	ELLevel = TypeIntoOverviewSkillDropDown(a.getOverviewSecondRowSkillDropDown());
	MSLevel = TypeIntoOverviewSkillDropDown(a.getOverviewThirdRowSkillDropDown());
	PLLevel = TypeIntoOverviewSkillDropDown(a.getOverviewForthRowSkillDropDown());
	PPLevel = TypeIntoOverviewSkillDropDown(a.getOverviewFifthRowSkillDropDown());
	WFLevel = TypeIntoOverviewSkillDropDown(a.getOverviewSixthRowSkillDropDown());
}

public String getBCSkill(){
	return BCSkill;
}

public String getELSkill(){
	return ELSkill;
}

public String getMSSkill(){
	return MSSkill;
}

public String getPLSkill(){
	return PLSkill;
}

public String getPPSkill(){
	return PPSkill;
}

public String getWFSkill(){
	return WFSkill;
}

public String getBCDate(){
	return BCDate;
}

public String getELDate(){
	return ELDate;
}

public String getMSDate(){
	return MSDate;
}

public String getPLDate(){
	return PLDate;
}

public String getPPDate(){
	return PPDate;
}

public String getWFDate(){
	return WFDate;
}

public String getBCLevel(){
	return BCLevel;
}

public String getELLevel(){
	return ELLevel;
}

public String getMSLevel(){
	return MSLevel;
}

public String getPLLevel(){
	return PLLevel;
}

public String getPPLevel(){
	return PPLevel;
}

public String getWFLevel(){
	return WFLevel;
}

public void VerifyAppliedSkillsArePresent(String skill,CandidateTitlePageManageSkills a) {
	as.checkText(driver.findItem("//div[text()='" + skill + "']"), skill);
}

public boolean VerifySelectedAgeIsMatches(CandidateTitlePage a,String year) {
	wait.visible(a.getResumeManageEducationInfo());
	wait.visible(a.getBelowSubHeaderLineLink());
	wait.visible(a.getResumeMoreInfoAvailability());
	wait.visible(a.getResumeMoreInfoProfileVisibility());
	as.checkText(driver.findItem("//td[@class='col-skill-experience ng-binding' and text()='"+ year + "']"), year);
	return true;
}

public boolean VerifySelectedSkillLevelIsMatches(CandidateTitlePage a, String level) {
	wait.visible(a.getResumeManageEducationInfo());
	wait.visible(a.getBelowSubHeaderLineLink());
	wait.visible(a.getResumeMoreInfoAvailability());
	wait.visible(a.getResumeMoreInfoProfileVisibility());
	as.checkText(driver.findItem("//td[@class='col-skill-level ng-binding' and text()='" + level + "']"), level);
	return true;
}
}