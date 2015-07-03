package com.example.test.tests.functional.support;

import org.testng.annotations.Test;

import com.example.test.helpers.SupportTicketService;
import com.example.test.tests.base.BaseTest;
import com.example.test.tests.helpers.Users;
import com.example.test.tests.pages.NewTitlePage;
import com.example.test.tests.pages.support.CreateSupportTicketNotSignedIn;

public class F_SubmitSupportTicketNotSignedInHeaderAndFooterTest extends BaseTest {
	
	private NewTitlePage t = null;
	private CreateSupportTicketNotSignedIn c = null;
	private Users u = null;

	@Override
	public void onBeforeClassAfter() {
		t = initPage(NewTitlePage.class);
		c = initPage(CreateSupportTicketNotSignedIn.class);
		u = initPage(Users.class);
	}
	
	@Override
	public void onBeforeMethodAfter() {
		gotoBaseUrl();
	}

@Test
	public void f_submitSupportTicketNotSignedInHeaderAndFooterTest() {

		getService(SupportTicketService.class).NotSignedIn(t, c, u.getRandomName(), u.getUserOne(), u.getRandomTest(), u.getRandomTest());
	}
}