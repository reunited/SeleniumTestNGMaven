package com.example.test.helpers;

import com.example.test.tests.base.BaseService;
import com.example.test.tests.helpers.Users;
import com.example.test.tests.pages.NewTitlePage;

public class CompanyService extends BaseService {	
	
	public void CreateRandomCompany(NewTitlePage n, Users u) {
		//creating new company with random Company Name, Email, Representative Name and Last Name, Password and Phone number
		
		String CompanyName = u.getRandomCompanyName();
		String CompanyEmail = u.generateEmail();
		String RepresentativeName = u.getRandomName();
		String RepresentativeLastName = u.getRandomLastName();
		String Password = u.getRandomPassword();
		String Phone = u.getRandomPhone();
		
		as.click(n.getPostAJobButton());
		as.type(n.getInputFieldCompanyName(), CompanyName);
		as.type(n.getInputFieldEmail(), CompanyEmail);
		as.type(n.getInputFieldFirstName(), RepresentativeName);
		as.type(n.getInputFieldLastName(), RepresentativeLastName);
		as.type(n.getInputFieldPassword(), Password);
		as.type(n.getInputFieldConfirmationPassword(), Password);
		as.type(n.getInputFieldPhoneNumber(), Phone);
		as.click(n.getCheckBox());
		//as.click(n.getJoinButton());
	}	
}