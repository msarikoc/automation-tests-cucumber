package com.prestashop.step_definitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.prestashop.pages.HomePage;
import com.prestashop.pages.SigninPage;
import com.prestashop.utilities.ConfigurationReader;
import com.prestashop.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class HomePageStepDefs {

	@Given("the user is on the home page")
	public void the_user_is_on_the_home_page() {
	    System.out.println("Open the home page");
	    Driver.getDriver().get(ConfigurationReader.getProperty("url"));
	}

	@When("the user enters a search term")
	public void the_user_enters_a_search_term() {
	    System.out.println("Enter search term: France national team t shirt");
	    HomePage homePage = new HomePage();
	    homePage.search.sendKeys("t shirt");
	}

	@Then("the search box should contain the search term")
	public void the_search_box_should_contain_the_search_term() {
	    System.out.println("verifying search term");
	    HomePage homePage = new HomePage();
	    String actual = homePage.search.getAttribute("value");
	    assertEquals("t shirt",actual);
	}
	String title;
	@When("the user gets the title of the page")
	public void the_user_gets_the_title_of_the_page() {
		title = Driver.getDriver().getTitle();

	}

	@Then("title should be Search - My Store")
	public void title_should_be_Search_My_Store() {
		assertEquals("My Store", title);

	}

	@When("the user clickson the Sign in link")
	public void the_user_clickson_the_Sign_in_link() {
	    HomePage homePage = new HomePage();
	    homePage.signin.click();
	}

	@Then("username and password fields should be displayed")
	public void username_and_password_fields_should_be_displayed() {
		SigninPage signinPage = new SigninPage();
		
		assertTrue(signinPage.loginEmail.isDisplayed());
		assertTrue(signinPage.password.isDisplayed());

	}
}
