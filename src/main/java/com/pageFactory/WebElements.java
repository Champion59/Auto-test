package com.pageFactory;

	
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.base.Base;

	public class WebElements extends Base {

		public WebElements() {
			PageFactory.initElements(driver, this);
		}
	@FindBy (xpath= "//*[@class ='ico-login']")
	private WebElement signInButton;

	@FindBy (xpath = "//*[@class ='email']")
	private WebElement emailFeild;

	@FindBy (xpath = "//*[@class ='password']")
	private WebElement passwordFeild;

	@FindBy (xpath ="//*[@class ='button-1 login-button']")
	private WebElement finalSignINButton;

	public WebElement getSignInButton() {
		return signInButton;
	}

	public WebElement getEmailFeild() {
		return emailFeild;
	}

	public WebElement getPasswordFeild() {
		return passwordFeild;
	}

	public WebElement getFinalSignInButton() {
		return finalSignINButton;
	}
	}

