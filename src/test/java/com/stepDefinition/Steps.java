package com.stepDefinition;

	import org.openqa.selenium.support.PageFactory;
	import org.testng.Assert;

	import com.base.Base;
	import com.pageFactory.WebElements;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class Steps extends Base{

		WebElements pf = PageFactory.initElements(driver, WebElements.class);
		
		@Given("User navigates to {string}")
		public void user_navigates_to(String webPage) {
		   driver.get(webPage);
		    
		}

		@When("User clicks on the Sign In Button")
		public void user_clicks_on_the_sign_in_button() {
		//driver.findElement(By.xpath("//*[@class='ico-login']")).click();
		    pf.getSignInButton().click();
		}

		@When("User enters {string} into the email feild")
		public void user_enters_into_the_email_feild(String email) throws Exception {
		pf.getEmailFeild().sendKeys(email);
			
		    
		}

		@When("User enters {string} into the password feild")
		public void user_enters_into_the_password_feild(String password) {
		pf.getPasswordFeild().sendKeys(password);
		}
		

		@When("User clicks on final sign In Button")
		public void user_clicks_on_final_sign_in_button() {
		pf.getFinalSignInButton().click();
		    
		}

		@Then("User should be able to access {string}")
		public void user_should_be_able_to_access(String webpage) {

			String expected = webpage;
			String actual;
			
			
			//driver.manage().deleteAllCookies();
			
			driver.get(webpage);

			actual = driver.getCurrentUrl();

			Assert.assertEquals(actual, expected);

		}
	}
		
