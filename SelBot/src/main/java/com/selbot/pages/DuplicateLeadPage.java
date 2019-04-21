package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selbot.testng.api.base.Annotations;

public class DuplicateLeadPage extends Annotations{

	public DuplicateLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="createLeadForm_companyName")  WebElement eleCompanyName;
	@FindBy(how=How.ID, using="createLeadForm_firstName")  WebElement eleFirstName;
	@FindBy(how=How.ID, using="createLeadForm_lastName")  WebElement eleLastName;
	@FindBy(how=How.NAME, using="submitButton") WebElement eleCreateLead;

	public DuplicateLeadPage enterCompanyName(String companyName) {
		clearAndType(eleCompanyName,companyName);
		return this;
	}
	
	public DuplicateLeadPage enterFirstName(String firstName) {
		clearAndType(eleFirstName,firstName);
		return this;
	}

	public DuplicateLeadPage enterLastName(String lastName) {
		clearAndType(eleLastName,lastName);
		return this;
	}
	
	public ViewLeadPage clickDuplicate() {
		click(eleCreateLead);
		return new ViewLeadPage();
	}





}
