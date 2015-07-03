package com.example.test.tests.helpers;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import com.example.test.tests.base.BaseTest;

public class Users extends BaseTest {
	
	private String AutomationCreatedCompany = "xwwuqfc@abg.xfo";
	private String AutomationCreatedCompanyPassword = "gXWtibnhME";
	
	private String QACompanyEmail = "qa1@test.com";
	private String QACompanyPassword = "123456";
	
	private String userOne = "";
	private String userTwo = "";
	
	private String CandidateOne = "";
	private String CandidateOnePass = "p@ssword";
	
	private String StaffOne = "";
	
	private String AutomationUserPassword = "p@ssword1";
	private String StaffPassword = "st@ffp@ssword1";

	private String CandidateRandomCompanyName = "CandidateCompany-" + RandomStringUtils.randomAlphabetic(10);
	private String CandidateRandomJobTitle = "CandidateJobTitle-" + RandomStringUtils.randomAlphabetic(10);
	
	private String CandidateJobDescription = "CandidateJobDescription-" + RandomStringUtils.randomAlphabetic(500).replaceAll("(?!^)([A-Z])", " $1");
	
	private String RandomCompanyName = RandomStringUtils.randomAlphabetic(15);
	private String RandomName = RandomStringUtils.randomAlphabetic(10);
	private String RandomLastName = RandomStringUtils.randomAlphabetic(15);
	private String RandomSubject = RandomStringUtils.randomAlphabetic(40).replaceAll("(?!^)([A-Z])", " $1");
	private String RandomMessage = RandomStringUtils.randomAlphabetic(500).replaceAll("(?!^)([A-Z])", " $1");	
	
	private String CandidateRandomUniversityName  = "CandidateUniversity-" + RandomStringUtils.randomAlphabetic(15);
	private String CandidateRandomUniversityName2 = "CandidateUniversity-" + RandomStringUtils.randomAlphabetic(15);
	private String CandidateRandomUniversityName3 = "CandidateUniversity-" + RandomStringUtils.randomAlphabetic(15);
	
	private String RandomTest = "RandomTest";
	
	private String RandomPassword = RandomStringUtils.randomAlphabetic(10);
	
	private String RandomCity1 = RandomStringUtils.randomAlphabetic(10);
	private String RandomCity2 = RandomStringUtils.randomAlphabetic(10);
	private String RandomCity3 = RandomStringUtils.randomAlphabetic(10);
	private String RandomCity4 = RandomStringUtils.randomAlphabetic(10);
	private String RandomCity5 = RandomStringUtils.randomAlphabetic(10);
	private String RandomCity6 = RandomStringUtils.randomAlphabetic(10);
	
	private String RandomAboutMe1 = RandomStringUtils.randomAlphabetic(100).replaceAll("(?!^)([A-Z])", " $1");
	private String RandomAboutMe2 = RandomStringUtils.randomAlphabetic(100).replaceAll("(?!^)([A-Z])", " $1");
	private String RandomAboutMe3 = RandomStringUtils.randomAlphabetic(100).replaceAll("(?!^)([A-Z])", " $1");
	private String RandomAboutMe4 = RandomStringUtils.randomAlphabetic(100).replaceAll("(?!^)([A-Z])", " $1");
	private String RandomAboutMe5 = RandomStringUtils.randomAlphabetic(100).replaceAll("(?!^)([A-Z])", " $1");
	private String RandomAboutMe6 = RandomStringUtils.randomAlphabetic(100).replaceAll("(?!^)([A-Z])", " $1");

	private String RandomPhone = RandomStringUtils.randomNumeric(10);
	private String RandomYear = RandomStringUtils.randomNumeric(4);
	
	private String Degree  = "degree-" +RandomStringUtils.randomAlphabetic(15);
	private String Degree2 = "degree2-" +RandomStringUtils.randomAlphabetic(15);
	
