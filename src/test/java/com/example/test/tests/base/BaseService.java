package com.example.test.tests.base;

public abstract class BaseService {
	
	protected MyDriver driver;
	protected Wait wait;
	
	protected ActionService as = new ActionService();
	
	public MyDriver getDriver() {
		return driver;
	}
	
	public void setDriver(MyDriver driver) {
		this.driver = driver;
	}
	
	public Wait getWait() {
		return wait;
	}
	
	public void setWait(Wait wait) {
		this.wait = wait;
	}
}
