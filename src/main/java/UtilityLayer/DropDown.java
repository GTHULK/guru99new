package UtilityLayer;

import java.util.List;

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

	public static String capturevaluebyValue(WebElement wb, String value) {

		if (wb.isDisplayed() && wb.isEnabled()) {
			new Select(wb).selectByValue(value);
		}
		return new Select(wb).getFirstSelectedOption().getText();
	}

	public static String caturevalueByindex(WebElement wb, int index) {

		if (wb.isDisplayed() && wb.isEnabled()) {
			new Select(wb).selectByIndex(index);
		}
		return new Select(wb).getFirstSelectedOption().getText();
	}

	public static void printAllvalue(WebElement wb) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			List<WebElement> ls = new Select(wb).getOptions();
			for (WebElement abc : ls) {
				System.out.println(abc.getText());
			}
		}
	}
	
	public static void selectSpecificValue(WebElement wb,String value) {
		if(wb.isDisplayed()&&wb.isEnabled()) {
			List<WebElement> ls=new Select(wb).getOptions();
			for(WebElement abc:ls) {
				if(abc.getText().equalsIgnoreCase(value)) {
					System.out.println(value +"value is present");
				}
				else {
					System.out.println(value +"value is not present");
				}
			}
		}
	}
	
	public static void selectValue(List<WebElement> ls, String value) {

		for (WebElement abc : ls) {
			if (abc.getText().equalsIgnoreCase(value)) {
				abc.click();
				break;
			}
		}
	}
}
