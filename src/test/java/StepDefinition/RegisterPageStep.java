package StepDefinition;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageStep extends BaseClass {
	
	private static RegisterPage reg;
	@Given("User is on register page")
	public void user_is_on_register_page() {
	   BaseClass.initialization("Chrome");
	}

	@When("user enter firstname, lastname, phone, email in contact info")
	public void user_enter_firstname_lastname_phone_email_in_contact_info() {
		
		 reg=new RegisterPage();
		 reg.contactinfo("Gyan", "Date", "1234567890", "gyan@gamil.com");
	   
	}

	@Then("user enter address, city, state, postal code, country in mailing info")
	public void user_enter_address_city_state_postal_code_country_in_mailing_info() {
		
		reg.mailinginfo("Rahuri", "Rahuri", "Maharashtra", "12345", "INDIA");
	    
	}

	@Then("user enter username and password and confirm password")
	public void user_enter_username_and_password_and_confirm_password() {
	
		reg.userinfo("Gyan@gamil.com", "123456", "123456");
	}

	@Then("user click on submit button")
	public void user_click_on_submit_button() {
		
		reg.submitbtn();
	 
	}

}
