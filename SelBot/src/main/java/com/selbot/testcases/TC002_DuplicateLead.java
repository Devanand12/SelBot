package com.selbot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selbot.pages.LoginPage;
import com.selbot.testng.api.base.Annotations;

public class TC002_DuplicateLead extends Annotations{
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC002_DuplicateLead";
		testcaseDec = "Login, Create, Duplicate that Lead and Verify";
		author = "Koushik";
		category = "Sanity";
		excelFileName = "TC002";
	} 

	@Test(dataProvider="fetchData") 
	public void createLead(String uName, String pwd, 
				String companyName, String firstName, 
				String lastName, String newCompanyName) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassWord(pwd) 
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(companyName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickCreateLead()
		.clickDuplicateLead()
		.enterCompanyName(newCompanyName)
		.clickDuplicate()
		.verifyCompanyName(newCompanyName);
	}
	
}






