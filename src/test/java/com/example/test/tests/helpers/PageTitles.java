package com.example.test.tests.helpers;

import com.example.test.tests.base.BaseTest;

public class PageTitles extends BaseTest {
	
	private String TitlePageTitleText = "";
	private String AppPageTitleText = " - The App";
	private String LoginPageTitleText = " - Login";
	private String CandidateMainPageTitle = " - The App";
	private String AdsSettings = "Ads Settings";
	private String SupportCenter = "Support Center";
	private String StaffMainPageTitle = " - Staff UI";
	
	public String getTitlePageTitleText() {
		return TitlePageTitleText;
	}
	public String getLoginPageTitleText() {
		return LoginPageTitleText;
	}
	public String getCandidateMainPageTitle() {
		return CandidateMainPageTitle;
	}
	public String getAdsSettings() {
		return AdsSettings;
	}
	public String getSupportCenter() {
		return SupportCenter;
	}
	public String getStaffMainPageTitle() {
		return StaffMainPageTitle;
	}
	public String getAppPageTitleText() {
		return AppPageTitleText;
	}
}