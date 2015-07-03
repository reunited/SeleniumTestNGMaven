package com.example.test.helpers;

import org.openqa.selenium.support.ui.Select;

import com.example.test.tests.base.BaseService;
import com.example.test.tests.base.BaseTest;
import com.example.test.tests.pages.candidate.CandidateTitlePageEditProfileInfo;

public class CandidateService extends BaseService {
	
	public void selectNotAvailable(CandidateTitlePageEditProfileInfo c, String driverType) {
		wait.visible(c.getAvailabilityDropDown());
		wait.clickable(c.getAvailabilityDropDown());
		if(BaseTest.browserFirefox.equals(driverType)) {
		as.type(c.getAvailabilityDropDown(), c.getNotAvailableText());
		} 
		 	else {
		 		new Select(c.getAvailabilityDropDown()).selectByValue("0");
		 	}
	}
	
	public void selectAvailableForFullTime(CandidateTitlePageEditProfileInfo c, String driverType) {
		wait.visible(c.getAvailabilityDropDown());
		wait.clickable(c.getAvailabilityDropDown());
		if(BaseTest.browserFirefox.equals(driverType)){
			as.type(c.getAvailabilityDropDown(), c.getAvailableForFullTimeText());
		}
		else {
			new Select(c.getAvailabilityDropDown()).selectByValue("1");	
		}
	}
	
	public void selectAvailableForPartTimeOnly(CandidateTitlePageEditProfileInfo c, String driverType)  {
		wait.visible(c.getAvailabilityDropDown());
		wait.clickable(c.getAvailabilityDropDown());
		if(BaseTest.browserFirefox.equals(driverType)) {
			 as.type(c.getAvailabilityDropDown(), c.getAvailableForPartTimeOnlyText());
		} 
		 	else {
				new Select(c.getAvailabilityDropDown()).selectByValue("2");
		 	}
	}
	
	private void WaitClickAndTypeCountry(CandidateTitlePageEditProfileInfo c, String string) {
		
		wait.clickable(c.getCountrySelectDropDown());
		wait.visible(c.getCountrySelectDropDown());
        as.click(c.getCountrySelectDropDown());
        wait.visible(c.getCountrySelectDropDownSearchField());
        as.type(c.getCountrySelectDropDownSearchField(), string);
        wait.visible(c.getCountrySelectDropDownSearchResult());
        as.click(c.getCountrySelectDropDownSearchResult());
	}
	
	private void WaitClickAndTypeState(CandidateTitlePageEditProfileInfo c, String string) {
		
		wait.visible(c.getStateDropDown());
		wait.clickable(c.getStateDropDown());
        as.click(c.getStateDropDown());
        wait.visible(c.getStateDropDownInputField());
        wait.clickable(c.getStateDropDownInputField());
        as.type(c.getStateDropDownInputField(), string);
        wait.visible(c.getStateSearchResult());
        wait.clickable(c.getStateSearchResult());
        as.click(c.getStateSearchResult());
        
	}
	
	public void TypeInToCountrySelectDropDownSearchField(CandidateTitlePageEditProfileInfo c) {
		{
	        String[] objects = { 
	        		
	    "Albania", "Australia", "Brazil", "Bangladesh", "Cambodia", "Cameroon", "Canada", "Taiwan", "Tajikistan"	};
	        
	        int length = objects.length;
			{
	            int rand = (int) (Math.random() * length);
	            WaitClickAndTypeCountry(c, objects[rand]);
	        }
	    }
	}

	public void TypeInToStateDropDownInputField(CandidateTitlePageEditProfileInfo c) {
		
		if (c.getCountrySelectDropDownSearchResultToCopy().getText().equals("Albania")) 
		{
			System.out.println("found match");
	        String[] objects = { 
	        		
	    "Berat", "Elbasan", "Fier" 	};
	        
	        int length = objects.length;
			{
	            int rand = (int) (Math.random() * length);
	            WaitClickAndTypeState(c, objects[rand]);
	        }
		}
		
		else if (c.getCountrySelectDropDownSearchResultToCopy().getText().equals("Australia"))
		{
			System.out.println("found match");
	        String[] objects = { 
	        		
	    "Queensland", "Tasmania", "Victoria" 	};
	        
	        int length = objects.length;
			{
	            int rand = (int) (Math.random() * length);
	            WaitClickAndTypeState(c, objects[rand]);
	        }
		}
		
		else if (c.getCountrySelectDropDownSearchResultToCopy().getText().equals("Brazil"))
		{
			System.out.println("found match");
	        String[] objects = { 
	        		
	    "Acre", "Bahia", "Sergipe"  };
	        
	        int length = objects.length;
			{
	            int rand = (int) (Math.random() * length);
	            WaitClickAndTypeState(c, objects[rand]);  
	        }
		}
		
		else if (c.getCountrySelectDropDownSearchResultToCopy().getText().equals("Bangladesh"))
		{
			System.out.println("found match");
	        String[] objects = { 
	        		
	    "Khulna bibhag", "Dhaka bibhag", "Barisal bibhag" 	};
	        
	        int length = objects.length;
			{
	            int rand = (int) (Math.random() * length);
	            WaitClickAndTypeState(c, objects[rand]);
	        }
		}
		
		else if (c.getCountrySelectDropDownSearchResultToCopy().getText().equals("Cambodia"))
		{
			System.out.println("found match");
	        String[] objects = { 
	        		
	    "Battambang", "Kampot", "Pousaat" 	};
	        
	        int length = objects.length;
			{
	            int rand = (int) (Math.random() * length);
	            WaitClickAndTypeState(c, objects[rand]);
	        }
		}
		
		else if (c.getCountrySelectDropDownSearchResultToCopy().getText().equals("Cameroon"))
		{
			System.out.println("found match");
	        String[] objects = { 
	        		
	   "Far North", "South", "West" 	};
	        
	        int length = objects.length;
			{
	            int rand = (int) (Math.random() * length);
	            WaitClickAndTypeState(c, objects[rand]);
	        }
		}
		
		else if (c.getCountrySelectDropDownSearchResultToCopy().getText().equals("Canada"))
		{
			System.out.println("found match");
	        String[] objects = { 
	        		
	   "Ontario", "Yukon", "Manitoba" 	};
	        
	        int length = objects.length;
			{
	            int rand = (int) (Math.random() * length);
	            WaitClickAndTypeState(c, objects[rand]);
	        }
		}
		
		else if (c.getCountrySelectDropDownSearchResultToCopy().getText().equals("Taiwan"))
		{
			System.out.println("found match");
	        String[] objects = { 
	        		
	    "Hualien", "Miaoli", "Tainan" 	};
	        
	        int length = objects.length;
			{
	            int rand = (int) (Math.random() * length);
	            WaitClickAndTypeState(c, objects[rand]);
	        }
		}
		
		else if (c.getCountrySelectDropDownSearchResultToCopy().getText().equals("Tajikistan"))
		{
			System.out.println("found match");
	        String[] objects = { 
	        		
	    "Gorno-Badakhshan", "Khatlon", "Sughd" 	};
	        
	        int length = objects.length;
			{
	            int rand = (int) (Math.random() * length);
	            WaitClickAndTypeState(c, objects[rand]);
	        }
		}
	}
}