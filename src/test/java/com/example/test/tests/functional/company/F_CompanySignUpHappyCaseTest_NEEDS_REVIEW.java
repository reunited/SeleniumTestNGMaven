package com.example.test.tests.functional.company;
/*
//Frank

public class F_CompanySignUpHappyCaseTest_NEEDS_REVIEW extends BaseTest {
/*	
		
@Test
	public void f_CompanySignUpPositiveTest() {
	
	TitlePage____OUTDATED t = initPage(TitlePage____OUTDATED.class);
	SignUpPage____OUTDATED s = initPage(SignUpPage____OUTDATED.class);
	Users r = initPage(Users.class);
	
	checkTitleAndUrl(PageTitles.TitlePageTitleText, Links.MainLink);

	t.clickOnHeaderSignUpElement();
	
	checkTitleAndUrl(PageTitles.TitlePageTitleText, Links.SignUpLink);

	s.typeInToCompanyNameField(Users.RandomName).verifyCompanyNameFieldEquals(Users.RandomName);
	String CompanyName = s.CompanyNameField.getText();
	System.out.println(CompanyName);

	String generatedEmail = r.generate();
	s.typeInToEmailField(generatedEmail).verifyEmailFieldEquals(generatedEmail);
	String CompanyEmail = s.EmailField.getText();
	System.out.println(CompanyEmail);

	s.typeInToYourFirstNameField(Users.RandomCity1).verifyYourFirstNameFieldEquals(Users.RandomCity1);
	String RepFirstName = s.YourFirstNameField.getText();
	System.out.println(RepFirstName);

	s.typeInToYourLastNameField(Users.RandomCity2).verifyYourLastNameFieldEquals(Users.RandomCity2);
	String RepLastName = s.YourLastNameField.getText();
	System.out.println(RepLastName);

	s.typeInToSetPasswordField(Users.RandomPassword).verifySetPasswordFieldEquals(Users.RandomPassword);
	s.typeInToConfirmPasswordField(Users.RandomPassword).verifyConfirmPasswordFieldEquals(Users.RandomPassword);
	String CompanyPassword = s.SetPasswordField.getText();
	System.out.println(CompanyPassword);

	s.typeInToPhoneNumberField(Users.RandomPhone).verifyPhoneNumberFieldEquals(Users.RandomPhone);
	String CompanyPhone = s.PhoneNumberField.getText();
	System.out.println(CompanyPhone);
//	s.clickOnAgreedCheckBoxElement().clickOnJoinButtonElement();
 	} 
} */