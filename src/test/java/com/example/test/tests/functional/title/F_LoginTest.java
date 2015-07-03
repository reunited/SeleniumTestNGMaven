package com.example.test.tests.functional.title;

import org.testng.annotations.Test;

import com.example.test.helpers.UserService;
import com.example.test.tests.base.BaseTest;
import com.example.test.tests.helpers.Users;
import com.example.test.tests.pages.NewTitlePage;
import com.example.test.tests.pages.SignInPage;
import com.example.test.tests.pages.candidate.CandidateTitlePage;
import com.example.test.tests.pages.candidate.CandidateTitlePageMiniProfile;
import com.example.test.tests.pages.company.CompanySignUpProgressPage;
import com.example.test.tests.pages.company.CompanyTitlePage;
import com.example.test.tests.pages.staff.NewStaffInterfacePage;

public class F_LoginTest extends BaseTest {
	
	private NewTitlePage t = null;
	private SignInPage s = null;
	private CandidateTitlePageMiniProfile cm = null;
	private NewStaffInterfacePage l = null;
	private CompanySignUpProgressPage co = null;
	private Users u = null;
	private CandidateTitlePage ct = null;
	private CompanyTitlePage ctp = null;
	
@Override
public void onBeforeClassAfter() {
	t = initPage(NewTitlePage.class);
	s = initPage(SignInPage.class);
	cm = initPage(CandidateTitlePageMiniProfile.class);
	l = initPage(NewStaffInterfacePage.class);
	co = initPage(CompanySignUpProgressPage.class);
	u = initPage(Users.class);
	ct = initPage(CandidateTitlePage.class);
	ctp = initPage(CompanyTitlePage.class);
}

@Override
public void onBeforeMethodAfter() {
	gotoBaseUrl();
	wait.visible(t.getSignInLinkTopPage());
	wait.clickable(t.getSignInLinkTopPage());
}
	
public void loginValidCandidate() {
	getDriver().refresh();
	wait.visible(s.getSignInWindowEmailField());
	wait.clickable(s.getSignInWindowEmailField());
	as.type(s.getSignInWindowEmailField(), u.getUserOne());
	as.type(s.getSignInWindowPasswordField(), u.getAutomationUserPassword());
	as.click(s.getSignInWindowSignInButton());
}
	
public void loginValidCompany() {
	getDriver().refresh();
	wait.visible(s.getSignInWindowEmailField());
	wait.clickable(s.getSignInWindowEmailField());
	as.type(s.getSignInWindowEmailField(), u.getQACompanyEmail());
	as.type(s.getSignInWindowPasswordField(), u.getQACompanyPassword());
	as.click(s.getSignInWindowSignInButton());
}
	
public void loginValidStaff() {
	getDriver().refresh();
	wait.visible(s.getSignInWindowEmailField());
	wait.clickable(s.getSignInWindowEmailField());
	as.type(s.getSignInWindowEmailField(), u.getStaffOne());
	as.type(s.getSignInWindowPasswordField(), u.getStaffPassword());
	as.click(s.getSignInWindowSignInButton());
}

public void loginInvalidEmail() {
	getDriver().refresh();
	wait.visible(s.getSignInWindowEmailField());
	wait.clickable(s.getSignInWindowEmailField());
	as.type(s.getSignInWindowEmailField(), u.getRandomCity1()+"@"+u.getRandomCity2()+".com");
	as.type(s.getSignInWindowPasswordField(), u.getAutomationUserPassword());
	as.click(s.getSignInWindowSignInButton());
}
	
public void loginInvalidPassword() {		
	getDriver().refresh();
	wait.visible(s.getSignInWindowEmailField());
	wait.clickable(s.getSignInWindowEmailField());
	as.type(s.getSignInWindowEmailField(), u.getUserOne());
	as.type(s.getSignInWindowPasswordField(), u.getRandomCity2());
	as.click(s.getSignInWindowSignInButton());
}
	
@Test(enabled=true)
public void f_logInCandidateTopFunctionalPositiveTest() {	
	wait.clickable(t.getSignInLinkTopPage());
	as.click(t.getSignInLinkTopPage());
	loginValidCandidate();
	wait.visible(ct.getCandidateName());
	getService(UserService.class).logOutAsCandidate(cm);
}

@Test(enabled=true)
public void f_logInCandidateFooterFunctionalPositiveTest() {
	wait.visible(t.getSignInLink());
	wait.clickable(t.getSignInLink());
	as.click(t.getSignInLink());
	loginValidCandidate();
	wait.visible(ct.getCandidateName());
	getService(UserService.class).logOutAsCandidate(cm);
}

@Test(enabled=true)
	public void f_logInCompanyTopFunctionalPositiveTest() {
		
	wait.clickable(t.getSignInLinkTopPage());
	as.click(t.getSignInLinkTopPage());
	loginValidCompany();
	wait.visible(ctp.getCompanyName());
	getService(UserService.class).logOutAsCompany(co, t);
}

@Test(enabled=true)
	public void f_logInCompanyFooterFunctionalPositiveTest() {

		wait.clickable(t.getSignInLink());
		as.click(t.getSignInLink());
		loginValidCompany();
	wait.visible(ctp.getCompanyName());
	getService(UserService.class).logOutAsCompany(co, t);
}

@Test(enabled=true)
	public void f_logInStaffTopFunctionalPositiveTest() {		
	wait.clickable(t.getSignInLinkTopPage());
	as.click(t.getSignInLinkTopPage());
	loginValidStaff();
	wait.visible(l.getBasicStatsText());
	getService(UserService.class).logOutAsStaff(l);
}

@Test(enabled=true)
	public void f_logInStaffFunctionalPositiveTest() {
		wait.visible(t.getSignInLink());
		wait.clickable(t.getSignInLink());
		as.click(t.getSignInLink());
		loginValidStaff();
		wait.visible(l.getBasicStatsText());
		getService(UserService.class).logOutAsStaff(l);
	}

@Test(enabled=true)
public void f_loginTopFunctionalInvalidEmailTest() {
	wait.visible(t.getSignInLinkTopPage());
	wait.clickable(t.getSignInLinkTopPage());
	as.click(t.getSignInLinkTopPage());
	loginInvalidEmail();
	as.isPresentAndCheckText(s.getErrorMessage(), s.getErrorMessageText());
}

@Test(enabled=true)
public void f_loginFooterFunctionalInvalidEmailTest() {
	wait.visible(t.getSignInLink());
	wait.clickable(t.getSignInLink());
	as.click(t.getSignInLink());
	loginInvalidEmail();
	as.isPresentAndCheckText(s.getErrorMessage(), s.getErrorMessageText());
}

@Test(enabled=true)
public void f_loginTopFunctionalInvalidPasswordTest() {
	wait.visible(t.getSignInLinkTopPage());
	wait.clickable(t.getSignInLinkTopPage());
	as.click(t.getSignInLinkTopPage());
	loginInvalidPassword();
	as.isPresentAndCheckText(s.getErrorMessage(), s.getErrorMessageText());
}	

@Test(enabled=true)
public void f_loginFooterFunctionalInvalidPasswordTest() {
	wait.visible(t.getSignInLink());
	wait.clickable(t.getSignInLink());
	as.click(t.getSignInLink());
	loginInvalidPassword();
	as.isPresentAndCheckText(s.getErrorMessage(), s.getErrorMessageText());
	}
}