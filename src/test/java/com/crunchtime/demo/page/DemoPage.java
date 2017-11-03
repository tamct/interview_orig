package com.crunchtime.demo.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DemoPage {

	@FindBy(css = "a[href='http://www.crunchtime.com/about-us/']")
	public WebElement aboutLink;

	@FindBy(css = "a[href*='about-us/careers/']")
	public WebElement careersLink;

	@FindBy(css = "a[href*='about-us/leadership-team/']")
	public WebElement leadershipTeamLink;

	@FindBy(css = "article div[class='entry-content'] h2 img[src*='careers-header']")
	public WebElement helpWantedImg;

	@FindBy(css = "article p strong")
	public List<WebElement> jobTitleList;
	@FindBy(css = "a[id^='resumator-desc-show-job']")
	public List<WebElement> viewDetailsLinkList;
	@FindBy(css = "div[class='resumator-job-description-text resumator-jobs-text']")
	public List<WebElement> jobDescSectionList;


}