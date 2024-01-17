package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class Wait extends BaseClass{

	public void click(WebElement wb)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement WebWb = wait.until(ExpectedConditions.elementToBeClickable(wb));
		WebWb.click();
	}
	

	public void clear(WebElement wb)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement WebWb = wait.until(ExpectedConditions.elementToBeClickable(wb));
		WebWb.clear();;
	}
	
	public static String getAttribute(WebElement wb, String keyName)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement WebWb = wait.until(ExpectedConditions.visibilityOf(wb));
		String a=WebWb.getAttribute(keyName);
		return a;
	}
}
