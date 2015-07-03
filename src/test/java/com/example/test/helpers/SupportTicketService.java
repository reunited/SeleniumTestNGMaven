package com.example.test.helpers;

import com.example.test.tests.base.BaseService;
import com.example.test.tests.base.MyDriver;
import com.example.test.tests.helpers.SupportTicketHelper;
import com.example.test.tests.helpers.Users;
import com.example.test.tests.pages.NewTitlePage;
import com.example.test.tests.pages.candidate.CandidateTitlePageFooter;
import com.example.test.tests.pages.candidate.CandidateTitlePageHeader;
import com.example.test.tests.pages.company.CompanySignUpProgressPage;
import com.example.test.tests.pages.support.CreateSupportTicket;
import com.example.test.tests.pages.support.CreateSupportTicketNotSignedIn;

public class SupportTicketService extends BaseService {	
	
	public void FillTicketNotSignedIn(CreateSupportTicketNotSignedIn c, String name, String email, String subject, String message) {
		
		wait.clickable(c.getYourNameField());
		as.type(c.getYourNameField(), name);
		as.type(c.getYourEmailField(), email);
		as.type(c.getSubjectField(), subject);
		as.type(c.getMessageField(), message);
		as.clear(c.getYourNameField());
		as.type(c.getYourNameField(), name);
		wait.clickable(c.getCreateTicketButton());
		as.click(c.getCreateTicketButton());
	}
	
	public void LoginToZendesk(Users u, SupportTicketHelper s, String userId, String userPass) {
		
		getDriver().goToUrl("https://");
		wait.clickable(s.getSignIn());
		as.click(s.getSignIn());
		as.type(s.getUserEmailField(), userId);
		as.type(s.getUserPasswordField(), userPass);
		as.click(s.getLogInButton());
	}
	
	public void LogOutFromZenDesk(SupportTicketHelper s) {
		
		wait.clickable(s.getLogOutDropDown());
		as.click(s.getLogOutDropDown());
		wait.clickable(s.getSignOut());
		as.click(s.getSignOut());
	}
	
	public void DeleteTicket(Users u, SupportTicketHelper s, String ticketText) {
		
		as.isPresentAndCheckText(s.getTicketBody(), ticketText);
		wait.clickable(s.getTicketMenuDropDown());
		as.click(s.getTicketMenuDropDown());
		wait.clickable(s.getTicketDelete());
		as.click(s.getTicketDelete());
		wait.clickable(s.getOkPopup());
		as.click(s.getOkPopup());
	}
	
	public void PickTicket(SupportTicketHelper s) {
		
	/*	 if (s.getLastPageArrow().isDisplayed()) {
			wait.clickable(s.getLastPageArrow());
			as.click(s.getLastPageArrow());
			wait.clickable(s.getPickTestTicket());
			as.click(s.getPickTestTicket());
		}
		else  */
			wait.clickable(s.getPickTestTicket());
			as.click(s.getPickTestTicket());
	}

	public void NotSignedIn(NewTitlePage t, CreateSupportTicketNotSignedIn c, String name, String email, String subject, String message) {	
		
		wait.clickable(t.getSupportLinkTopPage());
		as.click(t.getSupportLinkTopPage());
		FillTicketNotSignedIn(c, name, email, subject, message);
		wait.clickable(t.getSupportLink());
		as.click(t.getSupportLink());
		FillTicketNotSignedIn(c, name, email, subject, message);
	}

	public void VerifyAndDelete(Users u, SupportTicketHelper s, String userId, String userPass, String ticketText, MyDriver driver) {			

		try{
			LoginToZendesk(u, s, userId, userPass);
			wait.clickable(s.getUserDropDown());
			as.click(s.getUserDropDown());					 
			String parentHandle = driver.getWindowHandle(); // get the current window handle
			as.click(s.getOpenAgentInterface());
				for (String winHandle : driver.getWindowHandles()) {
					driver.switchToWindow(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
				}
		PickTicket(s);
		DeleteTicket(u, s, ticketText);				
			driver.closeNotQuit(); // close newly opened window when done with it
			driver.switchToWindow(parentHandle); // switch back to the original window
		LogOutFromZenDesk(s);
		}
		catch(Exception e)  {
			System.out.println(e);
		}
	}
	
	public void CleanUp(SupportTicketHelper s, Users u, String userId, String userPass, String ticketText, MyDriver driver) throws Exception {
		
		getDriver().goToUrl("https://");
		LoginToZendesk(u, s, userId, userPass);
		String parentHandle = driver.getWindowHandle(); // get the current window handle
		wait.visible(s.getUserDropDown());
		wait.clickable(s.getUserDropDown());
		as.click(s.getUserDropDown());
		Thread.sleep(2000);
		wait.visible(s.getOpenAgentInterface());
		wait.clickable(s.getOpenAgentInterface());
		as.click(s.getOpenAgentInterface());		    
	    for (String winHandle: driver.getWindowHandles()) {
	    	driver.switchToWindow(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		}	
	try {
		 while (s.getPickTestTicket() !=null) {
			 
			 if (s.getLastPageArrow().isDisplayed()) {
					as.click(s.getLastPageArrow());
					as.click(s.getPickTestTicket());
					DeleteTicket(u, s, ticketText);
					Thread.sleep(2000);
			} else 
			 driver.refresh();
			 wait.clickable(s.getPickTestTicket());
			 PickTicket(s);
			 DeleteTicket(u, s, ticketText);
			 Thread.sleep(2000);
			 } 
		 }	
	 	 catch(Exception e) {
	 		System.out.println(e);	
	}
	driver.closeNotQuit(); // close newly opened window when done with it
	driver.switchToWindow(parentHandle); // switch back to the original window
	LogOutFromZenDesk(s); 	
	}
	
	public void SignedInFillTicketFieldsAndSubmit(CreateSupportTicket c, String subject, String message) {
		
		wait.clickable(c.getSubjectField());
		as.type(c.getSubjectField(), subject);
		wait.clickable(c.getMessageInputField());
		as.type(c.getMessageInputField(), message);
		as.clear(c.getSubjectField());
		as.type(c.getSubjectField(), subject);
		as.click(c.getCreateTicketButton());
	}
		
	public void SubmitTicketCandidateSignedInFromHeader(CreateSupportTicket c, CandidateTitlePageHeader cp, String subject, String message) {
		
		getDriver().goToUrl("http://");
		wait.clickable(cp.getHeaderSupport());
		as.click(cp.getHeaderSupport());
		SignedInFillTicketFieldsAndSubmit(c, subject, message);
	}
			
	public void SubmitTicketWhenCandidateSignedInFromFooter(CreateSupportTicket c, CandidateTitlePageFooter cf, String subject, String message) {
					
		getDriver().goToUrl("http://");
		wait.clickable(cf.getFooterSupportLink());
		as.click(cf.getFooterSupportLink());
		SignedInFillTicketFieldsAndSubmit(c, subject, message);
}
			
	public void SubmitTicketWhenCompanySignedInFromHeader(CreateSupportTicket c,  CompanySignUpProgressPage co, String subject, String message) {

		wait.clickable(co.getHeaderSupportIcon());
		as.click(co.getHeaderSupportIcon());
		SignedInFillTicketFieldsAndSubmit(c, subject, message);
}
			
	public void SubmitTicketWhenCompanySignedInFromFooter(CreateSupportTicket c, CompanySignUpProgressPage co, String subject, String message) {		
	
		wait.clickable(co.getFooterSupportIcon());
		as.click(co.getFooterSupportIcon());
		SignedInFillTicketFieldsAndSubmit(c, subject, message);
	}
}