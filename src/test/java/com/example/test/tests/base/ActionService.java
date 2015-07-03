package com.example.test.tests.base;

import org.openqa.selenium.WebElement;
import static org.testng.Assert.*;

public class ActionService {
	
	public void isPresent(WebElement el) {
		assertTrue(el.isDisplayed());
	}
	
	public void click(WebElement el) {
		isPresent(el);
		el.click();
	}
	
	public void isPresentAndCheckText(WebElement el, String text) {
		assertTrue(el.isDisplayed());
		assertEquals(el.getText(), text);
	}
	
	public void checkText(WebElement el, String text) {
		assertEquals(el.getText(), text);
	}

	public void checkTitleAndUrl(String title, String url, MyDriver driver) {
		assertEquals(driver.getTitle(), title, "not matches");
		assertEquals(driver.getCurrentUrl(), url, "not matches");
	}
	
	public void checkTitle(String title, MyDriver driver) {
		assertEquals(driver.getTitle(), title);
	}
	
	public void checkStrings(String text1, String text2) {
		assertEquals(text1, text2);
	}
		
	public void checkAttribute(WebElement el, String attr, String text) {
		assertEquals(el.getAttribute(attr), text);
	}
	
	public void type(WebElement el, String text) {
		isPresent(el);
		el.sendKeys(text);
	}
	
	public void checkValue(WebElement el, String text) {
		checkAttribute(el, "value", text);
	}
	
	public void checkPlaceholder(WebElement el, String text) {
		checkAttribute(el, "placeholder", text);
	}
	
	public void clear(WebElement el) {
		isPresent(el);
		el.clear();
	}
	
	public void checkEitherElementPresent(WebElement one, WebElement two) {
		try {
			isPresent(one);
			System.out.println("First element displayed");
		}
		catch (Exception e)
		{ 
			isPresent(two);
			System.out.println("Second element displayed");
		}
	}
	
	public void checkEitherElementAndTextPresent(WebElement one, String textOne, WebElement two, String textTwo) {
		if (one.getText().equalsIgnoreCase(textOne)) {
			System.out.println(textOne);
		}
		else if (two.getText().equalsIgnoreCase(textTwo)) {
			System.out.println(textTwo);
		}
	}
	
	public void checkAvailabiltyValue(WebElement element, String availableForFT, String unavailable, String availableForPT) {
		if (element.getText().equalsIgnoreCase(availableForFT)) {
			assertEquals(element.getText(), availableForFT);
			System.out.println("Candidate is " + availableForFT);
		}
		else if (element.getText().equalsIgnoreCase(unavailable)) {
			assertEquals(element.getText(), unavailable);
			System.out.println("Candidate is " + unavailable);
		}
		else {
			assertEquals(element.getText(), availableForPT);
			System.out.println("Candidate is " + availableForPT);
		}
	}
	
	public String getText(WebElement el) {
		return el.getText();
	}

	public void isElementNotPresent(WebElement el){
    try {
    	assertFalse(el.isDisplayed());
    } catch (Exception e) {
    }
}
	
	public void clickDeleteAndConfirmIfPresent(WebElement el, WebElement ele) {
		if (el.isDisplayed()) {
			el.click();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			ele.click();
			System.out.println("Sucessfully deleted");
		}
		else {
			System.out.println("Element not available");
		}
	}
}