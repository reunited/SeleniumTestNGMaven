package com.example.test.tests.base;

import org.testng.ITestContext;

import com.example.test.helpers.UserService;
import com.example.test.tests.helpers.Users;
import com.example.test.tests.pages.NewTitlePage;
import com.example.test.tests.pages.SignInPage;
import com.example.test.tests.pages.candidate.CandidateTitlePageMiniProfile;

public abstract class BaseTestCandidate extends BaseTest {
	private String[] candidates;
	
	private CandidateTitlePageMiniProfile c = null;
	private NewTitlePage t = null;
	private SignInPage s = null;
	private Users u = null;
	
	@Override
	public void onBeforeClassAfter() {
		c = initPage(CandidateTitlePageMiniProfile.class);
		t = initPage(NewTitlePage.class);
		s = initPage(SignInPage.class);
		u = initPage(Users.class);
	}
	
	@Override 
	public void onBeforeMethodBefore() {
		gotoBaseUrl();
		getService(UserService.class).login(s, t, CommonUtils.getRandomArrayElement(candidates), u.getAutomationUserPassword());
	}
	
	@Override 
	public void onBeforeClassBefore() {
		ITestContext testContext = getTestContext();
		String string = testContext.getCurrentXmlTest().getParameter("candidates");
		if(string == null)
			string = "test@case.com"; 
		candidates = string.split(",");
	}
	
	@Override
	public void onAfterMethodBefore() {
		getService(UserService.class).logOutAsCandidate(c);
	}
}