	private String FieldOfStudy  = "fieldOfStudy"+RandomStringUtils.randomAlphabetic(15);
	private String FieldOfStudy2 = "fieldOfStudy2"+RandomStringUtils.randomAlphabetic(15);

	public String generateEmail() {

		char symb [] ={'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','b'};
		int i = 0;

		String newEmail="";
		Random rn = new Random();

		for(i=0;i<7;i++)
		{
		int newx = rn.nextInt(23);
		newEmail += symb[newx];
		}
		newEmail+="@";

		int newx = rn.nextInt(4);

		for(i=0;i<3;i++)
		{
		newx = rn.nextInt(23);
		newEmail+=symb[newx];
		}
		newEmail+=".";

		for(i=0;i<3;i++)
		{
		int newtt = rn.nextInt(23);
		newEmail+=symb[newtt]; 
		}
		System.out.println("email: "+newEmail); 
		
		return newEmail;
	}

	public String getAutomationCreatedCompany() {
		return AutomationCreatedCompany;
	}

	public String getAutomationCreatedCompanyPassword() {
		return AutomationCreatedCompanyPassword;
	}

	public String getQACompanyEmail() {
		return QACompanyEmail;
	}

	public String getQACompanyPassword() {
		return QACompanyPassword;
	}

	public String getUserOne() {
		return userOne;
	}

	public String getUserTwo() {
		return userTwo;
	}

	public String getCandidateOne() {
		return CandidateOne;
	}

	public String getCandidateOnePass() {
		return CandidateOnePass;
	}

	public String getStaffOne() {
		return StaffOne;
	}

	public String getAutomationUserPassword() {
		return AutomationUserPassword;
	}

	public String getStaffPassword() {
		return StaffPassword;
	}

	public String getCandidateRandomCompanyName() {
		return CandidateRandomCompanyName;
	}

	public String getCandidateRandomJobTitle() {
		return CandidateRandomJobTitle;
	}

	public String getCandidateJobDescription() {
		return CandidateJobDescription;
	}

	public String getRandomCompanyName() {
		return RandomCompanyName;
	}

	public String getRandomName() {
		return RandomName;
	}

	public String getRandomLastName() {
		return RandomLastName;
	}

	public String getRandomSubject() {
		return RandomSubject;
	}

	public String getRandomMessage() {
		return RandomMessage;
	}

	public String getCandidateRandomUniversityName() {
		return CandidateRandomUniversityName;
	}

	public String getCandidateRandomUniversityName2() {
		return CandidateRandomUniversityName2;
	}

	public String getCandidateRandomUniversityName3() {
		return CandidateRandomUniversityName3;
	}

	public String getRandomTest() {
		return RandomTest;
	}

	public String getRandomPassword() {
		System.out.println("password: "+RandomPassword); 
		return RandomPassword;
	}

	public String getRandomCity1() {
		return RandomCity1;
	}

	public String getRandomCity2() {
		return RandomCity2;
	}

	public String getRandomCity3() {
		return RandomCity3;
	}

	public String getRandomCity4() {
		return RandomCity4;
	}

	public String getRandomCity5() {
		return RandomCity5;
	}

	public String getRandomCity6() {
		return RandomCity6;
	}

	public String getRandomAboutMe1() {
		return RandomAboutMe1;
	}

	public String getRandomAboutMe2() {
		return RandomAboutMe2;
	}

	public String getRandomAboutMe3() {
		return RandomAboutMe3;
	}

	public String getRandomAboutMe4() {
		return RandomAboutMe4;
	}

	public String getRandomAboutMe5() {
		return RandomAboutMe5;
	}

	public String getRandomAboutMe6() {
		return RandomAboutMe6;
	}

	public String getRandomPhone() {
		return RandomPhone;
	}

	public String getRandomYear() {
		return RandomYear;
	}

	public String getDegree() {
		return Degree;
	}

	public String getDegree2() {
		return Degree2;
	}

	public String getFieldOfStudy() {
		return FieldOfStudy;
	}

	public String getFieldOfStudy2() {
		return FieldOfStudy2;
	}
}
