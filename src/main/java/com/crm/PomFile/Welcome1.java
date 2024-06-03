package com.crm.PomFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Welcome1 {
	
	public Welcome1(WebDriver driver) {
		 PageFactory.initElements(driver,this);
		 
	}
	 public @FindBy(css = "img[alt='Tricentis Demo Web Shop']")
	 WebElement DemoWebShop_img;
	 
	 public @FindBy(xpath = "(//a[contains(text(),'Book')])[1]")
     WebElement Book;
	 
	 public @FindBy(xpath = "(//a[contains(text(),'Computer')])[1]")
	 WebElement Computer;
	 
	 public @FindBy(xpath = "(//a[contains(text(),'Electronics')])[1]")
	 WebElement Electronics;
	 
	 public @FindBy(xpath = "(//a[contains(text(),'Apparel & Shoe')])[1]")
	 WebElement Apparel_Shoes;
	 
	 public @FindBy(xpath = "(//a[contains(text(),'Digital download')])[1]")
	 WebElement Digital_download;
	 
	public @FindBy(xpath = "(//a[contains(text(),'Jewelr')])[1]")
	 WebElement Jewelry;
	 
	public @FindBy(xpath = "(//a[contains(text(),'Gift Card')])[1]")
	WebElement Gift_Card;
	
	
	
	
	public @FindBy(xpath = "//a[text()='Facebook']")
	WebElement facebook;
	
	public @FindBy(xpath = "//a[text()='Twitter']")
	WebElement Twitter;
	
	public @FindBy(xpath = "//a[text()='RSS']")
	WebElement RSS;
	
	public @FindBy(xpath = "//a[text()='YouTube']")
	WebElement YouTube;
	
	public @FindBy(xpath = "//a[text()='Google+']")
	WebElement Google;
	
	public void DemoWebShop_Img() {
		DemoWebShop_img.click();
	}
	public void Boo_k() {
	Book.click();
	}
	public void Computer_() {
		Computer.click();
	}
	public void Electronics_() {
		 Electronics.click();
	}
	public void Apparel_Shoes_() {
		Apparel_Shoes.click();
	}
	public void Digital_download_() {
		 Digital_download.click();
	}
	public void Jewelry_() {
		 Jewelry.click();
	}
	public void Gift_Card_() {
		 Gift_Card.click();
	}
	
	
	
	public void facebook_() {
		 facebook.click();
		
		 
	}
	public void Twitter_() {
		 Twitter.click();
;
	}
	public void RSS_() {
		 RSS.click();
	}
	public void YouTube_() {
		 YouTube.click();
	}
	public void Google_() {
		 Google.click();
	}
}
