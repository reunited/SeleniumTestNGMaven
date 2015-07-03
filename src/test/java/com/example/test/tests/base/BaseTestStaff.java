package com.example.test.tests.base;

import org.testng.ITestContext;

import com.example.test.helpers.UserService;
import com.example.test.tests.helpers.Users;
import com.example.test.tests.pages.NewTitlePage;
import com.example.test.tests.pages.SignInPage;
import com.example.test.tests.pages.staff.NewStaffInterfacePage;

public abstract class BaseTestStaff extends BaseTest {	
	private String[] staff;
	
	private NewStaffInterfacePage c;
	private NewTitlePage t;
	private SignInPage s;
	private Users u;
	
	@Override
	public void onBeforeClassAfter() {
		c = initPage(NewStaffInterfacePage.class);
		t = initPage(NewTitlePage.class);
		s = initPage(SignInPage.class);
		u = initPage(Users.class);
	}
	
	@Override 
	public void onBeforeMethodBefore() {
		gotoBaseUrl();
		getService(UserService.class).login(s, t, CommonUtils.getRandomArrayElement(staff), u.getStaffPassword());
	}
	
	@Override 
	public void onBeforeClassBefore() {
		ITestContext testContext = getTestContext();
		String staff = testContext.getCurrentXmlTest().getParameter("staff");
		if(staff == null)
			staff = "staff@test.com";
		this.staff = staff.split(",");
	}
	
	@Override
	public void onAfterMethodBefore() {
		getService(UserService.class).logOutAsStaff(c);
	}
}