package com.example.test.tests.functional.company;
/*

public class F_CompanySignUpTest_NEEDS_REVIEW extends BaseTest {
	/*
	TitlePage____OUTDATED t = null;
	SignUpPage____OUTDATED s = null;
	Users r = null;
	
	@Override
	public void onBeforeClassAfter() {
		t = initPage(TitlePage____OUTDATED.class);
		s = initPage(SignUpPage____OUTDATED.class);
		r = initPage(Users.class);	
	}
		
	@Override
	public void onBeforeMethodAfter() {
		gotoBaseUrl();
	}

@Test
	public void f_CompanySignUpInvalidEmailTest() {
	
	checkTitleAndUrl(PageTitles.TitlePageTitleText, Links.MainLink);
	
	t.clickOnHeaderSignUpElement();

	checkTitleAndUrl(PageTitles.TitlePageTitleText, Links.SignUpLink);
	
	s.typeInToCompanyNameField(Users.RandomName).verifyCompanyNameFieldEquals(Users.RandomName);
	String CompanyName = s.CompanyNameField.getText();
	System.out.println(CompanyName);
	
	s.typeInToEmailField(Users.RandomLastName).verifyEmailFieldEquals(Users.RandomLastName);
	String CompanyEmail = s.EmailField.getText();
	System.out.println(CompanyEmail);
	
	s.typeInToYourFirstNameField(Users.RandomCity1).verifyYourFirstNameFieldEquals(Users.RandomCity1);
	String RepFirstName = s.YourFirstNameField.getText();
	System.out.println(RepFirstName);
	
	s.typeInToYourLastNameField(Users.RandomCity2).verifyYourLastNameFieldEquals(Users.RandomCity2);
	String RepLastName = s.YourLastNameField.getText();
	System.out.println(RepLastName);
	
	s.typeInToSetPasswordField(Users.RandomCity3).verifySetPasswordFieldEquals(Users.RandomCity3);
	s.typeInToConfirmPasswordField(Users.RandomCity3).verifyConfirmPasswordFieldEquals(Users.RandomCity3);
	String CompanyPassword = s.SetPasswordField.getText();
	System.out.println(CompanyPassword);
	
	s.typeInToPhoneNumberField(Users.RandomPhone).verifyPhoneNumberFieldEquals(Users.RandomPhone);
	String CompanyPhone = s.PhoneNumberField.getText();
	System.out.println(CompanyPhone);
	s.clickOnAgreedCheckBoxElement().clickOnJoinButtonElement();
	
	s.verifyEmailIsIncorrectErrorEquals();
}
	
@Test
	public void f_CompanySignUpPasswordDoesntMatchErrorTest() {
	
	checkTitleAndUrl(PageTitles.TitlePageTitleText, Links.MainLink);

	t.clickOnHeaderSignUpElement();

	checkTitleAndUrl(PageTitles.TitlePageTitleText, Links.SignUpLink);
		
	s.typeInToCompanyNameField(Users.RandomName).verifyCompanyNameFieldEquals(Users.RandomName);
	String CompanyName = s.CompanyNameField.getText();
	System.out.println(CompanyName);
		
	s.typeInToEmailField(Users.RandomLastName).verifyEmailFieldEquals(Users.RandomLastName);
	String CompanyEmail = s.EmailField.getText();
	System.out.println(CompanyEmail);
		
	s.typeInToYourFirstNameField(Users.RandomCity1).verifyYourFirstNameFieldEquals(Users.RandomCity1);
	String RepFirstName = s.YourFirstNameField.getText();
	System.out.println(RepFirstName);
		
	s.typeInToYourLastNameField(Users.RandomCity2).verifyYourLastNameFieldEquals(Users.RandomCity2);
	String RepLastName = s.YourLastNameField.getText();
	System.out.println(RepLastName);
		
	s.typeInToSetPasswordField(Users.RandomCity3).verifySetPasswordFieldEquals(Users.RandomCity3);
	s.typeInToConfirmPasswordField(Users.RandomCity4).verifyConfirmPasswordFieldEquals(Users.RandomCity4);
	String CompanyPassword = s.SetPasswordField.getText();
	System.out.println(CompanyPassword);
		
	s.typeInToPhoneNumberField(Users.RandomPhone).verifyPhoneNumberFieldEquals(Users.RandomPhone);
	String CompanyPhone = s.PhoneNumberField.getText();
	System.out.println(CompanyPhone);
	
    s.clickOnAgreedCheckBoxElement().clickOnJoinButtonElement().verifyPasswordDoesntMatchErrorEquals();
    s.verifyPasswordDoesntMatchHeaderPopUpEquals();
	}
  
@Test
	public void f_CompanySignUpCheckingEachRequiredFieldTest() {
	
	checkTitleAndUrl(PageTitles.TitlePageTitleText, Links.MainLink);

	t.clickOnHeaderSignUpElement();

		checkTitleAndUrl(PageTitles.TitlePageTitleText, Links.SignUpLink);
		
	s.clickOnInactiveJoinButtonElement();

	s.clickOnAgreedCheckBoxElement().clickOnJoinButtonElement();
	
	checkTitleAndUrl(PageTitles.TitlePageTitleText, Links.SignUpLink);
		
	s.typeInToCompanyNameField(Users.RandomName).verifyCompanyNameFieldEquals(Users.RandomName);
	String CompanyName = s.CompanyNameField.getText();
	System.out.println(CompanyName);
	
	s.clickOnJoinButtonElement();

	checkTitleAndUrl(PageTitles.TitlePageTitleText, Links.SignUpLink);

	s.typeInToEmailField(Users.RandomLastName).verifyEmailFieldEquals(Users.RandomLastName);
	String CompanyEmail = s.EmailField.getText();
	System.out.println(CompanyEmail);
	
	s.clickOnJoinButtonElement();
	
	checkTitleAndUrl(PageTitles.TitlePageTitleText, Links.SignUpLink);

	s.typeInToYourFirstNameField(Users.RandomCity1).verifyYourFirstNameFieldEquals(Users.RandomCity1);
	String RepFirstName = s.YourFirstNameField.getText();
	System.out.println(RepFirstName);
	
	s.clickOnJoinButtonElement();
	
	checkTitleAndUrl(PageTitles.TitlePageTitleText, Links.SignUpLink);
	
	s.typeInToYourLastNameField(Users.RandomCity2).verifyYourLastNameFieldEquals(Users.RandomCity2);
	String RepLastName = s.YourLastNameField.getText();
	System.out.println(RepLastName);
	
	s.clickOnJoinButtonElement();
	
	checkTitleAndUrl(PageTitles.TitlePageTitleText, Links.SignUpLink);
	
	s.typeInToSetPasswordField(Users.RandomCity3).verifySetPasswordFieldEquals(Users.RandomCity3);
	s.typeInToConfirmPasswordField(Users.RandomCity4).verifyConfirmPasswordFieldEquals(Users.RandomCity4);
	String CompanyPassword = s.SetPasswordField.getText();
	System.out.println(CompanyPassword);
	
	s.typeInToPhoneNumberField(Users.RandomPhone).verifyPhoneNumberFieldEquals(Users.RandomPhone);
	String CompanyPhone = s.PhoneNumberField.getText();
	System.out.println(CompanyPhone);
}


@Test
	public void f_CompanySignUpPositiveTest() {
	
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