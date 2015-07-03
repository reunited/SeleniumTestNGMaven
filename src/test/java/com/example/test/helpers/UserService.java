package com.example.test.helpers;

import com.example.test.tests.base.BaseService;
import com.example.test.tests.pages.NewTitlePage;
import com.example.test.tests.pages.SignInPage;
import com.example.test.tests.pages.candidate.CandidateTitlePageMiniProfile;
import com.example.test.tests.pages.company.CompanySignUpProgressPage;
import com.example.test.tests.pages.staff.NewStaffInterfacePage;

public class UserService extends BaseService {
	
	public void logOutAsCandidate(CandidateTitlePageMiniProfile c) {

		wait.clickable(c.getMiniProfileDownArrow());
		as.click(c.getMiniProfileDownArrow());
		wait.clickable(c.getLogoutDropDown());
		as.click(c.getLogoutDropDown());
		getDriver().refresh();
	}
	
	public void logOutAsStaff(NewStaffInterfacePage s) {		
		
		wait.clickable(s.getUserNameTopPage());
		as.click(s.getUserNameTopPage());
		wait.clickable(s.getSignOutButton());
		as.click(s.getSignOutButton());
		getDriver().refresh();
	}
	
	public void logOutAsCompany(CompanySignUpProgressPage co, NewTitlePage t) {
		
		wait.clickable(co.getMiniProfileName());
		as.click(co.getMiniProfileName());
		wait.clickable(co.getLogOut());
		as.click(co.getLogOut());
		wait.clickable(t.getSignInLinkTopPage());
		getDriver().refresh();
	}
	
public void login(SignInPage s, NewTitlePage t, String email, String password) {	
		
		getDriver().refresh();
		wait.visible(t.getSignInLinkTopPage());
		wait.clickable(t.getSignInLinkTopPage());
		as.click(t.getSignInLinkTopPage());
		wait.clickable(s.getSignInWindowEmailField());
		as.type(s.getSignInWindowEmailField(), email);
		wait.clickable(s.getSignInWindowPasswordField());
		as.type(s.getSignInWindowPasswordField(), password);
		wait.clickable(s.getSignInWindowSignInButton());
		as.click(s.getSignInWindowSignInButton());
	}		
}