package com.example.test.tests.functional.test.positions;

import org.testng.annotations.Test;

import com.example.test.helpers.PositionService;
import com.example.test.tests.base.BaseTestCandidate;
import com.example.test.tests.helpers.Users;
import com.example.test.tests.pages.candidate.CandidateTitlePage;
import com.example.test.tests.pages.candidate.CandidateTitlePageHeader;
import com.example.test.tests.pages.candidate.CandidateTitlePageManagePositions;
import com.example.test.tests.pages.candidate.CandidateTitlePageManagePositionsAdd;

public class F_CandidateAddNewPositionIntoEmplymentHistoryTest extends BaseTestCandidate {
	
	private CandidateTitlePage a = null;
	private CandidateTitlePageManagePositionsAdd b = null;
	private CandidateTitlePageManagePositions c = null;
	private Users u = null;
	private CandidateTitlePageHeader ct = null;
	
	@Override 
	public void onBeforeClassAfter() {
		super.onBeforeClassAfter();
		
		a = initPage(CandidateTitlePage.class);
		b = initPage(CandidateTitlePageManagePositionsAdd.class);
		c = initPage(CandidateTitlePageManagePositions.class);
		u = initPage(Users.class);
		ct = initPage(CandidateTitlePageHeader.class);
	}
		
@Test 
public void f_CandidateAddNewPositionIntoEmplymentHistory() {	
	getService(PositionService.class).AddNewPositionFromCandidateTitlePageAndSetAsWorkingCurrently(ct, a, c, b, 
		u.getCandidateRandomCompanyName(), u.getCandidateRandomJobTitle(), u.getRandomCity6(), 
		u.getCandidateJobDescription(), getDriver().getBrowser());
	
	getService(PositionService.class).AddNewPositionFromCandidateTitlePageAndSetRandomEndDate(a, ct, c, b, 
		u.getCandidateRandomCompanyName(), u.getCandidateRandomJobTitle(), u.getRandomCity6(), 
		u.getCandidateJobDescription(), getDriver().getBrowser());
	}
}