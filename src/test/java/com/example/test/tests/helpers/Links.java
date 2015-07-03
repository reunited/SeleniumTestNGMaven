package com.example.test.tests.helpers;

import com.example.test.tests.base.BaseTest;

public class Links extends BaseTest {
	
//Prod Links
	
	private String PrivacyPolicyProdLink		   	     	= "https://";
	
//QA Links

	private String QAStaff	                            	= "http://";

//Beta Links
	
	private String MainLink									= "http://";
	
//Other Links
	
	private String ZendeskLink						 		= "https://";
	private String Support									= "http://";
	private String ZendeskAgentPage					 		= "https://";
	
	public String getPrivacyPolicyProdLink() {
		return PrivacyPolicyProdLink;
	}

	public String getMainLink() {
		return MainLink;
	}
	public String getZendeskLink() {
		return ZendeskLink;
	}
	public String getSupport() {
		return Support;
	}
	public String getZendeskAgentPage() {
		return ZendeskAgentPage;
	}
	public String getQAStaff() {
		return QAStaff;
	}
}