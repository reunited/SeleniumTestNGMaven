package com.example.test.tests.functional.support;

import org.testng.annotations.Test;

import com.example.test.helpers.SupportTicketService;
import com.example.test.tests.base.BaseTestCandidate;
import com.example.test.tests.helpers.Users;
import com.example.test.tests.pages.candidate.CandidateTitlePageFooter;
import com.example.test.tests.pages.candidate.CandidateTitlePageHeader;
import com.example.test.tests.pages.support.CreateSupportTicket;

public class F_SubmitSupportTicketSignedInAsCandidateTest extends BaseTestCandidate {
	
	private CreateSupportTicket c = null;
	private CandidateTitlePageHeader cp = null;
	private CandidateTitlePageFooter cf = null;
	private Users u = null;
	
	@Override
	public void onBeforeClassAfter() {
		
	c = initPage(CreateSupportTicket.class);
	cp = initPage(CandidateTitlePageHeader.class);
	cf = initPage(CandidateTitlePageFooter.class);
	u = initPage(Users.class);
	super.onBeforeClassAfter();
}

@Test(enabled=true)
	public void f_SubmitSupportTicketSignedInHeaderTest() {
		getService(SupportTicketService.class).SubmitTicketCandidateSignedInFromHeader(c, cp, u.getRandomTest(), u.getRandomTest());
	}

@Test(enabled=true)
	public void f_SubmitSupportTicketSignedInFooterTest() {
		getService(SupportTicketService.class).SubmitTicketWhenCandidateSignedInFromFooter(c, cf, u.getRandomTest(), u.getRandomTest());
	}
}