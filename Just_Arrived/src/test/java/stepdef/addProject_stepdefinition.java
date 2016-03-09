package stepdef;

import Config.libraryScript;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class addProject_stepdefinition {

	@Given("^the user is on project dashboard page$")
	public void the_user_is_on_project_dashboard_page() {
		libraryScript.VerifyHomePage("link_projectList");
	   
	}

	@When("^user click on Add project button$")
	public void user_click_on_Add_project_button() {
	   libraryScript.Click("addProject");
	    
	}

	@When("^switch to Add project popup window$")
	public void switch_to_Add_project_popup_window(){
	    libraryScript.switchTowindow();
	   
	}

	@When("^select Project type as <type> from dropdown$")
	public void select_Project_type_from_dropdown() {
	    // Express the Regexp above with the code you wish you had
	   
	}

	@When("^enter <input_field>$")
	public void enter_project_name() {
	    // Express the Regexp above with the code you wish you had
	  
	}

	@When("^click Save$")
	public void click_Save() {
	    // Express the Regexp above with the code you wish you had
	    
	}

	@Then("^project should get saved to project list on dashboard$")
	public void project_should_get_saved_to_project_list_on_dashboard()  {
	    // Express the Regexp above with the code you wish you had
	   
	}

	@When("^click Cancel$")
	public void click_Cancel(){
	    // Express the Regexp above with the code you wish you had
	   
	}

	@Then("^project should not get saved to project list on dashboard$")
	public void project_should_not_get_saved_to_project_list_on_dashboard() {
	    // Express the Regexp above with the code you wish you had
	   
	}

	
}
