package macy1PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddtocarPageElement {
	
	@FindBy(xpath="//*[@id=\"servicError\"]/button")         //*[@id="servicError"]/button or  //*[@id="cta-notification-order-panel-1622049"]/div/div/div[2]/button
	public WebElement serviceerror;
	
	@FindBy(xpath="//*[@id=\"sortBy\"]")
	public WebElement dropdown;
	
	@FindBy(xpath="//a[contains(@title,\"Women's Kendrick Slip-On Espadrille Flats\")]//div[@class='prodDescription']")
	public WebElement selectShoes;
	
	@FindBy(xpath="//img[@alt='Chambray']")
	public WebElement color;
	
	
	@FindBy(xpath="//li[normalize-space()='7M']")
	public WebElement size;
	

	@FindBy(xpath="//button[@id='bag-add-11596561']")
	public WebElement AddToBag;
	
	@FindBy(xpath="//*[@id=\"onetrust-close-btn-container\"]/button")
	public WebElement cookies;
	
	@FindBy (xpath="//*[@id=\"cta-notification-order-panel-1622049\"]/div/div/div[2]/button")
	public WebElement technicalError;
	
	
	
	

}
