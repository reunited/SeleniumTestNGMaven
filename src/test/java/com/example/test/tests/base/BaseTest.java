package com.example.test.tests.base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public abstract class BaseTest {
	
	public static final String browserFirefox = "firefox";
	public static final String browserChrome = "chrome";
	
	private String baseUrl = null;
	
	private ITestContext testContext;
	
	protected Wait wait;
	
	private MyDriver driver;
	
	private Map<Class<?>, BaseService> services = new HashMap<Class<?>, BaseService>();
	
	protected final ActionService as = new ActionService();

	private WebDriver createDriver(String hubUrl, String browser, String baseUrl, boolean isLocal) {
		if (isLocal) {
			if (browserFirefox.equalsIgnoreCase(browser))
				return new FirefoxDriver();
			else if (browserChrome.equalsIgnoreCase(browser)) {
				System.setProperty("webdriver.chrome.driver", getFilePath("/chromedriver.exe"));
				return new ChromeDriver();
			}

			Assert.assertTrue(false, "Browser " + browser + " is not supported");
		} else {
			DesiredCapabilities capability = DesiredCapabilities.firefox();
			capability.setBrowserName(browser); 
			try {
				RemoteWebDriver driver = new RemoteWebDriver(new URL(hubUrl), capability);
				driver.setFileDetector(new LocalFileDetector());
				return driver;
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
		
		return null; 
	  }

	public String getFilePath(String file) {
		try {
			URL url = BaseTest.class.getResource(file);
			String path = new File(url.toURI()).getAbsolutePath();
			return path;
		 } catch(Exception e) {
		  throw new RuntimeException("No file found: " + file);
		}
	}
	
	@Parameters({"hub.url", "browser", "site.url", "is_local"})
	@BeforeClass
	final public void beforeClass(ITestContext testContext, 
		@Optional ("http://216.38.137.42:4444/wd/hub") String hubUrl,
		@Optional ("chrome") String browser, 
		@Optional ("http://") String baseUrl, 
		@Optional ("true") boolean isLocal) {
		
		this.baseUrl  = baseUrl;		
		this.testContext = testContext;
		
		try {
			onBeforeClassBefore();
		} catch(Exception e) { e.printStackTrace(); }
		
		driver =  new MyDriver(browser, createDriver(hubUrl, browser, baseUrl, isLocal));
		wait = new Wait(driver);
		
		gotoBaseUrl();
		
		try {
			onBeforeClassAfter();
		} catch(Exception e) { e.printStackTrace(); }
	}
	
	@AfterClass final public void afterClass()  {
		try {
			onAfterClassBefore();
		} catch(Exception e) { e.printStackTrace(); }
		
		driver.close();
		
		try {
			onAfterClassAfter();
		} catch(Exception e) { e.printStackTrace(); }
	}
	
	@BeforeMethod final public void beforeMethod() {
		try {
			onBeforeMethodBefore();
		} catch(Exception e) { e.printStackTrace(); }
		
		try {
			onBeforeMethodAfter();
		} catch(Exception e) { e.printStackTrace(); }
	}
	
	@AfterMethod final public void afterMethod() {
		try {
			onAfterMethodBefore();
		} catch(Exception e) { e.printStackTrace(); }
		
		try {
			onAfterMethodAfter();
		} catch(Exception e) { e.printStackTrace(); }
	}
	
	public void onBeforeClassBefore() throws Exception {}
	public void onBeforeClassAfter() throws Exception {}
	public void onAfterClassBefore() throws Exception {}
	public void onAfterClassAfter() throws Exception {}
	
	public void onBeforeMethodBefore() throws Exception {}
	public void onBeforeMethodAfter() throws Exception {}
	public void onAfterMethodBefore() throws Exception {}
	public void onAfterMethodAfter() throws Exception {}
	
	public ITestContext getTestContext() {
		return testContext;
	}
	
	public String getBaseUrl() {
		return baseUrl;
	}
	
	public void gotoBaseUrl() {
		driver.goToUrl(baseUrl);
	}
		
	public <T> T initPage(Class<T> clazz) {
		return driver.initPage(clazz);
	}
		
	public MyDriver getDriver() {
		return driver;
	}
	
	@SuppressWarnings("unchecked")
	public <T extends BaseService> T getService(Class<T> clazz) {
		T result = (T)services.get(clazz);
		
		if(result == null) {
			try {
				result = clazz.getConstructor().newInstance();
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
			result.setDriver(driver);
			result.setWait(wait);
			services.put(clazz, result);
		}
		
		return result;
	}
}