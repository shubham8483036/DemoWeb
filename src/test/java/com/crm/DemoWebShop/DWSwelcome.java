package com.crm.DemoWebShop;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.PomFile.Welcome1;

public class DWSwelcome {
	@Test
	public void welcom() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		Welcome1 wc= new Welcome1(driver);
		wc.DemoWebShop_Img();
		wc.Boo_k();
		wc.Computer_();
		wc.Electronics_();
		wc.Apparel_Shoes_();
		wc.Digital_download_();
		wc.Jewelry_();
		wc.Gift_Card_();
		
		wc.facebook_();
		driver.navigate().back();
		
		wc.Twitter_();
		driver.navigate().back();
		
		wc.RSS_();
		driver.navigate().back();
		
		wc.YouTube_();
		driver.navigate().back();
		
		wc.Google_();
		driver.navigate().back();
			
		}
		
		
	}


