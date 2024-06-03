package com.crm.PomFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class GiftCart {

	public GiftCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
		 
	}                        
	public @FindBy(xpath = "(//a[contains(text(),'Gift Car')])[1]")
	WebElement GiftCat;
	
//	public @FindBy(id = "products-orderby")
//	WebElement softBy_DropDown;
	
//	Select sc1 = new Select(softBy_DropDown);
//	
//	public @FindBy(id = "products-pagesize")
//	WebElement Display_Dropdown;
//	
//	Select sc2= new Select(Display_Dropdown);
//	
//	public @FindBy(id = "products-viewmode")
//	WebElement Grid_DropDown;
//
//	Select sc3= new Select(Grid_DropDown);
	
	public @FindBy(css = "img[alt='Picture of $100 Physical Gift Card']")
	WebElement Giftcart_Img;
	
	public @FindBy(css = "input[name='giftcard_4.RecipientName']")
	WebElement Recipients_Name;
	
	public @FindBy(css = "input[name='giftcard_4.SenderName']")
	WebElement Your_Name;
	
	public @FindBy(css = "textarea[class='message']")
	WebElement Msg;
	
	public @FindBy(xpath = "(//input[@value='Add to cart'])[1]")
	WebElement AddToCart;
	
	// Enter Value
	public void clickGiftCart() {
		GiftCat.click();
	}
//	public void SortByDropDown() {
//		sc1.selectByIndex(3);
//	}
//	public void DisplayDropDown() {
//		sc2.selectByIndex(1);
//	}
//	public void GridDropDown() {
//		sc3.selectByIndex(1);
//	}
	public void ClickGiftImg() {
		Giftcart_Img.click();
	}
	public void RecipientsName(String value) {
		Recipients_Name.sendKeys(value);
	}
	public void YourName(String value) {
		Your_Name.sendKeys(value);
	}
	public void message(String value) {
		Msg.sendKeys(value);
	}
	public void Add_T0_Cart() {
		AddToCart.click();
	}
	}
	
	



