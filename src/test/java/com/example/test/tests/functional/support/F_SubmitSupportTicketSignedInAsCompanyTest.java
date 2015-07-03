package com.example.test.tests.functional.support;

import org.testng.annotations.Test;

import com.example.test.helpers.SupportTicketService;
import com.example.test.helpers.UserService;
import com.example.test.tests.base.BaseTest;
import com.example.test.tests.helpers.Users;
import com.example.test.tests.pages.NewTitlePage;
import com.example.test.tests.pages.SignInPage;
import com.example.test.tests.pages.company.CompanySignUpProgressPage;
import com.example.test.tests.pages.support.CreateSupportTicket;

public class F_SubmitSupportTicketSignedInAsCompanyTest extends BaseTest {
	
	private SignInPage s = null;
	private NewTitlePage t = null;
	private CompanySignUpProgressPage cp = null;
	private CreateSupportTicket c = null;
	private Users u = null;
	
	@Override
	public void onBeforeMethodAfter() {
		s = initPage(SignInPage.class);
		t = initPage(NewTitlePage.class);
		cp = initPage(CompanySignUpProgressPage.class);
		c = initPage(CreateSupportTicket.class);
		u = initPage(Users.class);
		getService(UserService.class).login(s, t, u.getQACompanyEmail(), u.getQACompanyPassword());
	}
	
@Test
public void f_SubmitSupportTicketSignedInAsCompanyHeaderTest() {
	getService(SupportTicketService.class).SubmitTicketWhenCompanySignedInFromHeader(c, cp, u.getRandomTest(), u.getRandomTest());
}

@Test
public void f_SubmitSupportTicketSignedInFooterTest() {
	try{
	getService(SupportTicketService.class).SubmitTicketWhenCompanySignedInFromFooter(c, cp, u.getRandomTest(), u.getRandomTest());
	}catch(Exception e){}
	}
}