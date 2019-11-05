package com.crm.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CalenderPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class CalenderPageTest extends TestBase{
	

	
	LoginPage loginpage;
	HomePage homepage;
	CalenderPage calenderpage;
	
	
	
	
public CalenderPageTest() {
	
super ();	
}

@BeforeMethod
public void setUp() {
initialization();	
	
loginpage =new LoginPage();	
homepage= new HomePage();
homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
calenderpage= homepage.clickOnCalenderLink();
calenderpage.validateClickOnNewButton();	
	
}


@Test
public void validateTitleTextBoxTest() {
calenderpage.validateTitleTextbox("Mr");

calenderpage.selectDropDownBox("Meeting");	
calenderpage.validateSelectStartDate("12/10/2019 00:00");



calenderpage.validateSelectEndDate("14/10/2019 00:00");
calenderpage.enterDescription("test1");
calenderpage.clickOnSaveButton();

	
}
//
//@Test
//public void validateDropDownBoxTest() {
//	
//
//	
//	
//}




//@AfterMethod
//public void tearDown(){
//	
//	driver.close();


//}
}
