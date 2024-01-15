package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class DropDown extends BaseClass {

	public static void selectByVisibleText(WebElement wb, String value) {

//		if (wb.isDisplayed() && wb.isEnabled()) {
//		new Select(wb).selectByVisibleText(value);
//	}

//		// create object of WebDriverWait class by using driver instance and Duration in time.
//					 
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//
//		// use visibilityOf() method to check element is visible or not
//		WebElement waitwb = wait.until(ExpectedConditions.visibilityOf(wb));
//
//		// create Object of Select class by passing WebElement
//		Select sel = new Select(waitwb);

		if (wb.isDisplayed() && wb.isEnabled()) {

			Select sel = new Select(wb);
			sel.selectByVisibleText(value);
		}

	}

	public static void selectByValue(WebElement wb, String value) {

		if (wb.isDisplayed() && wb.isEnabled()) {
			new Select(wb).selectByValue(value);
		}

	}

	public static void selectByIndex(WebElement wb, int index) {

		if (wb.isDisplayed() && wb.isEnabled()) {
			new Select(wb).selectByIndex(index);
		}

	}

	public static String capturevaluebyvisibletext(WebElement wb, String value) {

		if (wb.isDisplayed() && wb.isEnabled()) {
			new Select(wb).selectByVisibleText(value);
		}
		return new Select(wb).getFirstSelectedOption().getText();

	}

}
