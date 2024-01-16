package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClass;

public class ActionClass extends BaseClass{
	
	public void contextClick(WebElement wb) {
		Actions act = new Actions(driver);
		act.contextClick(wb).build().perform();
	}

}
