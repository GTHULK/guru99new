package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.DropDown;
import UtilityLayer.UtilsClass;

public class RegisterPage extends BaseClass{
	
	@FindBy(name="firstName")
	private WebElement fname;
	
	@FindBy(name="lastName")
	private WebElement lname;
	
	@FindBy(name="phone")
	private WebElement phone;
	
	@FindBy(name="userName")
	private WebElement email;
	
	@FindBy(name="address1")
	private WebElement address;
	
	@FindBy(name="city")
	private WebElement city;
	
	@FindBy(name="state")
	private WebElement state;
	
	@FindBy(name="postalCode")
	private WebElement pcode;
	
	@FindBy(name="country")
	private WebElement country;
	
	@FindBy(name="email")
	private WebElement uname;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(name="confirmPassword")
	private WebElement conpass;
	
	@FindBy(name="submit")
	private WebElement subBtn;
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void contactinfo(String Fname,String Lname,String Phone,String Email) {
		
		UtilsClass.sendkeys(fname, Fname);
		UtilsClass.sendkeys(lname, Lname);
		UtilsClass.sendkeys(phone, Phone);
		UtilsClass.sendkeys(email, Email);
		
	}
	
	public void mailinginfo(String add,String City,String State,String Pcode,String Country) {
		
		UtilsClass.sendkeys(address, add);
		UtilsClass.sendkeys(city, City);
		UtilsClass.sendkeys(state, State);
		UtilsClass.sendkeys(pcode, Pcode);
		DropDown.selectByVisibleText(country, Country);
		
	}
	
	public void userinfo(String Uname,String Pass,String conPass) {
		
		UtilsClass.sendkeys(uname, Uname);
		UtilsClass.sendkeys(pass, Pass);
		UtilsClass.sendkeys(conpass, conPass);
		
	}
  
	public void submitbtn() {
		
		UtilsClass.click(subBtn);;
	}
}
