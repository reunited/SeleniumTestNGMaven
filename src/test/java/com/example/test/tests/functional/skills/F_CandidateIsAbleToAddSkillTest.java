package com.example.test.tests.functional.skills;

import org.testng.annotations.Test;

import com.example.test.helpers.SkillService;
import com.example.test.tests.base.BaseTestCandidate;
import com.example.test.tests.pages.candidate.CandidateTitlePage;
import com.example.test.tests.pages.candidate.CandidateTitlePageManageSkills;

public class F_CandidateIsAbleToAddSkillTest extends BaseTestCandidate {
		
	CandidateTitlePageManageSkills CTPMS = null;
	CandidateTitlePage CTP               = null;
	SkillService SS						 = null;

@Override
public void onBeforeClassAfter(){
	super.onBeforeClassAfter();
	CTPMS = initPage(CandidateTitlePageManageSkills.class);
	CTP   = initPage(CandidateTitlePage.class);
	SS	  = initPage(SkillService.class); 
}
	
@Test
public void F_candidateIsAbleToAddAndDeleteSixSkillsWithDifferentYearsAndKnowledgeTest() {	
	
	as.click(CTP.getResumeManageSkillsEditIcon());
	getService(SkillService.class).TypeAndAddRandomBussinessCommunicationSkill(CTPMS);
	getService(SkillService.class).TypeAndAddRandomElectricalSkill(CTPMS);
	getService(SkillService.class).TypeAndAddRandomManagementSkill(CTPMS);
	getService(SkillService.class).TypeAndAddRandomProgrammingLanguagesSkill(CTPMS);
	getService(SkillService.class).TypeAndAddRandomProgrammingParadigmsSkill(CTPMS);
	getService(SkillService.class).TypeAndAddRandomWebFrameworksSkill(CTPMS);
		getService(SkillService.class).SetRandomAmountOfYearsForSixRows(CTPMS);
	getService(SkillService.class).SetRandomSkillKnowledgeForSixRows(CTPMS);
		as.click(CTP.getResumeSquareResume());
	getService(SkillService.class).VerifyAppliedSkillsArePresent(SS.getBCSkill(),CTPMS);
	getService(SkillService.class).VerifyAppliedSkillsArePresent(SS.getELSkill(),CTPMS);
	getService(SkillService.class).VerifyAppliedSkillsArePresent(SS.getMSSkill(),CTPMS);
	getService(SkillService.class).VerifyAppliedSkillsArePresent(SS.getPLSkill(),CTPMS);
	getService(SkillService.class).VerifyAppliedSkillsArePresent(SS.getPPSkill(),CTPMS);
	getService(SkillService.class).VerifyAppliedSkillsArePresent(SS.getWFSkill(),CTPMS);
	getService(SkillService.class).VerifySelectedAgeIsMatches(CTP,SS.getBCDate());
	getService(SkillService.class).VerifySelectedAgeIsMatches(CTP,SS.getELDate());
	getService(SkillService.class).VerifySelectedAgeIsMatches(CTP,SS.getMSDate());
	getService(SkillService.class).VerifySelectedAgeIsMatches(CTP,SS.getPLDate());
	getService(SkillService.class).VerifySelectedAgeIsMatches(CTP,SS.getPPDate());
	getService(SkillService.class).VerifySelectedAgeIsMatches(CTP,SS.getWFDate());
	getService(SkillService.class).VerifySelectedSkillLevelIsMatches(CTP, SS.getBCLevel());
	getService(SkillService.class).VerifySelectedSkillLevelIsMatches(CTP, SS.getELLevel());
	getService(SkillService.class).VerifySelectedSkillLevelIsMatches(CTP, SS.getMSLevel());
	getService(SkillService.class).VerifySelectedSkillLevelIsMatches(CTP, SS.getPLLevel());
	getService(SkillService.class).VerifySelectedSkillLevelIsMatches(CTP, SS.getPPLevel());
	getService(SkillService.class).VerifySelectedSkillLevelIsMatches(CTP, SS.getWFLevel());
}
}