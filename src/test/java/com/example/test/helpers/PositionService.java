package com.example.test.helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.example.test.tests.base.BaseService;
import com.example.test.tests.base.BaseTest;
import com.example.test.tests.pages.candidate.CandidateTitlePage;
import com.example.test.tests.pages.candidate.CandidateTitlePageHeader;
import com.example.test.tests.pages.candidate.CandidateTitlePageManagePositions;
import com.example.test.tests.pages.candidate.CandidateTitlePageManagePositionsAdd;

public class PositionService extends BaseService {
	
	public void NavigateToAddPositionPage(CandidateTitlePage a, CandidateTitlePageManagePositions b,
			CandidateTitlePageHeader ct) {
		
		wait.clickable(ct.getHeaderLogo());
		wait.visible(ct.getHeaderLogo());
		as.click(ct.getHeaderLogo());
		wait.clickable(a.getResumeSquarePaperIcon());
		as.click(a.getResumeSquarePaperIcon());
		wait.clickable(a.getResumeManagePositionsButton());
		as.click(a.getResumeManagePositionsButton());	
		wait.clickable(b.getAddPositionButton());
		as.click(b.getAddPositionButton());
	}
	
	public void FillAllFormsAboveDates(CandidateTitlePage a, CandidateTitlePageManagePositions b, 
			CandidateTitlePageManagePositionsAdd c, String company, String jobTitle, 
			String city, String description) {
		
		wait.visible(c.getCompanyField());
		wait.visible(c.getJobTitleField());
		wait.visible(c.getDescriptionField());
		as.clear(c.getCompanyField());
		as.type(c.getCompanyField(), company);
		as.clear(c.getJobTitleField());
		as.type(c.getJobTitleField(), jobTitle);
		wait.clickable(c.getCountryDropDown());
		as.click(c.getCountryDropDown());
		TypeInToCountryDropDownInputField(c);
		wait.clickable(c.getSearchResultOfCountry());
		as.click(c.getSearchResultOfCountry());
		wait.visible(c.getStateDropDown());
		wait.clickable(c.getStateDropDown());
		wait.visible(c.getCityField());
		wait.clickable(c.getCityField());
		as.click(c.getStateDropDown());
		TypeInToStateDropDownInputField(c, c.getCountryDropDown());
		wait.clickable(c.getSearchResultOfState());
		as.click(c.getSearchResultOfState());
		as.clear(c.getCityField());
		as.type(c.getCityField(), city);
		as.clear(c.getDescriptionField());
		as.type(c.getDescriptionField(), description);
	}
	
	public void TypeInToCountryDropDownInputField(CandidateTitlePageManagePositionsAdd c) {
		 
		{
	        String[] objects = { 
	        		
	"Albania", "Australia", "Brazil", "Bangladesh", "Cambodia", "Cameroon", "Canada", "Taiwan", "Tajikistan" };
	        
	        int length = objects.length;
			{
	            int rand = (int) (Math.random() * length);
	            as.type(c.getCountryDropDownInputField(), objects[rand]);
	        }
	    }
	}
	
