package UtilityLayer;

import BaseLayer.BaseClass;

public class Alert extends BaseClass{
	
	public static void clickOnOkbtn() {
	    driver.switchTo().alert().accept();
	}

	public static void clickOncancelbtn() {
		driver.switchTo().alert().dismiss();
	}
	
	public static void sendkeys(String value) {
		driver.switchTo().alert().sendKeys(value);
	}
	
	public static String captureText() {
		return driver.switchTo().alert().getText();
	}
	
	public static void EnterTextandClickonOk(String value) {
		driver.switchTo().alert().sendKeys(value);
		driver.switchTo().alert().accept();
	}
	
	public static void EnterTextandClickoncancel(String value) {
		driver.switchTo().alert().sendKeys(value);
		driver.switchTo().alert().dismiss();
	}
	
	public static String captureTextandClickonOk() {
		String value=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return value;
	}
	
	public static String captureTextandClickonCancel() {
		String value=driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();
		return value;
	}
	
}

