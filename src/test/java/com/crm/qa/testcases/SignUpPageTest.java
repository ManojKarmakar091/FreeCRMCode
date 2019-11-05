package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignUpPage;

public class SignUpPageTest extends TestBase{
	
	LoginPage loginPage;
	SignUpPage signuppage;
	
	public SignUpPageTest() {
		
		super();
		
	}
	
	
	
	@BeforeMethod
	public void setUp() {
	initialization();
	 loginPage = new LoginPage();
//	 signuppage= new SignUpPage();
	 signuppage =loginPage.clickOnSignUpLink();
			
	}
	
	@Test(priority=1)
	public void verifySignUpPageLevelTest() {
		
	Assert.assertTrue(signuppage.verifyPageLabel());
		
	}
	
	
	@Test(priority=2)
	public void validateEmailIdTest() {
		
	signuppage.validateEmailPhoneAddress("Manojkarmakar091@gmail.com", "9113952375");
	
	}
	
	@Test(priority=3)
	public void selectDropDownTest() {
		
	signuppage.validatePhoneDropDown();	
	}
	
	
	
	
	@AfterMethod
	public void tearDown(){
		
		driver.close();
	}	

}
