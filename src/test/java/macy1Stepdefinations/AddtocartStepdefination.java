package macy1Stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import macy1Action.mac1cartPageAction;

public class AddtocartStepdefination{
	
	mac1cartPageAction actions=new mac1cartPageAction();
	
	
	
	@Given("User is on {string}")
	public void user_is_on(String string) {
	    actions.openShoesPage();
	    actions.systemerror();
	    
	}

	@When("User sort item by best seller from dropdown menu")
	public void user_sort_item_by_best_seller_from_dropdown_menu() {
	    actions.dropdownMenu();
	    
	}

	@Then("user is able to see item based on best seller filter")
	public void user_is_able_to_see_item_based_on_best_seller_filter() {
	    
	    
	}

	@When("User clicks on an item")
	public void user_clicks_on_an_item() {
		try {
			actions.clickInShoe();
		}catch(Exception e) {
			e.getStackTrace();
			System.out.println("Item not found, sold out");
			
		}
	    
	    
	}

	@When("User choose a color")
	public void user_choose_a_color() {
	    actions.selectColor();
	    
	}

	@When("User choose a size")
	public void user_choose_a_size() {
		actions.selectSize();
		actions.cookiesHandle();
	    
	    
	}

	@When("User Clicks on Add to bag")
	public void user_Clicks_on_Add_to_bag() {
		try{actions.addToBag();
		}catch(Exception e) {
			e.getStackTrace();
			System.out.println("access denied ");
		}
	    
	    
	}

	@When("User Clicks on View bag from the new window")
	public void user_Clicks_on_View_bag_from_the_new_window() {
	    
	    
	}

	@Then("User is able to see the item added in the bag")
	public void user_is_able_to_see_the_item_added_in_the_bag() {
	    
	    
	}




}
