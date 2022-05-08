package macy1Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import macy1PageElements.AddtocarPageElement;
import macy1Utilities.SetupDriver;

public class mac1cartPageAction {
	
	AddtocarPageElement pageElement;
	public mac1cartPageAction(){
		pageElement = new AddtocarPageElement();
		PageFactory.initElements(SetupDriver.driver, pageElement);
	}
	
	public void openShoesPage() {
		SetupDriver.driver.get("https://www.macys.com/shop/featured/bestseller/Sortby/BEST_SELLERS?cm_kws_ls=bestseller");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		SetupDriver.driver.manage().deleteAllCookies();
		System.out.println("chrome opened ==>");
		System.out.println("Shoes Page Loading==>");
	}
	
	public void systemerror() {
		pageElement.serviceerror.click();
		System.out.println("temporary error!!");

	}
	
	public void dropdownMenu() {
		try {
			Select dropdown = new Select(pageElement.dropdown);
			dropdown.selectByVisibleText("Best Sellers");
			pageElement.dropdown.click();
			pageElement.serviceerror.click();
		} catch (Exception e) {
			e.getStackTrace();
			System.out.println("Failed to select drom drop down Menu !!");
		}
	}
	
	
	public void clickInShoe(){
		pageElement.selectShoes.click();
		System.out.println("selection a heel Now!!");
	}
	
	public void selectColor(){
		try{pageElement.color.click();}
		catch (Exception e) {
			e.getStackTrace();
			System.out.println("color sold out!!");}
	}
	
	public void selectSize(){
		pageElement.size.click();
		
	}
	
	public void addToBag(){
		pageElement.AddToBag.click();
	}
	
	public void cookiesHandle() {
		pageElement.cookies.click();
	}
	
	
	

}
