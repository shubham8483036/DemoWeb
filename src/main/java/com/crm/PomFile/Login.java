package com.crm.PomFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
public Login (WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public @FindBy(xpath = "//a[text()='Log in']")
WebElement Login_Bt;

public @FindBy(css = "input[autofocus='autofocus']")
WebElement username;
public @FindBy(name = "Password")
WebElement password;
public @FindBy(css = "input[class='button-1 login-button']")
WebElement login_bt;

public void clickLogin() {
	Login_Bt.click();
}
public void username(String value) {
	username.sendKeys(value);
}
public void password(String value) {
	password.sendKeys(value);
}
public void loginBt(){
	login_bt.click();
}
}
