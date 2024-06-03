package com.crm.DemoWebShop;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.PomFile.GiftCart;

public class GiftCart2 {
    @Test
	public void Giftcart11() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		GiftCart gc = new GiftCart(driver);
		
		Thread.sleep(2000);
		gc.clickGiftCart();
		
//		Thread.sleep(2000);
//		gc.SortByDropDown();
//		Thread.sleep(2000);
//		gc.DisplayDropDown();
//		Thread.sleep(2000);
//		gc.GridDropDown();
//		
		Thread.sleep(2000);
		gc.ClickGiftImg();
		Thread.sleep(2000);
		gc.RecipientsName("Ajay");
		gc.YourName("Shubham");
		gc.message("Hello");
		Thread.sleep(2000);
		gc.Add_T0_Cart();
		
		
		
	}
}
