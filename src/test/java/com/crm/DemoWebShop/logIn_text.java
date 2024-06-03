package com.crm.DemoWebShop;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.PomFile.Login;

public class logIn_text {
    @Test
	public void login() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		Login log= new Login(driver);
		
		Thread.sleep(2000);
		log.clickLogin();
		log.username("admin01@gmail.com");
		log.password("admin01");
		Thread.sleep(2000);
		log.loginBt();
		
		Thread.sleep(6000);
		driver.close();
	}
}
