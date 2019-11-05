package com.crm.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SignUpPage extends TestBase{
	
@FindBy(xpath="//h2[@class='ui blue header']")
WebElement verifyHeader;
	
@FindBy(xpath="//input[@id='email']")
WebElement emailAddressField;



@FindBy(xpath="//input[@id='phone_number']")
WebElement phoneNumberField;




	
	
	public SignUpPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyPageLabel() {
		
	return verifyHeader.isDisplayed();
		
	}
	
	
	public void validateEmailPhoneAddress(String emailId, String phoeNumber) {
		
		emailAddressField.sendKeys(emailId);
		phoneNumberField.sendKeys(phoeNumber);
	
		
	}
	
	public void validatePhoneDropDown() {
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='menu transition visible']//div//i"));
		
		for(int i=0; i<list.size(); i++ ) {
			if(list.get(i).getText().contains("Afghanistan (+93)"));
			list.get(i).click();
			break;
			
			
		}
		
	}
	

}
