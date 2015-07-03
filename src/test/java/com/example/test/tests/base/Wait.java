package com.example.test.tests.base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Wait {
	
	private final MyDriver driver;
	
	public Wait(MyDriver driver) {
		this.driver = driver;
	}
	
	public void wait(ExpectedCondition<WebElement> condition) {
		driver.createWait(10).pollingEvery(2, TimeUnit.SECONDS).until(condition);
	}
	
	public void clickable(WebElement element) {
		wait(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void visible(WebElement element) {
		wait(ExpectedConditions.visibilityOf(element));
	}

}