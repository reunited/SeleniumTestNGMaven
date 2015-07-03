package com.example.test.tests.base;

import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyDriver {
	
	private final WebDriver driver;
	private final String type;
	
	public MyDriver(String type, WebDriver driver) {
		this.driver = driver;
		this.type = type;
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void goToUrl(String url) {
		driver.get(url);
	}
	
	public <T> T initPage(Class<T> clazz) {
		return PageFactory.initElements(driver, clazz);
	}
	
	public String getBrowser() {
		return type;
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public void refresh() {
		driver.navigate().refresh();
	}
	
	public void deleteCookies() {
		driver.manage().deleteAllCookies();
	}
	
	public WebDriverWait createWait(long timeout) {
		return new WebDriverWait(driver, timeout);
	}
	
	public void back() {
		driver.navigate().back();
	}
	
	public void executeJavascript(String script) {
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript(script);
	}
	
	public void close() {
		driver.close();
		driver.quit();
	}
	
	public void closeNotQuit() {
		driver.close();
	}
	
	public String getWindowHandle() {
		return driver.getWindowHandle();
	}
	
	public Collection<String> getWindowHandles() {
		return driver.getWindowHandles();
	}
	
	public void switchToWindow(String winHandle) {
		driver.switchTo().window(winHandle);
	}
	
	public WebElement findItem(String location){
		return driver.findElement(By.xpath(location));
	}
}
