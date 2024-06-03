package com.crm.DemoWebShop;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import com.crm.PomFile.Register_in;

public class Register_text {
	@Test
	public void register() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");
		
		Thread.sleep(2000);
		Register_in rs= new Register_in(driver);
		
		Thread.sleep(2000);
		rs.RegisterButton();
		rs.Gender();
		Thread.sleep(2000);
		rs.FirstName("Shubham");
		rs.LastName("Patil");
		Thread.sleep(2000);
		rs.email("Shubhampatil26497@gmail.com");
		rs.yourPassword("Shubham@123");
		rs.confirmpassword("Shubham@123");
		Thread.sleep(2000);
		rs.regiSter();
	}

	

}
