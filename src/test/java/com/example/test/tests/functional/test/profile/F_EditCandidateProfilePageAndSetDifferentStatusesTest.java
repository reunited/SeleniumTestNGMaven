package com.example.test.tests.functional.test.profile;

import org.testng.annotations.Test;

import com.example.test.helpers.CandidateService;
import com.example.test.tests.base.BaseTestCandidate;
import com.example.test.tests.helpers.Users;
import com.example.test.tests.pages.candidate.CandidateTitlePage;
import com.example.test.tests.pages.candidate.CandidateTitlePageEditProfileInfo;

public class F_EditCandidateProfilePageAndSetDifferentStatusesTest extends BaseTestCandidate {

	private CandidateTitlePage a = null;
	private CandidateTitlePageEditProfileInfo c = null;
	private Users u = null;
	
	String availability = null;

@Override
	public void onBeforeClassAfter() {
	super.onBeforeClassAfter();
	a = initPage(CandidateTitlePage.class);
	c = initPage(CandidateTitlePageEditProfileInfo.class);	
	u = initPage(Users.class);	
}

void VerifyResumeMoreInfoAvailabilityValueEquals(String string) {
	
	wait.visible(a.getResumeMoreInfoAvailabilityValue());
	wait.visible(a.getResumeMoreInfoProfileVisibility());
	wait.visible(a.getResumeMapMarker());
	as.checkStrings(string, as.getText(a.getResumeMoreInfoAvailabilityValue()));
}
	
void EditProfile() {
	
	/*wait.visible(a.getResumeSummaryTop());
	wait.visible(a.getResumeMapMarker());*/
	wait.visible(a.getResumeTopModuleEditIcon());
	wait.clickable(a.getResumeTopModuleEditIcon());
	as.click(a.getResumeTopModuleEditIcon());
	wait.visible(c.getCityField());
	as.clear(c.getAboutMeField());
	as.type(c.getAboutMeField(), u.getRandomAboutMe1());
	wait.visible(c.getCityField());
	wait.clickable(c.getCityField());
	as.clear(c.getCityField());
	as.type(c.getCityField(), u.getRandomCity1());
	wait.clickable(c.getCountrySelectDropDown());
	wait.visible(c.getCountrySelectDropDown());
	getService(CandidateService.class).TypeInToCountrySelectDropDownSearchField(c);
	wait.clickable(c.getStateDropDown());
	wait.visible(c.getStateDropDown());
	getService(CandidateService.class).TypeInToStateDropDownInputField(c);
}

@Test(enabled=true)
	public void F_EditCandidateProfilePageSetToAvailableForFullTimeAndNotVisible() {
	
	//With this test I'm changing Availability to AVAILABLE FOR FULL TIME, Visibility to NOT Visible and verifying changes
	EditProfile();
	getService(CandidateService.class).selectAvailableForFullTime(c, getDriver().getBrowser());
	availability = as.getText(c.getAvailableForFullTime());
	if (c.getIsVisibleCheckbox().isSelected()) {
		as.click(c.getIsVisibleCheckbox());
	}		
	as.click(c.getSaveButton());
	wait.visible(a.getResumeMoreInfoProfileVisibility());
	wait.visible(a.getResumeMoreInfoAvailability());
	wait.visible(a.getResumeManageEducationInfo());
	wait.clickable(a.getResumeManageEducationInfo());
	VerifyResumeMoreInfoAvailabilityValueEquals(availability);
	as.isPresent(a.getMoreInfoProfileVisibilityDisabledIcon());
	as.checkText(a.getMoreInfoYourProfileIsNOTVisible() ,a.getMoreInfoYourProfileIsNOTVisibleText());
}

@Test(enabled=true)
	public void F_EditCandidateProfilePageSetToAvailableForPartTimeAndNotVisible() {
	
    //With this test I'm changing Availability to AVAILABLE FOR PART TIME ONLY, Visibility to NOT Visible and verifying changes
	wait.visible(a.getCandidateName());
	EditProfile();
	getService(CandidateService.class).selectAvailableForPartTimeOnly(c, getDriver().getBrowser());
	availability = as.getText(c.getAvailableForPartTimeOnly());
	System.out.println(availability);
	if (c.getIsVisibleCheckbox().isSelected()) {
			as.click(c.getIsVisibleCheckbox());
		}
	as.click(c.getSaveButton());
	wait.visible(a.getResumeMoreInfoProfileVisibility());
	wait.visible(a.getResumeMoreInfoAvailability());
	wait.visible(a.getResumeManageEducationInfo());
	wait.clickable(a.getResumeManageEducationInfo());
	VerifyResumeMoreInfoAvailabilityValueEquals(availability);
	as.isPresent(a.getMoreInfoProfileVisibilityDisabledIcon());
	as.checkText(a.getMoreInfoYourProfileIsNOTVisible(), a.getMoreInfoYourProfileIsNOTVisibleText());
}

@Test(enabled=true)
	public void F_EditCandidateProfilePageSetToAvailableForFullTimeAndVisible() {
	
    //With this test I'm changing Availability to AVAILABLE FOR FULL TIME, Visibility to VISIBLE and verifying changes
	wait.visible(a.getCandidateName());
	EditProfile();
	getService(CandidateService.class).selectAvailableForFullTime(c, getDriver().getBrowser());
	availability = as.getText(c.getAvailableForFullTime());
	if (!c.getIsVisibleCheckbox().isSelected()) {
			as.click(c.getIsVisibleCheckbox());
		}
	as.click(c.getSaveButton());
	wait.visible(a.getResumeMoreInfoProfileVisibility());
	wait.visible(a.getResumeMoreInfoAvailability());
	wait.visible(a.getResumeManageEducationInfo());
	wait.clickable(a.getResumeManageEducationInfo());
	VerifyResumeMoreInfoAvailabilityValueEquals(availability);
	as.isPresent(a.getMoreInfoProfileVisibilityGreenCheckIcon());
	as.checkText(a.getMoreInfoYourProfileIsVisible(), a.getMoreInfoYourProfileIsVisibleText());
}

@Test(enabled=true)
	public void F_EditCandidateProfilePageSetAvailableForPartTimeAndVisible() {
	
    //With this test I'm changing Availability to AVAILABLE FOR PART TIME ONLY, Visibility to VISIBLE and verifying changes
	wait.visible(a.getCandidateName());
	EditProfile();
	getService(CandidateService.class).selectAvailableForPartTimeOnly(c, getDriver().getBrowser());
	availability = as.getText(c.getAvailableForPartTimeOnly());
	System.out.println(availability);
		if (!c.getIsVisibleCheckbox().isSelected()) {
			as.click(c.getIsVisibleCheckbox());
		}
	as.click(c.getSaveButton());
	wait.visible(a.getResumeMoreInfoProfileVisibility());
	wait.visible(a.getResumeMoreInfoAvailability());
	wait.visible(a.getResumeManageEducationInfo());
	wait.clickable(a.getResumeManageEducationInfo());
	as.isPresent(a.getMoreInfoProfileVisibilityGreenCheckIcon());
	VerifyResumeMoreInfoAvailabilityValueEquals(availability);
	as.checkText(a.getMoreInfoYourProfileIsVisible(), a.getMoreInfoYourProfileIsVisibleText());
}

@Test(enabled=true)
	public void F_EditCandidateProfilePageSetNotAvailableAndNotVisible() {
	
    //With this test I'm changing Availability to NOT AVAILABLE, Visibility to NOT Visible and verifying changes
	wait.visible(a.getCandidateName());
	EditProfile();
	getService(CandidateService.class).selectNotAvailable(c, getDriver().getBrowser());
	availability = as.getText(c.getNotAvailable());
	System.out.println(availability);
		if (c.getIsVisibleCheckbox().isSelected()) {
			as.click(c.getIsVisibleCheckbox());
		}
	as.click(c.getSaveButton());
	wait.visible(a.getResumeMoreInfoProfileVisibility());
	wait.visible(a.getResumeMoreInfoAvailability());
	wait.visible(a.getResumeManageEducationInfo());
	wait.clickable(a.getResumeManageEducationInfo());
	//wait.visible(a.getEducationInfoBodyButtonPencil());
	VerifyResumeMoreInfoAvailabilityValueEquals(availability);
	as.isPresent(a.getMoreInfoProfileVisibilityDisabledIcon());
	as.checkText(a.getMoreInfoYourProfileIsNOTVisible(), a.getMoreInfoYourProfileIsNOTVisibleText());
}

@Test(enabled=true)
	public void F_EditCandidateProfilePageSetNotAvailableAndVisible() {
	
	//With this test I'm changing Availability to NOT AVAILABLE, Visibility to VISIBLE and verifying changes
	wait.visible(a.getCandidateName());
	EditProfile();
	getService(CandidateService.class).selectNotAvailable(c, getDriver().getBrowser());
	availability = as.getText(c.getNotAvailable());
	System.out.println(availability);
		if (!c.getIsVisibleCheckbox().isSelected()) {
			as.click(c.getIsVisibleCheckbox());
		}
	as.click(c.getSaveButton());
	wait.visible(a.getResumeMoreInfoProfileVisibility());
	wait.visible(a.getResumeMoreInfoAvailability());
	wait.visible(a.getResumeManageEducationInfo());
	VerifyResumeMoreInfoAvailabilityValueEquals(availability);
	as.isPresent(a.getMoreInfoProfileVisibilityGreenCheckIcon());
	as.checkText(a.getMoreInfoYourProfileIsVisible(), a.getMoreInfoYourProfileIsVisibleText());
	}
}