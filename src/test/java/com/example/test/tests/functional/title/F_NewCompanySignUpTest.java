package com.example.test.tests.functional.title;

import org.testng.annotations.Test;

import com.example.test.helpers.CompanyService;
import com.example.test.tests.base.BaseTest;
import com.example.test.tests.helpers.Users;
import com.example.test.tests.pages.NewTitlePage;

public class F_NewCompanySignUpTest extends BaseTest {
	
	private NewTitlePage n = null;
	private Users u = null;
	
	@Override 
	public void onBeforeClassAfter() {
		n = initPage(NewTitlePage.class);
		u = initPage(Users.class);
	}
	
@Test
public void CompanySignUpProcess() {
	getService(CompanyService.class).CreateRandomCompany(n, u);
	}
}