package com.crunchtime.demo.test;

import com.crunchtime.demo.page.DemoPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;


public class TC_Demo {
	protected WebDriver driver;
	public DemoPage demoPage;

	private static final String BASE_URL = "http://www.crunchtime.com/";
	private static final int LEADERSHIP_TEAM_COUNT = 5;


	@BeforeClass(alwaysRun = true)
	public void beforeClass() throws Exception {
		driver = new FirefoxDriver();
		this.demoPage = PageFactory.initElements(this.driver, DemoPage.class);
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() throws Exception {
		driver.quit();
	}

	@BeforeMethod(alwaysRun = true)
	public void setUp() throws Exception {
		driver.get(BASE_URL);
		driver.manage().window().maximize();
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.close();
	}


	@Test()
	public void verifyHelpWantedImageIsDisplayed() throws Exception {
		/**
		 * This test is navigate to Career page, to make sure Help Wanted image is displayed.
		 * TODO:
		 * -------------------------------------------------------------------------------------------------------------------------
		 * Fix Test Failure: - Fix the failure step, and to make sure the test is run and pass
		 * -------------------------------------------------------------------------------------------------------------------------
		 */
		demoPage.careersLink.click();
		Assert.assertTrue(demoPage.helpWantedImg.isDisplayed(), "Failed, as it's not on screen");
	}


	@Test()
	public void verifyLeadershipTeamCount() throws Exception {
		/**
		 * TODO:
		 * Write a test with the following steps, and then to perform a validation as stated below,
		 * -------------------------------------------------------------------------------------------------------------------------
		 * VALIDATION: - to validate that the Leadership team is a 5 (LEADERSHIP_TEAM_COUNT) people team
		 * -------------------------------------------------------------------------------------------------------------------------
		 * -------------------------------------------------------------------------------------------------------------------------
		 * --------------------------------------------------STEPS ARE AS FOLLOWS:--------------------------------------------------
		 * -------------------------------------------------------------------------------------------------------------------------
		 * -------------------------------------------------------------------------------------------------------------------------
		 * NOTE: parent URL is http://www.crunchtime.com, as written in before/after class and before/after method blocks
		 * -------------------------------------------------------------------------------------------------------------------------
		 * 1. mouse hover over to "About" link; NOTE: org.openqa.selenium.interactions.Actions class can be used for mouse action
		 * 2. click on "Leadership Team" link when it becomes visible in the dropdown after mouse over the "About" link;
		 * 3. assert (verify) that the total number of leadership team is 5
		 * 4. NOTE: Bonus Step - Print out the job title of each leader
		 */

		 
		 
	}


}