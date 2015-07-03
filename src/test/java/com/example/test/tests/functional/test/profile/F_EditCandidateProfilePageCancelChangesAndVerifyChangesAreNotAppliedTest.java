package com.example.test.tests.functional.test.profile;

import static org.testng.Assert.*;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.example.test.helpers.CandidateService;
import com.example.test.tests.base.BaseTestCandidate;
import com.example.test.tests.helpers.Users;
import com.example.test.tests.pages.candidate.CandidateTitlePage;
import com.example.test.tests.pages.candidate.CandidateTitlePageEditProfileInfo;

public class F_EditCandidateProfilePageCancelChangesAndVerifyChangesAreNotAppliedTest extends BaseTestCandidate { 

	private CandidateTitlePage a = null;
	private CandidateTitlePageEditProfileInfo c = null;
	private Users d = null;
	
	String LocationBeforeChanges = null;
	String AboutMeBeforeChanges = null;
	String AvailabilityBeforeChanges = null;
	String VisibilityBeforeChanges = null;
	String AboutMeAfterChanges = null;
	String AvailabilityAfterChanges = null;
	String VisibilityAfterChanges = null;
	String LocationAfterChanges = null;
	
	@Override
	public void onBeforeClassAfter() {
	super.onBeforeClassAfter();
			
	a = initPage(CandidateTitlePage.class);
	c = initPage(CandidateTitlePageEditProfileInfo.class);	
	d = initPage(Users.class);
	}
	
	@Override 
	public void onBeforeMethodBefore() {
		super.onBeforeMethodBefore();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wait.visible(a.getCandidateName());
		wait.clickable(a.getResumeTopModuleEditIcon());
		LocationBeforeChanges = as.getText(a.getLocationCountryAndCity());
		System.out.println("Location before changes:" + " " + LocationBeforeChanges);
		AboutMeBeforeChanges = as.getText(a.getResumeAboutMeInfo());
		System.out.println("About Me before changes:" + " " + AboutMeBeforeChanges);
		AvailabilityBeforeChanges = as.getText(a.getResumeMoreInfoAvailabilityValue());
		System.out.println("Availability before changes:" + " " + AvailabilityBeforeChanges);
		wait.visible(a.getMoreInfoYourProfileIsVisible());
		VisibilityBeforeChanges = as.getText(a.getMoreInfoYourProfileIsVisible());
		System.out.println("Visibility before changes:" + " " + VisibilityBeforeChanges);
		wait.clickable(a.getResumeTopModuleEditIcon());
		as.click(a.getResumeTopModuleEditIcon());
		wait.clickable(c.getAboutMeField());
		as.clear(c.getAboutMeField());
		as.type(c.getAboutMeField(), d.getRandomAboutMe1());
		verifyAboutMeFieldEquals(d.getRandomAboutMe1());
		getService(CandidateService.class).TypeInToCountrySelectDropDownSearchField(c);
		as.type(c.getCityField(), d.getRandomCity1());
		selectAvailableForFullTime();
		if (c.getIsVisibleCheckbox().isSelected()) {
			c.getIsVisibleCheckbox().click();
		}
		as.click(c.getCancelButton());
	}
	
public void verifyAboutMeFieldEquals(String string){
	String fieldValue = c.getAboutMeField().getAttribute("value");
	assertEquals(string, fieldValue); {
		System.out.println(string + " " + "equals to" + " " + fieldValue);
	}
}

public void selectAvailableForFullTime(){
	if("firefox".equals(getDriver().getBrowser())){
		as.type(c.getAvailabilityDropDown(), c.getAvailableForFullTimeText());
	}
	else{
			new Select(c.getAvailabilityDropDown()).selectByValue("1");	
	}
}

@Test
	public void f_EditCandidateProfilePageCancelChangesAndVerifyChangesAreNotApplied() {

	//With this test I'm changing About Me section, Country, City, 
	//Availability to AVAILABLE FOR FULL TIME, Visibility to NOT Visible, 
	//Canceling changes and verifying nothing was changed

	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
		wait.visible(a.getLocationCountryAndCity());
		wait.visible(a.getMoreInfoYourProfileIsVisible());
		LocationAfterChanges = as.getText(a.getLocationCountryAndCity());
		System.out.println("Location after changes:" + " " + LocationAfterChanges);
		assertEquals(LocationBeforeChanges, LocationAfterChanges, "Failed to verify location");
		AboutMeAfterChanges = as.getText(a.getResumeAboutMeInfo());
		System.out.println("About Me after changes:" + " " + AboutMeAfterChanges);
		assertEquals(AboutMeBeforeChanges, AboutMeAfterChanges, "Failed to verify about me");
		AvailabilityAfterChanges = as.getText(a.getResumeMoreInfoAvailabilityValue());
		System.out.println("Availiability after changes:" + " " + AvailabilityAfterChanges);
		assertEquals(AvailabilityBeforeChanges, AvailabilityAfterChanges, "Failed to verify availability");
		VisibilityAfterChanges = as.getText(a.getMoreInfoYourProfileIsVisible());
		System.out.println("Visibility after changes:" + " " + VisibilityAfterChanges);
		assertEquals(VisibilityBeforeChanges, VisibilityAfterChanges,"Failed to verify visibility");
	}
}