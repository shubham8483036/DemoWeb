package com.crm.PomFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Register_in {

	public Register_in(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public @FindBy(xpath = "//a[text()='Register']")
	WebElement Register_bt;
	
	public @FindBy(id = "gender-male")
	WebElement Gender_Bt;
	
	public @FindBy(css = "input[name='FirstName']")
	WebElement First_name;
	
	public @FindBy(css = "input[name='LastName']")
	WebElement Last_name;
	
	public @FindBy(css = "input[name='Email']")
	WebElement Email;
	
	public @FindBy(xpath = "(//input[@class='text-box single-line password'])[1]")
	WebElement Your_password;
	
	public @FindBy(xpath = "(//input[@class='text-box single-line password'])[2]")
	WebElement Confirm_password;
	
	public @FindBy(css = "input[name='register-button']")
	WebElement Register;
	
	// Enter values
	
	public void RegisterButton() {
	Register_bt.click();
		}
	public void Gender() {
		Gender_Bt.click();
	}
	public void FirstName(String value) {
		First_name.sendKeys(value);
	}
	public void LastName(String value) {
		Last_name.sendKeys(value);
	}
	public void email(String value) {
		Email.sendKeys(value);
	}
	public void yourPassword(String value) {
		Your_password.sendKeys(value);
	}
	public void confirmpassword(String value) {
		Confirm_password.sendKeys(value);
	}
	public void regiSter() {
		Register.click();
	}
	}
	