	public void TypeInToStateDropDownInputField(CandidateTitlePageManagePositionsAdd c, WebElement countryDropDown)  {
		
		if (as.getText(countryDropDown).equals("Albania"))
		{
			System.out.println("found match");
	        String[] objects = { 
	        		
	   "Berat", "Elbasan", "Fier" };
	        
	        int length = objects.length;
			{
	            int rand = (int) (Math.random() * length);
	            as.type(c.getStateDropDownInputField(), objects[rand]);
	        }
		}
		
		else if (as.getText(countryDropDown).equals("Australia"))
		{
			System.out.println("found match");
	        String[] objects = { 
	        		
	   "Queensland", "Tasmania", "Victoria", 	};
	        
	        int length = objects.length;
			{
	            int rand = (int) (Math.random() * length);
	            as.type(c.getStateDropDownInputField(), objects[rand]);
	        }
		}
		
		else if (as.getText(countryDropDown).equals("Brazil"))
		{
			System.out.println("found match");
	        String[] objects = { 
	        		
	   "Acre", "Bahia", "Sergipe", 	};
	        
	        int length = objects.length;
			{
	            int rand = (int) (Math.random() * length);
	            as.type(c.getStateDropDownInputField(), objects[rand]);
	        }
		}
		
		else if (as.getText(countryDropDown).equals("Bangladesh"))
		{
			System.out.println("found match");
	        String[] objects = { 
	        		
	   "Khulna bibhag", "Dhaka bibhag", "Barisal bibhag", 	};
	        
	        int length = objects.length;
			{
	            int rand = (int) (Math.random() * length);
	            as.type(c.getStateDropDownInputField(), objects[rand]);
	        }
		}
		
		else if (as.getText(countryDropDown).equals("Cambodia"))
		{
			System.out.println("found match");
	        String[] objects = { 
	        		
	  "Battambang", "Kampot", "Pousaat", 	};
	        
	        int length = objects.length;
			{
	            int rand = (int) (Math.random() * length);
	            as.type(c.getStateDropDownInputField(), objects[rand]);
	        }
		}
		
		else if (as.getText(countryDropDown).equals("Cameroon"))
		{
			System.out.println("found match");
	        String[] objects = { 
	        		
	   "Far North", "South", "West", 	};
	        
	        int length = objects.length;
			{
	            int rand = (int) (Math.random() * length);
	            as.type(c.getStateDropDownInputField(), objects[rand]);
	        }
		}
		
		else if (as.getText(countryDropDown).equals("Canada"))
		{
			System.out.println("found match");
	        String[] objects = { 
	        		
	   "Ontario", "Yukon", "Manitoba", 	};
	        
	        int length = objects.length;
			{
	            int rand = (int) (Math.random() * length);
	            as.type(c.getStateDropDownInputField(), objects[rand]);
	        }
		}
		
		else if (as.getText(countryDropDown).equals("Taiwan"))
		{
			System.out.println("found match");
	        String[] objects = { 
	        		
	   "Hualien", "Miaoli", "Tainan", 	};
	        
	        int length = objects.length;
			{
	            int rand = (int) (Math.random() * length);
	            as.type(c.getStateDropDownInputField(), objects[rand]);
	        }
		}
		
		else if (as.getText(countryDropDown).equals("Tajikistan"))
		{
			System.out.println("found match");
	        String[] objects = { 
	        		
	  "Gorno-Badakhshan", "Khatlon", "Sughd", 	};
	        
	        int length = objects.length;
			{
	            int rand = (int) (Math.random() * length);
	            as.type(c.getStateDropDownInputField(), objects[rand]);
	        }
		}
	}

