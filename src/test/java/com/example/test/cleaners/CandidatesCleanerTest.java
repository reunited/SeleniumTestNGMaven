package com.example.test.cleaners;

import org.testng.annotations.Test;

import com.example.test.helpers.EducationService;
import com.example.test.helpers.PositionService;
import com.example.test.helpers.SkillService;
import com.example.test.helpers.UserService;
import com.example.test.tests.base.BaseTest;
import com.example.test.tests.helpers.Users;
import org.testng.ITestContext;

public class CandidatesCleanerTest extends BaseTest {
	private String[] candidates;
	private Users u = null;

@Override
public void onBeforeClassAfter() {
	
	u = initPage(Users.class);
	}

@Override 
public void onBeforeMethodBefore() {
	gotoBaseUrl();
}

@Override 
public void onBeforeClassBefore() {
	ITestContext testContext = getTestContext();
	String string = testContext.getCurrentXmlTest().getParameter("candidates");
	if(string == null) 
		string = "user@test.com,user2@test.com"; 
	candidates = string.split(",");
}

@Test(enabled=true)
public void CleanTest() throws Exception{
	for(int i=0;i<=9;i++){
		System.out.println(i);
		//getService(UserService.class).login(s, t, candidates[i], u.getAutomationUserPassword());
		}
	}
}