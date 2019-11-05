package com.crm.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class CalenderPage extends TestBase 
{
	
	
	
@FindBy(xpath="//button[@class='ui linkedin button']")
WebElement clickOnNewButton;
	
@FindBy(xpath="//input[@name='title']")	
WebElement titleTextBox;



@FindBy(xpath="//textarea[@name='description']")
WebElement descriptionTextBox;

@FindBy(xpath=" //div[@class='ui fluid container main-content']//div[2]//div[1]//div[1]//div[1]//input[1]")
WebElement selectStartDate;


@FindBy(xpath="//div[@class='two fields']//div[1]//div[1]//div[1]//div[1]//inp")
WebElement selectEndDate;


@FindBy(xpath="//button[@class='ui linkedin button']")
WebElement clickSaveButton;


public CalenderPage() {
	
PageFactory.initElements(driver, this);	
}

public void validateClickOnNewButton() {
	
	
	clickOnNewButton.click();
	
}



public void validateTitleTextbox(String titleTextBoxfield) {
	
	titleTextBox.sendKeys(titleTextBoxfield);
	
}

public void selectDropDownBox(String dropDownOption) {
	
	List<WebElement> list = driver.findElements(By.xpath("//div[@class='visible menu transition']//div//span"));
	
	for(int i=0; i<list.size(); i++ ) {
		if(list.get(i).getText().contains(dropDownOption));
		list.get(i).click();
		break;
		
		
	}
	
}

public void validateSelectStartDate(String stdate) {
	
	selectStartDate.sendKeys(stdate);	
	
}

public void validateSelectEndDate(String enddate) {
	
	selectEndDate.sendKeys(enddate);	
}

public void enterDescription(String text) {
	
	descriptionTextBox.sendKeys(text);
}

public void clickOnSaveButton() {
	
	clickSaveButton.click();
}


}