	public void TypeRandomSelectedInToStartDateMonth(CandidateTitlePageManagePositionsAdd c)  {
	 
	{
        String[] objects = { 
        		
    "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        
        int length = objects.length;
		{
            int rand = (int) (Math.random() * length);
            wait.clickable(c.getStartDateMonth());
            as.type(c.getStartDateMonth(), objects[rand]);
        }
    }
}

	public void TypeRandomSelectedInToEndDateMonth(CandidateTitlePageManagePositionsAdd c, String driverType) {

		{
				if (BaseTest.browserFirefox.equals(driverType))
		{
					String[] objects = { 
	        		
	"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
	        
	        int length = objects.length;
			{
	            int rand = (int) (Math.random() * length);
	            wait.clickable(c.getEndDateMonth());
	            as.type(c.getEndDateMonth(), objects[rand]);
	        }
				}
				else {
			{
				 	String[] object = { 
				        
	"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"	};
				                
				        int length = object.length; {
				            int rand = (int) (Math.random() * length); 
				            wait.clickable(c.getEndDateMonth());
				            as.click(c.getEndDateMonth());
								new Select(c.getEndDateMonth()).selectByValue(object[rand]);
				        	}
						}
					}
				}	
			}
	
	public void TypeRandomSelectedInToStartYearField(CandidateTitlePageManagePositionsAdd c, String driverType)  {
 
		{	
		if (BaseTest.browserFirefox.equals(driverType)) {
		
	        String[] objects = { 
	        		
	"1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", 
	"1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000"	};
	        
	        int length = objects.length; {
	            int rand = (int) (Math.random() * length);
	            wait.clickable(c.getStartDateYear());
	            as.type(c.getStartDateYear(), objects[rand]);
	            }
			}
		else {
			{
	        String[] object = { 
	                		
	"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"	};
	                
	        int lengt = object.length; {
	            int rand = (int) (Math.random() * lengt); 
	            wait.clickable(c.getStartDateYear());
	            as.click(c.getStartDateYear());
					new Select(c.getStartDateYear()).selectByValue(object[rand]);
	        	}
			}
		}
	}	
}

	public void TypeRandomSelectedInToEndDateYear(CandidateTitlePageManagePositionsAdd c, String driverType)  {
	
	{	
		if (BaseTest.browserFirefox.equals(driverType)) {
	
        String[] objects = { 
        		
    "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014"	};
        
        int length = objects.length; {
            int rand = (int) (Math.random() * length);
            wait.clickable(c.getEndDateYear());
            as.type(c.getEndDateYear(), objects[rand]);
            }
		}
	
	else {
		{
        String[] object = { 
                		
    "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11" };
                
        int length = object.length; {
            int rand = (int) (Math.random() * length); 
            wait.clickable(c.getEndDateYear());
            as.click(c.getEndDateYear());
				new Select(c.getEndDateYear()).selectByValue(object[rand]);
        	}
		}
	}
}	
}

	public void AddNewPositionFromCandidateTitlePageAndSetAsWorkingCurrently(CandidateTitlePageHeader ct, 
			CandidateTitlePage a, CandidateTitlePageManagePositions b, CandidateTitlePageManagePositionsAdd c, 
			String company, String jobTitle, String city, String description, String browserType) {

		NavigateToAddPositionPage(a, b, ct);
		FillAllFormsAboveDates(a, b, c, company, jobTitle, city, description);
		as.click(c.getStartDateMonth());
		TypeRandomSelectedInToStartDateMonth(c);
		as.click(c.getStartDateYear());
		TypeRandomSelectedInToStartYearField(c, browserType);
		as.click(c.getCheckbox());
		wait.visible(c.getSaveButton());
		wait.clickable(c.getSaveButton());
		as.click(c.getSaveButton());
	}

	public void AddNewPositionFromCandidateTitlePageAndSetEndDate (CandidateTitlePageHeader ct, 
			CandidateTitlePage a, CandidateTitlePageManagePositions b, CandidateTitlePageManagePositionsAdd c, 
			String company, String jobTitle, String city, String description, String startMonth, 
			String startYear, String endMonth, String endYear, String browserType) {
	
		NavigateToAddPositionPage(a, b, ct);
		FillAllFormsAboveDates(a, b, c, company, jobTitle, city, description);
		as.click(c.getStartDateMonth());
		TypeRandomSelectedInToStartDateMonth(c);
		as.click(c.getStartDateYear());
		TypeRandomSelectedInToStartYearField(c, browserType);
		as.click(c.getEndDateMonth());
		TypeRandomSelectedInToEndDateMonth(c, browserType);
		as.click(c.getSaveButton());
		as.click(c.getEndDateYear());
		TypeRandomSelectedInToEndDateYear(c, browserType);
		as.click(c.getSaveButton());
	}	

	public void DeleteFisrtJobFromCandidateTitlePage(CandidateTitlePage a, CandidateTitlePageManagePositions b) {
		as.click(a.getResumeManagePositionsButton());	
		as.click(b.getFirstDeleteIcon());
	}

	public void DeleteSecondJobFromCandidateTitlePage(CandidateTitlePage a, CandidateTitlePageManagePositions b) {
	as.click(a.getResumeManagePositionsButton());	
	as.click(b.getSecondDeleteIcon());
	}

	public void DeleteThirdJobFromCandidateTitlePage(CandidateTitlePage a, CandidateTitlePageManagePositions b) {
		as.click(a.getResumeManagePositionsButton());	
		as.click(b.getThirdDeleteIcon());
	}

public void DeleteAllJobsFromCandidateTitlePage(CandidateTitlePage a, CandidateTitlePageManagePositions b,
			CandidateTitlePageHeader ct) {
	
		wait.clickable(ct.getHeaderLogo());
		wait.visible(ct.getHeadeRLogo());
		as.click(ct.getHeaderLogo());
		wait.clickable(a.getResumeSquarePaperIcon());
		as.click(a.getResumeSquarePaperIcon());
		wait.clickable(a.getResumeManagePositionsButton());
		as.click(a.getResumeManagePositionsButton());
		try {
			 while (b.getFirstDeleteIcon().isDisplayed()) {
			 as.clickDeleteAndConfirmIfPresent(b.getFirstDeleteIcon(), a.getDeletingPositionYesButton()); } 
		 	} catch(Exception e) {
		}
		}

	public void AddNewPositionFromCandidateTitlePageAndSetRandomEndDate (CandidateTitlePage a, 
		CandidateTitlePageHeader ct, CandidateTitlePageManagePositions b, CandidateTitlePageManagePositionsAdd c, 
		String company, String jobTitle, String city, String description, String browserType) {

		NavigateToAddPositionPage(a, b, ct);
		FillAllFormsAboveDates(a, b, c, company, jobTitle, city, description);
		TypeRandomSelectedInToStartDateMonth(c);
		TypeRandomSelectedInToStartYearField(c, browserType);
		TypeRandomSelectedInToEndDateMonth(c, browserType);
		TypeRandomSelectedInToEndDateYear(c, browserType);
		as.click(c.getSaveButton());
	}	

	public void DeleteAllPositionsFromCandidateTitlePageManagePositionsPage (CandidateTitlePage a, 
			CandidateTitlePageManagePositions b) {

		as.click(a.getResumeManagePositionsButton());

		try {
			while (b.getFirstDeleteIcon() !=null) {
				as.click(b.getFirstDeleteIcon());
				as.click(a.getDeletingPositionYesButton());
			} 
		} catch(Exception e) {
	}
}
}